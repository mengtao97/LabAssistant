/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getNested <em>Nested</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkBreakdownElement()
 * @model
 * @generated
 */
public interface WorkBreakdownElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nested</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.Acticity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkBreakdownElement_Nested()
	 * @model containment="true"
	 * @generated
	 */
	EList<Acticity> getNested();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkBreakdownElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkBreakdownElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WorkBreakdownElement
