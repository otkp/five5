package org.epragati.notification;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/**
 * 
 * @author pbattula
 *
 */

public class DestinationInfo implements Serializable {
	
	private String protocol;
	private String port;
	private String host;
	private byte[] attachment;
	private boolean isSendAttachment;
	private Map<String, String> parameters;
	private Map<String, String> headers;
	private String fileName;
	private String transactionId;
	private String messageType;
	private String serviceId;
	private String emailBody;
	
	private static final long serialVersionUID = 1L;
	
	public DestinationInfo(){
		
	}
	
	public DestinationInfo(byte[] attachment,boolean isSendAttachment,String host, String port, Map<String, String> parameters, String ptorocol, Map<String, String> headers,String emailBody) {
		
		super();
		this.protocol = ptorocol;
		this.attachment=attachment;
		this.isSendAttachment=isSendAttachment;
		this.port = port;
		this.host = host;
		this.setEmailBody(emailBody);
		this.setParameters(parameters);
		this.setHeaders(headers);
		
	}
	
	public Map<String, String> getHeaders() {
		return headers;
	}
	
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public byte[] getAttachment() {
		return attachment;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	public boolean isSendAttachment() {
		return isSendAttachment;
	}

	public void setSendAttachment(boolean isSendAttachment) {
		this.isSendAttachment = isSendAttachment;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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
	
	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	@Override
	public String toString() {
		return "DestinationInfo [protocol=" + protocol + ", port=" + port + ", host=" + host + ", attachment="
				+ Arrays.toString(attachment) + ", isSendAttachment=" + isSendAttachment + ", parameters=" + (parameters.containsKey("password")? "****":parameters)
				+ ", headers=" + headers + ", fileName=" + fileName + ", transactionId=" + transactionId
				+ ", messageType=" + messageType + ", serviceId=" + serviceId + ", emailBody=" + emailBody +"]";
	}

}
