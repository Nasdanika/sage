/**
 */
package org.nasdanika.sage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Feature state reflects level of "donness".
 * <!-- end-model-doc -->
 * @see org.nasdanika.sage.SagePackage#getFeatureState()
 * @model annotation="urn:org.nasdanika label_ru='\u0421\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430' documentation_ru='\u0421\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430, \u043e\u0442\u0440\u0430\u0436\u0430\u044e\u0449\u0435\u0435 \u0441\u0442\u0435\u043f\u0435\u043d\u044c \u0435\u0433\u043e \u0433\u043e\u0442\u043e\u0432\u043d\u043e\u0441\u0442\u0438.'"
 * @generated
 */
public enum FeatureState implements Enumerator {
	/**
	 * The '<em><b>New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial feature state from creation through grooming.
	 * <!-- end-model-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "New", "New"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature is actively worked on.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(1, "InProgress", "InProgress"),

	/**
	 * The '<em><b>Done</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All feature work has been completed.
	 * <!-- end-model-doc -->
	 * @see #DONE_VALUE
	 * @generated
	 * @ordered
	 */
	DONE(2, "Done", "Done");

	/**
	 * The '<em><b>New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial feature state from creation through grooming.
	 * <!-- end-model-doc -->
	 * @see #NEW
	 * @model name="New"
	 *        annotation="urn:org.nasdanika label_ru='\u041d\u043e\u0432\u044b\u0439' documentation_ru='\u041d\u0430\u0447\u0430\u043b\u044c\u043d\u043e\u0435 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u043e\u0442 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044f \u0434\u043e \u043d\u0430\u0447\u0430\u043b\u0430 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u043a\u0438'"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature is actively worked on.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="InProgress"
	 *        annotation="urn:org.nasdanika label_ru='\u0412 \u0440\u0430\u0431\u043e\u0442\u0435' documentation_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a \u0432 \u0441\u0442\u0430\u0434\u0438\u0438 \u0430\u043a\u0442\u0438\u0432\u043d\u043e\u0439 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438'"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 1;

	/**
	 * The '<em><b>Done</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All feature work has been completed.
	 * <!-- end-model-doc -->
	 * @see #DONE
	 * @model name="Done"
	 *        annotation="urn:org.nasdanika label_ru='\u0413\u043e\u0442\u043e\u0432\u043e' documentation_ru='\u0412\u0441\u0435 \u0440\u0430\u0431\u043e\u0442\u044b \u043f\u043e \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u044b'"
	 * @generated
	 * @ordered
	 */
	public static final int DONE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feature State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureState[] VALUES_ARRAY = new FeatureState[] { NEW, IN_PROGRESS, DONE, };

	/**
	 * A public read-only list of all the '<em><b>Feature State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureState get(int value) {
		switch (value) {
		case NEW_VALUE:
			return NEW;
		case IN_PROGRESS_VALUE:
			return IN_PROGRESS;
		case DONE_VALUE:
			return DONE;
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
	private FeatureState(int value, String name, String literal) {
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

} //FeatureState
