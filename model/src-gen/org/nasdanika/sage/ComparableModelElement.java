/**
 */
package org.nasdanika.sage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparable Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.ComparableModelElement#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getComparableModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ComparableModelElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.sage.SagePackage#getComparableModelElement_Weight()
	 * @model default="1.0"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.ComparableModelElement#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // ComparableModelElement
