/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sPEM.Milestone;
import org.eclipse.sirius.sample.sPEM.SPEM;
import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkBreakdownElement;
import org.eclipse.sirius.sample.sPEM.WorkProductRelationship;
import org.eclipse.sirius.sample.sPEM.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPEM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl#getWorksequence <em>Worksequence</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.SPEMImpl#getWprel <em>Wprel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPEMImpl extends MinimalEObjectImpl.Container implements SPEM {
	/**
	 * The cached value of the '{@link #getWorksequence() <em>Worksequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksequence()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> worksequence;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBreakdownElement> element;

	/**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected EList<Milestone> milestone;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWprel() <em>Wprel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWprel()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductRelationship> wprel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPEMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.SPEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getWorksequence() {
		if (worksequence == null) {
			worksequence = new EObjectContainmentEList<WorkSequence>(WorkSequence.class, this,
					SPEMPackage.SPEM__WORKSEQUENCE);
		}
		return worksequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkBreakdownElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<WorkBreakdownElement>(WorkBreakdownElement.class, this,
					SPEMPackage.SPEM__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Milestone> getMilestone() {
		if (milestone == null) {
			milestone = new EObjectContainmentEList<Milestone>(Milestone.class, this, SPEMPackage.SPEM__MILESTONE);
		}
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPEMPackage.SPEM__MODEL_NAME, oldModelName,
					modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductRelationship> getWprel() {
		if (wprel == null) {
			wprel = new EObjectContainmentEList<WorkProductRelationship>(WorkProductRelationship.class, this,
					SPEMPackage.SPEM__WPREL);
		}
		return wprel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPEMPackage.SPEM__WORKSEQUENCE:
			return ((InternalEList<?>) getWorksequence()).basicRemove(otherEnd, msgs);
		case SPEMPackage.SPEM__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
		case SPEMPackage.SPEM__MILESTONE:
			return ((InternalEList<?>) getMilestone()).basicRemove(otherEnd, msgs);
		case SPEMPackage.SPEM__WPREL:
			return ((InternalEList<?>) getWprel()).basicRemove(otherEnd, msgs);
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
		case SPEMPackage.SPEM__WORKSEQUENCE:
			return getWorksequence();
		case SPEMPackage.SPEM__ELEMENT:
			return getElement();
		case SPEMPackage.SPEM__MILESTONE:
			return getMilestone();
		case SPEMPackage.SPEM__MODEL_NAME:
			return getModelName();
		case SPEMPackage.SPEM__WPREL:
			return getWprel();
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
		case SPEMPackage.SPEM__WORKSEQUENCE:
			getWorksequence().clear();
			getWorksequence().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SPEMPackage.SPEM__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends WorkBreakdownElement>) newValue);
			return;
		case SPEMPackage.SPEM__MILESTONE:
			getMilestone().clear();
			getMilestone().addAll((Collection<? extends Milestone>) newValue);
			return;
		case SPEMPackage.SPEM__MODEL_NAME:
			setModelName((String) newValue);
			return;
		case SPEMPackage.SPEM__WPREL:
			getWprel().clear();
			getWprel().addAll((Collection<? extends WorkProductRelationship>) newValue);
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
		case SPEMPackage.SPEM__WORKSEQUENCE:
			getWorksequence().clear();
			return;
		case SPEMPackage.SPEM__ELEMENT:
			getElement().clear();
			return;
		case SPEMPackage.SPEM__MILESTONE:
			getMilestone().clear();
			return;
		case SPEMPackage.SPEM__MODEL_NAME:
			setModelName(MODEL_NAME_EDEFAULT);
			return;
		case SPEMPackage.SPEM__WPREL:
			getWprel().clear();
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
		case SPEMPackage.SPEM__WORKSEQUENCE:
			return worksequence != null && !worksequence.isEmpty();
		case SPEMPackage.SPEM__ELEMENT:
			return element != null && !element.isEmpty();
		case SPEMPackage.SPEM__MILESTONE:
			return milestone != null && !milestone.isEmpty();
		case SPEMPackage.SPEM__MODEL_NAME:
			return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
		case SPEMPackage.SPEM__WPREL:
			return wprel != null && !wprel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //SPEMImpl
