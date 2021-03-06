/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkDefinition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sPEM.WorkDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // WorkDefinition
