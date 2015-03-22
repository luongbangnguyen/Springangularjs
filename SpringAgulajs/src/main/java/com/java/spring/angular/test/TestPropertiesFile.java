package com.java.spring.angular.test;

import java.util.Iterator;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
public class TestPropertiesFile {
	public static void main(String[] args) throws ConfigurationException {
		Configuration configuration = new PropertiesConfiguration("liqibase.properties");
		Iterator<String> keys = configuration.getKeys();
		while(keys.hasNext()){
			System.out.println(keys.next());
		}
	}
}
