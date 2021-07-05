/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.fashion.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.fashion.core.constants.FashionCoreConstants;
import de.hybris.fashion.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class FashionCoreManager extends GeneratedFashionCoreManager
{
	public static final FashionCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (FashionCoreManager) em.getExtension(FashionCoreConstants.EXTENSIONNAME);
	}
}
