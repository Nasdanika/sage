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
import org.nasdanika.sage.Fulfillment;
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
	private EClass fulfillmentEClass = null;

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
	public EReference getNeed_Fulfillments() {
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
	public EClass getFulfillment() {
		return fulfillmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFulfillment_Feature() {
		return (EReference) fulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFulfillment_Weight() {
		return (EAttribute) fulfillmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFulfillment_Description() {
		return (EAttribute) fulfillmentEClass.getEStructuralFeatures().get(2);
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
		createEReference(needEClass, NEED__FULFILLMENTS);

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

		offeringEClass = createEClass(OFFERING);
		createEReference(offeringEClass, OFFERING__TARGET_AUDIENCES);
		createEReference(offeringEClass, OFFERING__INCLUDES);

		editionEClass = createEClass(EDITION);
		createEReference(editionEClass, EDITION__BASES);
		createEReference(editionEClass, EDITION__FEATURES);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__FEATURES);
		createEAttribute(releaseEClass, RELEASE__RELEASED);
		createEAttribute(releaseEClass, RELEASE__RELEASE_DATE);
		createEAttribute(releaseEClass, RELEASE__OVERHEAD);

		fulfillmentEClass = createEClass(FULFILLMENT);
		createEReference(fulfillmentEClass, FULFILLMENT__FEATURE);
		createEAttribute(fulfillmentEClass, FULFILLMENT__WEIGHT);
		createEAttribute(fulfillmentEClass, FULFILLMENT__DESCRIPTION);

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
		offeringEClass.getESuperTypes().add(this.getModelElement());
		editionEClass.getESuperTypes().add(this.getOffering());
		releaseEClass.getESuperTypes().add(this.getModelElement());
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
		initEReference(getNeed_Fulfillments(), this.getFulfillment(), null, "fulfillments", null, 0, -1, Need.class,
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

		initEClass(offeringEClass, Offering.class, "Offering", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffering_TargetAudiences(), this.getPersona(), this.getPersona_Offerings(), "targetAudiences",
				null, 0, -1, Offering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffering_Includes(), this.getOffering(), null, "includes", null, 0, -1, Offering.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(fulfillmentEClass, Fulfillment.class, "Fulfillment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFulfillment_Feature(), this.getFeature(), null, "feature", null, 0, 1, Fulfillment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillment_Weight(), ecorePackage.getEDouble(), "weight", "1.0", 0, 1, Fulfillment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfillment_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation(this, source, new String[] { "label_ru", "\u041c\u0443\u0434\u0440\u0435\u0446",
				"documentation_ru",
				"Nasdanika Sage \u043f\u043e\u043c\u043e\u0433\u0430\u0435\u0442 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c \u0443\u043f\u0440\u0430\u0432\u043b\u044f\u0442\u044c \u0438 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c...\n\nhelps organizations to manage and develop their product portfolios by establishing traceability from their target audiences (personas) needs to product features and their dependencies. \nIt also allow to assign weights to personas and their needs and compute weight (impact) of features. Features can be sized in some units of development effort - money, story points, days. \nUsing story sizes (including dependencies) and story weight/benefit a cost benefit analysis can be conducted to identify most valuable features, where value is benefit/size. It also allows to identify most valuable products in the portfolio." });
		addAnnotation(hierarchicalModelElementEClass, source, new String[] { "label_ru",
				"\u0418\u0435\u0440\u0430\u0440\u0445\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438",
				"documentation_ru",
				"\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438 \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043c\u043e\u0436\u0435\u0442 \u044f\u0432\u043b\u044f\u0442\u044c\u0441\u044f \u0447\u0430\u0441\u0442\u044c\u044e \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u0438, \u0442\u043e \u0435\u0441\u0442\u044c \u0438\u043c\u0435\u0442\u044c \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0435 \u0438 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b" });
		addAnnotation(needEClass, source, new String[] { "label_ru",
				"\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c", "documentation_ru",
				"\u041f\u043e\u0442\u0440\u0435\u0431\u043d\u043e\u0441\u0442\u044c \u043f\u0435\u0440\u0441\u043e\u043d\u044b... " });
	}

} //SagePackageImpl
