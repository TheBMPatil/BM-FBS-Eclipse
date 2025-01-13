package bm;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("WE ARE IN MAIN");
//		Address add = new Address("Shivrai", "Sambhajinagar");
		Account ref = new Account(123, "Bhagvat", 1200.5, new Address("Shivrai", "Sambhajinagar"));
		ref.dispay();
//		System.out.println(ref.getPostal().getLane1());
//		System.out.println(ref.getPostal().getLane2());
	}

}
