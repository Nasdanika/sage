/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.Release;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.ReleaseImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ReleaseImpl#isReleased <em>Released</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ReleaseImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.ReleaseImpl#getOverhead <em>Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends ModelElementImpl implements Release {
	/**
	 * The default value of the '{@link #isReleased() <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReleased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELEASED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOverhead() <em>Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERHEAD_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeatures() {
		return (EList<Feature>) eDynamicGet(SagePackage.RELEASE__FEATURES, SagePackage.Literals.RELEASE__FEATURES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReleased() {
		return (Boolean) eDynamicGet(SagePackage.RELEASE__RELEASED, SagePackage.Literals.RELEASE__RELEASED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleased(boolean newReleased) {
		eDynamicSet(SagePackage.RELEASE__RELEASED, SagePackage.Literals.RELEASE__RELEASED, newReleased);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReleaseDate() {
		return (Date) eDynamicGet(SagePackage.RELEASE__RELEASE_DATE, SagePackage.Literals.RELEASE__RELEASE_DATE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(Date newReleaseDate) {
		eDynamicSet(SagePackage.RELEASE__RELEASE_DATE, SagePackage.Literals.RELEASE__RELEASE_DATE, newReleaseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOverhead() {
		return (Double) eDynamicGet(SagePackage.RELEASE__OVERHEAD, SagePackage.Literals.RELEASE__OVERHEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverhead(double newOverhead) {
		eDynamicSet(SagePackage.RELEASE__OVERHEAD, SagePackage.Literals.RELEASE__OVERHEAD, newOverhead);
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
		case SagePackage.RELEASE__FEATURES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeatures()).basicAdd(otherEnd, msgs);
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
		case SagePackage.RELEASE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
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
		case SagePackage.RELEASE__FEATURES:
			return getFeatures();
		case SagePackage.RELEASE__RELEASED:
			return isReleased();
		case SagePackage.RELEASE__RELEASE_DATE:
			return getReleaseDate();
		case SagePackage.RELEASE__OVERHEAD:
			return getOverhead();
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
		case SagePackage.RELEASE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case SagePackage.RELEASE__RELEASED:
			setReleased((Boolean) newValue);
			return;
		case SagePackage.RELEASE__RELEASE_DATE:
			setReleaseDate((Date) newValue);
			return;
		case SagePackage.RELEASE__OVERHEAD:
			setOverhead((Double) newValue);
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
		case SagePackage.RELEASE__FEATURES:
			getFeatures().clear();
			return;
		case SagePackage.RELEASE__RELEASED:
			setReleased(RELEASED_EDEFAULT);
			return;
		case SagePackage.RELEASE__RELEASE_DATE:
			setReleaseDate(RELEASE_DATE_EDEFAULT);
			return;
		case SagePackage.RELEASE__OVERHEAD:
			setOverhead(OVERHEAD_EDEFAULT);
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
		case SagePackage.RELEASE__FEATURES:
			return !getFeatures().isEmpty();
		case SagePackage.RELEASE__RELEASED:
			return isReleased() != RELEASED_EDEFAULT;
		case SagePackage.RELEASE__RELEASE_DATE:
			return RELEASE_DATE_EDEFAULT == null ? getReleaseDate() != null
					: !RELEASE_DATE_EDEFAULT.equals(getReleaseDate());
		case SagePackage.RELEASE__OVERHEAD:
			return getOverhead() != OVERHEAD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ReleaseImpl
