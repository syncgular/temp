package com.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
	private String post;
	private String id;
	private int like_count;
	private int dislike_count;
	private int super_like_count;
	
	private List<String> cityList;
	private Set<String> citySet;
	private Map<String, String> cityMap;
	
	private Comment comment;
	
	@Autowired
	private Comment comment1;
	
	public Comment getComment1() {
		return comment1;
	}

	public void setComment1(Comment comment1) {
		this.comment1 = comment1;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public List<String> getCityList() {
		return cityList;
	}

	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public Set<String> getCitySet() {
		return citySet;
	}

	public void setCitySet(Set<String> citySet) {
		this.citySet = citySet;
	}

	public Map<String, String> getCityMap() {
		return cityMap;
	}

	public void setCityMap(Map<String, String> cityMap) {
		this.cityMap = cityMap;
	}

	public Post(){
		super();
	}
	
	public Post(String post){
		this.post = post;
	}

	@JsonProperty("LIKE_COUNT")
	public int getLike_count() {
		return like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	@JsonProperty("DISLIKE_COUNT")
	public int getDislike_count() {
		return dislike_count;
	}

	public void setDislike_count(int dislike_count) {
		this.dislike_count = dislike_count;
	}

	@JsonProperty("SUPER_LIKE_COUNT")
	public int getSuper_like_count() {
		return super_like_count;
	}

	public void setSuper_like_count(int super_like_count) {
		this.super_like_count = super_like_count;
	}

	@JsonProperty("POST")
	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@JsonProperty("ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
