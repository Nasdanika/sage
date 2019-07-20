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
 * @model
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
	 * @model
	 * @generated
	 */
	EList<Edition> getBases();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features included in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getEdition_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Edition
