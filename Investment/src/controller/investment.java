package controller;

public class investment {

	private String name;
	private double initialAmount;
	private double interest;
	private int years;
	
	public investment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public investment(String name, double initialAmount, double interest, int years) {
		super();
		this.name = name;
		this.initialAmount = initialAmount;
		this.interest = interest;
		this.years = years;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setIntialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public double calculateInterestEarned() {
		double interestEarned;
		
		interestEarned = (initialAmount * interest * years)/100;
		return interestEarned;
	}
	

}
