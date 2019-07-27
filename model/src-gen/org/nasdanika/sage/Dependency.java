/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dependency entry. See Feature.dependency documentation for details.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Dependency#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.sage.Dependency#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.nasdanika.sage.Dependency#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.nasdanika.sage.Dependency#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getDependency()
 * @model annotation="urn:org.nasdanika label_ru='\u0417\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c' documentation_ru='\u0412\u0432\u043e\u0434 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0435\u0439. \u041f\u043e\u0434\u0440\u043e\u0431\u043d\u043e\u0441\u0442\u0438 \u0441\u043c\u043e\u0442\u0440\u0438\u0442\u0435 \u0432 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430\u0446\u0438\u0438 \u043f\u043e Feature.dependency.'"
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicated that the dependency is optional and its effective weight shall be computed using "impact" value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.nasdanika.sage.SagePackage#getDependency_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Dependency#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dependency feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' reference.
	 * @see #setDependency(Feature)
	 * @see org.nasdanika.sage.SagePackage#getDependency_Dependency()
	 * @model required="true"
	 * @generated
	 */
	Feature getDependency();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Dependency#getDependency <em>Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Feature value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impact indicated how much the benefit delivered by the dependent feature would be affected if the dependency feature is not provided. Impact value 1.0 is equivalent to a mandatory dependency, i.e. if a dependency is not available then the dependent feature provides zero benefit. 
	 * Impact is used in calculating the effective weight of dependency features which indirectly fulfil persona needs. Such weights in turn are used to calculate weights of releases of internal products containing dependency features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see #setImpact(double)
	 * @see org.nasdanika.sage.SagePackage#getDependency_Impact()
	 * @model default="0.5"
	 * @generated
	 */
	double getImpact();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Dependency#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the dependency in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.sage.SagePackage#getDependency_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Dependency#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Dependency
