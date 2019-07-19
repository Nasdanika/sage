/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Product delivers value to customers (personas) by satisfying their needs via product features. A product may have multiple editions either tailored to different personas  and providing different levels of functionality at a different cost. E.g. there may be a community/free edition, a professional edition and an enterprise edition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Product#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends AbstractProduct {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getProduct_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Product
