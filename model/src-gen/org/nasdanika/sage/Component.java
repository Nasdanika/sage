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
 * @model annotation="urn:org.nasdanika label_ru='\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442' documentation_ru='\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430. \u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b \u043c\u043e\u0433\u0443\u0442 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c\u0441\u044f \u043d\u0435\u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e \u0440\u0430\u0437\u043d\u044b\u043c\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u0430\u043c\u0438, \u043d\u043e \u0432\u044b\u043f\u0443\u0441\u043a\u0430\u044e\u0442\u0441\u044f \u0432\u043c\u0435\u0441\u0442\u0435 \u043a\u0430\u043a \u0447\u0430\u0441\u0442\u044c \u0432\u044b\u043f\u0443\u0441\u043a\u0430 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430.'"
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
