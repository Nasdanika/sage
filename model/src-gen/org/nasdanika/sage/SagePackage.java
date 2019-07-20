/**
 */
package org.nasdanika.sage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * <!-- begin-model-doc -->
 * Nasdanika Sage helps organizations to manage and develop their product portfolios by establishing traceability from their target audiences (personas) needs to product features and their dependencies. 
 * It also allow to assign weights to personas and their needs and compute weight (impact) of features. Features can be sized in some units of development effort - money, story points, days. 
 * Using story sizes (including dependencies) and story weight/benefit a cost benefit analysis can be conducted to identify most valuable features, where value is benefit/size. It also allows to identify most valuable products in the portfolio.
 * <!-- end-model-doc -->
 * @see org.nasdanika.sage.SageFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika label_ru='\u041c\u0443\u0434\u0440\u0435\u0446' documentation_ru='Nasdanika Sage \u043f\u043e\u043c\u043e\u0433\u0430\u0435\u0442 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c \u0443\u043f\u0440\u0430\u0432\u043b\u044f\u0442\u044c \u0438 \u0440\u0430\u0437\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0442\u044c...\n\nhelps organizations to manage and develop their product portfolios by establishing traceability from their target audiences (personas) needs to product features and their dependencies. \nIt also allow to assign weights to personas and their needs and compute weight (impact) of features. Features can be sized in some units of development effort - money, story points, days. \nUsing story sizes (including dependencies) and story weight/benefit a cost benefit analysis can be conducted to identify most valuable features, where value is benefit/size. It also allows to identify most valuable products in the portfolio.'"
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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT__URL = MODEL_ELEMENT__URL;

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
	 * The feature id for the '<em><b>Effective Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparable Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT__URL = MODEL_ELEMENT__URL;

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
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hierarchical Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__URL = HIERARCHICAL_MODEL_ELEMENT__URL;

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
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__LINKED_CHILDREN = HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effective Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hierarchical Comparable Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 2;

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
	int ORGANIZATION__NAME = HIERARCHICAL_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URL = HIERARCHICAL_MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = HIERARCHICAL_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CONFIGURATION = HIERARCHICAL_MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CHILDREN = HIERARCHICAL_MODEL_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LINKED_CHILDREN = HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PERSONAS = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PRODUCTS = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = HIERARCHICAL_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.PersonaImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NAME = COMPARABLE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__URL = COMPARABLE_MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DESCRIPTION = COMPARABLE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CONFIGURATION = COMPARABLE_MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__WEIGHT = COMPARABLE_MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Effective Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__EFFECTIVE_WEIGHT = COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NEEDS = COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offerings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__OFFERINGS = COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = COMPARABLE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.NeedImpl <em>Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.NeedImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__NAME = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__URL = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DESCRIPTION = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__CONFIGURATION = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__CHILDREN = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__LINKED_CHILDREN = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__LINKED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__WEIGHT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Effective Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__EFFECTIVE_WEIGHT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__CATEGORY = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fulfillments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__FULFILLMENTS = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_OPERATION_COUNT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.StrategyImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__URL = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONFIGURATION = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CHILDREN = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__LINKED_CHILDREN = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__LINKED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__WEIGHT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Effective Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__EFFECTIVE_WEIGHT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = HIERARCHICAL_COMPARABLE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.AbstractProductImpl <em>Abstract Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.AbstractProductImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getAbstractProduct()
	 * @generated
	 */
	int ABSTRACT_PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Abstract Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.PortfolioImpl <em>Portfolio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.PortfolioImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getPortfolio()
	 * @generated
	 */
	int PORTFOLIO = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO__NAME = ABSTRACT_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO__URL = ABSTRACT_PRODUCT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO__DESCRIPTION = ABSTRACT_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO__CONFIGURATION = ABSTRACT_PRODUCT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO__CHILDREN = ABSTRACT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO__LINKED_CHILDREN = ABSTRACT_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Portfolio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO_FEATURE_COUNT = ABSTRACT_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Portfolio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTFOLIO_OPERATION_COUNT = ABSTRACT_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.ProductImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ABSTRACT_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__URL = ABSTRACT_PRODUCT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = ABSTRACT_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONFIGURATION = ABSTRACT_PRODUCT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Target Audiences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TARGET_AUDIENCES = ABSTRACT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = ABSTRACT_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RELEASES = ABSTRACT_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STAGE = ABSTRACT_PRODUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ABSTRACT_PRODUCT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ABSTRACT_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.FeatureImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = HIERARCHICAL_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__URL = HIERARCHICAL_MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = HIERARCHICAL_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONFIGURATION = HIERARCHICAL_MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDREN = HIERARCHICAL_MODEL_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Linked Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LINKED_CHILDREN = HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEPENDENCIES = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enablers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ENABLERS = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SIZE = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STATE = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Design</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESIGN = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = HIERARCHICAL_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = HIERARCHICAL_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.OfferingImpl <em>Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.OfferingImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getOffering()
	 * @generated
	 */
	int OFFERING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Target Audiences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__TARGET_AUDIENCES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.EditionImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__NAME = OFFERING__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__URL = OFFERING__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__DESCRIPTION = OFFERING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__CONFIGURATION = OFFERING__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Target Audiences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__TARGET_AUDIENCES = OFFERING__TARGET_AUDIENCES;

	/**
	 * The feature id for the '<em><b>Bases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__BASES = OFFERING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__FEATURES = OFFERING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = OFFERING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = OFFERING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.ReleaseImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__FEATURE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RELEASED = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RELEASE_DATE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__OVERHEAD = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.FulfillmentImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getFulfillment()
	 * @generated
	 */
	int FULFILLMENT = 15;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.DependencyImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 16;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OPTIONAL = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__IMPACT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.impl.EnablerImpl <em>Enabler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.impl.EnablerImpl
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getEnabler()
	 * @generated
	 */
	int ENABLER = 17;

	/**
	 * The feature id for the '<em><b>Boost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__BOOST = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Enabler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER__ENABLER = 2;

	/**
	 * The number of structural features of the '<em>Enabler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enabler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.NeedCategory <em>Need Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.NeedCategory
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getNeedCategory()
	 * @generated
	 */
	int NEED_CATEGORY = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.ProductStage <em>Product Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.ProductStage
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getProductStage()
	 * @generated
	 */
	int PRODUCT_STAGE = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.sage.FeatureState <em>Feature State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sage.FeatureState
	 * @see org.nasdanika.sage.impl.SagePackageImpl#getFeatureState()
	 * @generated
	 */
	int FEATURE_STATE = 20;

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.ModelElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.sage.ModelElement#getUrl()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Url();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.ComparableModelElement#getEffectiveWeight <em>Effective Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Weight</em>'.
	 * @see org.nasdanika.sage.ComparableModelElement#getEffectiveWeight()
	 * @see #getComparableModelElement()
	 * @generated
	 */
	EAttribute getComparableModelElement_EffectiveWeight();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.sage.HierarchicalModelElement#getLinkedChildren <em>Linked Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Children</em>'.
	 * @see org.nasdanika.sage.HierarchicalModelElement#getLinkedChildren()
	 * @see #getHierarchicalModelElement()
	 * @generated
	 */
	EReference getHierarchicalModelElement_LinkedChildren();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Organization#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see org.nasdanika.sage.Organization#getPersonas()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Personas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Organization#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.sage.Organization#getProducts()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Products();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see org.nasdanika.sage.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Persona#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needs</em>'.
	 * @see org.nasdanika.sage.Persona#getNeeds()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Needs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sage.Persona#getOfferings <em>Offerings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offerings</em>'.
	 * @see org.nasdanika.sage.Persona#getOfferings()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Offerings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Need</em>'.
	 * @see org.nasdanika.sage.Need
	 * @generated
	 */
	EClass getNeed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Need#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.nasdanika.sage.Need#getCategory()
	 * @see #getNeed()
	 * @generated
	 */
	EAttribute getNeed_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Need#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillments</em>'.
	 * @see org.nasdanika.sage.Need#getFulfillments()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_Fulfillments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see org.nasdanika.sage.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.AbstractProduct <em>Abstract Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Product</em>'.
	 * @see org.nasdanika.sage.AbstractProduct
	 * @generated
	 */
	EClass getAbstractProduct();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Portfolio <em>Portfolio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portfolio</em>'.
	 * @see org.nasdanika.sage.Portfolio
	 * @generated
	 */
	EClass getPortfolio();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.nasdanika.sage.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.nasdanika.sage.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Product#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.sage.Product#getReleases()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Releases();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Product#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.nasdanika.sage.Product#getStage()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Stage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.nasdanika.sage.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Feature#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.nasdanika.sage.Feature#getDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sage.Feature#getEnablers <em>Enablers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enablers</em>'.
	 * @see org.nasdanika.sage.Feature#getEnablers()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Enablers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Feature#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sage.Feature#getSize()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Feature#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.sage.Feature#getState()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Feature#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design</em>'.
	 * @see org.nasdanika.sage.Feature#getDesign()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Design();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Offering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offering</em>'.
	 * @see org.nasdanika.sage.Offering
	 * @generated
	 */
	EClass getOffering();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sage.Offering#getTargetAudiences <em>Target Audiences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Audiences</em>'.
	 * @see org.nasdanika.sage.Offering#getTargetAudiences()
	 * @see #getOffering()
	 * @generated
	 */
	EReference getOffering_TargetAudiences();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see org.nasdanika.sage.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sage.Edition#getBases <em>Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bases</em>'.
	 * @see org.nasdanika.sage.Edition#getBases()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Bases();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sage.Edition#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.nasdanika.sage.Edition#getFeatures()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Features();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.sage.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sage.Release#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.nasdanika.sage.Release#getFeature()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Release#isReleased <em>Released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Released</em>'.
	 * @see org.nasdanika.sage.Release#isReleased()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_Released();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Release#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.nasdanika.sage.Release#getReleaseDate()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Release#getOverhead <em>Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overhead</em>'.
	 * @see org.nasdanika.sage.Release#getOverhead()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_Overhead();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Fulfillment <em>Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment</em>'.
	 * @see org.nasdanika.sage.Fulfillment
	 * @generated
	 */
	EClass getFulfillment();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sage.Fulfillment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.nasdanika.sage.Fulfillment#getFeature()
	 * @see #getFulfillment()
	 * @generated
	 */
	EReference getFulfillment_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Fulfillment#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.sage.Fulfillment#getWeight()
	 * @see #getFulfillment()
	 * @generated
	 */
	EAttribute getFulfillment_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Fulfillment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.sage.Fulfillment#getDescription()
	 * @see #getFulfillment()
	 * @generated
	 */
	EAttribute getFulfillment_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.nasdanika.sage.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Dependency#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.sage.Dependency#isOptional()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Optional();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sage.Dependency#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency</em>'.
	 * @see org.nasdanika.sage.Dependency#getDependency()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Dependency#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see org.nasdanika.sage.Dependency#getImpact()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Impact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Dependency#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.sage.Dependency#getDescription()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sage.Enabler <em>Enabler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabler</em>'.
	 * @see org.nasdanika.sage.Enabler
	 * @generated
	 */
	EClass getEnabler();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Enabler#getBoost <em>Boost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boost</em>'.
	 * @see org.nasdanika.sage.Enabler#getBoost()
	 * @see #getEnabler()
	 * @generated
	 */
	EAttribute getEnabler_Boost();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sage.Enabler#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.sage.Enabler#getDescription()
	 * @see #getEnabler()
	 * @generated
	 */
	EAttribute getEnabler_Description();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sage.Enabler#getEnabler <em>Enabler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enabler</em>'.
	 * @see org.nasdanika.sage.Enabler#getEnabler()
	 * @see #getEnabler()
	 * @generated
	 */
	EReference getEnabler_Enabler();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sage.NeedCategory <em>Need Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Need Category</em>'.
	 * @see org.nasdanika.sage.NeedCategory
	 * @generated
	 */
	EEnum getNeedCategory();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sage.ProductStage <em>Product Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Stage</em>'.
	 * @see org.nasdanika.sage.ProductStage
	 * @generated
	 */
	EEnum getProductStage();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sage.FeatureState <em>Feature State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature State</em>'.
	 * @see org.nasdanika.sage.FeatureState
	 * @generated
	 */
	EEnum getFeatureState();

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
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__URL = eINSTANCE.getModelElement_Url();

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
		 * The meta object literal for the '<em><b>Effective Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARABLE_MODEL_ELEMENT__EFFECTIVE_WEIGHT = eINSTANCE.getComparableModelElement_EffectiveWeight();

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
		 * The meta object literal for the '<em><b>Linked Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN = eINSTANCE.getHierarchicalModelElement_LinkedChildren();

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

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PERSONAS = eINSTANCE.getOrganization_Personas();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PRODUCTS = eINSTANCE.getOrganization_Products();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.PersonaImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__NEEDS = eINSTANCE.getPersona_Needs();

		/**
		 * The meta object literal for the '<em><b>Offerings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__OFFERINGS = eINSTANCE.getPersona_Offerings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.NeedImpl <em>Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.NeedImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getNeed()
		 * @generated
		 */
		EClass NEED = eINSTANCE.getNeed();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEED__CATEGORY = eINSTANCE.getNeed_Category();

		/**
		 * The meta object literal for the '<em><b>Fulfillments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__FULFILLMENTS = eINSTANCE.getNeed_Fulfillments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.StrategyImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.AbstractProductImpl <em>Abstract Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.AbstractProductImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getAbstractProduct()
		 * @generated
		 */
		EClass ABSTRACT_PRODUCT = eINSTANCE.getAbstractProduct();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.PortfolioImpl <em>Portfolio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.PortfolioImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getPortfolio()
		 * @generated
		 */
		EClass PORTFOLIO = eINSTANCE.getPortfolio();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.ProductImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__RELEASES = eINSTANCE.getProduct_Releases();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__STAGE = eINSTANCE.getProduct_Stage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.FeatureImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DEPENDENCIES = eINSTANCE.getFeature_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Enablers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ENABLERS = eINSTANCE.getFeature_Enablers();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SIZE = eINSTANCE.getFeature_Size();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__STATE = eINSTANCE.getFeature_State();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESIGN = eINSTANCE.getFeature_Design();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.OfferingImpl <em>Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.OfferingImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getOffering()
		 * @generated
		 */
		EClass OFFERING = eINSTANCE.getOffering();

		/**
		 * The meta object literal for the '<em><b>Target Audiences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFERING__TARGET_AUDIENCES = eINSTANCE.getOffering_TargetAudiences();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.EditionImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '<em><b>Bases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__BASES = eINSTANCE.getEdition_Bases();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__FEATURES = eINSTANCE.getEdition_Features();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.ReleaseImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__FEATURE = eINSTANCE.getRelease_Feature();

		/**
		 * The meta object literal for the '<em><b>Released</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__RELEASED = eINSTANCE.getRelease_Released();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__RELEASE_DATE = eINSTANCE.getRelease_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__OVERHEAD = eINSTANCE.getRelease_Overhead();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.FulfillmentImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getFulfillment()
		 * @generated
		 */
		EClass FULFILLMENT = eINSTANCE.getFulfillment();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__FEATURE = eINSTANCE.getFulfillment_Feature();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT__WEIGHT = eINSTANCE.getFulfillment_Weight();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT__DESCRIPTION = eINSTANCE.getFulfillment_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.DependencyImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__OPTIONAL = eINSTANCE.getDependency_Optional();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDENCY = eINSTANCE.getDependency_Dependency();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__IMPACT = eINSTANCE.getDependency_Impact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__DESCRIPTION = eINSTANCE.getDependency_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.impl.EnablerImpl <em>Enabler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.impl.EnablerImpl
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getEnabler()
		 * @generated
		 */
		EClass ENABLER = eINSTANCE.getEnabler();

		/**
		 * The meta object literal for the '<em><b>Boost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLER__BOOST = eINSTANCE.getEnabler_Boost();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLER__DESCRIPTION = eINSTANCE.getEnabler_Description();

		/**
		 * The meta object literal for the '<em><b>Enabler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLER__ENABLER = eINSTANCE.getEnabler_Enabler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.NeedCategory <em>Need Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.NeedCategory
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getNeedCategory()
		 * @generated
		 */
		EEnum NEED_CATEGORY = eINSTANCE.getNeedCategory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.ProductStage <em>Product Stage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.ProductStage
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getProductStage()
		 * @generated
		 */
		EEnum PRODUCT_STAGE = eINSTANCE.getProductStage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sage.FeatureState <em>Feature State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sage.FeatureState
		 * @see org.nasdanika.sage.impl.SagePackageImpl#getFeatureState()
		 * @generated
		 */
		EEnum FEATURE_STATE = eINSTANCE.getFeatureState();

	}

} //SagePackage
