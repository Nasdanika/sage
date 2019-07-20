/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sage.ComparableModelElement;
import org.nasdanika.sage.HierarchicalComparableModelElement;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Comparable Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.HierarchicalComparableModelElementImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.HierarchicalComparableModelElementImpl#getEffectiveWeight <em>Effective Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HierarchicalComparableModelElementImpl<T> extends HierarchicalModelElementImpl<T>
		implements HierarchicalComparableModelElement<T> {
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
	 * The default value of the '{@link #getEffectiveWeight() <em>Effective Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFECTIVE_WEIGHT_EDEFAULT = 1.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchicalComparableModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return (Double) eDynamicGet(SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT,
				SagePackage.Literals.COMPARABLE_MODEL_ELEMENT__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		eDynamicSet(SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT,
				SagePackage.Literals.COMPARABLE_MODEL_ELEMENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffectiveWeight() {
		return (Double) eDynamicGet(SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT,
				SagePackage.Literals.COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT:
			return getWeight();
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT:
			return getEffectiveWeight();
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
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT:
			setWeight((Double) newValue);
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
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
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
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT:
			return getWeight() != WEIGHT_EDEFAULT;
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT:
			return getEffectiveWeight() != EFFECTIVE_WEIGHT_EDEFAULT;
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
		if (baseClass == ComparableModelElement.class) {
			switch (derivedFeatureID) {
			case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT:
				return SagePackage.COMPARABLE_MODEL_ELEMENT__WEIGHT;
			case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT:
				return SagePackage.COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT;
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
		if (baseClass == ComparableModelElement.class) {
			switch (baseFeatureID) {
			case SagePackage.COMPARABLE_MODEL_ELEMENT__WEIGHT:
				return SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT;
			case SagePackage.COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT:
				return SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HierarchicalComparableModelElementImpl
