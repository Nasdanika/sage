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
 *   <li>{@link org.nasdanika.sage.Product#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.sage.Product#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.sage.Product#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.sage.Product#getEditions <em>Editions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getProduct()
 * @model annotation="urn:org.nasdanika label_ru='\u041f\u0440\u043e\u0434\u0443\u043a\u0442' documentation_ru='\u041f\u0440\u043e\u0434\u0443\u043a\u0442 - \u043e\u0431\u044a\u0435\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438, \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u0439 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u0432. \u041f\u0440\u043e\u0434\u0443\u043a\u0442 \u043c\u043e\u0436\u0435\u0442 \u0438\u043c\u0435\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439, \u0430\u0434\u0430\u043f\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445 \u043a \u043d\u0443\u0436\u0434\u0430\u043c \u0440\u0430\u0437\u043d\u044b\u0445 \u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0439 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u0432, \u0440\u0430\u0437\u043b\u0438\u0447\u0430\u044e\u0449\u0438\u0445\u0441\u044f \u043e\u0431\u044a\u0435\u043c\u043e\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438, \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u043c\u043e\u0439 \u0432 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044e \u0438 \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c\u044e.  \u0422\u0430\u043a, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0434\u043b\u044f \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e\u0433\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f, \u043f\u0440\u043e\u0444\u0435\u0441\u0441\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u0430\u044f \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044f, \u043a\u043e\u0440\u043f\u043e\u0440\u0430\u0442\u0438\u0432\u043d\u0430\u044f \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044f.\n'"
 * @generated
 */
public interface Product extends AbstractProduct, Offering {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A product provides multiple features which can be organized into editons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getProduct_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product features are delivered incrementally in a series of releases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getProduct_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sage.ProductStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product lifecycle stage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see org.nasdanika.sage.ProductStage
	 * @see #setStage(ProductStage)
	 * @see org.nasdanika.sage.SagePackage#getProduct_Stage()
	 * @model
	 * @generated
	 */
	ProductStage getStage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Product#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see org.nasdanika.sage.ProductStage
	 * @see #getStage()
	 * @generated
	 */
	void setStage(ProductStage value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A product may consist of several interdependent components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getProduct_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Editions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product editions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editions</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getProduct_Editions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edition> getEditions();

} // Product
