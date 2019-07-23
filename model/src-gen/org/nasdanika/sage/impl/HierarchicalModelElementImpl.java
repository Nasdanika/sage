/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sage.HierarchicalModelElement;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.HierarchicalModelElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.HierarchicalModelElementImpl#getLinkedChildren <em>Linked Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HierarchicalModelElementImpl<T> extends ModelElementImpl implements HierarchicalModelElement<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchicalModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<T> getChildren() {
		return (EList<T>) eDynamicGet(SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HierarchicalModelElement<T>> getLinkedChildren() {
		return (EList<HierarchicalModelElement<T>>) eDynamicGet(SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN,
				SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN:
			return getChildren();
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN:
			return getLinkedChildren();
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
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends T>) newValue);
			return;
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN:
			getLinkedChildren().clear();
			getLinkedChildren().addAll((Collection<? extends HierarchicalModelElement<T>>) newValue);
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
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN:
			getChildren().clear();
			return;
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN:
			getLinkedChildren().clear();
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
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN:
			return !getChildren().isEmpty();
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN:
			return !getLinkedChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HierarchicalModelElementImpl
