/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.sample.sPEM.Acticity;
import org.eclipse.sirius.sample.sPEM.Constraint;
import org.eclipse.sirius.sample.sPEM.Milestone;
import org.eclipse.sirius.sample.sPEM.ParameterDirectionKind;
import org.eclipse.sirius.sample.sPEM.ProcessParameter;
import org.eclipse.sirius.sample.sPEM.ProcessPerformer;
import org.eclipse.sirius.sample.sPEM.SPEMFactory;
import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkBreakdownElement;
import org.eclipse.sirius.sample.sPEM.WorkDefinition;
import org.eclipse.sirius.sample.sPEM.WorkProduct;
import org.eclipse.sirius.sample.sPEM.WorkProductRelationship;
import org.eclipse.sirius.sample.sPEM.WorkSenquenceKind;
import org.eclipse.sirius.sample.sPEM.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPEMPackageImpl extends EPackageImpl implements SPEMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workBreakdownElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acticityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workSenquenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.sample.sPEM.SPEMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SPEMPackageImpl() {
		super(eNS_URI, SPEMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SPEMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SPEMPackage init() {
		if (isInited)
			return (SPEMPackage) EPackage.Registry.INSTANCE.getEPackage(SPEMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSPEMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SPEMPackageImpl theSPEMPackage = registeredSPEMPackage instanceof SPEMPackageImpl
				? (SPEMPackageImpl) registeredSPEMPackage
				: new SPEMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSPEMPackage.createPackageContents();

		// Initialize created meta-data
		theSPEMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSPEMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SPEMPackage.eNS_URI, theSPEMPackage);
		return theSPEMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkSequence() {
		return workSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkSequence_Successor() {
		return (EReference) workSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkSequence_LinkKind() {
		return (EAttribute) workSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkSequence_Predecessor() {
		return (EReference) workSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkSequence_Name() {
		return (EAttribute) workSequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkBreakdownElement() {
		return workBreakdownElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkBreakdownElement_Nested() {
		return (EReference) workBreakdownElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_Description() {
		return (EAttribute) workBreakdownElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_Name() {
		return (EAttribute) workBreakdownElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Require() {
		return (EReference) milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestone_Deadline() {
		return (EAttribute) milestoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProduct() {
		return workProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProduct_Content() {
		return (EAttribute) workProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductRelationship() {
		return workProductRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductRelationship_Source() {
		return (EReference) workProductRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductRelationship_Target() {
		return (EReference) workProductRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessParameter() {
		return processParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessParameter_Direction() {
		return (EAttribute) processParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessParameter_Product() {
		return (EReference) processParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDefinition() {
		return workDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDefinition_Description() {
		return (EAttribute) workDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Condition() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActicity() {
		return acticityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActicity_Param() {
		return (EReference) acticityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActicity_Performer() {
		return (EReference) acticityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActicity_Postcondition() {
		return (EReference) acticityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActicity_Precondition() {
		return (EReference) acticityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPerformer() {
		return processPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessPerformer_Name() {
		return (EAttribute) processPerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessPerformer_Role() {
		return (EAttribute) processPerformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPEM() {
		return spemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPEM_Worksequence() {
		return (EReference) spemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPEM_Element() {
		return (EReference) spemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPEM_Milestone() {
		return (EReference) spemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPEM_ModelName() {
		return (EAttribute) spemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPEM_Wprel() {
		return (EReference) spemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkSenquenceKind() {
		return workSenquenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPEMFactory getSPEMFactory() {
		return (SPEMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		workSequenceEClass = createEClass(WORK_SEQUENCE);
		createEReference(workSequenceEClass, WORK_SEQUENCE__SUCCESSOR);
		createEAttribute(workSequenceEClass, WORK_SEQUENCE__LINK_KIND);
		createEReference(workSequenceEClass, WORK_SEQUENCE__PREDECESSOR);
		createEAttribute(workSequenceEClass, WORK_SEQUENCE__NAME);

		workBreakdownElementEClass = createEClass(WORK_BREAKDOWN_ELEMENT);
		createEReference(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__NESTED);
		createEAttribute(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__DESCRIPTION);
		createEAttribute(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__NAME);

		milestoneEClass = createEClass(MILESTONE);
		createEReference(milestoneEClass, MILESTONE__REQUIRE);
		createEAttribute(milestoneEClass, MILESTONE__DEADLINE);

		workProductEClass = createEClass(WORK_PRODUCT);
		createEAttribute(workProductEClass, WORK_PRODUCT__CONTENT);

		workProductRelationshipEClass = createEClass(WORK_PRODUCT_RELATIONSHIP);
		createEReference(workProductRelationshipEClass, WORK_PRODUCT_RELATIONSHIP__SOURCE);
		createEReference(workProductRelationshipEClass, WORK_PRODUCT_RELATIONSHIP__TARGET);

		processParameterEClass = createEClass(PROCESS_PARAMETER);
		createEAttribute(processParameterEClass, PROCESS_PARAMETER__DIRECTION);
		createEReference(processParameterEClass, PROCESS_PARAMETER__PRODUCT);

		workDefinitionEClass = createEClass(WORK_DEFINITION);
		createEAttribute(workDefinitionEClass, WORK_DEFINITION__DESCRIPTION);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__CONDITION);

		acticityEClass = createEClass(ACTICITY);
		createEReference(acticityEClass, ACTICITY__PARAM);
		createEReference(acticityEClass, ACTICITY__PERFORMER);
		createEReference(acticityEClass, ACTICITY__POSTCONDITION);
		createEReference(acticityEClass, ACTICITY__PRECONDITION);

		processPerformerEClass = createEClass(PROCESS_PERFORMER);
		createEAttribute(processPerformerEClass, PROCESS_PERFORMER__NAME);
		createEAttribute(processPerformerEClass, PROCESS_PERFORMER__ROLE);

		spemEClass = createEClass(SPEM);
		createEReference(spemEClass, SPEM__WORKSEQUENCE);
		createEReference(spemEClass, SPEM__ELEMENT);
		createEReference(spemEClass, SPEM__MILESTONE);
		createEAttribute(spemEClass, SPEM__MODEL_NAME);
		createEReference(spemEClass, SPEM__WPREL);

		// Create enums
		workSenquenceKindEEnum = createEEnum(WORK_SENQUENCE_KIND);
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		acticityEClass.getESuperTypes().add(this.getWorkDefinition());

		// Initialize classes, features, and operations; add parameters
		initEClass(workSequenceEClass, WorkSequence.class, "WorkSequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkSequence_Successor(), this.getWorkBreakdownElement(), null, "successor", null, 0, -1,
				WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkSequence_LinkKind(), this.getWorkSenquenceKind(), "linkKind", null, 0, 3,
				WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getWorkSequence_Predecessor(), this.getWorkBreakdownElement(), null, "predecessor", null, 0, -1,
				WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkSequence_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkSequence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workBreakdownElementEClass, WorkBreakdownElement.class, "WorkBreakdownElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkBreakdownElement_Nested(), this.getActicity(), null, "nested", null, 0, -1,
				WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkBreakdownElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkBreakdownElement_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMilestone_Require(), this.getWorkProduct(), null, "require", null, 1, -1, Milestone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Deadline(), ecorePackage.getEString(), "deadline", null, 0, 1, Milestone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductEClass, WorkProduct.class, "WorkProduct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkProduct_Content(), ecorePackage.getEString(), "content", null, 0, 1, WorkProduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductRelationshipEClass, WorkProductRelationship.class, "WorkProductRelationship",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductRelationship_Source(), this.getWorkProduct(), null, "source", null, 1, -1,
				WorkProductRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkProductRelationship_Target(), this.getWorkProduct(), null, "target", null, 1, -1,
				WorkProductRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processParameterEClass, ProcessParameter.class, "ProcessParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessParameter_Direction(), this.getParameterDirectionKind(), "direction", null, 0, 2,
				ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessParameter_Product(), this.getWorkProduct(), null, "product", null, 0, -1,
				ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workDefinitionEClass, WorkDefinition.class, "WorkDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acticityEClass, Acticity.class, "Acticity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActicity_Param(), this.getProcessParameter(), null, "param", null, 0, -1, Acticity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActicity_Performer(), this.getProcessPerformer(), null, "performer", null, 1, -1,
				Acticity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActicity_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1,
				Acticity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActicity_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1,
				Acticity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPerformerEClass, ProcessPerformer.class, "ProcessPerformer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessPerformer_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ProcessPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessPerformer_Role(), ecorePackage.getEString(), "role", null, 0, 1,
				ProcessPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(spemEClass, org.eclipse.sirius.sample.sPEM.SPEM.class, "SPEM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPEM_Worksequence(), this.getWorkSequence(), null, "worksequence", null, 0, -1,
				org.eclipse.sirius.sample.sPEM.SPEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPEM_Element(), this.getWorkBreakdownElement(), null, "element", null, 0, -1,
				org.eclipse.sirius.sample.sPEM.SPEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPEM_Milestone(), this.getMilestone(), null, "milestone", null, 0, -1,
				org.eclipse.sirius.sample.sPEM.SPEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPEM_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1,
				org.eclipse.sirius.sample.sPEM.SPEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPEM_Wprel(), this.getWorkProductRelationship(), null, "wprel", null, 0, -1,
				org.eclipse.sirius.sample.sPEM.SPEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workSenquenceKindEEnum, WorkSenquenceKind.class, "WorkSenquenceKind");
		addEEnumLiteral(workSenquenceKindEEnum, WorkSenquenceKind.FINISH_TO_START);
		addEEnumLiteral(workSenquenceKindEEnum, WorkSenquenceKind.FINSH_TO_FINISH);
		addEEnumLiteral(workSenquenceKindEEnum, WorkSenquenceKind.START_TO_START);
		addEEnumLiteral(workSenquenceKindEEnum, WorkSenquenceKind.START_TO_FINISH);

		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind");
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.OUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //SPEMPackageImpl
