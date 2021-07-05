/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.fashion.facades.customer.impl;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author ZeeshanZulfiqar
 *
 */
public class FashionDefaultCustomerFacade extends DefaultCustomerFacade
{

	@Override
	protected void setCommonPropertiesForRegister(final RegisterData registerData, final CustomerModel customerModel)
	{
		customerModel.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		setTitleForRegister(registerData, customerModel);
		setUidForRegister(registerData, customerModel);
		customerModel.setOccupation(registerData.getOccupation());
		customerModel.setIncome(registerData.getIncome());
		customerModel.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		customerModel.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
	}
}
