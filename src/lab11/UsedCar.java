package lab11;

public class UsedCar extends Car {
	
	private double mileage;
	
	public UsedCar() {}
		
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
	    this.mileage = mileage;
		
		setMake(make);
		setModel(model);
		setYear(year);
		setPrice(price);
		this.mileage = mileage;
		
	}
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	@Override
	public String toString() {
		return "UsedCar make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", mileage="
				+ mileage + "";
	}


	


	
	
	
	
	
	
	
}

	
// one getter/ or one setter - not both 
	

//

