/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sage.Enabler;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.EnablerImpl#getBoost <em>Boost</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.EnablerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.EnablerImpl#getEnabler <em>Enabler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnablerImpl extends MinimalEObjectImpl.Container implements Enabler {
	/**
	 * The default value of the '{@link #getBoost() <em>Boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoost()
	 * @generated
	 * @ordered
	 */
	protected static final double BOOST_EDEFAULT = 0.0;

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
	protected EnablerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.ENABLER;
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
	public double getBoost() {
		return (Double) eDynamicGet(SagePackage.ENABLER__BOOST, SagePackage.Literals.ENABLER__BOOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoost(double newBoost) {
		eDynamicSet(SagePackage.ENABLER__BOOST, SagePackage.Literals.ENABLER__BOOST, newBoost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(SagePackage.ENABLER__DESCRIPTION, SagePackage.Literals.ENABLER__DESCRIPTION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(SagePackage.ENABLER__DESCRIPTION, SagePackage.Literals.ENABLER__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getEnabler() {
		return (Feature) eDynamicGet(SagePackage.ENABLER__ENABLER, SagePackage.Literals.ENABLER__ENABLER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetEnabler() {
		return (Feature) eDynamicGet(SagePackage.ENABLER__ENABLER, SagePackage.Literals.ENABLER__ENABLER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabler(Feature newEnabler) {
		eDynamicSet(SagePackage.ENABLER__ENABLER, SagePackage.Literals.ENABLER__ENABLER, newEnabler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagePackage.ENABLER__BOOST:
			return getBoost();
		case SagePackage.ENABLER__DESCRIPTION:
			return getDescription();
		case SagePackage.ENABLER__ENABLER:
			if (resolve)
				return getEnabler();
			return basicGetEnabler();
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
		case SagePackage.ENABLER__BOOST:
			setBoost((Double) newValue);
			return;
		case SagePackage.ENABLER__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SagePackage.ENABLER__ENABLER:
			setEnabler((Feature) newValue);
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
		case SagePackage.ENABLER__BOOST:
			setBoost(BOOST_EDEFAULT);
			return;
		case SagePackage.ENABLER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SagePackage.ENABLER__ENABLER:
			setEnabler((Feature) null);
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
		case SagePackage.ENABLER__BOOST:
			return getBoost() != BOOST_EDEFAULT;
		case SagePackage.ENABLER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		case SagePackage.ENABLER__ENABLER:
			return basicGetEnabler() != null;
		}
		return super.eIsSet(featureID);
	}

} //EnablerImpl
