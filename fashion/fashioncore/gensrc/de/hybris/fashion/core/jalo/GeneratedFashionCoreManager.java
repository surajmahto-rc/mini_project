/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 5, 2021, 9:44:20 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.fashion.core.jalo;

import de.hybris.fashion.core.constants.FashionCoreConstants;
import de.hybris.fashion.core.jalo.ApparelProduct;
import de.hybris.fashion.core.jalo.ApparelSizeVariantProduct;
import de.hybris.fashion.core.jalo.ApparelStyleVariantProduct;
import de.hybris.fashion.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>FashionCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedFashionCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("occupation", AttributeMode.INITIAL);
		tmp.put("income", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("giftCoupon", AttributeMode.INITIAL);
		tmp.put("gCDetails", AttributeMode.INITIAL);
		tmp.put("shipping", AttributeMode.INITIAL);
		tmp.put("shippingDetails", AttributeMode.INITIAL);
		tmp.put("editorsChoice", AttributeMode.INITIAL);
		tmp.put("eCDetails", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FashionCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FashionCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FashionCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FashionCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.eCDetails</code> attribute.
	 * @return the eCDetails - Editor's Choice Details
	 */
	public String getECDetails(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, FashionCoreConstants.Attributes.Product.ECDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.eCDetails</code> attribute.
	 * @return the eCDetails - Editor's Choice Details
	 */
	public String getECDetails(final Product item)
	{
		return getECDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.eCDetails</code> attribute. 
	 * @param value the eCDetails - Editor's Choice Details
	 */
	public void setECDetails(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Product.ECDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.eCDetails</code> attribute. 
	 * @param value the eCDetails - Editor's Choice Details
	 */
	public void setECDetails(final Product item, final String value)
	{
		setECDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.editorsChoice</code> attribute.
	 * @return the editorsChoice - Editor's Choice
	 */
	public Boolean isEditorsChoice(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, FashionCoreConstants.Attributes.Product.EDITORSCHOICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.editorsChoice</code> attribute.
	 * @return the editorsChoice - Editor's Choice
	 */
	public Boolean isEditorsChoice(final Product item)
	{
		return isEditorsChoice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.editorsChoice</code> attribute. 
	 * @return the editorsChoice - Editor's Choice
	 */
	public boolean isEditorsChoiceAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isEditorsChoice( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.editorsChoice</code> attribute. 
	 * @return the editorsChoice - Editor's Choice
	 */
	public boolean isEditorsChoiceAsPrimitive(final Product item)
	{
		return isEditorsChoiceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.editorsChoice</code> attribute. 
	 * @param value the editorsChoice - Editor's Choice
	 */
	public void setEditorsChoice(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Product.EDITORSCHOICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.editorsChoice</code> attribute. 
	 * @param value the editorsChoice - Editor's Choice
	 */
	public void setEditorsChoice(final Product item, final Boolean value)
	{
		setEditorsChoice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.editorsChoice</code> attribute. 
	 * @param value the editorsChoice - Editor's Choice
	 */
	public void setEditorsChoice(final SessionContext ctx, final Product item, final boolean value)
	{
		setEditorsChoice( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.editorsChoice</code> attribute. 
	 * @param value the editorsChoice - Editor's Choice
	 */
	public void setEditorsChoice(final Product item, final boolean value)
	{
		setEditorsChoice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.gCDetails</code> attribute.
	 * @return the gCDetails - Gift Coupon details
	 */
	public String getGCDetails(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, FashionCoreConstants.Attributes.Product.GCDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.gCDetails</code> attribute.
	 * @return the gCDetails - Gift Coupon details
	 */
	public String getGCDetails(final Product item)
	{
		return getGCDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.gCDetails</code> attribute. 
	 * @param value the gCDetails - Gift Coupon details
	 */
	public void setGCDetails(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Product.GCDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.gCDetails</code> attribute. 
	 * @param value the gCDetails - Gift Coupon details
	 */
	public void setGCDetails(final Product item, final String value)
	{
		setGCDetails( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return FashionCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftCoupon</code> attribute.
	 * @return the giftCoupon - Gift Coupon
	 */
	public Boolean isGiftCoupon(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, FashionCoreConstants.Attributes.Product.GIFTCOUPON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftCoupon</code> attribute.
	 * @return the giftCoupon - Gift Coupon
	 */
	public Boolean isGiftCoupon(final Product item)
	{
		return isGiftCoupon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftCoupon</code> attribute. 
	 * @return the giftCoupon - Gift Coupon
	 */
	public boolean isGiftCouponAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isGiftCoupon( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftCoupon</code> attribute. 
	 * @return the giftCoupon - Gift Coupon
	 */
	public boolean isGiftCouponAsPrimitive(final Product item)
	{
		return isGiftCouponAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftCoupon</code> attribute. 
	 * @param value the giftCoupon - Gift Coupon
	 */
	public void setGiftCoupon(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Product.GIFTCOUPON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftCoupon</code> attribute. 
	 * @param value the giftCoupon - Gift Coupon
	 */
	public void setGiftCoupon(final Product item, final Boolean value)
	{
		setGiftCoupon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftCoupon</code> attribute. 
	 * @param value the giftCoupon - Gift Coupon
	 */
	public void setGiftCoupon(final SessionContext ctx, final Product item, final boolean value)
	{
		setGiftCoupon( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftCoupon</code> attribute. 
	 * @param value the giftCoupon - Gift Coupon
	 */
	public void setGiftCoupon(final Product item, final boolean value)
	{
		setGiftCoupon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.income</code> attribute.
	 * @return the income - Customer's Income
	 */
	public String getIncome(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, FashionCoreConstants.Attributes.Customer.INCOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.income</code> attribute.
	 * @return the income - Customer's Income
	 */
	public String getIncome(final Customer item)
	{
		return getIncome( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.income</code> attribute. 
	 * @param value the income - Customer's Income
	 */
	public void setIncome(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Customer.INCOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.income</code> attribute. 
	 * @param value the income - Customer's Income
	 */
	public void setIncome(final Customer item, final String value)
	{
		setIncome( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.occupation</code> attribute.
	 * @return the occupation - Customer's Occupation
	 */
	public String getOccupation(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, FashionCoreConstants.Attributes.Customer.OCCUPATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.occupation</code> attribute.
	 * @return the occupation - Customer's Occupation
	 */
	public String getOccupation(final Customer item)
	{
		return getOccupation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.occupation</code> attribute. 
	 * @param value the occupation - Customer's Occupation
	 */
	public void setOccupation(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Customer.OCCUPATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.occupation</code> attribute. 
	 * @param value the occupation - Customer's Occupation
	 */
	public void setOccupation(final Customer item, final String value)
	{
		setOccupation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shipping</code> attribute.
	 * @return the shipping - Shipping
	 */
	public Boolean isShipping(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, FashionCoreConstants.Attributes.Product.SHIPPING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shipping</code> attribute.
	 * @return the shipping - Shipping
	 */
	public Boolean isShipping(final Product item)
	{
		return isShipping( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shipping</code> attribute. 
	 * @return the shipping - Shipping
	 */
	public boolean isShippingAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isShipping( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shipping</code> attribute. 
	 * @return the shipping - Shipping
	 */
	public boolean isShippingAsPrimitive(final Product item)
	{
		return isShippingAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shipping</code> attribute. 
	 * @param value the shipping - Shipping
	 */
	public void setShipping(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Product.SHIPPING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shipping</code> attribute. 
	 * @param value the shipping - Shipping
	 */
	public void setShipping(final Product item, final Boolean value)
	{
		setShipping( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shipping</code> attribute. 
	 * @param value the shipping - Shipping
	 */
	public void setShipping(final SessionContext ctx, final Product item, final boolean value)
	{
		setShipping( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shipping</code> attribute. 
	 * @param value the shipping - Shipping
	 */
	public void setShipping(final Product item, final boolean value)
	{
		setShipping( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shippingDetails</code> attribute.
	 * @return the shippingDetails - Shipping Details
	 */
	public String getShippingDetails(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, FashionCoreConstants.Attributes.Product.SHIPPINGDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shippingDetails</code> attribute.
	 * @return the shippingDetails - Shipping Details
	 */
	public String getShippingDetails(final Product item)
	{
		return getShippingDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shippingDetails</code> attribute. 
	 * @param value the shippingDetails - Shipping Details
	 */
	public void setShippingDetails(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, FashionCoreConstants.Attributes.Product.SHIPPINGDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shippingDetails</code> attribute. 
	 * @param value the shippingDetails - Shipping Details
	 */
	public void setShippingDetails(final Product item, final String value)
	{
		setShippingDetails( getSession().getSessionContext(), item, value );
	}
	
}
