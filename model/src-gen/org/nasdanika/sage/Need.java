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
 * Описание потребности, которая должна быть удовлетворена или  проблемы, которая должна быть решена при помощи разрабатываемого продукта.
 * Потребностям присваивается удельный вес, который позволяет выбрать наиболее значимые направления удовлетворения потребностей.
 * Удельный вес потребности используется для вычисления степени готовности продукта. 
 *  
 *  This weight is used to compute effective weight of a need to be used in computing feature and product weights (benefits) and values (benefit/investment|effort|size).
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
 * @model annotation="urn:org.nasdanika label_ru='\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c' documentation_ru='\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u043f\u0435\u0440\u0441\u043e\u043d\u044b... '"
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
