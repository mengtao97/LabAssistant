/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkProductRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.WorkProductRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkProductRelationship()
 * @model
 * @generated
 */
public interface WorkProductRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkProductRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkProduct> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getWorkProductRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkProduct> getTarget();

} // WorkProductRelationship
