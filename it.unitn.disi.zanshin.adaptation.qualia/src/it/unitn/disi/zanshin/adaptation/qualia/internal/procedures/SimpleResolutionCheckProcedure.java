package it.unitn.disi.zanshin.adaptation.qualia.internal.procedures;

import it.unitn.disi.zanshin.adaptation.qualia.model.AbstractResolutionCheckProcedure;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimpleResolutionCheckProcedure extends AbstractResolutionCheckProcedure {
	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.ResolutionCheckProcedure#checkResolution(boolean) */
	@Override
	public boolean checkResolution(boolean evaluation) {
		// The simple resolution conditions just returns the indicator evaluation.
		return evaluation;
	}
}
