//Create doggie class which will use animal interface. 
public class doggies implements animals {
	String name; 
	int energy; 
	int numberOfLegs;
	int weight;
	
	 //TODO Set minimum weight and number of legs to zero. 
	public doggies(String name, int energy, int weight) {
		this.name = name; 
		this.energy = energy;
		this.weight = weight;
		this.numberOfLegs = 4;
	}

	// Eating allows dogs to gain weight and energy. 
   public void eat() {
	  energy += 5; 
	  weight += 1; 
      System.out.println(name + " eats. Current weight: "+weight+" Current energy: "+energy);
   }

   // Travel costs energy and causes animal to lose weight. 
   public void travel(int distance) {
	  int effort = distance / numberOfLegs;
	  energy -= effort;
	  weight -= effort/5; 
      System.out.println(name + " travels "+distance+". Current weight: "+weight+" Current energy: "+energy);
   } 
   
   //Tragic accident. Limb is lost. 
   public void accident() {
      numberOfLegs--;
      weight -= 2; 
      System.out.println(name+" has an accident. Current weight: "+weight);
   }
   
   //Resting after a hard day. 
	public void sleep() {
		energy = 100;
		System.out.println(name+" sleeps. Current energy: "+energy);
	}

	//Example to get your started
   public static void main(String args[]) {
      doggies dog1 = new doggies("Sparky", 55, 14);
      doggies dog2 = new doggies("Sparky Jr", 15, 2);
      dog1.eat();
      dog2.travel(5);
   }
} 