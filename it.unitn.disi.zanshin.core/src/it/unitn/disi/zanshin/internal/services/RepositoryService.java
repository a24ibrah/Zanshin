package it.unitn.disi.zanshin.internal.services;

import it.unitn.disi.zanshin.model.gore.GoalModel;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class RepositoryService implements IRepositoryService {
	/** A repository that maps model IDs to models. */
	private Map<Long, GoalModel> repository = new HashMap<Long, GoalModel>();
	
	/** A repository that maps model IDs to model elements. */
	private Map<Long, GoalModelElements> elementsRepository = new HashMap<Long, GoalModelElements>();
	
	/** @see it.unitn.disi.zanshin.services.IRepositoryService#storeGoalModel(it.unitn.disi.zanshin.model.gore.GoalModel) */
	@Override
	public void storeGoalModel(GoalModel model) {
		// Stores the model in the repository.
		Long id = model.getId();
		repository.put(id, model);
		
		// Creates an element mapping object and stores it in the elements repository.
		GoalModelElements elements = new GoalModelElements(model);
		elementsRepository.put(id, elements);
	}

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveGoalModel(java.lang.String) */
	@Override
	public GoalModel retrieveGoalModel(Long id) {
		// Retrieves the model from the repository.
		return repository.get(id);
	}

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveRequirement(java.lang.Long, java.lang.Class) */
	@Override
	public <R extends Requirement> R retrieveRequirement(Long modelId, Class<R> reqClass) {
		// Obtains the element mapping object from the elements repository.
		GoalModelElements elements = elementsRepository.get(modelId);
		
		// Retrieve the element from the model.
		return (elements == null) ? null : elements.retrieveRequirementInstance(reqClass);
	}

	/** @see it.unitn.disi.zanshin.services.IRepositoryService#retrieveRequirement(java.lang.Long, java.lang.String) */
	@Override
	public Requirement retrieveRequirement(Long modelId, String reqClassName) {
		// Obtains the element mapping object from the elements repository.
		GoalModelElements elements = elementsRepository.get(modelId);
		
		// Retrieve the element from the model.
		return (elements == null) ? null : elements.retrieveRequirementInstance(reqClassName);
	}
}
