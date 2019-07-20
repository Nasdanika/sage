/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Persona need. Has a weight relative to "peer" needs. This weight is used to compute effective weight of a need to be used in computing feature and product weights (benefits) and values (benefit/investment|effort|size).
 * Needs can be organized into a hierarchy.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Need#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.sage.Need#getFulfillments <em>Fulfillments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends HierarchicalComparableModelElement<Need> {

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sage.NeedCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Need category - basic, performance, or delighter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.nasdanika.sage.NeedCategory
	 * @see #setCategory(NeedCategory)
	 * @see org.nasdanika.sage.SagePackage#getNeed_Category()
	 * @model
	 * @generated
	 */
	NeedCategory getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Need#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.nasdanika.sage.NeedCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(NeedCategory value);

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Fulfillment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mappings to features fulfilling this need.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getNeed_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fulfillment> getFulfillments();
} // Need
