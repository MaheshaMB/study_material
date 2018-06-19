package com.yodlee.iae.iat.rest.impl;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Task implements Serializable {

	@ApiModelProperty(notes = "The database generated Task ID")
	private int id;
	
	
    @ApiModelProperty(notes = "The task description.")
	private String description;

	public Task() {
		super();
	}

	public Task(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + "]";
	}

}
