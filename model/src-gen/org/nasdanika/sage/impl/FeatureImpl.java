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
import org.nasdanika.sage.Dependency;
import org.nasdanika.sage.Edition;
import org.nasdanika.sage.Enabler;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.FeatureState;
import org.nasdanika.sage.Fulfillment;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.Persona;
import org.nasdanika.sage.Release;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getTargetAudiences <em>Target Audiences</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getFulfillments <em>Fulfillments</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getEnablers <em>Enablers</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getEditions <em>Editions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends HierarchicalModelElementImpl<Feature> implements Feature {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureState STATE_EDEFAULT = FeatureState.NEW;
	/**
	 * The default value of the '{@link #getDesign() <em>Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetAudiences() {
		return (EList<Persona>) eDynamicGet(SagePackage.FEATURE__TARGET_AUDIENCES,
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
		return (EList<Offering>) eDynamicGet(SagePackage.FEATURE__INCLUDES, SagePackage.Literals.OFFERING__INCLUDES,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Fulfillment> getFulfillments() {
		return (EList<Fulfillment>) eDynamicGet(SagePackage.FEATURE__FULFILLMENTS,
				SagePackage.Literals.OFFERING__FULFILLMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Dependency> getDependencies() {
		return (EList<Dependency>) eDynamicGet(SagePackage.FEATURE__DEPENDENCIES,
				SagePackage.Literals.FEATURE__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Enabler> getEnablers() {
		return (EList<Enabler>) eDynamicGet(SagePackage.FEATURE__ENABLERS, SagePackage.Literals.FEATURE__ENABLERS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSize() {
		return (Double) eDynamicGet(SagePackage.FEATURE__SIZE, SagePackage.Literals.FEATURE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(double newSize) {
		eDynamicSet(SagePackage.FEATURE__SIZE, SagePackage.Literals.FEATURE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureState getState() {
		return (FeatureState) eDynamicGet(SagePackage.FEATURE__STATE, SagePackage.Literals.FEATURE__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(FeatureState newState) {
		eDynamicSet(SagePackage.FEATURE__STATE, SagePackage.Literals.FEATURE__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesign() {
		return (String) eDynamicGet(SagePackage.FEATURE__DESIGN, SagePackage.Literals.FEATURE__DESIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesign(String newDesign) {
		eDynamicSet(SagePackage.FEATURE__DESIGN, SagePackage.Literals.FEATURE__DESIGN, newDesign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Component> getComponents() {
		return (EList<Component>) eDynamicGet(SagePackage.FEATURE__COMPONENTS, SagePackage.Literals.FEATURE__COMPONENTS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release getRelease() {
		return (Release) eDynamicGet(SagePackage.FEATURE__RELEASE, SagePackage.Literals.FEATURE__RELEASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release basicGetRelease() {
		return (Release) eDynamicGet(SagePackage.FEATURE__RELEASE, SagePackage.Literals.FEATURE__RELEASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelease(Release newRelease, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newRelease, SagePackage.FEATURE__RELEASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelease(Release newRelease) {
		eDynamicSet(SagePackage.FEATURE__RELEASE, SagePackage.Literals.FEATURE__RELEASE, newRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Edition> getEditions() {
		return (EList<Edition>) eDynamicGet(SagePackage.FEATURE__EDITIONS, SagePackage.Literals.FEATURE__EDITIONS, true,
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
		case SagePackage.FEATURE__TARGET_AUDIENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetAudiences()).basicAdd(otherEnd, msgs);
		case SagePackage.FEATURE__FULFILLMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFulfillments()).basicAdd(otherEnd, msgs);
		case SagePackage.FEATURE__RELEASE:
			Release release = basicGetRelease();
			if (release != null)
				msgs = ((InternalEObject) release).eInverseRemove(this, SagePackage.RELEASE__FEATURES, Release.class,
						msgs);
			return basicSetRelease((Release) otherEnd, msgs);
		case SagePackage.FEATURE__EDITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEditions()).basicAdd(otherEnd, msgs);
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
		case SagePackage.FEATURE__TARGET_AUDIENCES:
			return ((InternalEList<?>) getTargetAudiences()).basicRemove(otherEnd, msgs);
		case SagePackage.FEATURE__FULFILLMENTS:
			return ((InternalEList<?>) getFulfillments()).basicRemove(otherEnd, msgs);
		case SagePackage.FEATURE__DEPENDENCIES:
			return ((InternalEList<?>) getDependencies()).basicRemove(otherEnd, msgs);
		case SagePackage.FEATURE__ENABLERS:
			return ((InternalEList<?>) getEnablers()).basicRemove(otherEnd, msgs);
		case SagePackage.FEATURE__RELEASE:
			return basicSetRelease(null, msgs);
		case SagePackage.FEATURE__EDITIONS:
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
		case SagePackage.FEATURE__TARGET_AUDIENCES:
			return getTargetAudiences();
		case SagePackage.FEATURE__INCLUDES:
			return getIncludes();
		case SagePackage.FEATURE__FULFILLMENTS:
			return getFulfillments();
		case SagePackage.FEATURE__DEPENDENCIES:
			return getDependencies();
		case SagePackage.FEATURE__ENABLERS:
			return getEnablers();
		case SagePackage.FEATURE__SIZE:
			return getSize();
		case SagePackage.FEATURE__STATE:
			return getState();
		case SagePackage.FEATURE__DESIGN:
			return getDesign();
		case SagePackage.FEATURE__COMPONENTS:
			return getComponents();
		case SagePackage.FEATURE__RELEASE:
			if (resolve)
				return getRelease();
			return basicGetRelease();
		case SagePackage.FEATURE__EDITIONS:
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
		case SagePackage.FEATURE__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			getTargetAudiences().addAll((Collection<? extends Persona>) newValue);
			return;
		case SagePackage.FEATURE__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Offering>) newValue);
			return;
		case SagePackage.FEATURE__FULFILLMENTS:
			getFulfillments().clear();
			getFulfillments().addAll((Collection<? extends Fulfillment>) newValue);
			return;
		case SagePackage.FEATURE__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends Dependency>) newValue);
			return;
		case SagePackage.FEATURE__ENABLERS:
			getEnablers().clear();
			getEnablers().addAll((Collection<? extends Enabler>) newValue);
			return;
		case SagePackage.FEATURE__SIZE:
			setSize((Double) newValue);
			return;
		case SagePackage.FEATURE__STATE:
			setState((FeatureState) newValue);
			return;
		case SagePackage.FEATURE__DESIGN:
			setDesign((String) newValue);
			return;
		case SagePackage.FEATURE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case SagePackage.FEATURE__RELEASE:
			setRelease((Release) newValue);
			return;
		case SagePackage.FEATURE__EDITIONS:
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
		case SagePackage.FEATURE__TARGET_AUDIENCES:
			getTargetAudiences().clear();
			return;
		case SagePackage.FEATURE__INCLUDES:
			getIncludes().clear();
			return;
		case SagePackage.FEATURE__FULFILLMENTS:
			getFulfillments().clear();
			return;
		case SagePackage.FEATURE__DEPENDENCIES:
			getDependencies().clear();
			return;
		case SagePackage.FEATURE__ENABLERS:
			getEnablers().clear();
			return;
		case SagePackage.FEATURE__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case SagePackage.FEATURE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case SagePackage.FEATURE__DESIGN:
			setDesign(DESIGN_EDEFAULT);
			return;
		case SagePackage.FEATURE__COMPONENTS:
			getComponents().clear();
			return;
		case SagePackage.FEATURE__RELEASE:
			setRelease((Release) null);
			return;
		case SagePackage.FEATURE__EDITIONS:
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
		case SagePackage.FEATURE__TARGET_AUDIENCES:
			return !getTargetAudiences().isEmpty();
		case SagePackage.FEATURE__INCLUDES:
			return !getIncludes().isEmpty();
		case SagePackage.FEATURE__FULFILLMENTS:
			return !getFulfillments().isEmpty();
		case SagePackage.FEATURE__DEPENDENCIES:
			return !getDependencies().isEmpty();
		case SagePackage.FEATURE__ENABLERS:
			return !getEnablers().isEmpty();
		case SagePackage.FEATURE__SIZE:
			return getSize() != SIZE_EDEFAULT;
		case SagePackage.FEATURE__STATE:
			return getState() != STATE_EDEFAULT;
		case SagePackage.FEATURE__DESIGN:
			return DESIGN_EDEFAULT == null ? getDesign() != null : !DESIGN_EDEFAULT.equals(getDesign());
		case SagePackage.FEATURE__COMPONENTS:
			return !getComponents().isEmpty();
		case SagePackage.FEATURE__RELEASE:
			return basicGetRelease() != null;
		case SagePackage.FEATURE__EDITIONS:
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
		if (baseClass == Offering.class) {
			switch (derivedFeatureID) {
			case SagePackage.FEATURE__TARGET_AUDIENCES:
				return SagePackage.OFFERING__TARGET_AUDIENCES;
			case SagePackage.FEATURE__INCLUDES:
				return SagePackage.OFFERING__INCLUDES;
			case SagePackage.FEATURE__FULFILLMENTS:
				return SagePackage.OFFERING__FULFILLMENTS;
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
				return SagePackage.FEATURE__TARGET_AUDIENCES;
			case SagePackage.OFFERING__INCLUDES:
				return SagePackage.FEATURE__INCLUDES;
			case SagePackage.OFFERING__FULFILLMENTS:
				return SagePackage.FEATURE__FULFILLMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FeatureImpl
