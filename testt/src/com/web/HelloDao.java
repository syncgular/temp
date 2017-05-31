package com.web;


import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class HelloDao {
	@Autowired
	private Hello hello;

	protected DataSource dataSource;
	protected JdbcTemplate jdbcTemplate;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



	public Hello create() {
		return hello;
	}
	
	public List<Map<String, Object>> selectAll() {
		String sql = "SELECT * FROM POST";
		List<Map<String, Object>> helloList = jdbcTemplate.queryForList(sql);
		
		return helloList;
	}
}
