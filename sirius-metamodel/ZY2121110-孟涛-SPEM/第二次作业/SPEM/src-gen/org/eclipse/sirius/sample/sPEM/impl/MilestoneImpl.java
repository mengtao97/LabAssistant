/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.sPEM.Milestone;
import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.MilestoneImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.MilestoneImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MilestoneImpl extends MinimalEObjectImpl.Container implements Milestone {
	/**
	 * The cached value of the '{@link #getRequire() <em>Require</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequire()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> require;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final String DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected String deadline = DEADLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilestoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.MILESTONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getRequire() {
		if (require == null) {
			require = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, SPEMPackage.MILESTONE__REQUIRE);
		}
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(String newDeadline) {
		String oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPEMPackage.MILESTONE__DEADLINE, oldDeadline,
					deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SPEMPackage.MILESTONE__REQUIRE:
			return getRequire();
		case SPEMPackage.MILESTONE__DEADLINE:
			return getDeadline();
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
		case SPEMPackage.MILESTONE__REQUIRE:
			getRequire().clear();
			getRequire().addAll((Collection<? extends WorkProduct>) newValue);
			return;
		case SPEMPackage.MILESTONE__DEADLINE:
			setDeadline((String) newValue);
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
		case SPEMPackage.MILESTONE__REQUIRE:
			getRequire().clear();
			return;
		case SPEMPackage.MILESTONE__DEADLINE:
			setDeadline(DEADLINE_EDEFAULT);
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
		case SPEMPackage.MILESTONE__REQUIRE:
			return require != null && !require.isEmpty();
		case SPEMPackage.MILESTONE__DEADLINE:
			return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
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
		result.append(" (deadline: ");
		result.append(deadline);
		result.append(')');
		return result.toString();
	}

} //MilestoneImpl
