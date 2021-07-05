/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.fashion.facades.populators;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.commercefacades.product.converters.populator.AbstractProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.product.ProductConfigurableChecker;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.variants.model.VariantProductModel;

import org.springframework.beans.factory.annotation.Required;

/**
 * Populates {@link ProductData} with .
 */

public class ProductCustomAttributesPopulator<SOURCE extends ProductModel, TARGET extends ProductData> extends
        AbstractProductPopulator<SOURCE, TARGET>
{
    private ProductConfigurableChecker productConfigurableChecker;

    @Override
    public void populate(final SOURCE productModel, final TARGET productData) throws ConversionException
    {
        productData.setName((String) getProductAttribute(productModel, ProductModel.NAME));
        productData.setManufacturer((String) getProductAttribute(productModel, ProductModel.MANUFACTURERNAME));
		  //productData.setTestAttribute((String) getProductAttribute(productModel, ProductModel.TESTATTRIBUTE));

        if (productModel.getEditorsChoice() != null)
        {
            productData.setEditorsChoice((Boolean) getProductAttribute(productModel, ProductModel.EDITORSCHOICE));
        }

		  if (productModel.getGiftCoupon() != null)
        {
			  productData.setGiftCoupon((Boolean) getProductAttribute(productModel, ProductModel.GIFTCOUPON));
        }

		  if (productModel.getShipping() != null)
        {
			  productData.setShipping((Boolean) getProductAttribute(productModel, ProductModel.SHIPPING));
        }

        productData.setAverageRating(productModel.getAverageRating());
        if (productModel.getVariantType() != null)
        {
            productData.setVariantType(productModel.getVariantType().getCode());
        }
        if (productModel instanceof VariantProductModel)
        {
            final VariantProductModel variantProduct = (VariantProductModel) productModel;
            productData.setBaseProduct(variantProduct.getBaseProduct() != null ? variantProduct.getBaseProduct().getCode() : null);
        }
        productData.setPurchasable(Boolean.valueOf(productModel.getVariantType() == null && isApproved(productModel)));
        productData.setConfigurable(Boolean.valueOf(getProductConfigurableChecker().isProductConfigurable(productModel)));
        productData.setConfiguratorType(getProductConfigurableChecker().getFirstConfiguratorType(productModel));
    }

    protected boolean isApproved(final SOURCE productModel)
    {
        final ArticleApprovalStatus approvalStatus = productModel.getApprovalStatus();
        return ArticleApprovalStatus.APPROVED.equals(approvalStatus);
    }

    protected ProductConfigurableChecker getProductConfigurableChecker()
    {
        return productConfigurableChecker;
    }

    @Required
    public void setProductConfigurableChecker(final ProductConfigurableChecker productConfigurableChecker)
    {
        this.productConfigurableChecker = productConfigurableChecker;
    }
}
