package mainPackage;


//Create a Pet Class with the following instance variables: 
//name (PRIVATE) 
//age (PRIVATE) 
//location (PRIVATE) 
//type (PRIVATE) 
//two constructors(empty, all attributes)
//Code to be able to access the following (Get Methods): 
//name, age, type 
//Code to be able to change (Set Methods): 
//name, age, location
public class Pet {
	
    //fields or attributes
	private String name;
	private int    age;
	private String location;
	private String type;
	//empty constructor
	public Pet() {
		
	}
	//all attributes constructor
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	//getters. name, age, type
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	//just to extend it i will add a location getter
	public String getLocation() {
		return location;
	}
	//Setters. name, age, location
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
