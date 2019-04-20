
public class fox implements animals2 {
	int weight;
	
	public fox(int weight) {
		this.weight = weight;
	}
	
	public void makeSound() {
		System.out.println("What does the fox say?");
	}

	public void eat() {
		weight++;
		System.out.println("The fox gains weight. Current weight: "+weight);
	}
	
	public static void main(String[] args) {
		fox fox1 = new fox(4); 
		fox1.eat();
		fox1.makeSound();
		
	}
}
