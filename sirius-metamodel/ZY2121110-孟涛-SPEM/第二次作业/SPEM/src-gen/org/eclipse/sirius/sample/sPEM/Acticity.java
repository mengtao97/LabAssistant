/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acticity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.Acticity#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.Acticity#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.Acticity#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.Acticity#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getActicity()
 * @model
 * @generated
 */
public interface Acticity extends WorkDefinition {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.ProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getActicity_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessParameter> getParam();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.ProcessPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getActicity_Performer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getActicity_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getActicity_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

} // Acticity
