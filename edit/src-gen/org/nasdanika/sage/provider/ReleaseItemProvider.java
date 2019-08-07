/**
 */
package org.nasdanika.sage.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.Product;
import org.nasdanika.sage.Release;
import org.nasdanika.sage.SagePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.sage.Release} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReleaseItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseItemProvider(AdapterFactory adapterFactory) {
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

			addFeaturesPropertyDescriptor(object);
			addReleasedPropertyDescriptor(object);
			addReleaseDatePropertyDescriptor(object);
			addOverheadPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getLabel(SagePackage.Literals.RELEASE__FEATURES, getString("_UI_Release_features_feature")),
				getTooltip(SagePackage.Literals.RELEASE__FEATURES), SagePackage.Literals.RELEASE__FEATURES, true, false,
				true, null, null, null, createMultiReferenceDialogCellEditorFactory()) {

			/**
			 * Features in the container project. 
			 */
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				Product product = (Product) ((EObject) object).eContainer();
				List<Feature> ret = new ArrayList<>();
				TreeIterator<EObject> tit = product.eAllContents();
				while (tit.hasNext()) {
					EObject next = tit.next();
					if (next instanceof Feature) {
						ret.add((Feature) next);
					}
				}
				return ret;
			}

		});
	}

	/**
	 * This adds a property descriptor for the Released feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleasedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Release_released_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Release_released_feature",
								"_UI_Release_type"),
						SagePackage.Literals.RELEASE__RELEASED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Release Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleaseDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Release_releaseDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Release_releaseDate_feature",
								"_UI_Release_type"),
						SagePackage.Literals.RELEASE__RELEASE_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Overhead feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverheadPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Release_overhead_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Release_overhead_feature",
								"_UI_Release_type"),
						SagePackage.Literals.RELEASE__OVERHEAD, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Release.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(((Release) object).isReleased() ? "full/obj16/Released.png" : "full/obj16/Release.png"));
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
		String label = ((Release) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Release_type") : label;
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

		switch (notification.getFeatureID(Release.class)) {
		case SagePackage.RELEASE__RELEASED:
		case SagePackage.RELEASE__RELEASE_DATE:
		case SagePackage.RELEASE__OVERHEAD:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
