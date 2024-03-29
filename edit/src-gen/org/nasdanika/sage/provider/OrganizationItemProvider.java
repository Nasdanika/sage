/**
 */
package org.nasdanika.sage.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.rigel.RigelFactory;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.Organization;
import org.nasdanika.sage.SageFactory;
import org.nasdanika.sage.SagePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.sage.Organization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationItemProvider extends HierarchicalModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RigelPackage.Literals.IPACKAGE__ELEMENTS);
			childrenFeatures.add(SagePackage.Literals.ORGANIZATION__PERSONAS);
			childrenFeatures.add(SagePackage.Literals.ORGANIZATION__PRODUCTS);
			childrenFeatures.add(SagePackage.Literals.ORGANIZATION__STRATEGIES);
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
	 * This returns Organization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Organization.png"));
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
		String label = ((Organization) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Organization_type") : label;
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

		switch (notification.getFeatureID(Organization.class)) {
		case SagePackage.ORGANIZATION__ELEMENTS:
		case SagePackage.ORGANIZATION__PERSONAS:
		case SagePackage.ORGANIZATION__PRODUCTS:
		case SagePackage.ORGANIZATION__STRATEGIES:
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

		newChildDescriptors.add(
				createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS, RigelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(
				createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS, RigelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(
				createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS, RigelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add(
				createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS, RigelFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createActivityReference()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createEngineer()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.ORGANIZATION__PERSONAS,
				SageFactory.eINSTANCE.createPersona()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.ORGANIZATION__PRODUCTS,
				SageFactory.eINSTANCE.createPortfolio()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.ORGANIZATION__PRODUCTS,
				SageFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add(createChildParameter(SagePackage.Literals.ORGANIZATION__STRATEGIES,
				SageFactory.eINSTANCE.createStrategy()));
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
				|| childFeature == SagePackage.Literals.HIERARCHICAL_MODEL_ELEMENT__CHILDREN
				|| childFeature == SagePackage.Literals.ORGANIZATION__PERSONAS
				|| childFeature == SagePackage.Literals.ORGANIZATION__STRATEGIES
				|| childFeature == SagePackage.Literals.ORGANIZATION__PRODUCTS
				|| childFeature == RigelPackage.Literals.IPACKAGE__ELEMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
