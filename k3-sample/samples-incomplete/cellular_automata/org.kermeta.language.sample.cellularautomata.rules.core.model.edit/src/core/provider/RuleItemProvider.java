/**
 */
package core.provider;


import core.CoreFactory;
import core.CorePackage;
import core.Rule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link core.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.RULE__EVALUATED_VAL);
			childrenFeatures.add(CorePackage.Literals.RULE__FILTER);
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
	 * This returns Rule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Rule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Rule_type");
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

		switch (notification.getFeatureID(Rule.class)) {
			case CorePackage.RULE__EVALUATED_VAL:
			case CorePackage.RULE__FILTER:
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

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createLower()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createUMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.RULE__EVALUATED_VAL,
				 CoreFactory.eINSTANCE.createEqual()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Rules_coreEditPlugin.INSTANCE;
	}

}
