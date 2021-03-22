package com.herokuapp.catfact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name{

	@JsonProperty("last")
	private String last;

	@JsonProperty("first")
	private String first;

	public void setLast(String last){
		this.last = last;
	}

	public String getLast(){
		return last;
	}

	public void setFirst(String first){
		this.first = first;
	}

	public String getFirst(){
		return first;
	}

	@Override
 	public String toString(){
		return 
			"Name{" + 
			"last = '" + last + '\'' + 
			",first = '" + first + '\'' + 
			"}";
		}
}