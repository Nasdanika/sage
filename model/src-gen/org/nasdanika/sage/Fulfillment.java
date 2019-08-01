/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fulfillment is a mapping between a need and offerings which fulfill it. Multiple features from multiple product may particpate in fulfillment of a need. Fulfillment weight reflects to which extent a particular feature fullfills a particular need comparing to other features participating in the need fulfillment.
 * If there is more than one offering in one fulfillment then the weight is distributed evenly between the participating offerings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Fulfillment#getOfferings <em>Offerings</em>}</li>
 *   <li>{@link org.nasdanika.sage.Fulfillment#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.sage.Fulfillment#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getFulfillment()
 * @model annotation="urn:org.nasdanika label_ru='\u0423\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c' documentation_ru='\u0423\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043e\u0442\u0440\u0430\u0436\u0430\u0435\u0442 \u043f\u043e\u043b\u043d\u043e\u0442\u0443/\u0441\u0442\u0435\u043f\u0435\u043d\u044c \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439. \u0422\u043e \u0435\u0441\u0442\u044c: \u0441\u0432\u044f\u0437\u044c \u043c\u0435\u0436\u0434\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c\u044e \u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u043c \u0438\u043b\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c \u0431\u043b\u043e\u043a\u043e\u043c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u043c \u044d\u0442\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c. \n\n\u041f\u043e\u043b\u043d\u043e\u0442\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0443\u0434\u0438\u0442\u044c: \u0432 \u043a\u0430\u043a\u043e\u0439 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u044b\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u0443\u044e \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u043f\u043e \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044e \u0441 \u0434\u0440\u0443\u0433\u0438\u043c\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c\u0438 \u0431\u043b\u043e\u043a\u0430\u043c\u0438, \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u043c\u0438 \u0432 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438.\n'"
 * @generated
 */
public interface Fulfillment extends EObject {
	/**
	 * Returns the value of the '<em><b>Offerings</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Offering}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Offering#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature fulfilling the need.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offerings</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getFulfillment_Offerings()
	 * @see org.nasdanika.sage.Offering#getFulfillments
	 * @model opposite="fulfillments"
	 *        annotation="urn:org.nasdanika label_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a' documentation_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a, \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u0439 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u0443\u044e \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c'"
	 * @generated
	 */
	EList<Offering> getOfferings();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fulfillment weight represents how much this particular feature participates in fulfilling the need comparing to other features fulfilling the same need.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.sage.SagePackage#getFulfillment_Weight()
	 * @model default="1.0"
	 *        annotation="urn:org.nasdanika label_ru='\u0412\u0435\u0441' documentation_ru='\u0412\u0435\u0441 - \u043e\u0442\u0440\u0430\u0436\u0430\u0435\u0442 \u0441\u0442\u0435\u043f\u0435\u043d\u044c \u0443\u0447\u0430\u0441\u0442\u0438\u044f \u043e\u0446\u0435\u043d\u0438\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0432 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043f\u043e \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044e \u0441 \u0434\u0440\u0443\u0433\u0438\u043c\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c\u0438 \u0431\u043b\u043e\u043a\u0430\u043c\u0438, \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u043c\u0438 \u044d\u0442\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c.\n'"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Fulfillment#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Markdown description of how the feature fulfills the need.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.sage.SagePackage#getFulfillment_Description()
	 * @model annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435' documentation_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u0442\u043e\u0433\u043e, \u043a\u0430\u043a\u0438\u043c \u043e\u0431\u0440\u0430\u0437\u043e\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c. (\u0441 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c \u0441\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441\u0430 \u041c\u0430\u0440\u043a\u0434\u0430\u0443\u043d)'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Fulfillment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Fulfillment
