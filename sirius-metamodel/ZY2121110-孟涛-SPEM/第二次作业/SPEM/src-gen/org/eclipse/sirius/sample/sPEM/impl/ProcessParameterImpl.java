/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sPEM.ParameterDirectionKind;
import org.eclipse.sirius.sample.sPEM.ProcessParameter;
import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.ProcessParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.ProcessParameterImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessParameterImpl extends MinimalEObjectImpl.Container implements ProcessParameter {
	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDirectionKind> direction;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.PROCESS_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDirectionKind> getDirection() {
		if (direction == null) {
			direction = new EDataTypeUniqueEList<ParameterDirectionKind>(ParameterDirectionKind.class, this,
					SPEMPackage.PROCESS_PARAMETER__DIRECTION);
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<WorkProduct>(WorkProduct.class, this,
					SPEMPackage.PROCESS_PARAMETER__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SPEMPackage.PROCESS_PARAMETER__PRODUCT:
			return ((InternalEList<?>) getProduct()).basicRemove(otherEnd, msgs);
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
		case SPEMPackage.PROCESS_PARAMETER__DIRECTION:
			return getDirection();
		case SPEMPackage.PROCESS_PARAMETER__PRODUCT:
			return getProduct();
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
		case SPEMPackage.PROCESS_PARAMETER__DIRECTION:
			getDirection().clear();
			getDirection().addAll((Collection<? extends ParameterDirectionKind>) newValue);
			return;
		case SPEMPackage.PROCESS_PARAMETER__PRODUCT:
			getProduct().clear();
			getProduct().addAll((Collection<? extends WorkProduct>) newValue);
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
		case SPEMPackage.PROCESS_PARAMETER__DIRECTION:
			getDirection().clear();
			return;
		case SPEMPackage.PROCESS_PARAMETER__PRODUCT:
			getProduct().clear();
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
		case SPEMPackage.PROCESS_PARAMETER__DIRECTION:
			return direction != null && !direction.isEmpty();
		case SPEMPackage.PROCESS_PARAMETER__PRODUCT:
			return product != null && !product.isEmpty();
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ProcessParameterImpl
