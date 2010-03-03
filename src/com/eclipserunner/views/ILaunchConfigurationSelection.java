package com.eclipserunner.views;

import org.eclipse.debug.core.ILaunchConfiguration;

/**
 * @author vachacz
 */
public interface ILaunchConfigurationSelection {

	public boolean isLaunchConfigurationSelected();
	public Object getSelectedObject();
	public ILaunchConfiguration getSelectedLaunchConfiguration();

}
