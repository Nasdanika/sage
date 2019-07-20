/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model element which can form a hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.HierarchicalModelElement#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.sage.HierarchicalModelElement#getLinkedChildren <em>Linked Children</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Element's children contained by the element.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getHierarchicalModelElement_Children()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	EList<T> getChildren();

	/**
	 * Returns the value of the '<em><b>Linked Children</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.HierarchicalModelElement}<code>&lt;T&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linked children, not contained by the element. Links allow to build logical hierarchies with elements residing in different resources (files). Breaking a model into multiple resources simplifies collaborative work on the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Children</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getHierarchicalModelElement_LinkedChildren()
	 * @model
	 * @generated
	 */
	EList<HierarchicalModelElement<T>> getLinkedChildren();

} // HierarchicalModelElement
