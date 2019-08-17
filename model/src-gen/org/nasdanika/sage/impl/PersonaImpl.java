/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.rigel.Flow;
import org.nasdanika.rigel.Participant;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.Need;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.Persona;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.PersonaImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.PersonaImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.PersonaImpl#getOfferings <em>Offerings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends ComparableModelElementImpl implements Persona {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Flow> getFlows() {
		return (EList<Flow>) eDynamicGet(SagePackage.PERSONA__FLOWS, RigelPackage.Literals.PARTICIPANT__FLOWS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getNeeds() {
		return (EList<Need>) eDynamicGet(SagePackage.PERSONA__NEEDS, SagePackage.Literals.PERSONA__NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Offering> getOfferings() {
		return (EList<Offering>) eDynamicGet(SagePackage.PERSONA__OFFERINGS, SagePackage.Literals.PERSONA__OFFERINGS,
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
		case SagePackage.PERSONA__FLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFlows()).basicAdd(otherEnd, msgs);
		case SagePackage.PERSONA__OFFERINGS:
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
		case SagePackage.PERSONA__FLOWS:
			return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
		case SagePackage.PERSONA__NEEDS:
			return ((InternalEList<?>) getNeeds()).basicRemove(otherEnd, msgs);
		case SagePackage.PERSONA__OFFERINGS:
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
		case SagePackage.PERSONA__FLOWS:
			return getFlows();
		case SagePackage.PERSONA__NEEDS:
			return getNeeds();
		case SagePackage.PERSONA__OFFERINGS:
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
		case SagePackage.PERSONA__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends Flow>) newValue);
			return;
		case SagePackage.PERSONA__NEEDS:
			getNeeds().clear();
			getNeeds().addAll((Collection<? extends Need>) newValue);
			return;
		case SagePackage.PERSONA__OFFERINGS:
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
		case SagePackage.PERSONA__FLOWS:
			getFlows().clear();
			return;
		case SagePackage.PERSONA__NEEDS:
			getNeeds().clear();
			return;
		case SagePackage.PERSONA__OFFERINGS:
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
		case SagePackage.PERSONA__FLOWS:
			return !getFlows().isEmpty();
		case SagePackage.PERSONA__NEEDS:
			return !getNeeds().isEmpty();
		case SagePackage.PERSONA__OFFERINGS:
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
		if (baseClass == Participant.class) {
			switch (derivedFeatureID) {
			case SagePackage.PERSONA__FLOWS:
				return RigelPackage.PARTICIPANT__FLOWS;
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
		if (baseClass == Participant.class) {
			switch (baseFeatureID) {
			case RigelPackage.PARTICIPANT__FLOWS:
				return SagePackage.PERSONA__FLOWS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PersonaImpl
