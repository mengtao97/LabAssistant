/**
 */
package org.eclipse.sirius.sample.sPEM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.sPEM.SPEMFactory
 * @model kind="package"
 * @generated
 */
public interface SPEMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sPEM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/sample/sPEM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sPEM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SPEMPackage eINSTANCE = org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkSequence()
	 * @generated
	 */
	int WORK_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__SUCCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Link Kind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__LINK_KIND = 1;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PREDECESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Work Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Work Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl <em>Work Breakdown Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkBreakdownElement()
	 * @generated
	 */
	int WORK_BREAKDOWN_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Nested</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__NESTED = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Work Breakdown Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work Breakdown Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.MilestoneImpl <em>Milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.MilestoneImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getMilestone()
	 * @generated
	 */
	int MILESTONE = 2;

	/**
	 * The feature id for the '<em><b>Require</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__REQUIRE = 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__DEADLINE = 1;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.WorkProductImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkProductRelationshipImpl <em>Work Product Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.WorkProductRelationshipImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkProductRelationship()
	 * @generated
	 */
	int WORK_PRODUCT_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Work Product Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Work Product Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.ProcessParameterImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getProcessParameter()
	 * @generated
	 */
	int PROCESS_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PRODUCT = 1;

	/**
	 * The number of structural features of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.WorkDefinitionImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkDefinition()
	 * @generated
	 */
	int WORK_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Work Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.ConstraintImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.ActicityImpl <em>Acticity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.ActicityImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getActicity()
	 * @generated
	 */
	int ACTICITY = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY__DESCRIPTION = WORK_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY__PARAM = WORK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY__PERFORMER = WORK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY__POSTCONDITION = WORK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY__PRECONDITION = WORK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Acticity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY_FEATURE_COUNT = WORK_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Acticity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTICITY_OPERATION_COUNT = WORK_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.ProcessPerformerImpl <em>Process Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.ProcessPerformerImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getProcessPerformer()
	 * @generated
	 */
	int PROCESS_PERFORMER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Process Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Process Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl <em>SPEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMImpl
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getSPEM()
	 * @generated
	 */
	int SPEM = 10;

	/**
	 * The feature id for the '<em><b>Worksequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM__WORKSEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM__MILESTONE = 2;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM__MODEL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Wprel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM__WPREL = 4;

	/**
	 * The number of structural features of the '<em>SPEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SPEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.WorkSenquenceKind <em>Work Senquence Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.WorkSenquenceKind
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkSenquenceKind()
	 * @generated
	 */
	int WORK_SENQUENCE_KIND = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sPEM.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sPEM.ParameterDirectionKind
	 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getParameterDirectionKind()
	 * @generated
	 */
	int PARAMETER_DIRECTION_KIND = 12;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.WorkSequence <em>Work Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Sequence</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSequence
	 * @generated
	 */
	EClass getWorkSequence();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSequence#getSuccessor()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EReference getWorkSequence_Successor();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getLinkKind <em>Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link Kind</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSequence#getLinkKind()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EAttribute getWorkSequence_LinkKind();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessor</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSequence#getPredecessor()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EReference getWorkSequence_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.WorkSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSequence#getName()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EAttribute getWorkSequence_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement <em>Work Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Breakdown Element</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkBreakdownElement
	 * @generated
	 */
	EClass getWorkBreakdownElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getNested <em>Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getNested()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EReference getWorkBreakdownElement_Nested();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getDescription()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EAttribute getWorkBreakdownElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkBreakdownElement#getName()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EAttribute getWorkBreakdownElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Milestone
	 * @generated
	 */
	EClass getMilestone();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sPEM.Milestone#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Require</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Milestone#getRequire()
	 * @see #getMilestone()
	 * @generated
	 */
	EReference getMilestone_Require();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.Milestone#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Milestone#getDeadline()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Deadline();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.WorkProduct#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkProduct#getContent()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.WorkProductRelationship <em>Work Product Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Relationship</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkProductRelationship
	 * @generated
	 */
	EClass getWorkProductRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sPEM.WorkProductRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkProductRelationship#getSource()
	 * @see #getWorkProductRelationship()
	 * @generated
	 */
	EReference getWorkProductRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sPEM.WorkProductRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkProductRelationship#getTarget()
	 * @see #getWorkProductRelationship()
	 * @generated
	 */
	EReference getWorkProductRelationship_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Parameter</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ProcessParameter
	 * @generated
	 */
	EClass getProcessParameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sirius.sample.sPEM.ProcessParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Direction</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ProcessParameter#getDirection()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EAttribute getProcessParameter_Direction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.ProcessParameter#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ProcessParameter#getProduct()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EReference getProcessParameter_Product();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Definition</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkDefinition
	 * @generated
	 */
	EClass getWorkDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.WorkDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkDefinition#getDescription()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EAttribute getWorkDefinition_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.Constraint#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Constraint#getCondition()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.Acticity <em>Acticity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acticity</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Acticity
	 * @generated
	 */
	EClass getActicity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.Acticity#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Acticity#getParam()
	 * @see #getActicity()
	 * @generated
	 */
	EReference getActicity_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.Acticity#getPerformer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Acticity#getPerformer()
	 * @see #getActicity()
	 * @generated
	 */
	EReference getActicity_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.Acticity#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Acticity#getPostcondition()
	 * @see #getActicity()
	 * @generated
	 */
	EReference getActicity_Postcondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.Acticity#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.Acticity#getPrecondition()
	 * @see #getActicity()
	 * @generated
	 */
	EReference getActicity_Precondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.ProcessPerformer <em>Process Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Performer</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ProcessPerformer
	 * @generated
	 */
	EClass getProcessPerformer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.ProcessPerformer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ProcessPerformer#getName()
	 * @see #getProcessPerformer()
	 * @generated
	 */
	EAttribute getProcessPerformer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.ProcessPerformer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ProcessPerformer#getRole()
	 * @see #getProcessPerformer()
	 * @generated
	 */
	EAttribute getProcessPerformer_Role();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sPEM.SPEM <em>SPEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPEM</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.SPEM
	 * @generated
	 */
	EClass getSPEM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.SPEM#getWorksequence <em>Worksequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worksequence</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.SPEM#getWorksequence()
	 * @see #getSPEM()
	 * @generated
	 */
	EReference getSPEM_Worksequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.SPEM#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.SPEM#getElement()
	 * @see #getSPEM()
	 * @generated
	 */
	EReference getSPEM_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.SPEM#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestone</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.SPEM#getMilestone()
	 * @see #getSPEM()
	 * @generated
	 */
	EReference getSPEM_Milestone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.sPEM.SPEM#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.SPEM#getModelName()
	 * @see #getSPEM()
	 * @generated
	 */
	EAttribute getSPEM_ModelName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sPEM.SPEM#getWprel <em>Wprel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wprel</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.SPEM#getWprel()
	 * @see #getSPEM()
	 * @generated
	 */
	EReference getSPEM_Wprel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.sPEM.WorkSenquenceKind <em>Work Senquence Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Senquence Kind</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.WorkSenquenceKind
	 * @generated
	 */
	EEnum getWorkSenquenceKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.sPEM.ParameterDirectionKind <em>Parameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction Kind</em>'.
	 * @see org.eclipse.sirius.sample.sPEM.ParameterDirectionKind
	 * @generated
	 */
	EEnum getParameterDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SPEMFactory getSPEMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkSequence()
		 * @generated
		 */
		EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

		/**
		 * The meta object literal for the '<em><b>Link Kind</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_SEQUENCE__LINK_KIND = eINSTANCE.getWorkSequence_LinkKind();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_SEQUENCE__NAME = eINSTANCE.getWorkSequence_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl <em>Work Breakdown Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkBreakdownElement()
		 * @generated
		 */
		EClass WORK_BREAKDOWN_ELEMENT = eINSTANCE.getWorkBreakdownElement();

		/**
		 * The meta object literal for the '<em><b>Nested</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_BREAKDOWN_ELEMENT__NESTED = eINSTANCE.getWorkBreakdownElement_Nested();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BREAKDOWN_ELEMENT__DESCRIPTION = eINSTANCE.getWorkBreakdownElement_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BREAKDOWN_ELEMENT__NAME = eINSTANCE.getWorkBreakdownElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.MilestoneImpl <em>Milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.MilestoneImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getMilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getMilestone();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MILESTONE__REQUIRE = eINSTANCE.getMilestone_Require();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__DEADLINE = eINSTANCE.getMilestone_Deadline();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.WorkProductImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkProduct()
		 * @generated
		 */
		EClass WORK_PRODUCT = eINSTANCE.getWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT__CONTENT = eINSTANCE.getWorkProduct_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkProductRelationshipImpl <em>Work Product Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.WorkProductRelationshipImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkProductRelationship()
		 * @generated
		 */
		EClass WORK_PRODUCT_RELATIONSHIP = eINSTANCE.getWorkProductRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_RELATIONSHIP__SOURCE = eINSTANCE.getWorkProductRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_RELATIONSHIP__TARGET = eINSTANCE.getWorkProductRelationship_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.ProcessParameterImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getProcessParameter()
		 * @generated
		 */
		EClass PROCESS_PARAMETER = eINSTANCE.getProcessParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PARAMETER__DIRECTION = eINSTANCE.getProcessParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PARAMETER__PRODUCT = eINSTANCE.getProcessParameter_Product();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.WorkDefinitionImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkDefinition()
		 * @generated
		 */
		EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DEFINITION__DESCRIPTION = eINSTANCE.getWorkDefinition_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.ConstraintImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONDITION = eINSTANCE.getConstraint_Condition();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.ActicityImpl <em>Acticity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.ActicityImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getActicity()
		 * @generated
		 */
		EClass ACTICITY = eINSTANCE.getActicity();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTICITY__PARAM = eINSTANCE.getActicity_Param();

		/**
		 * The meta object literal for the '<em><b>Performer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTICITY__PERFORMER = eINSTANCE.getActicity_Performer();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTICITY__POSTCONDITION = eINSTANCE.getActicity_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTICITY__PRECONDITION = eINSTANCE.getActicity_Precondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.ProcessPerformerImpl <em>Process Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.ProcessPerformerImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getProcessPerformer()
		 * @generated
		 */
		EClass PROCESS_PERFORMER = eINSTANCE.getProcessPerformer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PERFORMER__NAME = eINSTANCE.getProcessPerformer_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PERFORMER__ROLE = eINSTANCE.getProcessPerformer_Role();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl <em>SPEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMImpl
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getSPEM()
		 * @generated
		 */
		EClass SPEM = eINSTANCE.getSPEM();

		/**
		 * The meta object literal for the '<em><b>Worksequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEM__WORKSEQUENCE = eINSTANCE.getSPEM_Worksequence();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEM__ELEMENT = eINSTANCE.getSPEM_Element();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEM__MILESTONE = eINSTANCE.getSPEM_Milestone();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEM__MODEL_NAME = eINSTANCE.getSPEM_ModelName();

		/**
		 * The meta object literal for the '<em><b>Wprel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEM__WPREL = eINSTANCE.getSPEM_Wprel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.WorkSenquenceKind <em>Work Senquence Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.WorkSenquenceKind
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getWorkSenquenceKind()
		 * @generated
		 */
		EEnum WORK_SENQUENCE_KIND = eINSTANCE.getWorkSenquenceKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sPEM.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sPEM.ParameterDirectionKind
		 * @see org.eclipse.sirius.sample.sPEM.impl.SPEMPackageImpl#getParameterDirectionKind()
		 * @generated
		 */
		EEnum PARAMETER_DIRECTION_KIND = eINSTANCE.getParameterDirectionKind();

	}

} //SPEMPackage
