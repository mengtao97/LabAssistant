/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.Milestone#getRequire <em>Require</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.Milestone#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends EObject {
	/**
	 * Returns the value of the '<em><b>Require</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getMilestone_Require()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkProduct> getRequire();

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(String)
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getMilestone_Deadline()
	 * @model
	 * @generated
	 */
	String getDeadline();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sPEM.Milestone#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(String value);

} // Milestone
