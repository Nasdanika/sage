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
import org.nasdanika.sage.Component;
import org.nasdanika.sage.Edition;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.Scenario;
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
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getTargetAudiences <em>Target Audiences</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ProductImpl#getEditions <em>Editions</em>}</li>
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
	@Override
	public EList<Requirement> getRequiredBy() {
		return (EList<Requirement>) eDynamicGet(SagePackage.PRODUCT__REQUIRED_BY,
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
		return (EList<Persona>) eDynamicGet(SagePackage.PRODUCT__TARGET_AUDIENCES,
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
		return (EList<Offering>) eDynamicGet(SagePackage.PRODUCT__INCLUDES, SagePackage.Literals.OFFERING__INCLUDES,
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
		return (EList<Scenario>) eDynamicGet(SagePackage.PRODUCT__SCENARIOS, SagePackage.Literals.OFFERING__SCENARIOS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
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
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>) eDynamicGet(SagePackage.PRODUCT__RELEASES, SagePackage.Literals.PRODUCT__RELEASES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStage getStage() {
		return (ProductStage) eDynamicGet(SagePackage.PRODUCT__STAGE, SagePackage.Literals.PRODUCT__STAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(ProductStage newStage) {
		eDynamicSet(SagePackage.PRODUCT__STAGE, SagePackage.Literals.PRODUCT__STAGE, newStage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
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
	public EList<Edition> getEditions() {
		return (EList<Edition>) eDynamicGet(SagePackage.PRODUCT__EDITIONS, SagePackage.Literals.PRODUCT__EDITIONS, true,
				true);
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
		case SagePackage.PRODUCT__REQUIRED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredBy()).basicAdd(otherEnd, msgs);
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetAudiences()).basicAdd(otherEnd, msgs);
		case SagePackage.PRODUCT__SCENARIOS:
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
		case SagePackage.PRODUCT__REQUIRED_BY:
			return ((InternalEList<?>) getRequiredBy()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return ((InternalEList<?>) getTargetAudiences()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__SCENARIOS:
			return ((InternalEList<?>) getScenarios()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__RELEASES:
			return ((InternalEList<?>) getReleases()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case SagePackage.PRODUCT__EDITIONS:
			return ((InternalEList<?>) getEditions()).basicRemove(otherEnd, msgs);
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
		case SagePackage.PRODUCT__REQUIRED_BY:
			return getRequiredBy();
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return getTargetAudiences();
		case SagePackage.PRODUCT__INCLUDES:
			return getIncludes();
		case SagePackage.PRODUCT__SCENARIOS:
			return getScenarios();
		case SagePackage.PRODUCT__FEATURES:
			return getFeatures();
		case SagePackage.PRODUCT__RELEASES:
			return getReleases();
		case SagePackage.PRODUCT__STAGE:
			return getStage();
		case SagePackage.PRODUCT__COMPONENTS:
			return getComponents();
		case SagePackage.PRODUCT__EDITIONS:
			return getEditions();
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
		case SagePackage.PRODUCT__REQUIRED_BY:
			getRequiredBy().clear();
			getRequiredBy().addAll((Collection<? extends Requirement>) newValue);
			return;
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			getTargetAudiences().addAll((Collection<? extends Persona>) newValue);
			return;
		case SagePackage.PRODUCT__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Offering>) newValue);
			return;
		case SagePackage.PRODUCT__SCENARIOS:
			getScenarios().clear();
			getScenarios().addAll((Collection<? extends Scenario>) newValue);
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
		case SagePackage.PRODUCT__EDITIONS:
			getEditions().clear();
			getEditions().addAll((Collection<? extends Edition>) newValue);
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
		case SagePackage.PRODUCT__REQUIRED_BY:
			getRequiredBy().clear();
			return;
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			return;
		case SagePackage.PRODUCT__INCLUDES:
			getIncludes().clear();
			return;
		case SagePackage.PRODUCT__SCENARIOS:
			getScenarios().clear();
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
		case SagePackage.PRODUCT__EDITIONS:
			getEditions().clear();
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
		case SagePackage.PRODUCT__REQUIRED_BY:
			return !getRequiredBy().isEmpty();
		case SagePackage.PRODUCT__TARGET_AUDIENCES:
			return !getTargetAudiences().isEmpty();
		case SagePackage.PRODUCT__INCLUDES:
			return !getIncludes().isEmpty();
		case SagePackage.PRODUCT__SCENARIOS:
			return !getScenarios().isEmpty();
		case SagePackage.PRODUCT__FEATURES:
			return !getFeatures().isEmpty();
		case SagePackage.PRODUCT__RELEASES:
			return !getReleases().isEmpty();
		case SagePackage.PRODUCT__STAGE:
			return getStage() != STAGE_EDEFAULT;
		case SagePackage.PRODUCT__COMPONENTS:
			return !getComponents().isEmpty();
		case SagePackage.PRODUCT__EDITIONS:
			return !getEditions().isEmpty();
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
			case SagePackage.PRODUCT__REQUIRED_BY:
				return RigelPackage.CAPABILITY__REQUIRED_BY;
			default:
				return -1;
			}
		}
		if (baseClass == Offering.class) {
			switch (derivedFeatureID) {
			case SagePackage.PRODUCT__TARGET_AUDIENCES:
				return SagePackage.OFFERING__TARGET_AUDIENCES;
			case SagePackage.PRODUCT__INCLUDES:
				return SagePackage.OFFERING__INCLUDES;
			case SagePackage.PRODUCT__SCENARIOS:
				return SagePackage.OFFERING__SCENARIOS;
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
				return SagePackage.PRODUCT__REQUIRED_BY;
			default:
				return -1;
			}
		}
		if (baseClass == Offering.class) {
			switch (baseFeatureID) {
			case SagePackage.OFFERING__TARGET_AUDIENCES:
				return SagePackage.PRODUCT__TARGET_AUDIENCES;
			case SagePackage.OFFERING__INCLUDES:
				return SagePackage.PRODUCT__INCLUDES;
			case SagePackage.OFFERING__SCENARIOS:
				return SagePackage.PRODUCT__SCENARIOS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductImpl
