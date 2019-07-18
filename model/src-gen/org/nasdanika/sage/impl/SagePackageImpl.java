/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sage.ComparableModelElement;
import org.nasdanika.sage.HierarchicalComparableModelElement;
import org.nasdanika.sage.HierarchicalModelElement;
import org.nasdanika.sage.ModelElement;
import org.nasdanika.sage.Organization;
import org.nasdanika.sage.SageFactory;
import org.nasdanika.sage.SagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SagePackageImpl extends EPackageImpl implements SagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchicalModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchicalComparableModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sage.SagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SagePackageImpl() {
		super(eNS_URI, SageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SagePackage init() {
		if (isInited)
			return (SagePackage) EPackage.Registry.INSTANCE.getEPackage(SagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SagePackageImpl theSagePackage = registeredSagePackage instanceof SagePackageImpl
				? (SagePackageImpl) registeredSagePackage
				: new SagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSagePackage.createPackageContents();

		// Initialize created meta-data
		theSagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SagePackage.eNS_URI, theSagePackage);
		return theSagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Description() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Configuration() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparableModelElement() {
		return comparableModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparableModelElement_Weight() {
		return (EAttribute) comparableModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchicalModelElement() {
		return hierarchicalModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchicalModelElement_Children() {
		return (EReference) hierarchicalModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchicalComparableModelElement() {
		return hierarchicalComparableModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SageFactory getSageFactory() {
		return (SageFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__CONFIGURATION);

		comparableModelElementEClass = createEClass(COMPARABLE_MODEL_ELEMENT);
		createEAttribute(comparableModelElementEClass, COMPARABLE_MODEL_ELEMENT__WEIGHT);

		hierarchicalModelElementEClass = createEClass(HIERARCHICAL_MODEL_ELEMENT);
		createEReference(hierarchicalModelElementEClass, HIERARCHICAL_MODEL_ELEMENT__CHILDREN);

		hierarchicalComparableModelElementEClass = createEClass(HIERARCHICAL_COMPARABLE_MODEL_ELEMENT);

		organizationEClass = createEClass(ORGANIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter hierarchicalModelElementEClass_T = addETypeParameter(hierarchicalModelElementEClass, "T");
		ETypeParameter hierarchicalComparableModelElementEClass_T = addETypeParameter(
				hierarchicalComparableModelElementEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		comparableModelElementEClass.getESuperTypes().add(this.getModelElement());
		hierarchicalModelElementEClass.getESuperTypes().add(this.getModelElement());
		EGenericType g1 = createEGenericType(this.getHierarchicalModelElement());
		EGenericType g2 = createEGenericType(hierarchicalComparableModelElementEClass_T);
		g1.getETypeArguments().add(g2);
		hierarchicalComparableModelElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getComparableModelElement());
		hierarchicalComparableModelElementEClass.getEGenericSuperTypes().add(g1);
		organizationEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(comparableModelElementEClass, ComparableModelElement.class, "ComparableModelElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparableModelElement_Weight(), ecorePackage.getEDouble(), "weight", "1.0", 0, 1,
				ComparableModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hierarchicalModelElementEClass, HierarchicalModelElement.class, "HierarchicalModelElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(hierarchicalModelElementEClass_T);
		initEReference(getHierarchicalModelElement_Children(), g1, null, "children", null, 0, -1,
				HierarchicalModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hierarchicalComparableModelElementEClass, HierarchicalComparableModelElement.class,
				"HierarchicalComparableModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SagePackageImpl
