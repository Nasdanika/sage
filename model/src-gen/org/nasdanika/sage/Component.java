/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Product component. Components may be developed independently by different teams, but are released all together as part of a product release.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Component#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends HierarchicalModelElement<Component> {

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component may depend on other components in the same product or other products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getComponent_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Component> getDependencies();
} // Component
