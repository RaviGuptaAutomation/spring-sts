package com.tech.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myoracledbconfig")
public class MyOracleDbConfig {

	private String driverClass;
	private String connectionURL;
	private String userName;
	private String dbPassword;
	
	
	/*
	 * public MyOracleDbConfig(String driverClass, String connectionURL, String
	 * userName, String dbPassword) { this.driverClass = driverClass;
	 * this.connectionURL = connectionURL; this.userName = userName; this.dbPassword
	 * = dbPassword; }
	 */
	
	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	

}
