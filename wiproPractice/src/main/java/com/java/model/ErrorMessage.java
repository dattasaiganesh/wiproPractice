package com.java.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
 
	private String errorMessage;
	private String eErrorCode;
	private String description;

	public ErrorMessage() {
		super();
	}
	public ErrorMessage(String errorMessage, String eErrorCode, String description) {
		super();
		this.errorMessage = errorMessage;
		this.eErrorCode = eErrorCode;
		this.description = description;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String geteErrorCode() {
		return eErrorCode;
	}
	public void seteErrorCode(String eErrorCode) {
		this.eErrorCode = eErrorCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
