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
 * </ul>
 *
 * @see org.nasdanika.sage.SagePackage#getFeature()
 * @model
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
} // Feature
