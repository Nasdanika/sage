/**
 */
package org.nasdanika.sage.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.rigel.RigelFactory;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.Portfolio;
import org.nasdanika.sage.SageFactory;
import org.nasdanika.sage.SagePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.sage.Portfolio} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortfolioItemProvider extends AbstractProductItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortfolioItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLinkedChildrenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linked Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HierarchicalModelElement_linkedChildren_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HierarchicalModelElement_linkedChildren_feature",
						"_UI_HierarchicalModelElement_type"),
				SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__LINKED_CHILDREN, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Portfolio.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Portfolio"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Portfolio) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Portfolio_type") : label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Portfolio.class)) {
		case SagePackage.PORTFOLIO__CHILDREN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createPersona()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createNeed()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createPortfolio()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createEdition()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createRelease()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createEnabler()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				SageFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createActivityReference()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createEngineer()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN,
				RigelFactory.eINSTANCE.createIssue()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == RigelPackage.Literals.ENGINEERED_ELEMENT__ISSUES
				|| childFeature == SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
