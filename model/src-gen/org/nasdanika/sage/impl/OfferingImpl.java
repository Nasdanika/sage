/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sage.Fulfillment;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.Persona;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getTargetAudiences <em>Target Audiences</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getFulfillments <em>Fulfillments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OfferingImpl extends ModelElementImpl implements Offering {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.OFFERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetAudiences() {
		return (EList<Persona>) eDynamicGet(SagePackage.OFFERING__TARGET_AUDIENCES,
				SagePackage.Literals.OFFERING__TARGET_AUDIENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Offering> getIncludes() {
		return (EList<Offering>) eDynamicGet(SagePackage.OFFERING__INCLUDES, SagePackage.Literals.OFFERING__INCLUDES,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Fulfillment> getFulfillments() {
		return (EList<Fulfillment>) eDynamicGet(SagePackage.OFFERING__FULFILLMENTS,
				SagePackage.Literals.OFFERING__FULFILLMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetAudiences()).basicAdd(otherEnd, msgs);
		case SagePackage.OFFERING__FULFILLMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFulfillments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return ((InternalEList<?>) getTargetAudiences()).basicRemove(otherEnd, msgs);
		case SagePackage.OFFERING__FULFILLMENTS:
			return ((InternalEList<?>) getFulfillments()).basicRemove(otherEnd, msgs);
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
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return getTargetAudiences();
		case SagePackage.OFFERING__INCLUDES:
			return getIncludes();
		case SagePackage.OFFERING__FULFILLMENTS:
			return getFulfillments();
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
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			getTargetAudiences().addAll((Collection<? extends Persona>) newValue);
			return;
		case SagePackage.OFFERING__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Offering>) newValue);
			return;
		case SagePackage.OFFERING__FULFILLMENTS:
			getFulfillments().clear();
			getFulfillments().addAll((Collection<? extends Fulfillment>) newValue);
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
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			return;
		case SagePackage.OFFERING__INCLUDES:
			getIncludes().clear();
			return;
		case SagePackage.OFFERING__FULFILLMENTS:
			getFulfillments().clear();
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
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return !getTargetAudiences().isEmpty();
		case SagePackage.OFFERING__INCLUDES:
			return !getIncludes().isEmpty();
		case SagePackage.OFFERING__FULFILLMENTS:
			return !getFulfillments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OfferingImpl
