/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.rigel.Engineer;
import org.nasdanika.rigel.Issue;
import org.nasdanika.rigel.RigelPackage;
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
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ModelElementImpl#getUrl <em>Url</em>}</li>
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Engineer> getOwners() {
		return (EList<Engineer>) eDynamicGet(SagePackage.MODEL_ELEMENT__OWNERS,
				RigelPackage.Literals.ENGINEERED_ELEMENT__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>) eDynamicGet(SagePackage.MODEL_ELEMENT__ISSUES,
				RigelPackage.Literals.ENGINEERED_ELEMENT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__NAME, SagePackage.Literals.MODEL_ELEMENT__NAME, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__NAME, SagePackage.Literals.MODEL_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__URL, SagePackage.Literals.MODEL_ELEMENT__URL, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__URL, SagePackage.Literals.MODEL_ELEMENT__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__DESCRIPTION,
				SagePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__DESCRIPTION, SagePackage.Literals.MODEL_ELEMENT__DESCRIPTION,
				newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfiguration() {
		return (String) eDynamicGet(SagePackage.MODEL_ELEMENT__CONFIGURATION,
				SagePackage.Literals.MODEL_ELEMENT__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(String newConfiguration) {
		eDynamicSet(SagePackage.MODEL_ELEMENT__CONFIGURATION, SagePackage.Literals.MODEL_ELEMENT__CONFIGURATION,
				newConfiguration);
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
		case SagePackage.MODEL_ELEMENT__OWNERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwners()).basicAdd(otherEnd, msgs);
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
		case SagePackage.MODEL_ELEMENT__OWNERS:
			return ((InternalEList<?>) getOwners()).basicRemove(otherEnd, msgs);
		case SagePackage.MODEL_ELEMENT__ISSUES:
			return ((InternalEList<?>) getIssues()).basicRemove(otherEnd, msgs);
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
		case SagePackage.MODEL_ELEMENT__OWNERS:
			return getOwners();
		case SagePackage.MODEL_ELEMENT__ISSUES:
			return getIssues();
		case SagePackage.MODEL_ELEMENT__NAME:
			return getName();
		case SagePackage.MODEL_ELEMENT__URL:
			return getUrl();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SagePackage.MODEL_ELEMENT__OWNERS:
			getOwners().clear();
			getOwners().addAll((Collection<? extends Engineer>) newValue);
			return;
		case SagePackage.MODEL_ELEMENT__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case SagePackage.MODEL_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case SagePackage.MODEL_ELEMENT__URL:
			setUrl((String) newValue);
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
		case SagePackage.MODEL_ELEMENT__OWNERS:
			getOwners().clear();
			return;
		case SagePackage.MODEL_ELEMENT__ISSUES:
			getIssues().clear();
			return;
		case SagePackage.MODEL_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SagePackage.MODEL_ELEMENT__URL:
			setUrl(URL_EDEFAULT);
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
		case SagePackage.MODEL_ELEMENT__OWNERS:
			return !getOwners().isEmpty();
		case SagePackage.MODEL_ELEMENT__ISSUES:
			return !getIssues().isEmpty();
		case SagePackage.MODEL_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case SagePackage.MODEL_ELEMENT__URL:
			return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
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
