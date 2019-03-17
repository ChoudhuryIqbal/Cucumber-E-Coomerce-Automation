package com.cucumber.ecommerceSite.configreader;

import com.cumcumber.ecommerceSite.cucumber.configuration.BrowserType;

public interface ConfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}
