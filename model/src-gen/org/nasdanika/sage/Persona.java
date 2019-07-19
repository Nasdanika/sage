/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Personas representing organization's target audiences. It is generally recommended to focus on no more than 3 personas.
 * Personas can be assigned relative importance which is used to calculate effective importance of persona needs and then product features fulfilling those needs. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Persona#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends ComparableModelElement {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getPersona_Needs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Need> getNeeds();

} // Persona
