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
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getOffering()
 * @model abstract="true"
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
	 * @generated
	 */
	EList<Persona> getTargetAudiences();

} // Offering
