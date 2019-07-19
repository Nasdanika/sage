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
 * Root of the Sage analytical model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Organization#getPersonas <em>Personas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getOrganization_Personas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Persona> getPersonas();
} // Organization
