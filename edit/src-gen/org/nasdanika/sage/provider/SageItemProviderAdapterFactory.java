/**
 */
package org.nasdanika.sage.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.nasdanika.sage.util.SageAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SageItemProviderAdapterFactory extends SageAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SageItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Organization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationItemProvider organizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrganizationAdapter() {
		if (organizationItemProvider == null) {
			organizationItemProvider = new OrganizationItemProvider(this);
		}

		return organizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Persona} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaItemProvider personaItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonaAdapter() {
		if (personaItemProvider == null) {
			personaItemProvider = new PersonaItemProvider(this);
		}

		return personaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Need} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedItemProvider needItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNeedAdapter() {
		if (needItemProvider == null) {
			needItemProvider = new NeedItemProvider(this);
		}

		return needItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Strategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyItemProvider strategyItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Strategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrategyAdapter() {
		if (strategyItemProvider == null) {
			strategyItemProvider = new StrategyItemProvider(this);
		}

		return strategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Portfolio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortfolioItemProvider portfolioItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Portfolio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortfolioAdapter() {
		if (portfolioItemProvider == null) {
			portfolioItemProvider = new PortfolioItemProvider(this);
		}

		return portfolioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Edition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionItemProvider editionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditionAdapter() {
		if (editionItemProvider == null) {
			editionItemProvider = new EditionItemProvider(this);
		}

		return editionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Release} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseItemProvider releaseItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReleaseAdapter() {
		if (releaseItemProvider == null) {
			releaseItemProvider = new ReleaseItemProvider(this);
		}

		return releaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Fulfillment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentItemProvider fulfillmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Fulfillment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFulfillmentAdapter() {
		if (fulfillmentItemProvider == null) {
			fulfillmentItemProvider = new FulfillmentItemProvider(this);
		}

		return fulfillmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Enabler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnablerItemProvider enablerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Enabler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnablerAdapter() {
		if (enablerItemProvider == null) {
			enablerItemProvider = new EnablerItemProvider(this);
		}

		return enablerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.sage.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.sage.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (organizationItemProvider != null)
			organizationItemProvider.dispose();
		if (personaItemProvider != null)
			personaItemProvider.dispose();
		if (needItemProvider != null)
			needItemProvider.dispose();
		if (strategyItemProvider != null)
			strategyItemProvider.dispose();
		if (portfolioItemProvider != null)
			portfolioItemProvider.dispose();
		if (productItemProvider != null)
			productItemProvider.dispose();
		if (featureItemProvider != null)
			featureItemProvider.dispose();
		if (editionItemProvider != null)
			editionItemProvider.dispose();
		if (releaseItemProvider != null)
			releaseItemProvider.dispose();
		if (fulfillmentItemProvider != null)
			fulfillmentItemProvider.dispose();
		if (dependencyItemProvider != null)
			dependencyItemProvider.dispose();
		if (enablerItemProvider != null)
			enablerItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
	}

}
