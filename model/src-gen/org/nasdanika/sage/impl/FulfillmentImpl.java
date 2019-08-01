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
import org.nasdanika.sage.Fulfillment;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.FulfillmentImpl#getOfferings <em>Offerings</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FulfillmentImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.FulfillmentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FulfillmentImpl extends MinimalEObjectImpl.Container implements Fulfillment {
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
	protected FulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.FULFILLMENT;
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
	public EList<Offering> getOfferings() {
		return (EList<Offering>) eDynamicGet(SagePackage.FULFILLMENT__OFFERINGS,
				SagePackage.Literals.FULFILLMENT__OFFERINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double) eDynamicGet(SagePackage.FULFILLMENT__WEIGHT, SagePackage.Literals.FULFILLMENT__WEIGHT, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(SagePackage.FULFILLMENT__WEIGHT, SagePackage.Literals.FULFILLMENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(SagePackage.FULFILLMENT__DESCRIPTION, SagePackage.Literals.FULFILLMENT__DESCRIPTION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(SagePackage.FULFILLMENT__DESCRIPTION, SagePackage.Literals.FULFILLMENT__DESCRIPTION,
				newDescription);
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
		case SagePackage.FULFILLMENT__OFFERINGS:
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
		case SagePackage.FULFILLMENT__OFFERINGS:
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
		case SagePackage.FULFILLMENT__OFFERINGS:
			return getOfferings();
		case SagePackage.FULFILLMENT__WEIGHT:
			return getWeight();
		case SagePackage.FULFILLMENT__DESCRIPTION:
			return getDescription();
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
		case SagePackage.FULFILLMENT__OFFERINGS:
			getOfferings().clear();
			getOfferings().addAll((Collection<? extends Offering>) newValue);
			return;
		case SagePackage.FULFILLMENT__WEIGHT:
			setWeight((Double) newValue);
			return;
		case SagePackage.FULFILLMENT__DESCRIPTION:
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
		case SagePackage.FULFILLMENT__OFFERINGS:
			getOfferings().clear();
			return;
		case SagePackage.FULFILLMENT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case SagePackage.FULFILLMENT__DESCRIPTION:
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
		case SagePackage.FULFILLMENT__OFFERINGS:
			return !getOfferings().isEmpty();
		case SagePackage.FULFILLMENT__WEIGHT:
			return getWeight() != WEIGHT_EDEFAULT;
		case SagePackage.FULFILLMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //FulfillmentImpl
