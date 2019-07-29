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
	 * @model annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c' documentation_ru='\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442\u0441\u044f, \u0447\u0442\u043e \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043d\u0435 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0439 \u0438 \u0435\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0432\u0435\u0441  \u0440\u0430\u0441\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0438\u0441\u0445\u043e\u0434\u044f \u0438\u0437 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u0432\u043b\u0438\u044f\u043d\u0438\u044f \u043d\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u044e.'"
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
	 *        annotation="urn:org.nasdanika label_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a' documentation_ru='\u0421\u0432\u044f\u0437\u0430\u043d\u043d\u044b\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a'"
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
	 *        annotation="urn:org.nasdanika label_ru='\u0412\u043b\u0438\u044f\u043d\u0438\u0435 ' documentation_ru='\u0412\u043b\u0438\u044f\u043d\u0438\u0435 \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0430 \u0443\u0440\u043e\u0432\u0435\u043d\u044c \u0440\u0430\u0431\u043e\u0442\u043e\u0441\u043f\u043e\u0441\u043e\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430, \u0435\u0441\u043b\u0438 \u0432\u043b\u0438\u044f\u044e\u0449\u0430\u044f \u043d\u0430 \u043d\u0435\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430. \n\n\u0415\u0441\u043b\u0438 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0432\u043b\u0438\u044f\u043d\u0438\u044f = 1, \u0442\u043e \u044d\u0442\u043e \u0437\u043d\u0430\u0447\u0438\u0442, \u0447\u0442\u043e \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u0430\u044f.  \n\n\u0422\u043e \u0435\u0441\u0442\u044c, \u0435\u0441\u043b\u0438 \u0432\u043b\u0438\u044f\u044e\u0449\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430, \u0442\u043e \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043d\u0435\u0440\u0430\u0431\u043e\u0442\u043e\u0441\u043f\u043e\u0441\u043e\u0431\u043d\u0430.\n\n\u0412\u043b\u0438\u044f\u043d\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u043f\u0440\u0438 \u0440\u0430\u0441\u0447\u0435\u0442\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u043e\u0433\u043e \u0432\u0435\u0441\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0445 \u0431\u043b\u043e\u043a\u043e\u0432, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043a\u043e\u0441\u0432\u0435\u043d\u043d\u043e \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0442 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u0432. \n\n\u0422\u0430\u043a\u0438\u0435 \u0432\u0435\u0441\u0430, \u0432 \u0441\u0432\u043e\u044e \u043e\u0447\u0435\u0440\u0435\u0434\u044c, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0442\u0441\u044f \u0434\u043b\u044f \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u0432\u0435\u0441\u043e\u0432 \u0432\u044b\u043f\u0443\u0441\u043a\u043e\u0432 \u0432\u043d\u0443\u0442\u0440\u0435\u043d\u043d\u0438\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432, \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0449\u0438\u0445 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u044b\u0435 \u0438\u043b\u0438 \u0432\u043b\u0438\u044f\u044e\u0449\u0438\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438.\n\nImpact indicated how much the benefit delivered by the dependent feature would be affected if the dependency feature is not provided. Impact value 1.0 is equivalent to a mandatory dependency, i.e. if a dependency is not available then the dependent feature provides zero benefit. \nImpact is used in calculating the effective weight of dependency features which indirectly fulfil persona needs. Such weights in turn are used to calculate weights of releases of internal products containing dependency features.'"
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
	 * @model annotation="urn:org.nasdanika label_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435' documentation_ru='\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0438. \u0421\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441 =  \u041c\u0430\u0440\u043a\u0434\u0430\u0443\u043d'"
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
