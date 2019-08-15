/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.rigel.Capability;
import org.nasdanika.rigel.Requirement;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.Scenario;
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
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getTargetAudiences <em>Target Audiences</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OfferingImpl#getScenarios <em>Scenarios</em>}</li>
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
	public EList<Requirement> getRequiredBy() {
		return (EList<Requirement>) eDynamicGet(SagePackage.OFFERING__REQUIRED_BY,
				RigelPackage.Literals.CAPABILITY__REQUIRED_BY, true, true);
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
	public EList<Scenario> getScenarios() {
		return (EList<Scenario>) eDynamicGet(SagePackage.OFFERING__SCENARIOS, SagePackage.Literals.OFFERING__SCENARIOS,
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
		case SagePackage.OFFERING__REQUIRED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredBy()).basicAdd(otherEnd, msgs);
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetAudiences()).basicAdd(otherEnd, msgs);
		case SagePackage.OFFERING__SCENARIOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenarios()).basicAdd(otherEnd, msgs);
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
		case SagePackage.OFFERING__REQUIRED_BY:
			return ((InternalEList<?>) getRequiredBy()).basicRemove(otherEnd, msgs);
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return ((InternalEList<?>) getTargetAudiences()).basicRemove(otherEnd, msgs);
		case SagePackage.OFFERING__SCENARIOS:
			return ((InternalEList<?>) getScenarios()).basicRemove(otherEnd, msgs);
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
		case SagePackage.OFFERING__REQUIRED_BY:
			return getRequiredBy();
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return getTargetAudiences();
		case SagePackage.OFFERING__INCLUDES:
			return getIncludes();
		case SagePackage.OFFERING__SCENARIOS:
			return getScenarios();
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
		case SagePackage.OFFERING__REQUIRED_BY:
			getRequiredBy().clear();
			getRequiredBy().addAll((Collection<? extends Requirement>) newValue);
			return;
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			getTargetAudiences().addAll((Collection<? extends Persona>) newValue);
			return;
		case SagePackage.OFFERING__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Offering>) newValue);
			return;
		case SagePackage.OFFERING__SCENARIOS:
			getScenarios().clear();
			getScenarios().addAll((Collection<? extends Scenario>) newValue);
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
		case SagePackage.OFFERING__REQUIRED_BY:
			getRequiredBy().clear();
			return;
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			return;
		case SagePackage.OFFERING__INCLUDES:
			getIncludes().clear();
			return;
		case SagePackage.OFFERING__SCENARIOS:
			getScenarios().clear();
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
		case SagePackage.OFFERING__REQUIRED_BY:
			return !getRequiredBy().isEmpty();
		case SagePackage.OFFERING__TARGET_AUDIENCES:
			return !getTargetAudiences().isEmpty();
		case SagePackage.OFFERING__INCLUDES:
			return !getIncludes().isEmpty();
		case SagePackage.OFFERING__SCENARIOS:
			return !getScenarios().isEmpty();
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
		if (baseClass == Capability.class) {
			switch (derivedFeatureID) {
			case SagePackage.OFFERING__REQUIRED_BY:
				return RigelPackage.CAPABILITY__REQUIRED_BY;
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
		if (baseClass == Capability.class) {
			switch (baseFeatureID) {
			case RigelPackage.CAPABILITY__REQUIRED_BY:
				return SagePackage.OFFERING__REQUIRED_BY;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OfferingImpl
