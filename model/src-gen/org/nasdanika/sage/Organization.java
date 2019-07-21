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
 * @model
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
	 * @generated
	 */
	EList<Strategy> getStrategies();
} // Organization
