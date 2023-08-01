package mainPackage;

public class Main {

	public static void main(String[] args) {
		//******************************************
		// Pet Class
		Pet p1 = new Pet();
		p1.setName("zabi aryan");
		p1.setAge(31);
		p1.setLocation("California");
		
		System.out.println("Object p1 name: "+ p1.getName());
		System.out.println("Object p1 age: "+ p1.getAge());
		System.out.println("Object p1 location: "+ p1.getLocation());
		//you can make as many objects you want.
		// p2 , p3, p4......
		//*********************************************
		System.out.println("*******************************");
		// Phone class
		Phone phone1 = new Phone();
		phone1.setBrand("Iphone");
		phone1.setModel("Max Pro water Proof");
		phone1.setStorageCapacity(564);
		
		
		//print the objects
		System.out.println("Phone brand: "+phone1.getBrand());
		System.out.println("Phone model: "+phone1.getModel());
		System.out.println("Phone Storage Capacity: "+phone1.getStorageCapacity());
		String x = phone1.returnAstring("123456");
		System.out.println(x);
		boolean y = phone1.isWaterProof();
		System.out.println("Is the phone water proof? "+y);
	}

}
