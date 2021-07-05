/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.fashion.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.fashion.fulfilmentprocess.constants.FashionFulfilmentProcessConstants;

public class FashionFulfilmentProcessManager extends GeneratedFashionFulfilmentProcessManager
{
	public static final FashionFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (FashionFulfilmentProcessManager) em.getExtension(FashionFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
