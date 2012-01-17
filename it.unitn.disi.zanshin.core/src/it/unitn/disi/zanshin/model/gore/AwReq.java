/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getOtherTargets <em>Other Targets</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unitn.disi.zanshin.model.gore.AwReq#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq()
 * @model
 * @generated
 */
public interface AwReq extends DefinableRequirement {
	/**
	 * Returns the value of the '<em><b>Other Targets</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.zanshin.model.gore.DefinableRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Targets</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq_OtherTargets()
	 * @model
	 * @generated
	 */
	EList<DefinableRequirement> getOtherTargets();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DefinableRequirement)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq_Target()
	 * @model required="true"
	 * @generated
	 */
	DefinableRequirement getTarget();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.AwReq#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DefinableRequirement value);

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unitn.disi.zanshin.model.gore.GoalModel#getAwReqs <em>Aw Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' container reference.
	 * @see #setGoalModel(GoalModel)
	 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getAwReq_GoalModel()
	 * @see it.unitn.disi.zanshin.model.gore.GoalModel#getAwReqs
	 * @model opposite="awReqs" transient="false"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.gore.AwReq#getGoalModel <em>Goal Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' container reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

} // AwReq
