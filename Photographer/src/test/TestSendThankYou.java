package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.*;

public class TestSendThankYou {

	SessionLogic SBL = new SessionLogic();
	PhotographySession mySession = new PhotographySession("Abby", 0, "Family", "No");
	PhotographySession anotherSession = new PhotographySession("Melissa", .05, "Couples", "yes");
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSendThankYouPositive() {
		String thankYou = SBL.sendThankYou(mySession);
		assertEquals(thankYou, "Please enter a session with a half an hour or more!");
	}

	@Test
	public void testSendThankYouNegative() {
		String thankYou = SBL.sendThankYou(mySession);
		assertNotEquals(thankYou, "Thank you for booking your session");
	}
}
