/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.fashion.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;


public class RegisterFormCustom extends RegisterForm
{

	private String occupation;

	private String income;

	/**
	 * @return the occupation
	 */
	public String getOccupation()
	{
		return occupation;
	}

	/**
	 * @param occupation
	 *           the occupation to set
	 */
	public void setOccupation(final String occupation)
	{
		this.occupation = occupation;
	}

	/**
	 * @return the income
	 */
	public String getIncome()
	{
		return income;
	}

	/**
	 * @param income
	 *           the income to set
	 */
	public void setIncome(final String income)
	{
		this.income = income;
	}


}
