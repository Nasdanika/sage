/**
 */
package org.nasdanika.sage.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.sage.Offering;
import org.nasdanika.sage.SagePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.sage.Offering} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OfferingItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferingItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredByPropertyDescriptor(object);
			addTargetAudiencesPropertyDescriptor(object);
			addIncludesPropertyDescriptor(object);
			addScenariosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capability_requiredBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capability_requiredBy_feature",
								"_UI_Capability_type"),
						RigelPackage.Literals.CAPABILITY__REQUIRED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Audiences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAudiencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Offering_targetAudiences_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Offering_targetAudiences_feature",
								"_UI_Offering_type"),
						SagePackage.Literals.OFFERING__TARGET_AUDIENCES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Includes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Offering_includes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Offering_includes_feature",
								"_UI_Offering_type"),
						SagePackage.Literals.OFFERING__INCLUDES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Scenarios feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Offering_scenarios_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Offering_scenarios_feature",
								"_UI_Offering_type"),
						SagePackage.Literals.OFFERING__SCENARIOS, true, false, true, null, null, null));
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Offering) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Offering_type")
				: getString("_UI_Offering_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
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
	}

}
