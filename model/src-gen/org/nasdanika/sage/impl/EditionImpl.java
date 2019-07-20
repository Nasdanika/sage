/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sage.Edition;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.EditionImpl#getBases <em>Bases</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.EditionImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditionImpl extends OfferingImpl implements Edition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.EDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Edition> getBases() {
		return (EList<Edition>) eDynamicGet(SagePackage.EDITION__BASES, SagePackage.Literals.EDITION__BASES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getFeatures() {
		return (EList<Feature>) eDynamicGet(SagePackage.EDITION__FEATURES, SagePackage.Literals.EDITION__FEATURES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagePackage.EDITION__BASES:
			return getBases();
		case SagePackage.EDITION__FEATURES:
			return getFeatures();
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
		case SagePackage.EDITION__BASES:
			getBases().clear();
			getBases().addAll((Collection<? extends Edition>) newValue);
			return;
		case SagePackage.EDITION__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
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
		case SagePackage.EDITION__BASES:
			getBases().clear();
			return;
		case SagePackage.EDITION__FEATURES:
			getFeatures().clear();
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
		case SagePackage.EDITION__BASES:
			return !getBases().isEmpty();
		case SagePackage.EDITION__FEATURES:
			return !getFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EditionImpl
