/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.sage.AbstractProduct;
import org.nasdanika.sage.HierarchicalModelElement;
import org.nasdanika.sage.Portfolio;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portfolio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.PortfolioImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.PortfolioImpl#getLinkedChildren <em>Linked Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortfolioImpl extends AbstractProductImpl implements Portfolio {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortfolioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.PORTFOLIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractProduct> getChildren() {
		return (EList<AbstractProduct>) eDynamicGet(SagePackage.PORTFOLIO__CHILDREN,
				SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HierarchicalModelElement<AbstractProduct>> getLinkedChildren() {
		return (EList<HierarchicalModelElement<AbstractProduct>>) eDynamicGet(SagePackage.PORTFOLIO__LINKED_CHILDREN,
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
		case SagePackage.PORTFOLIO__CHILDREN:
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
		case SagePackage.PORTFOLIO__CHILDREN:
			return getChildren();
		case SagePackage.PORTFOLIO__LINKED_CHILDREN:
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
		case SagePackage.PORTFOLIO__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends AbstractProduct>) newValue);
			return;
		case SagePackage.PORTFOLIO__LINKED_CHILDREN:
			getLinkedChildren().clear();
			getLinkedChildren().addAll((Collection<? extends HierarchicalModelElement<AbstractProduct>>) newValue);
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
		case SagePackage.PORTFOLIO__CHILDREN:
			getChildren().clear();
			return;
		case SagePackage.PORTFOLIO__LINKED_CHILDREN:
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
		case SagePackage.PORTFOLIO__CHILDREN:
			return !getChildren().isEmpty();
		case SagePackage.PORTFOLIO__LINKED_CHILDREN:
			return !getLinkedChildren().isEmpty();
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
		if (baseClass == HierarchicalModelElement.class) {
			switch (derivedFeatureID) {
			case SagePackage.PORTFOLIO__CHILDREN:
				return SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN;
			case SagePackage.PORTFOLIO__LINKED_CHILDREN:
				return SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN;
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
		if (baseClass == HierarchicalModelElement.class) {
			switch (baseFeatureID) {
			case SagePackage.HIERARCHICAL_MODEL_ELEMENT__CHILDREN:
				return SagePackage.PORTFOLIO__CHILDREN;
			case SagePackage.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN:
				return SagePackage.PORTFOLIO__LINKED_CHILDREN;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PortfolioImpl
