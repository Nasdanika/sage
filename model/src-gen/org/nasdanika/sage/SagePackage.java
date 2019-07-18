/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.sage.SageFactory
 * @model kind="package"
 * @generated
 */
public interface SagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.sage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SagePackage eINSTANCE = org.nasdanika.sage.impl.SagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.ModelElementImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.ComparableModelElementImpl <em>Comparable Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.ComparableModelElementImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getComparableModelElement()
	 * @generated
	 */
	int COMPARABLE_MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT__WEIGHT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparable Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparable Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.HierarchicalModelElementImpl <em>Hierarchical Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.HierarchicalModelElementImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getHierarchicalModelElement()
	 * @generated
	 */
	int HIERARCHICAL_MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT__CHILDREN = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hierarchical Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hierarchical Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.HierarchicalComparableModelElementImpl <em>Hierarchical Comparable Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.HierarchicalComparableModelElementImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getHierarchicalComparableModelElement()
	 * @generated
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__NAME = HIERARCHICAL_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__DESCRIPTION = HIERARCHICAL_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__CONFIGURATION = HIERARCHICAL_MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__CHILDREN = HIERARCHICAL_MODEL_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hierarchical Comparable Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hierarchical Comparable Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_OPERATION_COUNT = HIERARCHICAL_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.OrganizationImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.sage.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sage.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.sage.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.ModelElement#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.nasdanika.sage.ModelElement#getConfiguration()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Configuration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.ComparableModelElement <em>Comparable Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable Model Element</em>'.
	 * @see org.nasdanika.sage.ComparableModelElement
	 * @generated
	 */
	EClass getComparableModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.ComparableModelElement#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.sage.ComparableModelElement#getWeight()
	 * @see #getComparableModelElement()
	 * @generated
	 */
	EAttribute getComparableModelElement_Weight();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.HierarchicalModelElement <em>Hierarchical Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical Model Element</em>'.
	 * @see org.nasdanika.sage.HierarchicalModelElement
	 * @generated
	 */
	EClass getHierarchicalModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.HierarchicalModelElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.sage.HierarchicalModelElement#getChildren()
	 * @see #getHierarchicalModelElement()
	 * @generated
	 */
	EReference getHierarchicalModelElement_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.HierarchicalComparableModelElement <em>Hierarchical Comparable Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical Comparable Model Element</em>'.
	 * @see org.nasdanika.sage.HierarchicalComparableModelElement
	 * @generated
	 */
	EClass getHierarchicalComparableModelElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.sage.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SageFactory getSageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.ModelElementImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__CONFIGURATION = eINSTANCE.getModelElement_Configuration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.ComparableModelElementImpl <em>Comparable Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.ComparableModelElementImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getComparableModelElement()
		 * @generated
		 */
		EClass COMPARABLE_MODEL_ELEMENT = eINSTANCE.getComparableModelElement();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARABLE_MODEL_ELEMENT__WEIGHT = eINSTANCE.getComparableModelElement_Weight();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.HierarchicalModelElementImpl <em>Hierarchical Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.HierarchicalModelElementImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getHierarchicalModelElement()
		 * @generated
		 */
		EClass HIERARCHICAL_MODEL_ELEMENT = eINSTANCE.getHierarchicalModelElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_MODEL_ELEMENT__CHILDREN = eINSTANCE.getHierarchicalModelElement_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.HierarchicalComparableModelElementImpl <em>Hierarchical Comparable Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.HierarchicalComparableModelElementImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getHierarchicalComparableModelElement()
		 * @generated
		 */
		EClass HIERARCHICAL_COMPARABLE_MODEL_ELEMENT = eINSTANCE.getHierarchicalComparableModelElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.OrganizationImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

	}

} //SagePackage
