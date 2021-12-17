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

import org.eclipse.sirius.sample.sPEM.Acticity;
import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkBreakdownElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl#getNested <em>Nested</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkBreakdownElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkBreakdownElementImpl extends MinimalEObjectImpl.Container implements WorkBreakdownElement {
	/**
	 * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested()
	 * @generated
	 * @ordered
	 */
	protected EList<Acticity> nested;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkBreakdownElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.WORK_BREAKDOWN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acticity> getNested() {
		if (nested == null) {
			nested = new EObjectContainmentEList<Acticity>(Acticity.class, this,
					SPEMPackage.WORK_BREAKDOWN_ELEMENT__NESTED);
		}
		return nested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPEMPackage.WORK_BREAKDOWN_ELEMENT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPEMPackage.WORK_BREAKDOWN_ELEMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NESTED:
			return ((InternalEList<?>) getNested()).basicRemove(otherEnd, msgs);
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
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NESTED:
			return getNested();
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__DESCRIPTION:
			return getDescription();
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NAME:
			return getName();
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
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NESTED:
			getNested().clear();
			getNested().addAll((Collection<? extends Acticity>) newValue);
			return;
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NAME:
			setName((String) newValue);
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
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NESTED:
			getNested().clear();
			return;
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
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
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NESTED:
			return nested != null && !nested.isEmpty();
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SPEMPackage.WORK_BREAKDOWN_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkBreakdownElementImpl
