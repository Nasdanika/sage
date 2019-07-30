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
import org.nasdanika.sage.Edition;
import org.nasdanika.sage.Feature;
import org.nasdanika.sage.Product;
import org.nasdanika.sage.SagePackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.sage.Edition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EditionItemProvider extends OfferingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionItemProvider(AdapterFactory adapterFactory) {
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

			addBasesPropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getLabel(SagePackage.Literals.EDITION__BASES, getString("_UI_Edition_bases_feature")),
				 getTooltip(SagePackage.Literals.EDITION__BASES),
				 SagePackage.Literals.EDITION__BASES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null,
				 createMultiReferenceDialogCellEditorFactory()) {
					
					@Override
					protected Collection<?> getComboBoxObjects(Object object) {
						// TODO - avoid circular references?
						List<Object> bases = new ArrayList<Object>(((Product) ((EObject) object).eContainer()).getEditions());
						bases.remove(object);
						return bases;
					}
					
				});
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		ItemPropertyDescriptor itemPropertyDescriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getLabel(SagePackage.Literals.EDITION__FEATURES, getString("_UI_Edition_features_feature")),
				getTooltip(SagePackage.Literals.EDITION__FEATURES),
				SagePackage.Literals.EDITION__FEATURES, 
				true, 
				false, 
				true, 
				null, 
				null, 
				null, 
				createMultiReferenceDialogCellEditorFactory()) {

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
		};

		itemPropertyDescriptors.add(itemPropertyDescriptor);
	}

	/**
	 * This returns Edition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Edition.png"));
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
		String label = ((Edition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Edition_type") : label;
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
