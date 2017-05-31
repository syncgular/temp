package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	protected JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void selectAll() {
		String sql = "SELECT POST FROM POST";
		
		List<String> queryForList = jdbcTemplate.queryForList(sql, String.class);
		System.out.println(queryForList);
		
		String sql1 = "SELECT * FROM POST WHERE ID=?";
		Object[] argArr = new Object[]{1};
		Map<String, Object> queryForMap = jdbcTemplate.queryForMap(sql1, argArr);
		System.out.println(queryForMap);
		
		
		String sql2 = "SELECT * FROM POST";
		List<Post> postList = (List<Post>) jdbcTemplate.query(sql2, new RowMapper<Post>(){
			
			public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
				Post post = new Post();
				post.setPost(rs.getString("POST"));
				return post;
			}
			
		});
		
		System.out.println(postList);
		
	}
	
	
	
	
	public void create() {
	
		String sql = "INSERT INTO POST (POST, LIKE_COUNT) VALUES (?, ?)";
		
		jdbcTemplate.update(sql, new Object[]{"Hie", 100});
	}
	
	
	public void option1(String str) {
		System.out.println("OPTION1");
	}
	
	public void option2(String str, int i) {
		System.out.println("OPTION2");
	}
}
