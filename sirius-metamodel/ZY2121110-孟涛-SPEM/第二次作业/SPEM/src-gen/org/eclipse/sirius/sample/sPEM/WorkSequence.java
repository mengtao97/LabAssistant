/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getLinkKind <em>Link Kind</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkSequence()
 * @model
 * @generated
 */
public interface WorkSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkSequence_Successor()
	 * @model
	 * @generated
	 */
	EList<WorkBreakdownElement> getSuccessor();

	/**
	 * Returns the value of the '<em><b>Link Kind</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkSenquenceKind}.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.sPEM.WorkSenquenceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Kind</em>' attribute list.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSenquenceKind
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkSequence_LinkKind()
	 * @model upper="3"
	 * @generated
	 */
	EList<WorkSenquenceKind> getLinkKind();

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkSequence_Predecessor()
	 * @model
	 * @generated
	 */
	EList<WorkBreakdownElement> getPredecessor();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkSequence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WorkSequence
