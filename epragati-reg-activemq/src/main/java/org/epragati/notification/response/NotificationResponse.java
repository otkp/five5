package org.epragati.notification.response;

import java.io.Serializable;

/**
 * 
 * @author rramilla
 *
 */

public class NotificationResponse implements Serializable{

	private static final long serialVersionUID = 2988122419158822021L;
	private String message;
	private String to;
	private String protocol;
	private String transactionId;
	private Character status;
	private String messageType;
	private String serviceId;
	
	public NotificationResponse(){
		
	}
	
	public NotificationResponse(String message,
			String to,
			String transactionId,
			String protocol,
			Character status
			){
		
		this.message = message;
		this.to = to;
		this.status = status;
		this.protocol = protocol;
		this.transactionId = transactionId;
		
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public String toString() {
		return "NotificationResponse [message=" + message + ", to=" + to + ", protocol=" + protocol + ", transactionId="
				+ transactionId + ", status=" + status + ", messageType=" + messageType + ", serviceId=" + serviceId
				+ "]";
	}
}
