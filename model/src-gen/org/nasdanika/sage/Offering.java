/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Offering is a base class for products and editions - something that is offered to personas, which are offering's target audiences.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Offering#getTargetAudiences <em>Target Audiences</em>}</li>
 *   <li>{@link org.nasdanika.sage.Offering#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getOffering()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika label_ru='\u0420\u0435\u0448\u0435\u043d\u0438\u0435' documentation_ru='\u0420\u0435\u0448\u0435\u043d\u0438\u0435 - \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0438 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439 - \u0441\u043e\u0432\u043e\u043a\u0443\u043f\u043d\u043e\u0441\u0442\u044c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u043f\u0440\u0435\u0434\u043b\u0430\u0433\u0430\u0435\u0442\u0441\u044f \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043c, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u043c\u0441\u044f \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0435\u0439 \u0440\u0435\u0448\u0435\u043d\u0438\u044f.\n'"
 * @generated
 */
public interface Offering extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target Audiences</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Persona}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Persona#getOfferings <em>Offerings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas to which this offering - product or edition - is offered. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Audiences</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getOffering_TargetAudiences()
	 * @see org.nasdanika.sage.Persona#getOfferings
	 * @model opposite="offerings"
	 *        annotation="urn:org.nasdanika label_ru='\u041f\u0435\u0440\u0441\u043e\u043d\u0430' documentation_ru='\u041f\u0435\u0440\u0441\u043e\u043d\u044b \u043a\u043e\u0442\u043e\u0440\u044b\u043c \u043f\u0440\u0435\u0434\u043b\u0430\u0433\u0430\u0435\u0442\u0441\u044f \u044d\u0442\u043e\u0442 \u043f\u0440\u043e\u0434\u0443\u043a\u0442 \u0438\u043b\u0438 \u0440\u0435\u0434\u0430\u0446\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430. '"
	 * @generated
	 */
	EList<Persona> getTargetAudiences();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Offering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One offering may include (bundle) other offferings. For example, Nasdanika Tool Suite would include community editions of Nasdanika products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getOffering_Includes()
	 * @model
	 * @generated
	 */
	EList<Offering> getIncludes();

} // Offering
