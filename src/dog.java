
public class dog implements headtails{

	public void head() {
		System.out.println("Woof");
		
	}
	public void tail() {
		System.out.println("Wagwagwagwag");
		
	}
	public static void main(String[] args) {
		dog dog1 = new dog(); 
		dog1.head();
		dog1.tail();
	}

}
