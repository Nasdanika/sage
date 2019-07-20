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
 * @model
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
	 * @model
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
