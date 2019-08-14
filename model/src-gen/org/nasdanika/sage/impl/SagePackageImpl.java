/**
 */
package org.nasdanika.sage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sage.AbstractProduct;
import org.nasdanika.sage.ComparableModelElement;
import org.nasdanika.sage.Component;
import org.nasdanika.sage.Dependency;
import org.nasdanika.sage.Edition;
import org.nasdanika.sage.Enabler;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.FeatureState;
import org.nasdanika.sage.Scenario;
import org.nasdanika.sage.HierarchicalComparableModelElement;
import org.nasdanika.sage.HierarchicalModelElement;
import org.nasdanika.sage.ModelElement;
import org.nasdanika.sage.Need;
import org.nasdanika.sage.NeedCategory;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.Organization;
import org.nasdanika.sage.Persona;
import org.nasdanika.sage.Portfolio;
import org.nasdanika.sage.Product;
import org.nasdanika.sage.ProductStage;
import org.nasdanika.sage.Release;
import org.nasdanika.sage.SageFactory;
import org.nasdanika.sage.SagePackage;
import org.nasdanika.sage.Strategy;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass needEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portfolioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offeringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum needCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureStateEEnum = null;

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

		// Initialize simple dependencies
		org.nasdanika.rigel.RigelPackage.eINSTANCE.eClass();

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
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Name() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Url() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Description() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Configuration() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparableModelElement() {
		return comparableModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparableModelElement_Weight() {
		return (EAttribute) comparableModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparableModelElement_EffectiveWeight() {
		return (EAttribute) comparableModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHierarchicalModelElement() {
		return hierarchicalModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHierarchicalModelElement_Children() {
		return (EReference) hierarchicalModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHierarchicalModelElement_LinkedChildren() {
		return (EReference) hierarchicalModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHierarchicalComparableModelElement() {
		return hierarchicalComparableModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Personas() {
		return (EReference) organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Products() {
		return (EReference) organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Strategies() {
		return (EReference) organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Needs() {
		return (EReference) personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Offerings() {
		return (EReference) personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeed() {
		return needEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeed_Category() {
		return (EAttribute) needEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_Scenarios() {
		return (EReference) needEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractProduct() {
		return abstractProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortfolio() {
		return portfolioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Features() {
		return (EReference) productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Releases() {
		return (EReference) productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Stage() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Components() {
		return (EReference) productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Editions() {
		return (EReference) productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Dependencies() {
		return (EReference) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Enablers() {
		return (EReference) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Size() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_State() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Design() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Components() {
		return (EReference) featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Release() {
		return (EReference) featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Editions() {
		return (EReference) featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOffering() {
		return offeringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffering_TargetAudiences() {
		return (EReference) offeringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffering_Includes() {
		return (EReference) offeringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffering_Scenarios() {
		return (EReference) offeringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdition() {
		return editionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Bases() {
		return (EReference) editionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Features() {
		return (EReference) editionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelease_Features() {
		return (EReference) releaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelease_Released() {
		return (EAttribute) releaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelease_ReleaseDate() {
		return (EAttribute) releaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelease_Overhead() {
		return (EAttribute) releaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Offerings() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Optional() {
		return (EAttribute) dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Dependency() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Impact() {
		return (EAttribute) dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Description() {
		return (EAttribute) dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnabler() {
		return enablerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnabler_Boost() {
		return (EAttribute) enablerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnabler_Description() {
		return (EAttribute) enablerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnabler_Enabler() {
		return (EReference) enablerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Dependencies() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeedCategory() {
		return needCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProductStage() {
		return productStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureState() {
		return featureStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEAttribute(modelElementEClass, MODEL_ELEMENT__URL);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__CONFIGURATION);

		offeringEClass = createEClass(OFFERING);
		createEReference(offeringEClass, OFFERING__TARGET_AUDIENCES);
		createEReference(offeringEClass, OFFERING__INCLUDES);
		createEReference(offeringEClass, OFFERING__SCENARIOS);

		comparableModelElementEClass = createEClass(COMPARABLE_MODEL_ELEMENT);
		createEAttribute(comparableModelElementEClass, COMPARABLE_MODEL_ELEMENT__WEIGHT);
		createEAttribute(comparableModelElementEClass, COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT);

		hierarchicalModelElementEClass = createEClass(HIERARCHICAL_MODEL_ELEMENT);
		createEReference(hierarchicalModelElementEClass, HIERARCHICAL_MODEL_ELEMENT__CHILDREN);
		createEReference(hierarchicalModelElementEClass, HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN);

		hierarchicalComparableModelElementEClass = createEClass(HIERARCHICAL_COMPARABLE_MODEL_ELEMENT);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__PERSONAS);
		createEReference(organizationEClass, ORGANIZATION__PRODUCTS);
		createEReference(organizationEClass, ORGANIZATION__STRATEGIES);

		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__NEEDS);
		createEReference(personaEClass, PERSONA__OFFERINGS);

		needEClass = createEClass(NEED);
		createEAttribute(needEClass, NEED__CATEGORY);
		createEReference(needEClass, NEED__SCENARIOS);

		strategyEClass = createEClass(STRATEGY);

		abstractProductEClass = createEClass(ABSTRACT_PRODUCT);

		portfolioEClass = createEClass(PORTFOLIO);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__FEATURES);
		createEReference(productEClass, PRODUCT__RELEASES);
		createEAttribute(productEClass, PRODUCT__STAGE);
		createEReference(productEClass, PRODUCT__COMPONENTS);
		createEReference(productEClass, PRODUCT__EDITIONS);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__DEPENDENCIES);
		createEReference(featureEClass, FEATURE__ENABLERS);
		createEAttribute(featureEClass, FEATURE__SIZE);
		createEAttribute(featureEClass, FEATURE__STATE);
		createEAttribute(featureEClass, FEATURE__DESIGN);
		createEReference(featureEClass, FEATURE__COMPONENTS);
		createEReference(featureEClass, FEATURE__RELEASE);
		createEReference(featureEClass, FEATURE__EDITIONS);

		editionEClass = createEClass(EDITION);
		createEReference(editionEClass, EDITION__BASES);
		createEReference(editionEClass, EDITION__FEATURES);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__FEATURES);
		createEAttribute(releaseEClass, RELEASE__RELEASED);
		createEAttribute(releaseEClass, RELEASE__RELEASE_DATE);
		createEAttribute(releaseEClass, RELEASE__OVERHEAD);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__OFFERINGS);

		dependencyEClass = createEClass(DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__OPTIONAL);
		createEReference(dependencyEClass, DEPENDENCY__DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__IMPACT);
		createEAttribute(dependencyEClass, DEPENDENCY__DESCRIPTION);

		enablerEClass = createEClass(ENABLER);
		createEAttribute(enablerEClass, ENABLER__BOOST);
		createEAttribute(enablerEClass, ENABLER__DESCRIPTION);
		createEReference(enablerEClass, ENABLER__ENABLER);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__DEPENDENCIES);

		// Create enums
		needCategoryEEnum = createEEnum(NEED_CATEGORY);
		productStageEEnum = createEEnum(PRODUCT_STAGE);
		featureStateEEnum = createEEnum(FEATURE_STATE);
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

		// Obtain other dependent packages
		org.nasdanika.rigel.RigelPackage theRigelPackage = (org.nasdanika.rigel.RigelPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.nasdanika.rigel.RigelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter hierarchicalModelElementEClass_T = addETypeParameter(hierarchicalModelElementEClass, "T");
		ETypeParameter hierarchicalComparableModelElementEClass_T = addETypeParameter(
				hierarchicalComparableModelElementEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		offeringEClass.getESuperTypes().add(this.getModelElement());
		offeringEClass.getESuperTypes().add(theRigelPackage.getCapability());
		comparableModelElementEClass.getESuperTypes().add(this.getModelElement());
		hierarchicalModelElementEClass.getESuperTypes().add(this.getModelElement());
		EGenericType g1 = createEGenericType(this.getHierarchicalModelElement());
		EGenericType g2 = createEGenericType(hierarchicalComparableModelElementEClass_T);
		g1.getETypeArguments().add(g2);
		hierarchicalComparableModelElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getComparableModelElement());
		hierarchicalComparableModelElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getHierarchicalModelElement());
		g2 = createEGenericType(this.getOrganization());
		g1.getETypeArguments().add(g2);
		organizationEClass.getEGenericSuperTypes().add(g1);
		personaEClass.getESuperTypes().add(this.getComparableModelElement());
		g1 = createEGenericType(this.getHierarchicalComparableModelElement());
		g2 = createEGenericType(this.getNeed());
		g1.getETypeArguments().add(g2);
		needEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getHierarchicalComparableModelElement());
		g2 = createEGenericType(this.getStrategy());
		g1.getETypeArguments().add(g2);
		strategyEClass.getEGenericSuperTypes().add(g1);
		abstractProductEClass.getESuperTypes().add(this.getModelElement());
		g1 = createEGenericType(this.getAbstractProduct());
		portfolioEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getHierarchicalModelElement());
		g2 = createEGenericType(this.getAbstractProduct());
		g1.getETypeArguments().add(g2);
		portfolioEClass.getEGenericSuperTypes().add(g1);
		productEClass.getESuperTypes().add(this.getAbstractProduct());
		productEClass.getESuperTypes().add(this.getOffering());
		g1 = createEGenericType(this.getHierarchicalModelElement());
		g2 = createEGenericType(this.getFeature());
		g1.getETypeArguments().add(g2);
		featureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOffering());
		featureEClass.getEGenericSuperTypes().add(g1);
		editionEClass.getESuperTypes().add(this.getOffering());
		releaseEClass.getESuperTypes().add(this.getModelElement());
		scenarioEClass.getESuperTypes().add(this.getComparableModelElement());
		scenarioEClass.getESuperTypes().add(theRigelPackage.getIPackage());
		g1 = createEGenericType(this.getHierarchicalModelElement());
		g2 = createEGenericType(this.getComponent());
		g1.getETypeArguments().add(g2);
		componentEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Url(), ecorePackage.getEString(), "url", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(offeringEClass, Offering.class, "Offering", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffering_TargetAudiences(), this.getPersona(), this.getPersona_Offerings(), "targetAudiences",
				null, 0, -1, Offering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffering_Includes(), this.getOffering(), null, "includes", null, 0, -1, Offering.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffering_Scenarios(), this.getScenario(), this.getScenario_Offerings(), "scenarios", null, 0,
				-1, Offering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparableModelElementEClass, ComparableModelElement.class, "ComparableModelElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparableModelElement_Weight(), ecorePackage.getEDouble(), "weight", "1.0", 0, 1,
				ComparableModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparableModelElement_EffectiveWeight(), ecorePackage.getEDouble(), "effectiveWeight", "1.0",
				0, 1, ComparableModelElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hierarchicalModelElementEClass, HierarchicalModelElement.class, "HierarchicalModelElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(hierarchicalModelElementEClass_T);
		initEReference(getHierarchicalModelElement_Children(), g1, null, "children", null, 0, -1,
				HierarchicalModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getHierarchicalModelElement());
		g2 = createEGenericType(hierarchicalModelElementEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getHierarchicalModelElement_LinkedChildren(), g1, null, "linkedChildren", null, 0, -1,
				HierarchicalModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hierarchicalComparableModelElementEClass, HierarchicalComparableModelElement.class,
				"HierarchicalComparableModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Personas(), this.getPersona(), null, "personas", null, 0, -1, Organization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Products(), this.getAbstractProduct(), null, "products", null, 0, -1,
				Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Strategies(), this.getStrategy(), null, "strategies", null, 0, -1,
				Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_Needs(), this.getNeed(), null, "needs", null, 0, -1, Persona.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPersona_Offerings(), this.getOffering(), this.getOffering_TargetAudiences(), "offerings",
				null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(needEClass, Need.class, "Need", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeed_Category(), this.getNeedCategory(), "category", null, 0, 1, Need.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeed_Scenarios(), this.getScenario(), null, "scenarios", null, 0, -1, Need.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractProductEClass, AbstractProduct.class, "AbstractProduct", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(portfolioEClass, Portfolio.class, "Portfolio", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Features(), this.getFeature(), null, "features", null, 0, -1, Product.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Releases(), this.getRelease(), null, "releases", null, 0, -1, Product.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Stage(), this.getProductStage(), "stage", null, 0, 1, Product.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Components(), this.getComponent(), null, "components", null, 0, -1, Product.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Editions(), this.getEdition(), null, "editions", null, 0, -1, Product.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1,
				Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Enablers(), this.getEnabler(), null, "enablers", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Size(), ecorePackage.getEDouble(), "size", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_State(), this.getFeatureState(), "state", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Design(), ecorePackage.getEString(), "design", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Components(), this.getComponent(), null, "components", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Release(), this.getRelease(), this.getRelease_Features(), "release", null, 0, 1,
				Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Editions(), this.getEdition(), this.getEdition_Features(), "editions", null, 0, -1,
				Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editionEClass, Edition.class, "Edition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdition_Bases(), this.getEdition(), null, "bases", null, 0, -1, Edition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEdition_Features(), this.getFeature(), this.getFeature_Editions(), "features", null, 0, -1,
				Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_Features(), this.getFeature(), this.getFeature_Release(), "features", null, 0, -1,
				Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_Released(), ecorePackage.getEBoolean(), "released", null, 0, 1, Release.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Release.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_Overhead(), ecorePackage.getEDouble(), "overhead", null, 0, 1, Release.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Offerings(), this.getOffering(), this.getOffering_Scenarios(), "offerings", null, 0,
				-1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Dependency.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Dependency(), this.getFeature(), null, "dependency", null, 1, 1, Dependency.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Impact(), ecorePackage.getEDouble(), "impact", "0.5", 0, 1, Dependency.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enablerEClass, Enabler.class, "Enabler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnabler_Boost(), ecorePackage.getEDouble(), "boost", null, 0, 1, Enabler.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnabler_Description(), ecorePackage.getEString(), "description", null, 0, 1, Enabler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnabler_Enabler(), this.getFeature(), null, "enabler", null, 1, 1, Enabler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Dependencies(), this.getComponent(), null, "dependencies", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(needCategoryEEnum, NeedCategory.class, "NeedCategory");
		addEEnumLiteral(needCategoryEEnum, NeedCategory.BASIC);
		addEEnumLiteral(needCategoryEEnum, NeedCategory.PERFORMANCE);
		addEEnumLiteral(needCategoryEEnum, NeedCategory.DELIGHTER);

		initEEnum(productStageEEnum, ProductStage.class, "ProductStage");
		addEEnumLiteral(productStageEEnum, ProductStage.PLANNING);
		addEEnumLiteral(productStageEEnum, ProductStage.DEVELOPMENT);
		addEEnumLiteral(productStageEEnum, ProductStage.RELEASED);
		addEEnumLiteral(productStageEEnum, ProductStage.RETIRED);

		initEEnum(featureStateEEnum, FeatureState.class, "FeatureState");
		addEEnumLiteral(featureStateEEnum, FeatureState.NEW);
		addEEnumLiteral(featureStateEEnum, FeatureState.IN_PROGRESS);
		addEEnumLiteral(featureStateEEnum, FeatureState.DONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(this, source, new String[] { "documentation",
				"Nasdanika Sage helps organizations to manage and develop their product portfolios by establishing traceability from their target audiences (personas) needs to product features and their dependencies. \nIt also allow to assign weights to personas and their needs and compute weight (impact) of features. Features can be sized in some units of development effort - money, story points, days. \nUsing story sizes (including dependencies) and story weight/benefit a cost benefit analysis can be conducted to identify most valuable features, where value is benefit/size. It also allows to identify most valuable products in the portfolio." });
		addAnnotation(modelElementEClass, source, new String[] { "documentation",
				"Base class for other model elements which feature name and description." });
		addAnnotation(getModelElement_Name(), source, new String[] { "documentation", "Element name." });
		addAnnotation(getModelElement_Url(), source,
				new String[] { "documentation", "Element URL if applicable. E.g. organization or product web site." });
		addAnnotation(getModelElement_Description(), source,
				new String[] { "documentation", "Element description in markdown." });
		addAnnotation(getModelElement_Configuration(), source, new String[] { "documentation",
				"Custom element configuration in YAML. It can be used for specialized analysis or reporting. For example features may specify requirements such as skills, organizational capabilities, or third-party services or tools." });
		addAnnotation(offeringEClass, source, new String[] { "documentation",
				"Offering is a base class for products and editions - something that is offered to personas, which are offering\'s target audiences." });
		addAnnotation(getOffering_TargetAudiences(), source, new String[] { "documentation",
				"Personas to which this offering - product or edition - is offered. " });
		addAnnotation(getOffering_Includes(), source, new String[] { "documentation",
				"One offering may include (bundle) other offferings. For example, Nasdanika Tool Suite would include community editions of Nasdanika products." });
		addAnnotation(comparableModelElementEClass, source, new String[] { "documentation",
				"Model element which can be assigned a weight/importance. The weight is used for comparing the element with its siblings in the containing reference." });
		addAnnotation(getComparableModelElement_Weight(), source, new String[] { "documentation",
				"Model element weight which is used to compare the importance of this element with its siblings. It may be any positive value." });
		addAnnotation(getComparableModelElement_EffectiveWeight(), source, new String[] { "documentation",
				"Effective weight is calculated by computing the element\'s normalized weight and multiplying it by the container\'s effective weight if the container is also a comparable element. \nThe normalized weight is calculated by dividing the element\'s weight by the sum of weights of all elements in its containing reference. As such the normalized weight is a number \nbetween zero and one and the sum of normalized weights of elements in a containing references is one. \nThe effective weight is also a number between zero and one and the sum of effective weights in a hierarchy of comparables is one.\n" });
		addAnnotation(hierarchicalModelElementEClass, source,
				new String[] { "documentation", "A model element which can form a hierarchy." });
		addAnnotation(getHierarchicalModelElement_Children(), source,
				new String[] { "documentation", "Element\'s children contained by the element.\r\n" });
		addAnnotation(getHierarchicalModelElement_LinkedChildren(), source, new String[] { "documentation",
				"Linked children, not contained by the element. Links allow to build logical hierarchies with elements residing in different resources (files). Breaking a model into multiple resources simplifies collaborative work on the model." });
		addAnnotation(hierarchicalComparableModelElementEClass, source,
				new String[] { "documentation", "A model element which is both hierarchical and comparable." });
		addAnnotation(organizationEClass, source, new String[] { "documentation",
				"Organization it the root of the Sage model. Organizations can be nested. Different products in organization\'s portfolio may be produced by different child organizations." });
		addAnnotation(getOrganization_Personas(), source, new String[] { "documentation",
				"Personas which represent the organization\'s target audiences. Typically shall be defined at the root organization, although child organizations may define internal personas." });
		addAnnotation(getOrganization_Products(), source, new String[] { "documentation",
				"Products manufactured by the organization. Products can be grouped into portfolios." });
		addAnnotation(personaEClass, source, new String[] { "documentation",
				"Personas represent target audiences of products manufactured by the organization. \n\nPersonas can be assigned relative weight/importance which is used to calculate effective weight of persona needs and then product features fulfilling those needs. \n" });
		addAnnotation(getPersona_Needs(), source, new String[] { "documentation",
				"Personas have needs which can be organized into a hierarchy. \nProduct features are mapped to the needs they fulfill." });
		addAnnotation(getPersona_Offerings(), source, new String[] { "documentation",
				"A list of products and product editions (for products with editions) which are offered to a particular persona to fulfill their needs." });
		addAnnotation(needEClass, source, new String[] { "documentation",
				"Persona need. Has a weight relative to \"peer\" needs. \n\n\nThis weight is used to compute effective weight of a need to be used in computing feature and product weights (benefits) and values (benefit/investment|effort|size).\n\n\nNeeds can be organized into a hierarchy.\n" });
		addAnnotation(getNeed_Category(), source,
				new String[] { "documentation", "Need category - basic, performance, or delighter." });
		addAnnotation(getNeed_Scenarios(), source,
				new String[] { "documentation", "Scenarios demonstrating how this need is fulfilled by offerings." });
		addAnnotation(strategyEClass, source, new String[] { "documentation",
				"Strategies capture the core guiding principles of an organization. They can be associated with products and features to compute strategic algnment which, in addition to the cost/benefit analysis, may help in feature prioritization. Strategies may also be used in identification of new features and decision making processes on how to implement those features." });
		addAnnotation(abstractProductEClass, source,
				new String[] { "documentation", "Base class for products and portfolios." });
		addAnnotation(portfolioEClass, source,
				new String[] { "documentation", "Portfolio is a container of products and other portfolios. " });
		addAnnotation(productEClass, source, new String[] { "documentation",
				"Product delivers value to customers (personas) by satisfying their needs via product features. A product may have multiple editions either tailored to different personas  and providing different levels of functionality at a different cost. E.g. there may be a community/free edition, a professional edition and an enterprise edition." });
		addAnnotation(getProduct_Features(), source, new String[] { "documentation",
				"A product provides multiple features which can be organized into editons." });
		addAnnotation(getProduct_Releases(), source, new String[] { "documentation",
				"Product features are delivered incrementally in a series of releases." });
		addAnnotation(getProduct_Stage(), source, new String[] { "documentation", "Product lifecycle stage." });
		addAnnotation(getProduct_Components(), source,
				new String[] { "documentation", "A product may consist of several interdependent components." });
		addAnnotation(getProduct_Editions(), source, new String[] { "documentation", "Product editions." });
		addAnnotation(featureEClass, source, new String[] { "documentation",
				"Feature is a unit of product functionality which satisfies specific persona needs. Feature\'s relative importance is computed from the needs satisfied by the feature. " });
		addAnnotation(getFeature_Dependencies(), source, new String[] { "documentation",
				"Mapping to features which this feature depends on. Dependencies may be mandatory or optional. Mandatory dependencies must be released in order to release the feature. Optional dependencies affect the benefit delivered by the feature. " });
		addAnnotation(getFeature_Enablers(), source, new String[] { "documentation",
				"Enablers improve productivity and thus reduce the size of a feature. For example, a code generator may be an enabler for a \"feature\" \"Set up a a new project\"." });
		addAnnotation(getFeature_Size(), source, new String[] { "documentation",
				"The amount of effort or expenditure required to implement the feature in some units agreed upon across the organization - money, story points, person hours, ...\r\n" });
		addAnnotation(getFeature_State(), source,
				new String[] { "documentation", "Feature state in the development process." });
		addAnnotation(getFeature_Design(), source, new String[] { "documentation",
				"Feature design in markdown. While the feature description explains what this feature does, the feature design explains how feature functionality shall be implemented. " });
		addAnnotation(getFeature_Components(), source, new String[] { "documentation",
				"Components which need to be create/modified to deliver the feature." });
		addAnnotation(getFeature_Release(), source, new String[] { "documentation", "Feature release." });
		addAnnotation(getFeature_Editions(), source,
				new String[] { "documentation", "Editions this feature is included into." });
		addAnnotation(editionEClass, source, new String[] { "documentation",
				"Product edition is a grouping of features which fulfill needs of a specific target audience. For example, a community edition may target customer with basic needs, and a professional edition would include additional features fulfilling the needs of customers who use the product extensively." });
		addAnnotation(getEdition_Bases(), source, new String[] { "documentation",
				"Editions which this one is based on, i.e. an edition includes all the features from its base editions plus the features explicitly included in the edition." });
		addAnnotation(getEdition_Features(), source,
				new String[] { "documentation", "Features included in this edition." });
		addAnnotation(releaseEClass, source, new String[] { "documentation",
				"Release is a version of a product which was made available to the product\'s target audiences. It is also a unit of delivery of a set of features.   " });
		addAnnotation(getRelease_Features(), source,
				new String[] { "documentation", "New features included in the release. " });
		addAnnotation(getRelease_Released(), source, new String[] { "documentation",
				"True if the release was made available to the product\'s target audiences, false otherwise - it it is still in planning/development." });
		addAnnotation(getRelease_ReleaseDate(), source,
				new String[] { "documentation", "Planned or actual release date." });
		addAnnotation(getRelease_Overhead(), source, new String[] { "documentation",
				"Amount of effort to perform release activities (press release, writing release notes, ...) in addition to the size of included features." });
		addAnnotation(needCategoryEEnum, source, new String[] { "documentation",
				"Need categories based on the [Kano model](https://en.wikipedia.org/wiki/Kano_model)." });
		addAnnotation(needCategoryEEnum.getELiterals().get(0), source, new String[] { "documentation",
				"Must be need - expected to be fulfilled and leads to dissatisfaction if not.\r\n" });
		addAnnotation(needCategoryEEnum.getELiterals().get(1), source,
				new String[] { "documentation", "Standard desired needs which increase satisfaction when fulfilled." });
		addAnnotation(needCategoryEEnum.getELiterals().get(2), source,
				new String[] { "documentation", "Unexpected needs - \"I didn\'t know I wanted it, but I like it!\"." });
		addAnnotation(scenarioEClass, source, new String[] { "documentation",
				"Scenario demonstrates how offerings fulfill a need. Multiple offerings may particpate in need fulfillment scenario. \nScenario weight reflects importance of a particular scenario in fulfilling the need comparing to the other scenarios.\nIf there is more than one offering in a scenario, then the weight is distributed evenly between the participating offerings." });
		addAnnotation(getScenario_Offerings(), source,
				new String[] { "documentation", "Feature fulfilling the need." });
		addAnnotation(dependencyEClass, source, new String[] { "documentation",
				"Dependency entry. See Feature.dependency documentation for details." });
		addAnnotation(getDependency_Optional(), source, new String[] { "documentation",
				"Indicated that the dependency is optional and its effective weight shall be computed using \"impact\" value." });
		addAnnotation(getDependency_Dependency(), source, new String[] { "documentation", "Dependency feature." });
		addAnnotation(getDependency_Impact(), source, new String[] { "documentation",
				"Impact indicated how much the benefit delivered by the dependent feature would be affected if the dependency feature is not provided. Impact value 1.0 is equivalent to a mandatory dependency, i.e. if a dependency is not available then the dependent feature provides zero benefit. \r\nImpact is used in calculating the effective weight of dependency features which indirectly fulfil persona needs. Such weights in turn are used to calculate weights of releases of internal products containing dependency features." });
		addAnnotation(getDependency_Description(), source,
				new String[] { "documentation", "Description of the dependency in markdown." });
		addAnnotation(enablerEClass, source,
				new String[] { "documentation", "See Feature.enabler documentation for details." });
		addAnnotation(getEnabler_Boost(), source, new String[] { "documentation",
				"Amount of effort by which the enabler reduces the size of the feature it enables." });
		addAnnotation(getEnabler_Description(), source,
				new String[] { "documentation", "Markdown description of the enabler." });
		addAnnotation(getEnabler_Enabler(), source, new String[] { "documentation", "Enabling feature." });
		addAnnotation(productStageEEnum, source, new String[] { "documentation", "Product lifecycle stage." });
		addAnnotation(productStageEEnum.getELiterals().get(0), source, new String[] { "documentation",
				"Initial product stage from the idea to the start of development. This stage includes proofs of concepts and prototyping." });
		addAnnotation(productStageEEnum.getELiterals().get(1), source, new String[] { "documentation",
				"A stage at which the organization has committed resources to producing the first release of the product, but the product hasn\'t been released yet." });
		addAnnotation(productStageEEnum.getELiterals().get(2), source, new String[] { "documentation",
				"At least one release was made availale to the product target audiences." });
		addAnnotation(productStageEEnum.getELiterals().get(3), source, new String[] { "documentation",
				"A product has reached the end of its useful life. There is no investment in new product features anymore. The organization may still spend some resources on product maintenance." });
		addAnnotation(featureStateEEnum, source,
				new String[] { "documentation", "Feature state reflects level of \"donness\"." });
		addAnnotation(featureStateEEnum.getELiterals().get(0), source,
				new String[] { "documentation", "Initial feature state from creation through grooming." });
		addAnnotation(featureStateEEnum.getELiterals().get(1), source,
				new String[] { "documentation", "The feature is actively worked on." });
		addAnnotation(featureStateEEnum.getELiterals().get(2), source,
				new String[] { "documentation", "All feature work has been completed." });
		addAnnotation(componentEClass, source, new String[] { "documentation",
				"Product component. Components may be developed independently by different teams, but are released all together as part of a product release." });
		addAnnotation(getComponent_Dependencies(), source, new String[] { "documentation",
				"A component may depend on other components in the same product or other products." });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation(this, source, new String[] { "label_ru",
				"\u041c\u0443\u0434\u0440\u0435\u0446-\u0441\u043e\u0432\u0435\u0442\u043d\u0438\u043a? \u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c \u0440\u0435\u0448\u0435\u043d\u0438\u0439?",
				"documentation_ru",
				"Nasdanika Sage \u043f\u043e\u043c\u043e\u0433\u0430\u0435\u0442 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c \u0443\u043f\u0440\u0430\u0432\u043b\u044f\u0442\u044c \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0435\u043c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432. \n\n\n\u0410 \u0438\u043c\u0435\u043d\u043d\u043e: \n\n\n1. \u041e\u0442\u0441\u043b\u0435\u0436\u0438\u0432\u0430\u0442\u044c \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u0438\u043d\u0442\u0435\u0440\u0435\u0441\u043e\u0432\u0430\u043d\u043d\u044b\u0445 \u043b\u0438\u0446, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u0445\u0441\u044f \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0435\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u0442\u043e \u0435\u0441\u0442\u044c \u0432\u0441\u0435\u0433\u0434\u0430 \u0438\u043c\u0435\u0442\u044c \u043e\u0442\u0432\u0435\u0442 \u043d\u0430 \u0432\u043e\u043f\u0440\u043e\u0441: \u0447\u0442\u043e \u0438 \u043a\u043e\u043c\u0443 \u0431\u044b\u043b\u043e \u043d\u0443\u0436\u043d\u043e \u043e\u0442 \u043a\u0430\u0436\u0434\u043e\u0433\u043e \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u043e\u0433\u043e  \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430. \n\n\n2. \u0425\u0440\u0430\u043d\u0438\u0442\u044c \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e \u0432\u0437\u0430\u0438\u043c\u043e\u0441\u0432\u044f\u0437\u044f\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0438 \u043f\u0440\u043e\u0433\u043d\u043e\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043f\u043e\u0441\u043b\u0435\u0434\u0441\u0442\u0432\u0438\u044f \u0432\u043d\u043e\u0441\u0438\u043c\u044b\u0445 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0439.\n\n\n3. \u041f\u0440\u0438\u0441\u0432\u0430\u0438\u0432\u0430\u0442\u044c \"\u0432\u0435\u0441\" \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044f\u043c \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438 (\u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u0430\u043c), \u043e\u0446\u0435\u043d\u0438\u0432\u0430\u0442\u044c \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043f\u043e \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u0438\u0445 \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438, \u0443\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u043f\u0440\u0438\u043e\u0440\u0438\u0442\u0435\u0442\u044b.  \n\n\n4. \u041e\u0446\u0435\u043d\u0438\u0432\u0430\u0442\u044c \u0437\u0430\u0442\u0440\u0430\u0442\u044b \u043d\u0430 \u0432\u044b\u043f\u0443\u0441\u043a \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0432 \u0440\u0430\u0437\u043b\u0438\u0447\u043d\u044b\u0445 \u0435\u0434\u0438\u043d\u0438\u0446\u0430\u0445: \u0434\u0435\u043d\u044c\u0433\u0430\u0445, \u0442\u0440\u0443\u0434\u043e\u0447\u0430\u0441\u0430\u0445 \u0438 \u0434\u0440.\n\n\n\u041d\u0430 \u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u0438 \u043f\u0440\u0438\u0441\u0432\u043e\u0435\u043d\u043d\u044b\u0445 \u043e\u0446\u0435\u043d\u043e\u043a, \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u0438 \u043e \u0437\u0430\u0442\u0440\u0430\u0442\u0430\u0445 \u043d\u0430 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0443 \u0438 \u043f\u043b\u0430\u043d\u0438\u0440\u0443\u0435\u043c\u043e\u043c \u044d\u043a\u043e\u043d\u043e\u043c\u0438\u0447\u0435\u0441\u043a\u043e\u043c \u044d\u0444\u0444\u0435\u043a\u0442\u0435 \u043c\u043e\u0436\u043d\u043e \u043f\u043b\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0440\u0435\u043d\u0442\u0430\u0431\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0442\u044c \u043d\u0430\u0438\u0431\u043e\u043b\u0435\u0435 \u0446\u0435\u043d\u043d\u044b\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b \u0432 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0435.\n" });
		addAnnotation(modelElementEClass, source, new String[] { "label_ru",
				"\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438",
				"documentation_ru",
				"\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u0438\u043c\u0435\u044e\u0449\u0438\u0439 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u0438 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435." });
		addAnnotation(getModelElement_Name(), source, new String[] { "label_ru",
				"\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", "documentation_ru",
				"\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430" });
		addAnnotation(getModelElement_Url(), source, new String[] { "documentation_ru",
				"URL \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043c\u043e\u0434\u0435\u043b\u0438 (\u043f\u0440\u0438 \u043d\u0430\u043b\u0438\u0447\u0438\u0438). \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440. \u0432\u0435\u0431-\u0441\u0430\u0439\u0442 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u0438\u043b\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430." });
		addAnnotation(getModelElement_Description(), source, new String[] { "label_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435", "documentation_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043c\u043e\u0434\u0435\u043b\u0438 \u0441 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c \u0441\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441\u0430 *markdown*." });
		addAnnotation(getModelElement_Configuration(), source, new String[] { "label_ru",
				"\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f", "documentation_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0439 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043d\u0430 YAML. \u041c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0430 \u0434\u043b\u044f \u0441\u043f\u0435\u0446\u0438\u0430\u043b\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0433\u043e \u0430\u043d\u0430\u043b\u0438\u0437\u0430 \u0438\u043b\u0438 \u043e\u0442\u0447\u0435\u0442\u043d\u043e\u0441\u0442\u0438. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u0444\u0443\u043d\u043a\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0442\u044c \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u044f, \u0442\u0430\u043a\u0438\u0435 \u043a\u0430\u043a \u043d\u0430\u0432\u044b\u043a\u0438, \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u043e\u043d\u043d\u044b\u0435 \u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e\u0441\u0442\u0438 \u0438\u043b\u0438 \u0441\u0442\u043e\u0440\u043e\u043d\u043d\u0438\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044b \u0438\u043b\u0438 \u0438\u043d\u0441\u0442\u0440\u0443\u043c\u0435\u043d\u0442\u044b." });
		addAnnotation(offeringEClass, source, new String[] { "label_ru", "\u0420\u0435\u0448\u0435\u043d\u0438\u0435",
				"documentation_ru",
				"\u0420\u0435\u0448\u0435\u043d\u0438\u0435 - \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0438 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439 - \u0441\u043e\u0432\u043e\u043a\u0443\u043f\u043d\u043e\u0441\u0442\u044c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u043f\u0440\u0435\u0434\u043b\u0430\u0433\u0430\u0435\u0442\u0441\u044f \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043c, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u043c\u0441\u044f \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0435\u0439 \u0440\u0435\u0448\u0435\u043d\u0438\u044f.\n" });
		addAnnotation(getOffering_TargetAudiences(), source, new String[] { "label_ru",
				"\u041f\u0435\u0440\u0441\u043e\u043d\u0430", "documentation_ru",
				"\u041f\u0435\u0440\u0441\u043e\u043d\u044b \u043a\u043e\u0442\u043e\u0440\u044b\u043c \u043f\u0440\u0435\u0434\u043b\u0430\u0433\u0430\u0435\u0442\u0441\u044f \u044d\u0442\u043e\u0442 \u043f\u0440\u043e\u0434\u0443\u043a\u0442 \u0438\u043b\u0438 \u0440\u0435\u0434\u0430\u0446\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430. " });
		addAnnotation(comparableModelElementEClass, source, new String[] { "label_ru",
				"\u0421\u0440\u0430\u0432\u043d\u0438\u043c\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438",
				"documentation_ru",
				"\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u043e\u0440\u043e\u043c\u0443 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043f\u0440\u0438\u0441\u0432\u043e\u0435\u043d \u0432\u0435\u0441, \u043e\u0446\u0435\u043d\u043a\u0430, \u043f\u0440\u0438\u043e\u0440\u0438\u0442\u0435\u0442 \u0434\u043b\u044f \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044f \u0441 \u0430\u043d\u0430\u043b\u043e\u0433\u0438\u0447\u043d\u044b\u043c\u0438 \u043e\u0431\u044a\u0435\u043a\u0442\u0430\u043c\u0438. " });
		addAnnotation(getComparableModelElement_Weight(), source, new String[] { "label_ru", "\u0412\u0435\u0441",
				"documentation_ru",
				"\u0412\u0435\u0441 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0434\u043b\u044f \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044f \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u044d\u0442\u043e\u0433\u043e \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0441 \u0440\u043e\u0434\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u043c\u0438 \u043e\u0431\u044a\u0435\u043a\u0442\u0430\u043c\u0438. \u041c\u043e\u0436\u0435\u0442 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u044c \u043b\u044e\u0431\u043e\u0435 \u043f\u043e\u043b\u043e\u0436\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435." });
		addAnnotation(getComparableModelElement_EffectiveWeight(), source, new String[] { "label_ru",
				"\u042d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0432\u0435\u0441",
				"documentation_ru",
				"\u042d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0432\u0435\u0441 \u0440\u0430\u0441\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u0443\u0442\u0435\u043c \u0432\u044b\u0447\u0438\u0441\u043b\u0435\u043d\u0438\u044f \u043d\u043e\u0440\u043c\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d\u043d\u043e\u0433\u043e \u0432\u0435\u0441\u0430 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0438 \u0443\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u044f \u0435\u0433\u043e \u043d\u0430 \u044d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0432\u0435\u0441 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0430, \u0435\u0441\u043b\u0438 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440 \u0442\u0430\u043a\u0436\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0441\u043e\u043f\u043e\u0441\u0442\u0430\u0432\u0438\u043c\u044b\u043c \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u043c.  \n\n\u041d\u043e\u0440\u043c\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u0432\u0435\u0441 \u0440\u0430\u0441\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u0443\u0442\u0435\u043c \u0434\u0435\u043b\u0435\u043d\u0438\u044f \u0432\u0435\u0441\u0430 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043d\u0430 \u0441\u0443\u043c\u043c\u0443 \u0432\u0435\u0441\u043e\u0432 \u0432\u0441\u0435\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0445 \u0432 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440 \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044f. \n\n\u0422\u0430\u043a\u0438\u043c \u043e\u0431\u0440\u0430\u0437\u043e\u043c, \u043d\u043e\u0440\u043c\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u0432\u0435\u0441 \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442 \u0441\u043e\u0431\u043e\u0439 \u0447\u0438\u0441\u043b\u043e  n \u043c\u0435\u0436\u0434\u0443 \u043d\u0443\u043b\u0435\u043c \u0438 \u0435\u0434\u0438\u043d\u0438\u0446\u0435\u0439, \u0430 \u0441\u0443\u043c\u043c\u0430 \u043d\u043e\u0440\u043c\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d\u043d\u044b\u0445 \u0432\u0435\u0441\u043e\u0432 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0445 \u0432 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440 \u0440\u0430\u0432\u043d\u0430 \u0435\u0434\u0438\u043d\u0438\u0446\u0435. \n\n\u042d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0432\u0435\u0441 \u0442\u0430\u043a\u0436\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0447\u0438\u0441\u043b\u043e\u043c \u043e\u0442 \u043d\u0443\u043b\u044f \u0434\u043e \u0435\u0434\u0438\u043d\u0438\u0446\u044b, \u0430 \u0441\u0443\u043c\u043c\u0430 \u044d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0445 \u0432\u0435\u0441\u043e\u0432 \u0432 \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0438 \u0441\u043e\u043f\u043e\u0441\u0442\u0430\u0432\u0438\u043c\u044b\u0445 \u0435\u0434\u0438\u043d\u0438\u0446 \u0440\u0430\u0432\u043d\u0430 \u0435\u0434\u0438\u043d\u0438\u0446\u0435.  " });
		addAnnotation(hierarchicalModelElementEClass, source, new String[] { "label_ru",
				"\u0418\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438",
				"documentation_ru",
				"\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043c\u043e\u0436\u0435\u0442 \u044f\u0432\u043b\u044f\u0442\u044c\u0441\u044f \u0447\u0430\u0441\u0442\u044c\u044e \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0438, \u0442\u043e \u0435\u0441\u0442\u044c \u0438\u043c\u0435\u0442\u044c \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0435 \u0438 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b" });
		addAnnotation(hierarchicalComparableModelElementEClass, source, new String[] { "label_ru",
				"\u0421\u0440\u0430\u0432\u0438\u043d\u0438\u043c\u044b\u0439 \u0418\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438",
				"documentation_ru",
				"\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043c\u043e\u0436\u0435\u0442 \u044f\u0432\u043b\u044f\u0442\u044c\u0441\u044f \u0447\u0430\u0441\u0442\u044c\u044e \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0438, \u0442\u043e \u0435\u0441\u0442\u044c \u0438\u043c\u0435\u0442\u044c \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0435 \u0438 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b. \u0418, \u043e\u0434\u043d\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e,  \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0441\u0440\u0430\u0432\u043d\u0438\u043c\u044b\u043c, \u0442\u043e \u0435\u0441\u0442\u044c \u0435\u043c\u0443 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043f\u0440\u0438\u0441\u0432\u043e\u0435\u043d \u0432\u0435\u0441, \u043e\u0446\u0435\u043d\u043a\u0430, \u043f\u0440\u0438\u043e\u0440\u0438\u0442\u0435\u0442 \u0434\u043b\u044f \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044f \u0441 \u0441\u043e\u043f\u043e\u0441\u0442\u0430\u0432\u0438\u043c\u044b\u043c\u0438 \u043e\u0431\u044a\u0435\u043a\u0442\u0430\u043c\u0438." });
		addAnnotation(organizationEClass, source, new String[] { "label_ru",
				"\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f", "documentation_ru",
				"\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u044d\u0442\u043e \u043a\u043e\u0440\u0435\u043d\u044c \u043c\u043e\u0434\u0435\u043b\u0438 Sage.  \n\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u0432\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0438, \u0442\u043e \u0435\u0441\u0442\u044c, \u0438\u043c\u0435\u0442\u044c \u043f\u043e\u0434\u0440\u0430\u0437\u0434\u0435\u043b\u0435\u043d\u0438\u044f. \n\u0420\u0430\u0437\u043b\u0438\u0447\u043d\u044b\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b \u0432 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0435 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c\u0441\u044f \u0440\u0430\u0437\u043d\u044b\u043c\u0438 \u043f\u043e\u0434\u0440\u0430\u0437\u0434\u0435\u043b\u0435\u043d\u0438\u044f\u043c\u0438 \u0438\u043b\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u0430\u043c\u0438  (\u0434\u043e\u0447\u0435\u0440\u043d\u0438\u043c\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c\u0438)." });
		addAnnotation(getOrganization_Personas(), source, new String[] { "label_ru",
				"\u041f\u0435\u0440\u0441\u043e\u043d\u0430", "documentation_ru",
				"\u0417\u0430\u043a\u0430\u0437\u0447\u0438\u043a, \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044c \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438. \u041a\u0430\u043a \u043f\u0440\u0430\u0432\u0438\u043b\u043e, \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u044b \u0432 \u043a\u043e\u0440\u043d\u0435\u0432\u043e\u0439 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438, \u0445\u043e\u0442\u044f \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0432\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u0432 \u0441\u0435\u0431\u044f \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u0435\u0439 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438." });
		addAnnotation(getOrganization_Products(), source, new String[] { "label_ru",
				"\u0410\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442",
				"documentation_ru",
				"\u041f\u0440\u043e\u0434\u0443\u043a\u0442 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u043c\u044b\u0439 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0435\u0439. \u041f\u0440\u043e\u0434\u0443\u043a\u0442\u044b \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u043e\u0431\u044a\u0435\u0434\u0438\u043d\u0435\u043d\u044b \u0432 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0438." });
		addAnnotation(getOrganization_Strategies(), source,
				new String[] { "label_ru", "\u0421\u0442\u0440\u0430\u0442\u0435\u0433\u0438\u044f" });
		addAnnotation(personaEClass, source, new String[] { "label_ru", "\u041f\u0435\u0440\u0441\u043e\u043d\u0430",
				"documentation_ru",
				"\u041f\u0435\u0440\u0441\u043e\u043d\u0430 - \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u0435\u043b\u044c \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438, \u0432 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0438\u0438 \u0441 \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u044f\u043c\u0438 \u043a\u043e\u0442\u043e\u0440\u043e\u0439 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442.\n\n\n\u041f\u0435\u0440\u0441\u043e\u043d\u0430\u043c \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043d\u0430\u0437\u043d\u0430\u0447\u0435\u043d \u043e\u0442\u043d\u043e\u0441\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u0432\u0435\u0441 \u0438\u043b\u0438 \u043e\u0446\u0435\u043d\u043a\u0430 \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u0439. \n\n\n\u042d\u0442\u043e \u043f\u043e\u0437\u0432\u043e\u043b\u0438\u0442 \u043e\u0446\u0435\u043d\u0438\u0442\u044c, \u043d\u0430 \u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0433\u043e\u0442\u043e\u0432\u044b\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u0442\u0440\u0435\u0431\u043e\u0432\u0430\u043d\u0438\u044f\u043c \u043f\u0435\u0440\u0441\u043e\u043d\u044b, \u0430 \u0442\u0430\u043a \u0436\u0435 \u043f\u0440\u0438\u043e\u0440\u0435\u0442\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0437\u0430\u0434\u0430\u0447\u0438 \u0432 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u0435 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438. " });
		addAnnotation(getPersona_Needs(), source, new String[] { "label_ru",
				"\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c", "documentation_ru",
				"\u041f\u0435\u0440\u0441\u043e\u043d\u044b \u0438\u043c\u0435\u044e\u0442 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u043e\u0432\u0430\u043d\u044b. \n\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438 \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u0441\u043e\u043f\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u044b \u0441 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044f\u043c\u0438 \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043e\u043d\u0438 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0442." });
		addAnnotation(getPersona_Offerings(), source, new String[] { "label_ru",
				"\u0420\u0435\u0448\u0435\u043d\u0438\u0435", "documentation_ru",
				"\u041f\u0435\u0440\u0435\u0447\u0435\u043d\u044c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0438 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 (\u0434\u043b\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0438\u043c\u0435\u044e\u0449\u0438\u0445 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0438), \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043f\u0440\u0435\u0434\u043b\u0430\u0433\u0430\u044e\u0442\u0441\u044f \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u043e\u0439 \u043f\u0435\u0440\u0441\u043e\u043d\u0435 \u0434\u043b\u044f \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \n\u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439." });
		addAnnotation(needEClass, source, new String[] { "label_ru",
				"\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c", "documentation_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0434\u043e\u043b\u0436\u043d\u0430 \u0431\u044b\u0442\u044c \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0430 \u0438\u043b\u0438  \u043f\u0440\u043e\u0431\u043b\u0435\u043c\u044b, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0434\u043e\u043b\u0436\u043d\u0430 \u0431\u044b\u0442\u044c \u0440\u0435\u0448\u0435\u043d\u0430 \u043f\u0440\u0438 \u043f\u043e\u043c\u043e\u0449\u0438 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430.\n\n\n\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044f\u043c \u043f\u0440\u0438\u0441\u0432\u0430\u0438\u0432\u0430\u0435\u0442\u0441\u044f \u0443\u0434\u0435\u043b\u044c\u043d\u044b\u0439 \u0432\u0435\u0441, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u043d\u0430\u0438\u0431\u043e\u043b\u0435\u0435 \u0437\u043d\u0430\u0447\u0438\u043c\u044b\u0435 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439.\n\n\n\u0423\u0434\u0435\u043b\u044c\u043d\u044b\u0439 \u0432\u0435\u0441 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0434\u043b\u044f \u0432\u044b\u0447\u0438\u0441\u043b\u0435\u043d\u0438\u044f \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0438\u043b\u0438 \u0435\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0438 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u0433\u043e\u0442\u043e\u0432\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430.\n\n\n\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u043e\u0432\u0430\u043d\u044b \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438.\n " });
		addAnnotation(getNeed_Category(), source, new String[] { "label_ru",
				"\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438",
				"documentation_ru", "Need category - basic, performance, or delighter." });
		addAnnotation(strategyEClass, source, new String[] { "label_ru",
				"\u0421\u0442\u0440\u0430\u0442\u0435\u0433\u0438\u044f", "documentation_ru",
				"\u0421\u0442\u0440\u0430\u0442\u0435\u0433\u0438\u0438 \u043e\u0442\u0440\u0430\u0436\u0430\u044e\u0442 \u043e\u0441\u043d\u043e\u0432\u043d\u044b\u0435 \u0440\u0443\u043a\u043e\u0432\u043e\u0434\u044f\u0449\u0438\u0435 \u043f\u0440\u0438\u043d\u0446\u0438\u043f\u044b \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u0438 \u0443\u0447\u0438\u0442\u044b\u0432\u0430\u044e\u0442\u0441\u044f \u043f\u0440\u0438 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0438\u0438 \u043f\u0440\u0438\u043e\u0440\u0438\u0442\u0435\u0442\u043e\u0432 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432, \u0440\u0430\u0437\u0432\u0438\u0442\u0438\u044f \u0438\u0445 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u043d\u0430 \u0440\u044f\u0434\u0443 \u0441 \u0430\u043d\u0430\u043b\u0438\u0437\u043e\u043c \u0437\u0430\u0442\u0440\u0430\u0442/\u0432\u044b\u0433\u043e\u0434.\n\u0421\u0442\u0440\u0430\u0442\u0435\u0433\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0442\u0430\u043a\u0436\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u043f\u0440\u0438 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0438\u0438 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0439 \u0438 \u0441\u043f\u043e\u0441\u043e\u0431\u043e\u0432 \u0440\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432." });
		addAnnotation(abstractProductEClass, source, new String[] { "label_ru",
				"\u0410\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442",
				"documentation_ru",
				"\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0438 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0435\u0439 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432" });
		addAnnotation(portfolioEClass, source, new String[] { "label_ru",
				"\u041f\u043e\u0440\u0442\u0444\u0435\u043b\u044c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432",
				"documentation_ru",
				"\u041f\u043e\u0440\u0442\u0444\u0435\u043b\u044c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0432 \u0441\u0435\u0431\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b \u0438\u043b\u0438 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u043f\u043e\u0440\u0442\u0444\u0435\u043b\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432" });
		addAnnotation(productEClass, source, new String[] { "label_ru", "\u041f\u0440\u043e\u0434\u0443\u043a\u0442",
				"documentation_ru",
				"\u041f\u0440\u043e\u0434\u0443\u043a\u0442 - \u043e\u0431\u044a\u0435\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438, \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u0439 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u0432. \u041f\u0440\u043e\u0434\u0443\u043a\u0442 \u043c\u043e\u0436\u0435\u0442 \u0438\u043c\u0435\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439, \u0430\u0434\u0430\u043f\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445 \u043a \u043d\u0443\u0436\u0434\u0430\u043c \u0440\u0430\u0437\u043d\u044b\u0445 \u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0439 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u0432, \u0440\u0430\u0437\u043b\u0438\u0447\u0430\u044e\u0449\u0438\u0445\u0441\u044f \u043e\u0431\u044a\u0435\u043c\u043e\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438, \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u043c\u043e\u0439 \u0432 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044e \u0438 \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c\u044e.  \u0422\u0430\u043a, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0434\u043b\u044f \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e\u0433\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f, \u043f\u0440\u043e\u0444\u0435\u0441\u0441\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u0430\u044f \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044f, \u043a\u043e\u0440\u043f\u043e\u0440\u0430\u0442\u0438\u0432\u043d\u0430\u044f \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044f.\n" });
		addAnnotation(featureEClass, source, new String[] { "label_ru",
				"\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a",
				"documentation_ru",
				"\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a  - \u044d\u0442\u043e \u0435\u0434\u0438\u043d\u0438\u0446\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u0443\u044e \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u0430.  \n\u041e\u0442\u043d\u043e\u0441\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u044c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0440\u0430\u0441\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0438\u0437 \u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0441\u043d\u043e\u0439 \u043e\u0446\u0435\u043d\u043a\u0438 \u0432\u0430\u0436\u043d\u043e\u0441\u0442\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438, \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u043c\u043e\u0439 \u044d\u0442\u0438\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c \u0431\u043b\u043e\u043a\u043e\u043c." });
		addAnnotation(getFeature_Release(), source, new String[] { "documentation_ru", "Feature release." });
		addAnnotation(getFeature_Editions(), source, new String[] { "label_ru",
				"\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f", "documentation_ru",
				"\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u0432 \u043a\u043e\u0442\u043e\u0440\u0443\u044e \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0430 \u044d\u0442\u043e\u0442 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a" });
		addAnnotation(editionEClass, source, new String[] { "label_ru",
				"\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f", "documentation_ru",
				"\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 - \u044d\u0442\u043e \u043d\u0430\u0431\u043e\u0440 \u0444\u0443\u043d\u043a\u0446\u0438\u0439, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0442  \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u043e\u0439 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438. \n\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, Free edition \u043f\u0440\u0435\u0434\u043d\u0430\u0437\u043d\u0430\u0447\u043a\u0435\u043d\u0430 \u0434\u043b\u044f \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432 \u0441 \u0431\u0430\u0437\u043e\u0432\u044b\u043c\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044f\u043c\u0438, \n\n\n\u0430 Professional edition \u0431\u0443\u0434\u0435\u0442 \u0432\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435 \u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e\u0441\u0442\u0438, \n\n\u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u0435 \u0441\u043f\u0435\u0446\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0430\u0442\u0435\u043b\u0435\u0439, \u0431\u043e\u043b\u0435\u0435 \u043f\u0440\u043e\u0444\u0435\u0441\u0441\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0449\u0438\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442.\n" });
		addAnnotation(getEdition_Bases(), source, new String[] { "label_ru",
				"\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f", "documentation_ru",
				"\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u0438, \u0431\u0430\u0437\u043e\u0432\u044b\u0435 \u0434\u043b\u044f \u044d\u0442\u043e\u0439 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0438. \n\n\u0420\u0435\u0434\u0430\u043a\u0446\u0438\u044f \u0432\u043b\u044e\u0447\u0430\u0435\u0442 \u0432 \u0441\u0435\u0431\u044f \u0432\u0441\u0435 \u0444\u0443\u043d\u043a\u0446\u0438 \u0438\u0437 \u0431\u0430\u0437\u043e\u0432\u044b\u0445 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0439, \u0430 \u0442\u0430\u043a \u0436\u0435 \u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u0438, \u044f\u0432\u043d\u043e \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0435 \u0432 \u044d\u0442\u0443 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044e.\n" });
		addAnnotation(getEdition_Features(), source, new String[] { "label_ru",
				"\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c",
				"documentation_ru",
				"\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u043c\u043e\u0434\u0443\u043b\u0438 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0435 \u0432 \u0434\u0430\u043d\u043d\u0443\u044e \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u044e" });
		addAnnotation(releaseEClass, source, new String[] { "label_ru", "\u0420\u0435\u043b\u0438\u0437",
				"documentation_ru",
				"\u0420\u0435\u043b\u0438\u0437 - \u044d\u0442\u043e \u0432\u0435\u0440\u0441\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u0431\u044b\u043b\u0430 \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0430 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438. \u042d\u0442\u043e \u0442\u0430\u043a\u0436\u0435 \u0435\u0434\u0438\u043d\u0438\u0446\u0430 \u0434\u043e\u0441\u0442\u0430\u0432\u043a\u0438 \u043d\u0430\u0431\u043e\u0440\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u0439." });
		addAnnotation(getRelease_Features(), source, new String[] { "label_ru",
				"\u0424\u043d\u0443\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c",
				"documentation_ru",
				"\u041d\u043e\u0432\u044b\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u0438, \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0435 \u0432 \u0440\u0435\u043b\u0438\u0437" });
		addAnnotation(getRelease_Released(), source, new String[] { "label_ru",
				"\u0412\u044b\u043f\u0443\u0449\u0435\u043d", "documentation_ru",
				"\u0418\u0421\u0422\u0418\u041d\u0410, \u0435\u0441\u043b\u0438 \u0440\u0435\u043b\u0438\u0437 \u0431\u044b\u043b \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438, \u0438\u043d\u0430\u0447\u0435 \u041b\u041e\u0416\u042c - \u043e\u043d \u0432\u0441\u0435 \u0435\u0449\u0435 \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u0435 \u043f\u043b\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f / \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438." });
		addAnnotation(getRelease_ReleaseDate(), source, new String[] { "label_ru",
				"\u0414\u0430\u0442\u0430 \u0440\u0435\u043b\u0438\u0437\u0430", "documentation_ru",
				"\u041f\u043b\u0430\u043d\u0438\u0440\u0443\u0435\u043c\u0430\u044f \u0438\u043b\u0438 \u0444\u0430\u043a\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0434\u0430\u0442\u0430 \u0440\u0435\u043b\u0438\u0437\u0430" });
		addAnnotation(getRelease_Overhead(), source, new String[] { "label_ru",
				"\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u044b\u0435 \u0440\u0430\u0441\u0445\u043e\u0434\u044b",
				"documentation_ru",
				"\u041e\u0431\u044a\u0435\u043c \u0437\u0430\u0442\u0440\u0430\u0442 \u043d\u0430 \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0440\u0435\u043b\u0438\u0437\u0430 (\u043f\u0443\u0431\u043b\u0438\u043a\u0430\u0446\u0438\u044f \u043f\u0440\u0435\u0441\u0441-\u0440\u0435\u043b\u0438\u0437\u0430, \u043d\u0430\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u0437\u0430\u043c\u0435\u0442\u043e\u043a \u043e \u0432\u044b\u043f\u0443\u0441\u043a\u0435 \u0438 \u0442.\u0434.). \u0412 \u0434\u043e\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u043a \u0440\u0430\u0441\u0445\u043e\u0434\u0430\u043c \u043d\u0430 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0443 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438." });
		addAnnotation(needCategoryEEnum, source, new String[] { "label_ru",
				"\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439",
				"documentation_ru",
				"\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439 \u0432 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0438\u0438 \u0441  [\u043c\u043e\u0434\u0435\u043b\u044c\u044e \u041a\u0430\u043d\u043e](https://en.wikipedia.org/wiki/Kano_model)." });
		addAnnotation(needCategoryEEnum.getELiterals().get(0), source, new String[] { "label_ru",
				"\u0411\u0430\u0437\u043e\u0432\u0430\u044f", "documentation_ru",
				"\u0411\u0430\u0437\u043e\u0432\u044b\u0435, \u0431\u0435\u0437 \u043a\u043e\u0442\u043e\u0440\u044b\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442 \u0432 \u043f\u0440\u0438\u043d\u0446\u0438\u043f\u0435 \u043d\u0435 \u0431\u0443\u0434\u0435\u0442 \u0438\u043c\u0435\u0442\u044c \u0441\u043c\u044b\u0441\u043b\u0430 \u0434\u043b\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f. " });
		addAnnotation(needCategoryEEnum.getELiterals().get(1), source, new String[] { "label_ru",
				"\u0421\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u043e\u0436\u0438\u0434\u0430\u0435\u043c\u0430\u044f",
				"documentation_ru",
				"\u0421\u0442\u0430\u043d\u0434\u0430\u0440\u0442 \u043e\u0436\u0438\u0434\u0430\u0435\u043c\u044b\u0439 \u043f\u043e\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043b\u0435\u043c/\u043c\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u043c. \u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u044e\u0442 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u043d\u043e\u0441\u0442\u044c \u043f\u043e\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043b\u044f." });
		addAnnotation(needCategoryEEnum.getELiterals().get(2), source, new String[] { "label_ru",
				"\u0423\u0445 \u0442\u044b! \u041a\u0440\u0443\u0442\u043e!", "documentation_ru",
				"\u041d\u0435\u043e\u0436\u0438\u0434\u0430\u043d\u043d\u044b\u0435, \u0432\u043e\u0441\u0445\u0438\u0449\u0430\u044e\u0449\u0438\u0435. \u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a Wow!-\u044d\u0444\u0444\u0435\u043a\u0442\u0430. \u00ab\u042f \u043d\u0435 \u0437\u043d\u0430\u043b, \u0447\u0442\u043e \u044d\u0442\u043e\u0433\u043e \u0445\u043e\u0447\u0443, \u043d\u043e \u043c\u043d\u0435 \u044d\u0442\u043e \u043d\u0440\u0430\u0432\u0438\u0442\u0441\u044f!\u00bb." });
		addAnnotation(scenarioEClass, source, new String[] { "label_ru",
				"\u0421\u0446\u0435\u043d\u0430\u0440\u0438\u0439", "documentation_ru",
				"TODO - \u043e\u0431\u043d\u043e\u0432\u0438\u0442\u044c \u043f\u0435\u0440\u0435\u0432\u043e\u0434.\n\n\u0423\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043e\u0442\u0440\u0430\u0436\u0430\u0435\u0442 \u043f\u043e\u043b\u043d\u043e\u0442\u0443/\u0441\u0442\u0435\u043f\u0435\u043d\u044c \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439. \u0422\u043e \u0435\u0441\u0442\u044c: \u0441\u0432\u044f\u0437\u044c \u043c\u0435\u0436\u0434\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c\u044e \u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u043c \u0438\u043b\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c \u0431\u043b\u043e\u043a\u043e\u043c \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0449\u0438\u043c \u044d\u0442\u0443 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c. \n\n\u041f\u043e\u043b\u043d\u043e\u0442\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0443\u0434\u0438\u0442\u044c: \u0432 \u043a\u0430\u043a\u043e\u0439 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u044b\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u0435\u0442 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u0443\u044e \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u043f\u043e \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044e \u0441 \u0434\u0440\u0443\u0433\u0438\u043c\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u043c\u0438 \u0431\u043b\u043e\u043a\u0430\u043c\u0438, \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u043c\u0438 \u0432 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u0438 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438.\n" });
		addAnnotation(getScenario_Offerings(), source, new String[] { "label_ru",
				"\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f", "documentation_ru",
				"\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u0435 \u0432 \u0441\u0446\u0435\u043d\u0430\u0440\u0438\u0438 \u0443\u0432\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438. " });
		addAnnotation(dependencyEClass, source, new String[] { "label_ru",
				"\u0417\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c", "documentation_ru",
				"\u0412\u0432\u043e\u0434 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0435\u0439. \u041f\u043e\u0434\u0440\u043e\u0431\u043d\u043e\u0441\u0442\u0438 \u0441\u043c\u043e\u0442\u0440\u0438\u0442\u0435 \u0432 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430\u0446\u0438\u0438 \u043f\u043e Feature.dependency." });
		addAnnotation(getDependency_Optional(), source, new String[] { "label_ru",
				"\u041e\u043f\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c",
				"documentation_ru",
				"\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442\u0441\u044f, \u0447\u0442\u043e \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043d\u0435 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0439 \u0438 \u0435\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0432\u0435\u0441  \u0440\u0430\u0441\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0438\u0441\u0445\u043e\u0434\u044f \u0438\u0437 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u0432\u043b\u0438\u044f\u043d\u0438\u044f \u043d\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u044e." });
		addAnnotation(getDependency_Dependency(), source, new String[] { "label_ru",
				"\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a",
				"documentation_ru",
				"\u0421\u0432\u044f\u0437\u0430\u043d\u043d\u044b\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a" });
		addAnnotation(getDependency_Impact(), source, new String[] { "label_ru",
				"\u0412\u043b\u0438\u044f\u043d\u0438\u0435 ", "documentation_ru",
				"\u0412\u043b\u0438\u044f\u043d\u0438\u0435 \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0430 \u0443\u0440\u043e\u0432\u0435\u043d\u044c \u0440\u0430\u0431\u043e\u0442\u043e\u0441\u043f\u043e\u0441\u043e\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430, \u0435\u0441\u043b\u0438 \u0432\u043b\u0438\u044f\u044e\u0449\u0430\u044f \u043d\u0430 \u043d\u0435\u0433\u043e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430. \n\n\u0415\u0441\u043b\u0438 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0432\u043b\u0438\u044f\u043d\u0438\u044f = 1, \u0442\u043e \u044d\u0442\u043e \u0437\u043d\u0430\u0447\u0438\u0442, \u0447\u0442\u043e \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u0430\u044f.  \n\n\u0422\u043e \u0435\u0441\u0442\u044c, \u0435\u0441\u043b\u0438 \u0432\u043b\u0438\u044f\u044e\u0449\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430, \u0442\u043e \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043d\u0435\u0440\u0430\u0431\u043e\u0442\u043e\u0441\u043f\u043e\u0441\u043e\u0431\u043d\u0430.\n\n\u0412\u043b\u0438\u044f\u043d\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u043f\u0440\u0438 \u0440\u0430\u0441\u0447\u0435\u0442\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u043e\u0433\u043e \u0432\u0435\u0441\u0430 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0445 \u0431\u043b\u043e\u043a\u043e\u0432, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043a\u043e\u0441\u0432\u0435\u043d\u043d\u043e \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u044f\u044e\u0442 \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u0432. \n\n\u0422\u0430\u043a\u0438\u0435 \u0432\u0435\u0441\u0430, \u0432 \u0441\u0432\u043e\u044e \u043e\u0447\u0435\u0440\u0435\u0434\u044c, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0442\u0441\u044f \u0434\u043b\u044f \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u0432\u0435\u0441\u043e\u0432 \u0432\u044b\u043f\u0443\u0441\u043a\u043e\u0432 \u0432\u043d\u0443\u0442\u0440\u0435\u043d\u043d\u0438\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432, \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0449\u0438\u0445 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u044b\u0435 \u0438\u043b\u0438 \u0432\u043b\u0438\u044f\u044e\u0449\u0438\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438.\n\nImpact indicated how much the benefit delivered by the dependent feature would be affected if the dependency feature is not provided. Impact value 1.0 is equivalent to a mandatory dependency, i.e. if a dependency is not available then the dependent feature provides zero benefit. \nImpact is used in calculating the effective weight of dependency features which indirectly fulfil persona needs. Such weights in turn are used to calculate weights of releases of internal products containing dependency features." });
		addAnnotation(getDependency_Description(), source, new String[] { "label_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435", "documentation_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0438. \u0421\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441 =  \u041c\u0430\u0440\u043a\u0434\u0430\u0443\u043d" });
		addAnnotation(enablerEClass, source, new String[] { "label_ru",
				"\u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0442\u043e\u0440", "documentation_ru",
				"\u041d\u0435\u0447\u0442\u043e, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u043c\u043e\u0435 \u0434\u043b\u044f \u043e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0446\u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 \u0438 \u043f\u043e\u0432\u044b\u0448\u0435\u043d\u0438\u044f \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u0430 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u0435\u0439." });
		addAnnotation(getEnabler_Boost(), source, new String[] { "label_ru",
				"\u0423\u0432\u0435\u043b\u0438\u0447\u0435\u043d\u0438\u0435", "documentation_ru",
				"\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0443\u0441\u0438\u043b\u0438\u0439, \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u043e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0442\u043e\u0440  \u0443\u043c\u0435\u043d\u044c\u0448\u0430\u0435\u0442 \u0440\u0430\u0437\u043c\u0435\u0440 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u043c\u043e\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u0438." });
		addAnnotation(getEnabler_Description(), source, new String[] { "label_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435", "documentation_ru",
				"\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0442\u043e\u0440\u0430. \u0421\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441 = \u041c\u0430\u0440\u043a\u0434\u0430\u0443\u043d" });
		addAnnotation(getEnabler_Enabler(), source, new String[] { "label_ru",
				"\u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0438\u0440\u0443\u0435\u043c\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f" });
		addAnnotation(productStageEEnum, source, new String[] { "label_ru",
				"\u042d\u0442\u0430\u043f \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438",
				"documentation_ru",
				"\u0421\u0442\u0430\u0434\u0438\u044f \u0436\u0438\u0437\u043d\u0435\u043d\u043d\u043e\u0433\u043e \u0446\u0438\u043a\u043b\u0430 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430" });
		addAnnotation(productStageEEnum.getELiterals().get(0), source, new String[] { "label_ru",
				"\u041f\u043b\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435", "documentation_ru",
				"\u041d\u0430\u0447\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u0442\u0430\u0434\u0438\u044f \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u043e\u0442 \u0438\u0434\u0435\u0438 \u0434\u043e \u043d\u0430\u0447\u0430\u043b\u0430 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438. \u042d\u0442\u043e\u0442 \u044d\u0442\u0430\u043f \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0432 \u0441\u0435\u0431\u044f \u043e\u0431\u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u0435 \u043a\u043e\u043d\u0446\u0435\u043f\u0446\u0438\u0438 \u0438 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u0430." });
		addAnnotation(productStageEEnum.getELiterals().get(1), source, new String[] { "label_ru",
				"\u0420\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0430", "documentation_ru",
				"\u042d\u0442\u0430\u043f, \u043d\u0430 \u043a\u043e\u0442\u043e\u0440\u043e\u043c \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u0432\u044b\u0434\u0435\u043b\u0438\u043b\u0430 \u0440\u0435\u0441\u0443\u0440\u0441\u044b \u0434\u043b\u044f \u0432\u044b\u043f\u0443\u0441\u043a\u0430 \u043f\u0435\u0440\u0432\u043e\u0439 \u0432\u0435\u0440\u0441\u0438\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430, \u043d\u043e \u043f\u0440\u043e\u0434\u0443\u043a\u0442 \u0435\u0449\u0435 \u043d\u0435 \u0432\u044b\u043f\u0443\u0449\u0435\u043d." });
		addAnnotation(productStageEEnum.getELiterals().get(2), source, new String[] { "label_ru",
				"\u041f\u0443\u0431\u043b\u0438\u043a\u0430\u0446\u0438\u044f", "documentation_ru",
				"\u041f\u043e \u043a\u0440\u0430\u0439\u043d\u0435\u0439 \u043c\u0435\u0440\u0435 \u043e\u0434\u0438\u043d \u0432\u044b\u043f\u0443\u0441\u043a \u0431\u044b\u043b \u0441\u0434\u0435\u043b\u0430\u043d \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u043c \u0434\u043b\u044f \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0430\u0443\u0434\u0438\u0442\u043e\u0440\u0438\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430." });
		addAnnotation(productStageEEnum.getELiterals().get(3), source, new String[] { "label_ru",
				"\u0417\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f",
				"documentation_ru",
				"\u041f\u0440\u043e\u0434\u0443\u043a\u0442 \u0434\u043e\u0441\u0442\u0438\u0433 \u043a\u043e\u043d\u0446\u0430 \u0441\u0432\u043e\u0435\u0433\u043e \u0441\u0440\u043e\u043a\u0430 \u043f\u043e\u043b\u0435\u0437\u043d\u043e\u0433\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f. \n\u0418\u043d\u0432\u0435\u0441\u0442\u0438\u0446\u0438\u0439 \u0432 \u043d\u043e\u0432\u044b\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u0431\u043e\u043b\u044c\u0448\u0435 \u043d\u0435\u0442. \u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u043f\u043e-\u043f\u0440\u0435\u0436\u043d\u0435\u043c\u0443 \u043c\u043e\u0436\u0435\u0442 \u0442\u0440\u0430\u0442\u0438\u0442\u044c \u043d\u0435\u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u0440\u0435\u0441\u0443\u0440\u0441\u044b \u043d\u0430 \u043e\u0431\u0441\u043b\u0443\u0436\u0438\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430." });
		addAnnotation(featureStateEEnum, source, new String[] { "label_ru",
				"\u0421\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430",
				"documentation_ru",
				"\u0421\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430, \u043e\u0442\u0440\u0430\u0436\u0430\u044e\u0449\u0435\u0435 \u0441\u0442\u0435\u043f\u0435\u043d\u044c \u0435\u0433\u043e \u0433\u043e\u0442\u043e\u0432\u043d\u043e\u0441\u0442\u0438." });
		addAnnotation(featureStateEEnum.getELiterals().get(0), source, new String[] { "label_ru",
				"\u041d\u043e\u0432\u044b\u0439", "documentation_ru",
				"\u041d\u0430\u0447\u0430\u043b\u044c\u043d\u043e\u0435 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430 \u043e\u0442 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044f \u0434\u043e \u043d\u0430\u0447\u0430\u043b\u0430 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u043a\u0438" });
		addAnnotation(featureStateEEnum.getELiterals().get(1), source, new String[] { "label_ru",
				"\u0412 \u0440\u0430\u0431\u043e\u0442\u0435", "documentation_ru",
				"\u0424\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u0431\u043b\u043e\u043a \u0432 \u0441\u0442\u0430\u0434\u0438\u0438 \u0430\u043a\u0442\u0438\u0432\u043d\u043e\u0439 \u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u043a\u0438" });
		addAnnotation(featureStateEEnum.getELiterals().get(2), source, new String[] { "label_ru",
				"\u0413\u043e\u0442\u043e\u0432\u043e", "documentation_ru",
				"\u0412\u0441\u0435 \u0440\u0430\u0431\u043e\u0442\u044b \u043f\u043e \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044e \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0431\u043b\u043e\u043a\u0430 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u044b" });
		addAnnotation(componentEClass, source, new String[] { "label_ru",
				"\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442", "documentation_ru",
				"\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430. \u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b \u043c\u043e\u0433\u0443\u0442 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c\u0441\u044f \u043d\u0435\u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e \u0440\u0430\u0437\u043d\u044b\u043c\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u0430\u043c\u0438, \u043d\u043e \u0432\u044b\u043f\u0443\u0441\u043a\u0430\u044e\u0442\u0441\u044f \u0432\u043c\u0435\u0441\u0442\u0435 \u043a\u0430\u043a \u0447\u0430\u0441\u0442\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u043e\u0439 \u0440\u0435\u0434\u0430\u043a\u0446\u0438\u0438 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u0430." });
		addAnnotation(getComponent_Dependencies(), source, new String[] { "label_ru",
				"\u0417\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u044c", "documentation_ru",
				"\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442 \u043c\u043e\u0436\u0435\u0442 \u0437\u0430\u0432\u0438\u0441\u0435\u0442\u044c \u043e\u0442 \u0434\u0440\u0443\u0433\u0438\u0445 \u043a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u043e\u0432 \u0442\u043e\u0433\u043e \u0436\u0435 \u0441\u0430\u043c\u043e\u0433\u043e \u0438\u043b\u0438 \u0438\u043d\u044b\u0445 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u043e\u0432." });
	}

} //SagePackageImpl
