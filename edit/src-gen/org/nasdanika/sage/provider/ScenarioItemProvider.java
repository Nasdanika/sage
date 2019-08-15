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
import org.nasdanika.sage.SagePackage;
import org.nasdanika.sage.Scenario;

/**
 * This is the item provider adapter for a {@link org.nasdanika.sage.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider extends ComparableModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addOfferingsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Offerings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOfferingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(getResourceLocator(), getString("_UI_Scenario_offerings_feature"),
						SagePackage.Literals.SCENARIO__OFFERINGS, true, false, true, null, null, null, null));
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
	 * This returns Fulfillment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario.png"));
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
		Scenario scenario = (Scenario) object;
		String label = scenario.getName();
		return (isBlank(label) ? getLabel(SagePackage.Literals.SCENARIO, getString("_UI_Scenario_type")) : label) + " ("
				+ scenario.getWeight() + ")";
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

		switch (notification.getFeatureID(Scenario.class)) {
		case SagePackage.SCENARIO__ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createActivityReference()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add(createChildParameter(RigelPackage.Literals.IPACKAGE__ELEMENTS,
				RigelFactory.eINSTANCE.createEngineer()));
	}

}
