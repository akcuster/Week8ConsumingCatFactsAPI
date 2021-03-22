package com.herokuapp.catfact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status{

	@JsonProperty("verified")
	private boolean verified;

	@JsonProperty("sentCount")
	private int sentCount;

	public void setVerified(boolean verified){
		this.verified = verified;
	}

	public boolean isVerified(){
		return verified;
	}

	public void setSentCount(int sentCount){
		this.sentCount = sentCount;
	}

	public int getSentCount(){
		return sentCount;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"verified = '" + verified + '\'' + 
			",sentCount = '" + sentCount + '\'' + 
			"}";
		}
}