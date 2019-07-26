/**
 */
package org.nasdanika.sage;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Release is a version of a product which was made available to the product's target audiences. It is also a unit of delivery of a set of features.   
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Release#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.sage.Release#isReleased <em>Released</em>}</li>
 *   <li>{@link org.nasdanika.sage.Release#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.nasdanika.sage.Release#getOverhead <em>Overhead</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getRelease()
 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0435\u043b\u0438\u0437' documentation_ru='\u0420\u0435\u043b\u0438\u0437 - \u044d\u0442\u043e \u0432\u0435\u0440\u0441\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0431\u044b\u043b\u0430 \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0430 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438. \u042d\u0442\u043e \u0442\u0430\u043a\u0436\u0435 \u0435\u0434\u0438\u043d\u0438\u0446\u0430 \u0434\u043e\u0441\u0442\u0430\u0432\u043a\u0438 \u043d\u0430\u0431\u043e\u0440\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u0439.'"
 * @generated
 */
public interface Release extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Feature}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Feature#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New features included in the release. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getRelease_Features()
	 * @see org.nasdanika.sage.Feature#getRelease
	 * @model opposite="release"
	 *        annotation="urn:org.nasdanika label_ru='\u0424\u043d\u0443\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c' documentation_ru='\u041d\u043e\u0432\u044b\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u0438, \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0435 \u0432 \u0440\u0435\u043b\u0438\u0437'"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the release was made available to the product's target audiences, false otherwise - it it is still in planning/development.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Released</em>' attribute.
	 * @see #setReleased(boolean)
	 * @see org.nasdanika.sage.SagePackage#getRelease_Released()
	 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0435\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d' documentation_ru='\u0418\u0421\u0422\u0418\u041d\u0410, \u0435\u0441\u043b\u0438 \u0440\u0435\u043b\u0438\u0437 \u0431\u044b\u043b \u0441\u0434\u0435\u043b\u0430\u043d \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u043c \u0434\u043b\u044f \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u0438\u043d\u0430\u0447\u0435 \u041b\u041e\u0416\u042c - \u043e\u043d \u0432\u0441\u0435 \u0435\u0449\u0435 \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u0435 \u043f\u043b\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f / \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438.'"
	 * @generated
	 */
	boolean isReleased();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Release#isReleased <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Released</em>' attribute.
	 * @see #isReleased()
	 * @generated
	 */
	void setReleased(boolean value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planned or actual release date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see org.nasdanika.sage.SagePackage#getRelease_ReleaseDate()
	 * @model annotation="urn:org.nasdanika label_ru='\u0414\u0430\u0442\u0430 \u0440\u0435\u043b\u0438\u0437\u0430' documentation_ru='\u041f\u043b\u0430\u043d\u0438\u0440\u0443\u0435\u043c\u0430\u044f \u0438\u043b\u0438 \u0444\u0430\u043a\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0434\u0430\u0442\u0430 \u0440\u0435\u043b\u0438\u0437\u0430'"
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Release#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of effort to perform release activities (press release, writing release notes, ...) in addition to the size of included features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overhead</em>' attribute.
	 * @see #setOverhead(double)
	 * @see org.nasdanika.sage.SagePackage#getRelease_Overhead()
	 * @model annotation="urn:org.nasdanika label_ru='\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u044b\u0435 \u0440\u0430\u0441\u0445\u043e\u0434\u044b' documentation_ru='\u041e\u0431\u044a\u0435\u043c \u0437\u0430\u0442\u0440\u0430\u0442 \u043d\u0430 \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0440\u0435\u043b\u0438\u0437\u0430 (\u043f\u0443\u0431\u043b\u0438\u043a\u0430\u0446\u0438\u044f \u043f\u0440\u0435\u0441\u0441-\u0440\u0435\u043b\u0438\u0437\u0430, \u043d\u0430\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u0437\u0430\u043c\u0435\u0442\u043e\u043a \u043e \u0432\u044b\u043f\u0443\u0441\u043a\u0435 \u0438 \u0442.\u0434.). \u0412 \u0434\u043e\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u043a \u0440\u0430\u0441\u0445\u043e\u0434\u0430\u043c \u043d\u0430 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0443 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438.'"
	 * @generated
	 */
	double getOverhead();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Release#getOverhead <em>Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead</em>' attribute.
	 * @see #getOverhead()
	 * @generated
	 */
	void setOverhead(double value);

} // Release
