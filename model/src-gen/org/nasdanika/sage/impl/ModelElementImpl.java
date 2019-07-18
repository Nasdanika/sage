/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sage.ModelElement;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.MODEL_ELEMENT;
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
	public String getName() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__NAME, SagePackage.Literals.MODEL_ELEMENT__NAME, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__NAME, SagePackage.Literals.MODEL_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__DESCRIPTION,
				SagePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__DESCRIPTION, SagePackage.Literals.MODEL_ELEMENT__DESCRIPTION,
				newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__CONFIGURATION,
				SagePackage.Literals.MODEL_ELEMENT__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__CONFIGURATION, SagePackage.Literals.MODEL_ELEMENT__CONFIGURATION,
				newConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagePackage.MODEL_ELEMENT__NAME:
			return getName();
		case SagePackage.MODEL_ELEMENT__DESCRIPTION:
			return getDescription();
		case SagePackage.MODEL_ELEMENT__CONFIGURATION:
			return getConfiguration();
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
		case SagePackage.MODEL_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case SagePackage.MODEL_ELEMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SagePackage.MODEL_ELEMENT__CONFIGURATION:
			setConfiguration((String) newValue);
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
		case SagePackage.MODEL_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SagePackage.MODEL_ELEMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SagePackage.MODEL_ELEMENT__CONFIGURATION:
			setConfiguration(CONFIGURATION_EDEFAULT);
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
		case SagePackage.MODEL_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case SagePackage.MODEL_ELEMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		case SagePackage.MODEL_ELEMENT__CONFIGURATION:
			return CONFIGURATION_EDEFAULT == null ? getConfiguration() != null
					: !CONFIGURATION_EDEFAULT.equals(getConfiguration());
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
