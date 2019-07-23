/**
 */
package org.nasdanika.sage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Need Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Need categories based on the [Kano model](https://en.wikipedia.org/wiki/Kano_model).
 * <!-- end-model-doc -->
 * @see org.nasdanika.sage.SagePackage#getNeedCategory()
 * @model
 * @generated
 */
public enum NeedCategory implements Enumerator {
	/**
	 * The '<em><b>Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must be need - expected to be fulfilled and leads to dissatisfaction if not.
	 * 
	 * <!-- end-model-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(0, "Basic", "Basic"),

	/**
	 * The '<em><b>Performance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard desired needs which increase satisfaction when fulfilled.
	 * <!-- end-model-doc -->
	 * @see #PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE(1, "Performance", "Performance"),

	/**
	 * The '<em><b>Delighter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unexpected needs - "I didn't know I wanted it, but I like it!".
	 * <!-- end-model-doc -->
	 * @see #DELIGHTER_VALUE
	 * @generated
	 * @ordered
	 */
	DELIGHTER(2, "Delighter", "Delighter");

	/**
	 * The '<em><b>Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must be need - expected to be fulfilled and leads to dissatisfaction if not.
	 * 
	 * <!-- end-model-doc -->
	 * @see #BASIC
	 * @model name="Basic"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 0;

	/**
	 * The '<em><b>Performance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard desired needs which increase satisfaction when fulfilled.
	 * <!-- end-model-doc -->
	 * @see #PERFORMANCE
	 * @model name="Performance"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_VALUE = 1;

	/**
	 * The '<em><b>Delighter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unexpected needs - "I didn't know I wanted it, but I like it!".
	 * <!-- end-model-doc -->
	 * @see #DELIGHTER
	 * @model name="Delighter"
	 * @generated
	 * @ordered
	 */
	public static final int DELIGHTER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Need Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NeedCategory[] VALUES_ARRAY = new NeedCategory[] { BASIC, PERFORMANCE, DELIGHTER, };

	/**
	 * A public read-only list of all the '<em><b>Need Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NeedCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Need Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeedCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NeedCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Need Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeedCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NeedCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Need Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeedCategory get(int value) {
		switch (value) {
		case BASIC_VALUE:
			return BASIC;
		case PERFORMANCE_VALUE:
			return PERFORMANCE;
		case DELIGHTER_VALUE:
			return DELIGHTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NeedCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //NeedCategory
