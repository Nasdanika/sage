/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.rigel.IPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Scenario demonstrates how offerings fulfill a need. Multiple offerings may particpate in need fulfillment scenario. 
 * Scenario weight reflects importance of a particular scenario in fulfilling the need comparing to the other scenarios.
 * If there is more than one offering in a scenario, then the weight is distributed evenly between the participating offerings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Scenario#getOfferings <em>Offerings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getScenario()
 * @model annotation="urn:org.nasdanika label_ru='\u0421\u0446\u0435\u043d\u0430\u0440\u0438\u0439' documentation_ru='TODO - \u043e\u0431\u043d\u043e\u0432\u0438\u0442\u044c \u043f\u0435\u0440\u0435\u0432\u043e\u0434.\n\n\u0423\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043e\u0442\u0440\u0430\u0436\u0430\u0435\u0442 \u043f\u043e\u043b\u043d\u043e\u0442\u0443/\u0441\u0442\u0435\u043f\u0435\u043d\u044c \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439. \u0422\u043e \u0435\u0441\u0442\u044c: \u0441\u0432\u044f\u0437\u044c \u043c\u0435\u0436\u0434\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c\u044e \u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u043c \u0438\u043b\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c \u0431\u043b\u043e\u043a\u043e\u043c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u043c \u044d\u0442\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c. \n\n\u041f\u043e\u043b\u043d\u043e\u0442\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0443\u0434\u0438\u0442\u044c: \u0432 \u043a\u0430\u043a\u043e\u0439 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u044b\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u0443\u044e \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u043f\u043e \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044e \u0441 \u0434\u0440\u0443\u0433\u0438\u043c\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c\u0438 \u0431\u043b\u043e\u043a\u0430\u043c\u0438, \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u043c\u0438 \u0432 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438.\n'"
 * @generated
 */
public interface Scenario extends ComparableModelElement, IPackage {
	/**
	 * Returns the value of the '<em><b>Offerings</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Offering}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Offering#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature fulfilling the need.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offerings</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getScenario_Offerings()
	 * @see org.nasdanika.sage.Offering#getScenarios
	 * @model opposite="scenarios"
	 *        annotation="urn:org.nasdanika label_ru='\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f' documentation_ru='\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u0435 \u0432 \u0441\u0446\u0435\u043d\u0430\u0440\u0438\u0438 \u0443\u0432\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438. '"
	 * @generated
	 */
	EList<Offering> getOfferings();

} // Fulfillment
