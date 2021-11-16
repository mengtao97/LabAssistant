/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sPEM.Acticity;
import org.eclipse.sirius.sample.sPEM.Constraint;
import org.eclipse.sirius.sample.sPEM.ProcessParameter;
import org.eclipse.sirius.sample.sPEM.ProcessPerformer;
import org.eclipse.sirius.sample.sPEM.SPEMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acticity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.ActicityImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.ActicityImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.ActicityImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.ActicityImpl#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActicityImpl extends WorkDefinitionImpl implements Acticity {
	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessParameter> param;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessPerformer> performer;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postcondition;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.ACTICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessParameter> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<ProcessParameter>(ProcessParameter.class, this,
					SPEMPackage.ACTICITY__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ProcessPerformer>(ProcessPerformer.class, this,
					SPEMPackage.ACTICITY__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					SPEMPackage.ACTICITY__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					SPEMPackage.ACTICITY__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPEMPackage.ACTICITY__PARAM:
			return ((InternalEList<?>) getParam()).basicRemove(otherEnd, msgs);
		case SPEMPackage.ACTICITY__PERFORMER:
			return ((InternalEList<?>) getPerformer()).basicRemove(otherEnd, msgs);
		case SPEMPackage.ACTICITY__POSTCONDITION:
			return ((InternalEList<?>) getPostcondition()).basicRemove(otherEnd, msgs);
		case SPEMPackage.ACTICITY__PRECONDITION:
			return ((InternalEList<?>) getPrecondition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SPEMPackage.ACTICITY__PARAM:
			return getParam();
		case SPEMPackage.ACTICITY__PERFORMER:
			return getPerformer();
		case SPEMPackage.ACTICITY__POSTCONDITION:
			return getPostcondition();
		case SPEMPackage.ACTICITY__PRECONDITION:
			return getPrecondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SPEMPackage.ACTICITY__PARAM:
			getParam().clear();
			getParam().addAll((Collection<? extends ProcessParameter>) newValue);
			return;
		case SPEMPackage.ACTICITY__PERFORMER:
			getPerformer().clear();
			getPerformer().addAll((Collection<? extends ProcessPerformer>) newValue);
			return;
		case SPEMPackage.ACTICITY__POSTCONDITION:
			getPostcondition().clear();
			getPostcondition().addAll((Collection<? extends Constraint>) newValue);
			return;
		case SPEMPackage.ACTICITY__PRECONDITION:
			getPrecondition().clear();
			getPrecondition().addAll((Collection<? extends Constraint>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SPEMPackage.ACTICITY__PARAM:
			getParam().clear();
			return;
		case SPEMPackage.ACTICITY__PERFORMER:
			getPerformer().clear();
			return;
		case SPEMPackage.ACTICITY__POSTCONDITION:
			getPostcondition().clear();
			return;
		case SPEMPackage.ACTICITY__PRECONDITION:
			getPrecondition().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SPEMPackage.ACTICITY__PARAM:
			return param != null && !param.isEmpty();
		case SPEMPackage.ACTICITY__PERFORMER:
			return performer != null && !performer.isEmpty();
		case SPEMPackage.ACTICITY__POSTCONDITION:
			return postcondition != null && !postcondition.isEmpty();
		case SPEMPackage.ACTICITY__PRECONDITION:
			return precondition != null && !precondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActicityImpl
