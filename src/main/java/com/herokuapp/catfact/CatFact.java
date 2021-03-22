package com.herokuapp.catfact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact{

	@JsonProperty("createdAt")
	private String createdAt;

	@JsonProperty("deleted")
	private boolean deleted;

	@JsonProperty("__v")
	private int V;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("text")
	private String text;

	@JsonProperty("source")
	private String source;

	@JsonProperty("used")
	private boolean used;

	@JsonProperty("type")
	private String type;

	@JsonProperty("user")
	private com.herokuapp.catfact.User user;

	@JsonProperty("status")
	private com.herokuapp.catfact.Status status;

	@JsonProperty("updatedAt")
	private String updatedAt;

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setDeleted(boolean deleted){
		this.deleted = deleted;
	}

	public boolean isDeleted(){
		return deleted;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setUsed(boolean used){
		this.used = used;
	}

	public boolean isUsed(){
		return used;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"CatFact{" + 
			"createdAt = '" + createdAt + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",__v = '" + V + '\'' + 
			",_id = '" + id + '\'' + 
			",text = '" + text + '\'' + 
			",source = '" + source + '\'' + 
			",used = '" + used + '\'' + 
			",type = '" + type + '\'' + 
			",user = '" + user + '\'' + 
			",status = '" + status + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}