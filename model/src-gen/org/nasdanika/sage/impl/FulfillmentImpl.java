/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sage.Feature;
import org.nasdanika.sage.Fulfillment;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.FulfillmentImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FulfillmentImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FulfillmentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FulfillmentImpl extends MinimalEObjectImpl.Container implements Fulfillment {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 1.0;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.FULFILLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeature() {
		return (Feature) eDynamicGet(SagePackage.FULFILLMENT__FEATURE, SagePackage.Literals.FULFILLMENT__FEATURE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return (Feature) eDynamicGet(SagePackage.FULFILLMENT__FEATURE, SagePackage.Literals.FULFILLMENT__FEATURE, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(Feature newFeature) {
		eDynamicSet(SagePackage.FULFILLMENT__FEATURE, SagePackage.Literals.FULFILLMENT__FEATURE, newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double) eDynamicGet(SagePackage.FULFILLMENT__WEIGHT, SagePackage.Literals.FULFILLMENT__WEIGHT, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(SagePackage.FULFILLMENT__WEIGHT, SagePackage.Literals.FULFILLMENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(SagePackage.FULFILLMENT__DESCRIPTION, SagePackage.Literals.FULFILLMENT__DESCRIPTION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(SagePackage.FULFILLMENT__DESCRIPTION, SagePackage.Literals.FULFILLMENT__DESCRIPTION,
				newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagePackage.FULFILLMENT__FEATURE:
			if (resolve)
				return getFeature();
			return basicGetFeature();
		case SagePackage.FULFILLMENT__WEIGHT:
			return getWeight();
		case SagePackage.FULFILLMENT__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SagePackage.FULFILLMENT__FEATURE:
			setFeature((Feature) newValue);
			return;
		case SagePackage.FULFILLMENT__WEIGHT:
			setWeight((Double) newValue);
			return;
		case SagePackage.FULFILLMENT__DESCRIPTION:
			setDescription((String) newValue);
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
		case SagePackage.FULFILLMENT__FEATURE:
			setFeature((Feature) null);
			return;
		case SagePackage.FULFILLMENT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case SagePackage.FULFILLMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case SagePackage.FULFILLMENT__FEATURE:
			return basicGetFeature() != null;
		case SagePackage.FULFILLMENT__WEIGHT:
			return getWeight() != WEIGHT_EDEFAULT;
		case SagePackage.FULFILLMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //FulfillmentImpl
