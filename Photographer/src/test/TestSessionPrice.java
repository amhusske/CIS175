package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.PhotographySession;
import model.SessionLogic;

public class TestSessionPrice {

	SessionLogic SBL = new SessionLogic();
	PhotographySession mySession = new PhotographySession("Abby", 5, "Family", "Yes");	
	PhotographySession yourSession = new PhotographySession("Matt", 2, "First Birthday", "No");	

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestPublishPhotosAuthorizationPositive() {
		assertTrue(SBL.publishPhotosAuthorization(mySession));
	}
	
	@Test
	public void TestPublishPhotosAuthorizationNegative() {
		assertFalse(SBL.publishPhotosAuthorization(yourSession));
	}

}
