package model;

public class PhotographySession {
	private String clientName;
	private double sessionHours;
	private String type;
	private String publishPhotos;
	
	
	public PhotographySession() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PhotographySession(String clientName, double sessionHours, String type, String publishPhotos) {
		super();
		this.clientName = clientName;
		this.sessionHours = sessionHours;
		this.type = type;
		this.publishPhotos = publishPhotos;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public double getSessionHours() {
		return sessionHours;
	}


	public void setSessionHours(int sessionHours) {
			this.sessionHours = sessionHours;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public String publishPhotos() {
		return publishPhotos;
	}


	public void setPublishPhotos(String publishPhotos) {
		this.type = publishPhotos;
	}
	
	
}
