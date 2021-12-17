/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPEM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.SPEM#getWorksequence <em>Worksequence</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.SPEM#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.SPEM#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.SPEM#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.SPEM#getWprel <em>Wprel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getSPEM()
 * @model
 * @generated
 */
public interface SPEM extends EObject {
	/**
	 * Returns the value of the '<em><b>Worksequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksequence</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getSPEM_Worksequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkSequence> getWorksequence();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getSPEM_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkBreakdownElement> getElement();

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.Milestone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getSPEM_Milestone()
	 * @model containment="true"
	 * @generated
	 */
	EList<Milestone> getMilestone();

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getSPEM_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sPEM.SPEM#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Wprel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sPEM.WorkProductRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wprel</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#getSPEM_Wprel()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkProductRelationship> getWprel();

} // SPEM
