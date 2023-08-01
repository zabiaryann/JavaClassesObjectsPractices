package mainPackage;

//2.  Create a Custom Class (anything you want - car, phone, holiday, etc.). 
// 0: Minimum 3 private instance variables 
// 1: An empty constructor 
// 2: A constructor that uses only 2 of your 3 variables
// 3: A constructor that uses all 3 of your instance variables 
// 4: Get methods for all 3 of your instance variables and Set methods for all 3 of
//  your instance variables 
// 5: A method that returns a Boolean 
// 6: A method that returns a String 

public class Phone {
  // 0:
	private String brand; 
	private String model;
	private int storageCapacity;
	
  // 1:
	public Phone() {
		
	}
  // 2:	
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
  // 3: 
	public Phone(String brand, String model, int storageCapacity) {
		this.brand           = brand;
		this.model           = model;
		this.storageCapacity = storageCapacity;
	}
  // 4:
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	// 5:
	public boolean isWaterProof() {
		return true;
	}
	// 6:
	public String returnAstring(String phoneNumber) {
		return phoneNumber+ " is calling";
	}
}









