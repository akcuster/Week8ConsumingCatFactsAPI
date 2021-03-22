package com.herokuapp.catfact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User{

	@JsonProperty("name")
	private Name name;

	@JsonProperty("photo")
	private String photo;

	@JsonProperty("_id")
	private String id;

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"name = '" + name + '\'' + 
			",photo = '" + photo + '\'' + 
			",_id = '" + id + '\'' + 
			"}";
		}
}