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
 * @model annotation="urn:org.nasdanika label_ru='\u041f\u0435\u0440\u0441\u043e\u043d\u0430' documentation_ru='\u041f\u0435\u0440\u0441\u043e\u043d\u0430 - \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044c \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438, \u0432 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0438\u0438 \u0441 \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u044f\u043c\u0438 \u043a\u043e\u0442\u043e\u0440\u043e\u0439 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442.\n\n\n\u041f\u0435\u0440\u0441\u043e\u043d\u0430\u043c \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043d\u0430\u0437\u043d\u0430\u0447\u0435\u043d \u043e\u0442\u043d\u043e\u0441\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u0432\u0435\u0441 \u0438\u043b\u0438 \u043e\u0446\u0435\u043d\u043a\u0430 \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u0439. \n\n\n\u042d\u0442\u043e \u043f\u043e\u0437\u0432\u043e\u043b\u0438\u0442 \u043e\u0446\u0435\u043d\u0438\u0442\u044c, \u043d\u0430 \u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0433\u043e\u0442\u043e\u0432\u044b\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u044f\u043c \u043f\u0435\u0440\u0441\u043e\u043d\u044b, \u0430 \u0442\u0430\u043a \u0436\u0435 \u043f\u0440\u0438\u043e\u0440\u0435\u0442\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0437\u0430\u0434\u0430\u0447\u0438 \u0432 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u0435 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438. '"
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
