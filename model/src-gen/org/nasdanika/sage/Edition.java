/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Product edition is a grouping of features which fulfill needs of a specific target audience. For example, a community edition may target customer with basic needs, and a professional edition would include additional features fulfilling the needs of customers who use the product extensively.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Edition#getBases <em>Bases</em>}</li>
 *   <li>{@link org.nasdanika.sage.Edition#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getEdition()
 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f' documentation_ru='\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 - \u044d\u0442\u043e \u043d\u0430\u0431\u043e\u0440 \u0444\u0443\u043d\u043a\u0446\u0438\u0439, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0442  \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u043e\u0439 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438. \n\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, Free edition \u043f\u0440\u0435\u0434\u043d\u0430\u0437\u043d\u0430\u0447\u043a\u0435\u043d\u0430 \u0434\u043b\u044f \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432 \u0441 \u0431\u0430\u0437\u043e\u0432\u044b\u043c\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044f\u043c\u0438, \n\n\n\u0430 Professional edition \u0431\u0443\u0434\u0435\u0442 \u0432\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435 \u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e\u0441\u0442\u0438, \n\n\u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u0435 \u0441\u043f\u0435\u0446\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0430\u0442\u0435\u043b\u0435\u0439, \u0431\u043e\u043b\u0435\u0435 \u043f\u0440\u043e\u0444\u0435\u0441\u0441\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0449\u0438\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442.\n'"
 * @generated
 */
public interface Edition extends Offering {
	/**
	 * Returns the value of the '<em><b>Bases</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Editions which this one is based on, i.e. an edition includes all the features from its base editions plus the features explicitly included in the edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bases</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getEdition_Bases()
	 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f' documentation_ru='\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u0438, \u0431\u0430\u0437\u043e\u0432\u044b\u0435 \u0434\u043b\u044f \u044d\u0442\u043e\u0439 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0438. \n\n\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u0432\u043b\u044e\u0447\u0430\u0435\u0442 \u0432 \u0441\u0435\u0431\u044f \u0432\u0441\u0435 \u0444\u0443\u043d\u043a\u0446\u0438 \u0438\u0437 \u0431\u0430\u0437\u043e\u0432\u044b\u0445 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439, \u0430 \u0442\u0430\u043a \u0436\u0435 \u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u0438, \u044f\u0432\u043d\u043e \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0435 \u0432 \u044d\u0442\u0443 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044e.\n'"
	 * @generated
	 */
	EList<Edition> getBases();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Feature}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Feature#getEditions <em>Editions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features included in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getEdition_Features()
	 * @see org.nasdanika.sage.Feature#getEditions
	 * @model opposite="editions"
	 *        annotation="urn:org.nasdanika label_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c' documentation_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u043c\u043e\u0434\u0443\u043b\u0438 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0435 \u0432 \u0434\u0430\u043d\u043d\u0443\u044e \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044e'"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Edition
