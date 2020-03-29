package com.Facebook.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataReader {
	
	public FileInputStream fis;
	
    private Properties pro;
	
	public ConfigDataReader()
	{
	File src = new File(".\\Configurations\\config.property");
	
	try {
		fis = new FileInputStream(src);
		
		setPro(new Properties());
		
		getPro().load(fis);
		
	} catch (Exception e) {
		
		System.out.println("Unable to load config file");
	}
	
	}
	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}
	
	

}
