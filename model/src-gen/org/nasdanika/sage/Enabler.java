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
 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0435\u0430\u043b\u0438\u0437\u0430\u0442\u043e\u0440/\u0430\u043a\u0442\u0438\u0432\u0430\u0442\u043e\u0440' documentation_ru='See Feature.enabler documentation for details.'"
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
	 * @model annotation="urn:org.nasdanika label_ru='\u0423\u0432\u0435\u043b\u0438\u0447\u0435\u043d\u0438\u0435' documentation_\u043a\u0433='\u041e\u0431\u044a\u0435\u043c \u0443\u0441\u0438\u043b\u0438\u0439, \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430\u0442\u043e\u0440 \u0443\u043c\u0435\u043d\u044c\u0448\u0430\u0435\u0442 \u0440\u0430\u0437\u043c\u0435\u0440 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u043c\u043e\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u0438.'"
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
	 * @model
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
