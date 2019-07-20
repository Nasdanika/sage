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
 * Personas represent target audiences of products manufactured by the organization. 
 * 
 * Personas can be assigned relative weight/importance which is used to calculate effective weight of persona needs and then product features fulfilling those needs. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Persona#getNeeds <em>Needs</em>}</li>
 *   <li>{@link org.nasdanika.sage.Persona#getOfferings <em>Offerings</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Personas have needs which can be organized into a hierarchy. 
	 * Product features are mapped to the needs they fulfill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getPersona_Needs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Need> getNeeds();

	/**
	 * Returns the value of the '<em><b>Offerings</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Offering}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Offering#getTargetAudiences <em>Target Audiences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of products and product editions (for products with editions) which are offered to a particular persona to fulfill their needs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offerings</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getPersona_Offerings()
	 * @see org.nasdanika.sage.Offering#getTargetAudiences
	 * @model opposite="targetAudiences"
	 * @generated
	 */
	EList<Offering> getOfferings();

} // Persona
