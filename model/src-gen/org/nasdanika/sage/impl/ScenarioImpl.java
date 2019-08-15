/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.rigel.IPackage;
import org.nasdanika.rigel.PackageElement;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.Scenario;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.ScenarioImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ScenarioImpl#getOfferings <em>Offerings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends ComparableModelElementImpl implements Scenario {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PackageElement> getElements() {
		return (EList<PackageElement>) eDynamicGet(SagePackage.SCENARIO__ELEMENTS,
				RigelPackage.Literals.IPACKAGE__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Offering> getOfferings() {
		return (EList<Offering>) eDynamicGet(SagePackage.SCENARIO__OFFERINGS, SagePackage.Literals.SCENARIO__OFFERINGS,
				true, true);
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
		case SagePackage.SCENARIO__OFFERINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOfferings()).basicAdd(otherEnd, msgs);
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
		case SagePackage.SCENARIO__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case SagePackage.SCENARIO__OFFERINGS:
			return ((InternalEList<?>) getOfferings()).basicRemove(otherEnd, msgs);
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
		case SagePackage.SCENARIO__ELEMENTS:
			return getElements();
		case SagePackage.SCENARIO__OFFERINGS:
			return getOfferings();
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
		case SagePackage.SCENARIO__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends PackageElement>) newValue);
			return;
		case SagePackage.SCENARIO__OFFERINGS:
			getOfferings().clear();
			getOfferings().addAll((Collection<? extends Offering>) newValue);
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
		case SagePackage.SCENARIO__ELEMENTS:
			getElements().clear();
			return;
		case SagePackage.SCENARIO__OFFERINGS:
			getOfferings().clear();
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
		case SagePackage.SCENARIO__ELEMENTS:
			return !getElements().isEmpty();
		case SagePackage.SCENARIO__OFFERINGS:
			return !getOfferings().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IPackage.class) {
			switch (derivedFeatureID) {
			case SagePackage.SCENARIO__ELEMENTS:
				return RigelPackage.IPACKAGE__ELEMENTS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IPackage.class) {
			switch (baseFeatureID) {
			case RigelPackage.IPACKAGE__ELEMENTS:
				return SagePackage.SCENARIO__ELEMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FulfillmentImpl
