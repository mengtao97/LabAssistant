/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.sPEM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPEMFactoryImpl extends EFactoryImpl implements SPEMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SPEMFactory init() {
		try {
			SPEMFactory theSPEMFactory = (SPEMFactory) EPackage.Registry.INSTANCE.getEFactory(SPEMPackage.eNS_URI);
			if (theSPEMFactory != null) {
				return theSPEMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SPEMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPEMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SPEMPackage.WORK_SEQUENCE:
			return createWorkSequence();
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT:
			return createWorkBreakdownElement();
		case SPEMPackage.MILESTONE:
			return createMilestone();
		case SPEMPackage.WORK_PRODUCT:
			return createWorkProduct();
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP:
			return createWorkProductRelationship();
		case SPEMPackage.PROCESS_PARAMETER:
			return createProcessParameter();
		case SPEMPackage.WORK_DEFINITION:
			return createWorkDefinition();
		case SPEMPackage.CONSTRAINT:
			return createConstraint();
		case SPEMPackage.ACTICITY:
			return createActicity();
		case SPEMPackage.PROCESS_PERFORMER:
			return createProcessPerformer();
		case SPEMPackage.SPEM:
			return createSPEM();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SPEMPackage.WORK_SENQUENCE_KIND:
			return createWorkSenquenceKindFromString(eDataType, initialValue);
		case SPEMPackage.PARAMETER_DIRECTION_KIND:
			return createParameterDirectionKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SPEMPackage.WORK_SENQUENCE_KIND:
			return convertWorkSenquenceKindToString(eDataType, instanceValue);
		case SPEMPackage.PARAMETER_DIRECTION_KIND:
			return convertParameterDirectionKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequence createWorkSequence() {
		WorkSequenceImpl workSequence = new WorkSequenceImpl();
		return workSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement createWorkBreakdownElement() {
		WorkBreakdownElementImpl workBreakdownElement = new WorkBreakdownElementImpl();
		return workBreakdownElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct createWorkProduct() {
		WorkProductImpl workProduct = new WorkProductImpl();
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductRelationship createWorkProductRelationship() {
		WorkProductRelationshipImpl workProductRelationship = new WorkProductRelationshipImpl();
		return workProductRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessParameter createProcessParameter() {
		ProcessParameterImpl processParameter = new ProcessParameterImpl();
		return processParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition createWorkDefinition() {
		WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Acticity createActicity() {
		ActicityImpl acticity = new ActicityImpl();
		return acticity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPerformer createProcessPerformer() {
		ProcessPerformerImpl processPerformer = new ProcessPerformerImpl();
		return processPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPEM createSPEM() {
		SPEMImpl spem = new SPEMImpl();
		return spem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSenquenceKind createWorkSenquenceKindFromString(EDataType eDataType, String initialValue) {
		WorkSenquenceKind result = WorkSenquenceKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkSenquenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPEMPackage getSPEMPackage() {
		return (SPEMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SPEMPackage getPackage() {
		return SPEMPackage.eINSTANCE;
	}

} //SPEMFactoryImpl
