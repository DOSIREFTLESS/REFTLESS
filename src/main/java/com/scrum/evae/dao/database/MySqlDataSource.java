package com.scrum.evae.dao.database;

public class MySqlDataSource extends DataSource {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String BRIDGE = "jdbc:mysql:";
	
	public MySqlDataSource() {
	}

	public MySqlDataSource(String name, String host, String userName, String password) {
		super(BRIDGE + "//" + host + "/" + name, DRIVER, userName, password);
	}

	public MySqlDataSource(String name, String userName, String password) {
		super(BRIDGE + "//localhost/" + name, DRIVER, userName, password);
	}

	public MySqlDataSource(String name, String userName) {
		super(BRIDGE + "//localhost/" + name, DRIVER, userName, "");
	}

	public MySqlDataSource(String name) {
		super(BRIDGE + "//localhost/" + name, DRIVER, "root", "");
	}

}
