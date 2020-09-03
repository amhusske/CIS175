package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.AllTests;



public class testRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				// TODO Auto-generated method stub
				Result result = JUnitCore.runClasses(AllTests.class);
				
				for(Failure failure: result.getFailures()) {
					System.out.println(failure.toString());
				}
				
				System.out.println(result.wasSuccessful());
			}

		}



