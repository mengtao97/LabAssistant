/**
 */
package org.eclipse.sirius.sample.sPEM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.sPEM.SPEMPackage;
import org.eclipse.sirius.sample.sPEM.WorkProduct;
import org.eclipse.sirius.sample.sPEM.WorkProductRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkProductRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sPEM.impl.WorkProductRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductRelationshipImpl extends MinimalEObjectImpl.Container implements WorkProductRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPEMPackage.Literals.WORK_PRODUCT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this,
					SPEMPackage.WORK_PRODUCT_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this,
					SPEMPackage.WORK_PRODUCT_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__SOURCE:
			return getSource();
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__TARGET:
			return getTarget();
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
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends WorkProduct>) newValue);
			return;
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends WorkProduct>) newValue);
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
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__SOURCE:
			getSource().clear();
			return;
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__TARGET:
			getTarget().clear();
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
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__SOURCE:
			return source != null && !source.isEmpty();
		case SPEMPackage.WORK_PRODUCT_RELATIONSHIP__TARGET:
			return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkProductRelationshipImpl
