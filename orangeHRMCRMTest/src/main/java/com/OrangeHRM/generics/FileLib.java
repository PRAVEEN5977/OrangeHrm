package com.OrangeHRM.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib 
{
	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p = new Properties();
		p.load(file);
		String value =p.getProperty(key);
		return value;
	}

}
