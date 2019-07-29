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
 * Persona need. Has a weight relative to "peer" needs. 
 * 
 * 
 * This weight is used to compute effective weight of a need to be used in computing feature and product weights (benefits) and values (benefit/investment|effort|size).
 * 
 * 
 * Needs can be organized into a hierarchy.
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
 * @model annotation="urn:org.nasdanika label_ru='\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c' documentation_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0434\u043e\u043b\u0436\u043d\u0430 \u0431\u044b\u0442\u044c \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0430 \u0438\u043b\u0438  \u043f\u0440\u043e\u0431\u043b\u0435\u043c\u044b, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0434\u043e\u043b\u0436\u043d\u0430 \u0431\u044b\u0442\u044c \u0440\u0435\u0448\u0435\u043d\u0430 \u043f\u0440\u0438 \u043f\u043e\u043c\u043e\u0449\u0438 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430.\n\n\n\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044f\u043c \u043f\u0440\u0438\u0441\u0432\u0430\u0438\u0432\u0430\u0435\u0442\u0441\u044f \u0443\u0434\u0435\u043b\u044c\u043d\u044b\u0439 \u0432\u0435\u0441, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u043d\u0430\u0438\u0431\u043e\u043b\u0435\u0435 \u0437\u043d\u0430\u0447\u0438\u043c\u044b\u0435 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439.\n\n\n\u0423\u0434\u0435\u043b\u044c\u043d\u044b\u0439 \u0432\u0435\u0441 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0434\u043b\u044f \u0432\u044b\u0447\u0438\u0441\u043b\u0435\u043d\u0438\u044f \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0438\u043b\u0438 \u0435\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0438 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u0433\u043e\u0442\u043e\u0432\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430.\n\n\n\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u043e\u0432\u0430\u043d\u044b \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438.\n '"
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
	 * @model annotation="urn:org.nasdanika label_ru='\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438' documentation_ru='Need category - basic, performance, or delighter.'"
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
