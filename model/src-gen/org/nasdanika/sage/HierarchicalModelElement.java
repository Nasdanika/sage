/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.HierarchicalModelElement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getHierarchicalModelElement()
 * @model abstract="true"
 * @generated
 */
public interface HierarchicalModelElement<T> extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getHierarchicalModelElement_Children()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	EList<T> getChildren();

} // HierarchicalModelElement
