/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * See Feature.enabler documentation for details.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Enabler#getBoost <em>Boost</em>}</li>
 *   <li>{@link org.nasdanika.sage.Enabler#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.sage.Enabler#getEnabler <em>Enabler</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getEnabler()
 * @model annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0442\u043e\u0440' documentation_ru='\u041d\u0435\u0447\u0442\u043e, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u043c\u043e\u0435 \u0434\u043b\u044f \u043e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0446\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 \u0438 \u043f\u043e\u0432\u044b\u0448\u0435\u043d\u0438\u044f \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439.'"
 * @generated
 */
public interface Enabler extends EObject {
	/**
	 * Returns the value of the '<em><b>Boost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of effort by which the enabler reduces the size of the feature it enables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boost</em>' attribute.
	 * @see #setBoost(double)
	 * @see org.nasdanika.sage.SagePackage#getEnabler_Boost()
	 * @model annotation="urn:org.nasdanika label_ru='\u0423\u0432\u0435\u043b\u0438\u0447\u0435\u043d\u0438\u0435' documentation_ru='\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0443\u0441\u0438\u043b\u0438\u0439, \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u043e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0442\u043e\u0440  \u0443\u043c\u0435\u043d\u044c\u0448\u0430\u0435\u0442 \u0440\u0430\u0437\u043c\u0435\u0440 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u043c\u043e\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u0438.'"
	 * @generated
	 */
	double getBoost();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Enabler#getBoost <em>Boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boost</em>' attribute.
	 * @see #getBoost()
	 * @generated
	 */
	void setBoost(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Markdown description of the enabler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.sage.SagePackage#getEnabler_Description()
	 * @model annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435' documentation_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0442\u043e\u0440\u0430. \u0421\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441 = \u041c\u0430\u0440\u043a\u0434\u0430\u0443\u043d'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Enabler#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Enabler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enabling feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabler</em>' reference.
	 * @see #setEnabler(Feature)
	 * @see org.nasdanika.sage.SagePackage#getEnabler_Enabler()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0438\u0440\u0443\u0435\u043c\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f'"
	 * @generated
	 */
	Feature getEnabler();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Enabler#getEnabler <em>Enabler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabler</em>' reference.
	 * @see #getEnabler()
	 * @generated
	 */
	void setEnabler(Feature value);

} // Enabler
