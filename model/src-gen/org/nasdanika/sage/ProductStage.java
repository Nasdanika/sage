/**
 */
package org.nasdanika.sage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Stage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Product lifecycle stage.
 * <!-- end-model-doc -->
 * @see org.nasdanika.sage.SagePackage#getProductStage()
 * @model
 * @generated
 */
public enum ProductStage implements Enumerator {
	/**
	 * The '<em><b>Planning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial product stage from the idea to the start of development. This stage includes proofs of concepts and prototyping.
	 * <!-- end-model-doc -->
	 * @see #PLANNING_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNING(0, "Planning", "Planning"),

	/**
	 * The '<em><b>Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stage at which the organization has committed resources to producing the first release of the product, but the product hasn't been released yet.
	 * <!-- end-model-doc -->
	 * @see #DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT(1, "Development", "Development"),

	/**
	 * The '<em><b>Released</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one release was made availale to the product target audiences.
	 * <!-- end-model-doc -->
	 * @see #RELEASED_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASED(2, "Released", "Released"),

	/**
	 * The '<em><b>Retired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A product has reached the end of its useful life. There is no investment in new product features anymore. The organization may still spend some resources on product maintenance.
	 * <!-- end-model-doc -->
	 * @see #RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	RETIRED(3, "Retired", "Retired");

	/**
	 * The '<em><b>Planning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial product stage from the idea to the start of development. This stage includes proofs of concepts and prototyping.
	 * <!-- end-model-doc -->
	 * @see #PLANNING
	 * @model name="Planning"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNING_VALUE = 0;

	/**
	 * The '<em><b>Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stage at which the organization has committed resources to producing the first release of the product, but the product hasn't been released yet.
	 * <!-- end-model-doc -->
	 * @see #DEVELOPMENT
	 * @model name="Development"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_VALUE = 1;

	/**
	 * The '<em><b>Released</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one release was made availale to the product target audiences.
	 * <!-- end-model-doc -->
	 * @see #RELEASED
	 * @model name="Released"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASED_VALUE = 2;

	/**
	 * The '<em><b>Retired</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A product has reached the end of its useful life. There is no investment in new product features anymore. The organization may still spend some resources on product maintenance.
	 * <!-- end-model-doc -->
	 * @see #RETIRED
	 * @model name="Retired"
	 * @generated
	 * @ordered
	 */
	public static final int RETIRED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Product Stage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductStage[] VALUES_ARRAY = new ProductStage[] { PLANNING, DEVELOPMENT, RELEASED, RETIRED, };

	/**
	 * A public read-only list of all the '<em><b>Product Stage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductStage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Stage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductStage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductStage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Stage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductStage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductStage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Stage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductStage get(int value) {
		switch (value) {
		case PLANNING_VALUE:
			return PLANNING;
		case DEVELOPMENT_VALUE:
			return DEVELOPMENT;
		case RELEASED_VALUE:
			return RELEASED;
		case RETIRED_VALUE:
			return RETIRED;
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
	private ProductStage(int value, String name, String literal) {
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

} //ProductStage
