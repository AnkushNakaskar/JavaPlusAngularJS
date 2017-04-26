package com.angular.example.bean.v1;

import java.io.Serializable;

public class PersonResponse<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	private T entity;

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
