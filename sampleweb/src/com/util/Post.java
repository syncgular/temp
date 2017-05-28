package com.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
	private String post;
	private String id;
	private int like_count;
	private int dislike_count;
	private int super_like_count;

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
