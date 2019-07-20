/**
 */
package org.nasdanika.sage;

import java.util.Date;

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
 *   <li>{@link org.nasdanika.sage.Release#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.sage.Release#isReleased <em>Released</em>}</li>
 *   <li>{@link org.nasdanika.sage.Release#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.nasdanika.sage.Release#getOverhead <em>Overhead</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features included in the release. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see org.nasdanika.sage.SagePackage#getRelease_Feature()
	 * @model
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Release#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

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
	 * @model
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
	 * @model
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
	 * @model
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
