/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage
 * @generated
 */
public interface SPEMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SPEMFactory eINSTANCE = org.eclipse.sirius.sample.sPEM.impl.SPEMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Sequence</em>'.
	 * @generated
	 */
	WorkSequence createWorkSequence();

	/**
	 * Returns a new object of class '<em>Work Breakdown Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Breakdown Element</em>'.
	 * @generated
	 */
	WorkBreakdownElement createWorkBreakdownElement();

	/**
	 * Returns a new object of class '<em>Milestone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Milestone</em>'.
	 * @generated
	 */
	Milestone createMilestone();

	/**
	 * Returns a new object of class '<em>Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product</em>'.
	 * @generated
	 */
	WorkProduct createWorkProduct();

	/**
	 * Returns a new object of class '<em>Work Product Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Relationship</em>'.
	 * @generated
	 */
	WorkProductRelationship createWorkProductRelationship();

	/**
	 * Returns a new object of class '<em>Process Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Parameter</em>'.
	 * @generated
	 */
	ProcessParameter createProcessParameter();

	/**
	 * Returns a new object of class '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Definition</em>'.
	 * @generated
	 */
	WorkDefinition createWorkDefinition();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Acticity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acticity</em>'.
	 * @generated
	 */
	Acticity createActicity();

	/**
	 * Returns a new object of class '<em>Process Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Performer</em>'.
	 * @generated
	 */
	ProcessPerformer createProcessPerformer();

	/**
	 * Returns a new object of class '<em>SPEM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPEM</em>'.
	 * @generated
	 */
	SPEM createSPEM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SPEMPackage getSPEMPackage();

} //SPEMFactory
