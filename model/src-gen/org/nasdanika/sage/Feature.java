/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Feature is a unit of product functionality which satisfies specific persona needs. Feature's relative importance is computed from the needs satisfied by the feature. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sage.Feature#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getEnablers <em>Enablers</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getDesign <em>Design</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getRelease <em>Release</em>}</li>
 *   <li>{@link org.nasdanika.sage.Feature#getEditions <em>Editions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getFeature()
 * @model annotation="urn:org.nasdanika label_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a' documentation_ru='\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a  - \u044d\u0442\u043e \u0435\u0434\u0438\u043d\u0438\u0446\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u0443\u044e \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u0430.  \n\u041e\u0442\u043d\u043e\u0441\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u044c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0440\u0430\u0441\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0438\u0437 \u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0441\u043d\u043e\u0439 \u043e\u0446\u0435\u043d\u043a\u0438 \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438, \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u043c\u043e\u0439 \u044d\u0442\u0438\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c \u0431\u043b\u043e\u043a\u043e\u043c.'"
 * @generated
 */
public interface Feature extends HierarchicalModelElement<Feature> {

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping to features which this feature depends on. Dependencies may be mandatory or optional. Mandatory dependencies must be released in order to release the feature. Optional dependencies affect the benefit delivered by the feature. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getFeature_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Enablers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Enabler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enablers improve productivity and thus reduce the size of a feature. For example, a code generator may be an enabler for a "feature" "Set up a a new project".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enablers</em>' containment reference list.
	 * @see org.nasdanika.sage.SagePackage#getFeature_Enablers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enabler> getEnablers();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of effort or expenditure required to implement the feature in some units agreed upon across the organization - money, story points, person hours, ...
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see org.nasdanika.sage.SagePackage#getFeature_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Feature#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sage.FeatureState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature state in the development process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.sage.FeatureState
	 * @see #setState(FeatureState)
	 * @see org.nasdanika.sage.SagePackage#getFeature_State()
	 * @model
	 * @generated
	 */
	FeatureState getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Feature#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.sage.FeatureState
	 * @see #getState()
	 * @generated
	 */
	void setState(FeatureState value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature design in markdown. While the feature description explains what this feature does, the feature design explains how feature functionality shall be implemented. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design</em>' attribute.
	 * @see #setDesign(String)
	 * @see org.nasdanika.sage.SagePackage#getFeature_Design()
	 * @model
	 * @generated
	 */
	String getDesign();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Feature#getDesign <em>Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' attribute.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Components which need to be create/modified to deliver the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getFeature_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Release#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(Release)
	 * @see org.nasdanika.sage.SagePackage#getFeature_Release()
	 * @see org.nasdanika.sage.Release#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.nasdanika.sage.Feature#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

	/**
	 * Returns the value of the '<em><b>Editions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sage.Edition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sage.Edition#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Editions this feature is included into.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editions</em>' reference list.
	 * @see org.nasdanika.sage.SagePackage#getFeature_Editions()
	 * @see org.nasdanika.sage.Edition#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Edition> getEditions();
} // Feature
