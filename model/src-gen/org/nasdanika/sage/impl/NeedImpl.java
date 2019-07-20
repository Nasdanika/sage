/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.sage.Fulfillment;
import org.nasdanika.sage.Need;
import org.nasdanika.sage.NeedCategory;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.NeedImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.NeedImpl#getFulfillments <em>Fulfillments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends HierarchicalComparableModelElementImpl<Need> implements Need {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final NeedCategory CATEGORY_EDEFAULT = NeedCategory.BASIC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedCategory getCategory() {
		return (NeedCategory) eDynamicGet(SagePackage.NEED__CATEGORY, SagePackage.Literals.NEED__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(NeedCategory newCategory) {
		eDynamicSet(SagePackage.NEED__CATEGORY, SagePackage.Literals.NEED__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Fulfillment> getFulfillments() {
		return (EList<Fulfillment>) eDynamicGet(SagePackage.NEED__FULFILLMENTS, SagePackage.Literals.NEED__FULFILLMENTS,
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
		case SagePackage.NEED__FULFILLMENTS:
			return ((InternalEList<?>) getFulfillments()).basicRemove(otherEnd, msgs);
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
		case SagePackage.NEED__CATEGORY:
			return getCategory();
		case SagePackage.NEED__FULFILLMENTS:
			return getFulfillments();
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
		case SagePackage.NEED__CATEGORY:
			setCategory((NeedCategory) newValue);
			return;
		case SagePackage.NEED__FULFILLMENTS:
			getFulfillments().clear();
			getFulfillments().addAll((Collection<? extends Fulfillment>) newValue);
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
		case SagePackage.NEED__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case SagePackage.NEED__FULFILLMENTS:
			getFulfillments().clear();
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
		case SagePackage.NEED__CATEGORY:
			return getCategory() != CATEGORY_EDEFAULT;
		case SagePackage.NEED__FULFILLMENTS:
			return !getFulfillments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NeedImpl
