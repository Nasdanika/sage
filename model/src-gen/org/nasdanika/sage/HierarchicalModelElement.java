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
 *        annotation="urn:org.nasdanika label_ru='\u0418\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438' documentation_ru='\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043c\u043e\u0436\u0435\u0442 \u044f\u0432\u043b\u044f\u0442\u044c\u0441\u044f \u0447\u0430\u0441\u0442\u044c\u044e \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0438, \u0442\u043e \u0435\u0441\u0442\u044c \u0438\u043c\u0435\u0442\u044c \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0435 \u0438 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b'"
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
