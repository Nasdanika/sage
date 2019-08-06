/**
 */
package org.nasdanika.sage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sage.SagePackage
 * @generated
 */
public class SageSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SageSwitch() {
		if (modelPackage == null) {
			modelPackage = SagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SagePackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T1 result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.OFFERING: {
			Offering offering = (Offering) theEObject;
			T1 result = caseOffering(offering);
			if (result == null)
				result = caseModelElement(offering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.COMPARABLE_MODEL_ELEMENT: {
			ComparableModelElement comparableModelElement = (ComparableModelElement) theEObject;
			T1 result = caseComparableModelElement(comparableModelElement);
			if (result == null)
				result = caseModelElement(comparableModelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.HIERARCHICAL_MODEL_ELEMENT: {
			HierarchicalModelElement<?> hierarchicalModelElement = (HierarchicalModelElement<?>) theEObject;
			T1 result = caseHierarchicalModelElement(hierarchicalModelElement);
			if (result == null)
				result = caseModelElement(hierarchicalModelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.HIERARCHICAL_COMPARABLE_MODEL_ELEMENT: {
			HierarchicalComparableModelElement<?> hierarchicalComparableModelElement = (HierarchicalComparableModelElement<?>) theEObject;
			T1 result = caseHierarchicalComparableModelElement(hierarchicalComparableModelElement);
			if (result == null)
				result = caseHierarchicalModelElement(hierarchicalComparableModelElement);
			if (result == null)
				result = caseComparableModelElement(hierarchicalComparableModelElement);
			if (result == null)
				result = caseModelElement(hierarchicalComparableModelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.ORGANIZATION: {
			Organization organization = (Organization) theEObject;
			T1 result = caseOrganization(organization);
			if (result == null)
				result = caseHierarchicalModelElement(organization);
			if (result == null)
				result = caseModelElement(organization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.PERSONA: {
			Persona persona = (Persona) theEObject;
			T1 result = casePersona(persona);
			if (result == null)
				result = caseComparableModelElement(persona);
			if (result == null)
				result = caseModelElement(persona);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.NEED: {
			Need need = (Need) theEObject;
			T1 result = caseNeed(need);
			if (result == null)
				result = caseHierarchicalComparableModelElement(need);
			if (result == null)
				result = caseHierarchicalModelElement(need);
			if (result == null)
				result = caseComparableModelElement(need);
			if (result == null)
				result = caseModelElement(need);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.STRATEGY: {
			Strategy strategy = (Strategy) theEObject;
			T1 result = caseStrategy(strategy);
			if (result == null)
				result = caseHierarchicalComparableModelElement(strategy);
			if (result == null)
				result = caseHierarchicalModelElement(strategy);
			if (result == null)
				result = caseComparableModelElement(strategy);
			if (result == null)
				result = caseModelElement(strategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.ABSTRACT_PRODUCT: {
			AbstractProduct abstractProduct = (AbstractProduct) theEObject;
			T1 result = caseAbstractProduct(abstractProduct);
			if (result == null)
				result = caseModelElement(abstractProduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.PORTFOLIO: {
			Portfolio portfolio = (Portfolio) theEObject;
			T1 result = casePortfolio(portfolio);
			if (result == null)
				result = caseAbstractProduct(portfolio);
			if (result == null)
				result = caseHierarchicalModelElement(portfolio);
			if (result == null)
				result = caseModelElement(portfolio);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.PRODUCT: {
			Product product = (Product) theEObject;
			T1 result = caseProduct(product);
			if (result == null)
				result = caseAbstractProduct(product);
			if (result == null)
				result = caseOffering(product);
			if (result == null)
				result = caseModelElement(product);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T1 result = caseFeature(feature);
			if (result == null)
				result = caseHierarchicalModelElement(feature);
			if (result == null)
				result = caseOffering(feature);
			if (result == null)
				result = caseModelElement(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.EDITION: {
			Edition edition = (Edition) theEObject;
			T1 result = caseEdition(edition);
			if (result == null)
				result = caseOffering(edition);
			if (result == null)
				result = caseModelElement(edition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.RELEASE: {
			Release release = (Release) theEObject;
			T1 result = caseRelease(release);
			if (result == null)
				result = caseModelElement(release);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.SCENARIO: {
			Scenario scenario = (Scenario) theEObject;
			T1 result = caseScenario(scenario);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.DEPENDENCY: {
			Dependency dependency = (Dependency) theEObject;
			T1 result = caseDependency(dependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.ENABLER: {
			Enabler enabler = (Enabler) theEObject;
			T1 result = caseEnabler(enabler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SagePackage.COMPONENT: {
			Component component = (Component) theEObject;
			T1 result = caseComponent(component);
			if (result == null)
				result = caseHierarchicalModelElement(component);
			if (result == null)
				result = caseModelElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComparableModelElement(ComparableModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchical Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchical Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseHierarchicalModelElement(HierarchicalModelElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchical Comparable Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchical Comparable Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseHierarchicalComparableModelElement(HierarchicalComparableModelElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePersona(Persona object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Need</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Need</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNeed(Need object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractProduct(AbstractProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portfolio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portfolio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePortfolio(Portfolio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOffering(Offering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEdition(Edition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnabler(Enabler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //SageSwitch
