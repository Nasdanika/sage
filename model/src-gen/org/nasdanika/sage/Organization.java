/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Organization it the root of the Sage model. Organizations can be nested. Different products in organization's portfolio may be produced by different child organizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Organization#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.sage.Organization#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.sage.Organization#getStrategies <em>Strategies</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getOrganization()
 * @model annotation="urn:org.nasdanika label_ru='\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f' documentation_ru='\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u044d\u0442\u043e \u043a\u043e\u0440\u0435\u043d\u044c \u043c\u043e\u0434\u0435\u043b\u0438 Sage.  \n\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u0432\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0438, \u0442\u043e \u0435\u0441\u0442\u044c, \u0438\u043c\u0435\u0442\u044c \u043f\u043e\u0434\u0440\u0430\u0437\u0434\u0435\u043b\u0435\u043d\u0438\u044f. \n\u0420\u0430\u0437\u043b\u0438\u0447\u043d\u044b\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b \u0432 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0435 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c\u0441\u044f \u0440\u0430\u0437\u043d\u044b\u043c\u0438 \u043f\u043e\u0434\u0440\u0430\u0437\u0434\u0435\u043b\u0435\u043d\u0438\u044f\u043c\u0438 \u0438\u043b\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u0430\u043c\u0438  (\u0434\u043e\u0447\u0435\u0440\u043d\u0438\u043c\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c\u0438).'"
 * @generated
 */
public interface Organization extends HierarchicalModelElement<Organization> {

	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas which represent the organization's target audiences. Typically shall be defined at the root organization, although child organizations may define internal personas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getOrganization_Personas()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika label_ru='\u041f\u0435\u0440\u0441\u043e\u043d\u0430' documentation_ru='\u0417\u0430\u043a\u0430\u0437\u0447\u0438\u043a, \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044c \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438. \u041a\u0430\u043a \u043f\u0440\u0430\u0432\u0438\u043b\u043e, \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u044b \u0432 \u043a\u043e\u0440\u043d\u0435\u0432\u043e\u0439 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438, \u0445\u043e\u0442\u044f \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0432\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u0432 \u0441\u0435\u0431\u044f \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u0435\u0439 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438.'"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.AbstractProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Products manufactured by the organization. Products can be grouped into portfolios.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getOrganization_Products()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika label_ru='\u0410\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442' documentation_ru='\u041f\u0440\u043e\u0434\u0443\u043a\u0442 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u043c\u044b\u0439 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0435\u0439. \u041f\u0440\u043e\u0434\u0443\u043a\u0442\u044b \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u043e\u0431\u044a\u0435\u0434\u0438\u043d\u0435\u043d\u044b \u0432 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0438.'"
	 * @generated
	 */
	EList<AbstractProduct> getProducts();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Strategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getOrganization_Strategies()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika label_ru='\u0421\u0442\u0440\u0430\u0442\u0435\u0433\u0438\u044f'"
	 * @generated
	 */
	EList<Strategy> getStrategies();
} // Organization
