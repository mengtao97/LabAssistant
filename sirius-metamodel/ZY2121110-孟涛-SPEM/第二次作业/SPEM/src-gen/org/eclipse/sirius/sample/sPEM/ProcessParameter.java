/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.ProcessParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.ProcessParameter#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getProcessParameter()
 * @model
 * @generated
 */
public interface ProcessParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.ParameterDirectionKind}.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.sPEM.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute list.
	 * @see org.eclipse.sirius.sample.sPEM.ParameterDirectionKind
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getProcessParameter_Direction()
	 * @model upper="2" ordered="false"
	 * @generated
	 */
	EList<ParameterDirectionKind> getDirection();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getProcessParameter_Product()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkProduct> getProduct();

} // ProcessParameter
