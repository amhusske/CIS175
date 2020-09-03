package model;

public class SessionLogic {

	public double calculateSessionPrice(PhotographySession session) {
		int hourlyRate = 20;
		double sessionPrice = 0;
		sessionPrice = session.getSessionHours() * hourlyRate;
		return sessionPrice;
	}
	
	public String sendThankYou(PhotographySession session) {
		String thankYouMessage = "Thank you for booking your session";
		if(session.getSessionHours() > 0) { 
			return thankYouMessage;
		}
		else {
			return "Please enter a session with a half an hour or more!";
		}
	}
	
	public boolean publishPhotosAuthorization(PhotographySession session) {
		String choice = session.publishPhotos();
		if(choice == "Yes" || choice == "Ya" || choice == "ok") {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
