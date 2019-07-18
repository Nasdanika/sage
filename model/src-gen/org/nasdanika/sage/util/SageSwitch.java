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
				result = caseModelElement(organization);
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
