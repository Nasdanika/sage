/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sage.Dependency;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.DependencyImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.DependencyImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.DependencyImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.DependencyImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final double IMPACT_EDEFAULT = 0.5;

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
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.DEPENDENCY;
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
	public boolean isOptional() {
		return (Boolean) eDynamicGet(SagePackage.DEPENDENCY__OPTIONAL, SagePackage.Literals.DEPENDENCY__OPTIONAL, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		eDynamicSet(SagePackage.DEPENDENCY__OPTIONAL, SagePackage.Literals.DEPENDENCY__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getDependency() {
		return (Feature) eDynamicGet(SagePackage.DEPENDENCY__DEPENDENCY, SagePackage.Literals.DEPENDENCY__DEPENDENCY,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetDependency() {
		return (Feature) eDynamicGet(SagePackage.DEPENDENCY__DEPENDENCY, SagePackage.Literals.DEPENDENCY__DEPENDENCY,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependency(Feature newDependency) {
		eDynamicSet(SagePackage.DEPENDENCY__DEPENDENCY, SagePackage.Literals.DEPENDENCY__DEPENDENCY, newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getImpact() {
		return (Double) eDynamicGet(SagePackage.DEPENDENCY__IMPACT, SagePackage.Literals.DEPENDENCY__IMPACT, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpact(double newImpact) {
		eDynamicSet(SagePackage.DEPENDENCY__IMPACT, SagePackage.Literals.DEPENDENCY__IMPACT, newImpact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(SagePackage.DEPENDENCY__DESCRIPTION, SagePackage.Literals.DEPENDENCY__DESCRIPTION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(SagePackage.DEPENDENCY__DESCRIPTION, SagePackage.Literals.DEPENDENCY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagePackage.DEPENDENCY__OPTIONAL:
			return isOptional();
		case SagePackage.DEPENDENCY__DEPENDENCY:
			if (resolve)
				return getDependency();
			return basicGetDependency();
		case SagePackage.DEPENDENCY__IMPACT:
			return getImpact();
		case SagePackage.DEPENDENCY__DESCRIPTION:
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
		case SagePackage.DEPENDENCY__OPTIONAL:
			setOptional((Boolean) newValue);
			return;
		case SagePackage.DEPENDENCY__DEPENDENCY:
			setDependency((Feature) newValue);
			return;
		case SagePackage.DEPENDENCY__IMPACT:
			setImpact((Double) newValue);
			return;
		case SagePackage.DEPENDENCY__DESCRIPTION:
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
		case SagePackage.DEPENDENCY__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
			return;
		case SagePackage.DEPENDENCY__DEPENDENCY:
			setDependency((Feature) null);
			return;
		case SagePackage.DEPENDENCY__IMPACT:
			setImpact(IMPACT_EDEFAULT);
			return;
		case SagePackage.DEPENDENCY__DESCRIPTION:
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
		case SagePackage.DEPENDENCY__OPTIONAL:
			return isOptional() != OPTIONAL_EDEFAULT;
		case SagePackage.DEPENDENCY__DEPENDENCY:
			return basicGetDependency() != null;
		case SagePackage.DEPENDENCY__IMPACT:
			return getImpact() != IMPACT_EDEFAULT;
		case SagePackage.DEPENDENCY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //DependencyImpl
