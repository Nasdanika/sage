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
import org.nasdanika.sage.Enabler;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.FeatureState;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getEnablers <em>Enablers</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FeatureImpl#getComponents <em>Components</em>}</li>
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
	protected static final FeatureState DESIGN_EDEFAULT = FeatureState.NEW;

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
	public EList<Enabler> getEnablers() {
		return (EList<Enabler>) eDynamicGet(SagePackage.FEATURE__ENABLERS, SagePackage.Literals.FEATURE__ENABLERS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return (Double) eDynamicGet(SagePackage.FEATURE__SIZE, SagePackage.Literals.FEATURE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		eDynamicSet(SagePackage.FEATURE__SIZE, SagePackage.Literals.FEATURE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureState getState() {
		return (FeatureState) eDynamicGet(SagePackage.FEATURE__STATE, SagePackage.Literals.FEATURE__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(FeatureState newState) {
		eDynamicSet(SagePackage.FEATURE__STATE, SagePackage.Literals.FEATURE__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureState getDesign() {
		return (FeatureState) eDynamicGet(SagePackage.FEATURE__DESIGN, SagePackage.Literals.FEATURE__DESIGN, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(FeatureState newDesign) {
		eDynamicSet(SagePackage.FEATURE__DESIGN, SagePackage.Literals.FEATURE__DESIGN, newDesign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagePackage.FEATURE__DEPENDENCIES:
			return ((InternalEList<?>) getDependencies()).basicRemove(otherEnd, msgs);
		case SagePackage.FEATURE__ENABLERS:
			return ((InternalEList<?>) getEnablers()).basicRemove(otherEnd, msgs);
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
			setDesign((FeatureState) newValue);
			return;
		case SagePackage.FEATURE__COMPONENTS:
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
		case SagePackage.FEATURE__DEPENDENCIES:
			return !getDependencies().isEmpty();
		case SagePackage.FEATURE__ENABLERS:
			return !getEnablers().isEmpty();
		case SagePackage.FEATURE__SIZE:
			return getSize() != SIZE_EDEFAULT;
		case SagePackage.FEATURE__STATE:
			return getState() != STATE_EDEFAULT;
		case SagePackage.FEATURE__DESIGN:
			return getDesign() != DESIGN_EDEFAULT;
		case SagePackage.FEATURE__COMPONENTS:
			return !getComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
