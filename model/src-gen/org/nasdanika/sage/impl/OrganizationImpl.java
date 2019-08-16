/**
 */
package org.nasdanika.sage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.rigel.IPackage;
import org.nasdanika.rigel.PackageElement;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.AbstractProduct;
import org.nasdanika.sage.Organization;
import org.nasdanika.sage.Persona;
import org.nasdanika.sage.SagePackage;
import org.nasdanika.sage.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.impl.OrganizationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OrganizationImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OrganizationImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.sage.impl.OrganizationImpl#getStrategies <em>Strategies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends HierarchicalModelElementImpl<Organization> implements Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagePackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PackageElement> getElements() {
		return (EList<PackageElement>) eDynamicGet(SagePackage.ORGANIZATION__ELEMENTS,
				RigelPackage.Literals.IPACKAGE__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getPersonas() {
		return (EList<Persona>) eDynamicGet(SagePackage.ORGANIZATION__PERSONAS,
				SagePackage.Literals.ORGANIZATION__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractProduct> getProducts() {
		return (EList<AbstractProduct>) eDynamicGet(SagePackage.ORGANIZATION__PRODUCTS,
				SagePackage.Literals.ORGANIZATION__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Strategy> getStrategies() {
		return (EList<Strategy>) eDynamicGet(SagePackage.ORGANIZATION__STRATEGIES,
				SagePackage.Literals.ORGANIZATION__STRATEGIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagePackage.ORGANIZATION__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case SagePackage.ORGANIZATION__PERSONAS:
			return ((InternalEList<?>) getPersonas()).basicRemove(otherEnd, msgs);
		case SagePackage.ORGANIZATION__PRODUCTS:
			return ((InternalEList<?>) getProducts()).basicRemove(otherEnd, msgs);
		case SagePackage.ORGANIZATION__STRATEGIES:
			return ((InternalEList<?>) getStrategies()).basicRemove(otherEnd, msgs);
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
		case SagePackage.ORGANIZATION__ELEMENTS:
			return getElements();
		case SagePackage.ORGANIZATION__PERSONAS:
			return getPersonas();
		case SagePackage.ORGANIZATION__PRODUCTS:
			return getProducts();
		case SagePackage.ORGANIZATION__STRATEGIES:
			return getStrategies();
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
		case SagePackage.ORGANIZATION__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends PackageElement>) newValue);
			return;
		case SagePackage.ORGANIZATION__PERSONAS:
			getPersonas().clear();
			getPersonas().addAll((Collection<? extends Persona>) newValue);
			return;
		case SagePackage.ORGANIZATION__PRODUCTS:
			getProducts().clear();
			getProducts().addAll((Collection<? extends AbstractProduct>) newValue);
			return;
		case SagePackage.ORGANIZATION__STRATEGIES:
			getStrategies().clear();
			getStrategies().addAll((Collection<? extends Strategy>) newValue);
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
		case SagePackage.ORGANIZATION__ELEMENTS:
			getElements().clear();
			return;
		case SagePackage.ORGANIZATION__PERSONAS:
			getPersonas().clear();
			return;
		case SagePackage.ORGANIZATION__PRODUCTS:
			getProducts().clear();
			return;
		case SagePackage.ORGANIZATION__STRATEGIES:
			getStrategies().clear();
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
		case SagePackage.ORGANIZATION__ELEMENTS:
			return !getElements().isEmpty();
		case SagePackage.ORGANIZATION__PERSONAS:
			return !getPersonas().isEmpty();
		case SagePackage.ORGANIZATION__PRODUCTS:
			return !getProducts().isEmpty();
		case SagePackage.ORGANIZATION__STRATEGIES:
			return !getStrategies().isEmpty();
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
		if (baseClass == IPackage.class) {
			switch (derivedFeatureID) {
			case SagePackage.ORGANIZATION__ELEMENTS:
				return RigelPackage.IPACKAGE__ELEMENTS;
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
		if (baseClass == IPackage.class) {
			switch (baseFeatureID) {
			case RigelPackage.IPACKAGE__ELEMENTS:
				return SagePackage.ORGANIZATION__ELEMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OrganizationImpl
