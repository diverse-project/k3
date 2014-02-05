/**
 */
package core.provider;


import core.Conditional;
import core.CoreFactory;
import core.CorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link core.Conditional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalItemProvider
	extends IntegerExpressionItemProvider
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
	public ConditionalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION);
			childrenFeatures.add(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION);
			childrenFeatures.add(CorePackage.Literals.CONDITIONAL__CONDITION);
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
	 * This returns Conditional.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Conditional"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Conditional_type");
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

		switch (notification.getFeatureID(Conditional.class)) {
			case CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION:
			case CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION:
			case CorePackage.CONDITIONAL__CONDITION:
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
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createLower()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createUMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION,
				 CoreFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createLower()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createUMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION,
				 CoreFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createLower()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createUMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONDITIONAL__CONDITION,
				 CoreFactory.eINSTANCE.createEqual()));
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

		boolean qualify =
			childFeature == CorePackage.Literals.CONDITIONAL__IF_TRUE_EXPRESSION ||
			childFeature == CorePackage.Literals.CONDITIONAL__IF_FALSE_EXPRESSION ||
			childFeature == CorePackage.Literals.CONDITIONAL__CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
