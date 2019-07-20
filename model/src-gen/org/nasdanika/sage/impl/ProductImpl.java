/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sage.Component;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.Persona;
import org.nasdanika.sage.Product;
import org.nasdanika.sage.ProductStage;
import org.nasdanika.sage.Release;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getTargetAudiences <em>Target Audiences</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends AbstractProductImpl implements Product {
	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final ProductStage STAGE_EDEFAULT = ProductStage.PLANNING;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Persona> getTargetAudiences() {
		return (EList<Persona>) eDynamicGet(SagePackage.PRODUCT__TARGET_AUDIENCES,
				SagePackage.Literals.OFFERING__TARGET_AUDIENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getFeatures() {
		return (EList<Feature>) eDynamicGet(SagePackage.PRODUCT__FEATURES, SagePackage.Literals.PRODUCT__FEATURES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Release> getReleases() {
		return (EList<Release>) eDynamicGet(SagePackage.PRODUCT__RELEASES, SagePackage.Literals.PRODUCT__RELEASES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStage getStage() {
		return (ProductStage) eDynamicGet(SagePackage.PRODUCT__STAGE, SagePackage.Literals.PRODUCT__STAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(ProductStage newStage) {
		eDynamicSet(SagePackage.PRODUCT__STAGE, SagePackage.Literals.PRODUCT__STAGE, newStage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getComponents() {
		return (EList<Component>) eDynamicGet(SagePackage.PRODUCT__COMPONENTS, SagePackage.Literals.PRODUCT__COMPONENTS,
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
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetAudiences()).basicAdd(otherEnd, msgs);
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
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return ((InternalEList<?>) getTargetAudiences()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__RELEASES:
			return ((InternalEList<?>) getReleases()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
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
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return getTargetAudiences();
		case SagePackage.PRODUCT__FEATURES:
			return getFeatures();
		case SagePackage.PRODUCT__RELEASES:
			return getReleases();
		case SagePackage.PRODUCT__STAGE:
			return getStage();
		case SagePackage.PRODUCT__COMPONENTS:
			return getComponents();
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
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			getTargetAudiences().addAll((Collection<? extends Persona>) newValue);
			return;
		case SagePackage.PRODUCT__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case SagePackage.PRODUCT__RELEASES:
			getReleases().clear();
			getReleases().addAll((Collection<? extends Release>) newValue);
			return;
		case SagePackage.PRODUCT__STAGE:
			setStage((ProductStage) newValue);
			return;
		case SagePackage.PRODUCT__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
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
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			return;
		case SagePackage.PRODUCT__FEATURES:
			getFeatures().clear();
			return;
		case SagePackage.PRODUCT__RELEASES:
			getReleases().clear();
			return;
		case SagePackage.PRODUCT__STAGE:
			setStage(STAGE_EDEFAULT);
			return;
		case SagePackage.PRODUCT__COMPONENTS:
			getComponents().clear();
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
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return !getTargetAudiences().isEmpty();
		case SagePackage.PRODUCT__FEATURES:
			return !getFeatures().isEmpty();
		case SagePackage.PRODUCT__RELEASES:
			return !getReleases().isEmpty();
		case SagePackage.PRODUCT__STAGE:
			return getStage() != STAGE_EDEFAULT;
		case SagePackage.PRODUCT__COMPONENTS:
			return !getComponents().isEmpty();
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
		if (baseClass == Offering.class) {
			switch (derivedFeatureID) {
			case SagePackage.PRODUCT__TARGET_AUDIENCES:
				return SagePackage.OFFERING__TARGET_AUDIENCES;
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
		if (baseClass == Offering.class) {
			switch (baseFeatureID) {
			case SagePackage.OFFERING__TARGET_AUDIENCES:
				return SagePackage.PRODUCT__TARGET_AUDIENCES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductImpl
