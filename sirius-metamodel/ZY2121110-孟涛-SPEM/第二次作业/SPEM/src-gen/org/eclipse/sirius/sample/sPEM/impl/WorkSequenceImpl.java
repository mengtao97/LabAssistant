/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkBreakdownElement;
import org.eclipse.sirius.sample.sPEM.WorkSenquenceKind;
import org.eclipse.sirius.sample.sPEM.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl#getLinkKind <em>Link Kind</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkSequenceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkSequenceImpl extends MinimalEObjectImpl.Container implements WorkSequence {
	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBreakdownElement> successor;

	/**
	 * The cached value of the '{@link #getLinkKind() <em>Link Kind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkKind()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSenquenceKind> linkKind;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBreakdownElement> predecessor;

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
	protected WorkSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.WORK_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkBreakdownElement> getSuccessor() {
		if (successor == null) {
			successor = new EObjectResolvingEList<WorkBreakdownElement>(WorkBreakdownElement.class, this,
					SPEMPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSenquenceKind> getLinkKind() {
		if (linkKind == null) {
			linkKind = new EDataTypeUniqueEList<WorkSenquenceKind>(WorkSenquenceKind.class, this,
					SPEMPackage.WORK_SEQUENCE__LINK_KIND);
		}
		return linkKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkBreakdownElement> getPredecessor() {
		if (predecessor == null) {
			predecessor = new EObjectResolvingEList<WorkBreakdownElement>(WorkBreakdownElement.class, this,
					SPEMPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return predecessor;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SPEMPackage.WORK_SEQUENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SPEMPackage.WORK_SEQUENCE__SUCCESSOR:
			return getSuccessor();
		case SPEMPackage.WORK_SEQUENCE__LINK_KIND:
			return getLinkKind();
		case SPEMPackage.WORK_SEQUENCE__PREDECESSOR:
			return getPredecessor();
		case SPEMPackage.WORK_SEQUENCE__NAME:
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
		case SPEMPackage.WORK_SEQUENCE__SUCCESSOR:
			getSuccessor().clear();
			getSuccessor().addAll((Collection<? extends WorkBreakdownElement>) newValue);
			return;
		case SPEMPackage.WORK_SEQUENCE__LINK_KIND:
			getLinkKind().clear();
			getLinkKind().addAll((Collection<? extends WorkSenquenceKind>) newValue);
			return;
		case SPEMPackage.WORK_SEQUENCE__PREDECESSOR:
			getPredecessor().clear();
			getPredecessor().addAll((Collection<? extends WorkBreakdownElement>) newValue);
			return;
		case SPEMPackage.WORK_SEQUENCE__NAME:
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
		case SPEMPackage.WORK_SEQUENCE__SUCCESSOR:
			getSuccessor().clear();
			return;
		case SPEMPackage.WORK_SEQUENCE__LINK_KIND:
			getLinkKind().clear();
			return;
		case SPEMPackage.WORK_SEQUENCE__PREDECESSOR:
			getPredecessor().clear();
			return;
		case SPEMPackage.WORK_SEQUENCE__NAME:
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
		case SPEMPackage.WORK_SEQUENCE__SUCCESSOR:
			return successor != null && !successor.isEmpty();
		case SPEMPackage.WORK_SEQUENCE__LINK_KIND:
			return linkKind != null && !linkKind.isEmpty();
		case SPEMPackage.WORK_SEQUENCE__PREDECESSOR:
			return predecessor != null && !predecessor.isEmpty();
		case SPEMPackage.WORK_SEQUENCE__NAME:
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
		result.append(" (linkKind: ");
		result.append(linkKind);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkSequenceImpl
