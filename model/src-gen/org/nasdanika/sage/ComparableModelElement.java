/**
 */
package org.nasdanika.sage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparable Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element which can be assigned a weight/importance. The weight is used for comparing the element with its siblings in the containing reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.ComparableModelElement#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.sage.ComparableModelElement#getEffectiveWeight <em>Effective Weight</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getComparableModelElement()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika label_ru='\u0421\u0440\u0430\u0432\u043d\u0438\u043c\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438' documentation_ru='\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u043e\u0440\u043e\u043c\u0443 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043f\u0440\u0438\u0441\u0432\u043e\u0435\u043d \u0432\u0435\u0441, \u043e\u0446\u0435\u043d\u043a\u0430, \u043f\u0440\u0438\u043e\u0440\u0438\u0442\u0435\u0442 \u0434\u043b\u044f \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044f \u0441 \u0430\u043d\u0430\u043b\u043e\u0433\u0438\u0447\u043d\u044b\u043c\u0438 \u043e\u0431\u044a\u0435\u043a\u0442\u0430\u043c\u0438. '"
 * @generated
 */
public interface ComparableModelElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model element weight which is used to compare the importance of this element with its siblings. It may be any positive value.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Effective Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Effective weight is calculated by computing the element's normalized weight and multiplying it by the container's effective weight if the container is also a comparable element. 
	 * The normalized weight is calculated by dividing the element's weight by the sum of weights of all elements in its containing reference. As such the normalized weight is a number 
	 * between zero and one and the sum of normalized weights of elements in a containing references is one. 
	 * The effective weight is also a number between zero and one and the sum of effective weights in a hierarchy of comparables is one.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Weight</em>' attribute.
	 * @see org.nasdanika.sage.SagePackage#getComparableModelElement_EffectiveWeight()
	 * @model default="1.0" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getEffectiveWeight();

} // ComparableModelElement
