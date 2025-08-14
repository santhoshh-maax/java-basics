package oop;

public class trip {
	
	String place;
	String food;
	String location1;
	String location2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trip ooty = new trip();
		ooty.place = "Ooty Quene of Hills";
		ooty.food = "tea";
		ooty.location1 = "Tea estate";
		ooty.location2 = "Rose garden";
		System.out.println("place: "+ooty.place);
		System.out.println("food: "+ooty.food);
		System.out.println("location1: "+ooty.location1);
		System.out.println("location2: "+ooty.location2);
		System.out.println("------------------------------------");
		trip singapore = new trip();
		singapore.place = "Singapore very expensive";
		singapore.food = "Mee Goreng or chicken rice";
		singapore.location1 = "marina bay sands";
		singapore.location2 = "east coast park";
		System.out.println("place: "+singapore.place);
		System.out.println("food: "+singapore.food);
		System.out.println("location1: "+singapore.location1);
		System.out.println("location2: "+singapore.location2);
		System.out.println("------------------------------------");
		
		trip dubai = new trip();
		dubai.place = "Dubai Hahpipeee come to dubaiaiiii....";
		dubai.food = "Mandhi biriyani Shawarma";
		dubai.location1 = "Burji kalaifa";
		dubai.location2 = "Dessert safari";
		System.out.println("place: "+dubai.place);
		System.out.println("food: "+dubai.food);
		System.out.println("location1: "+dubai.location1);
		System.out.println("location2: "+dubai.location2);
		System.out.println("------------------------------------");
		trip malayasia = new trip();
		malayasia.place = "Malaysia not very expensive as Singapore";
		malayasia.food = "Nasi lama";
		malayasia.location1 = "Malaka";
		malayasia.location2 = "KL";
		System.out.println("place: "+malayasia.place);
		System.out.println("food: "+malayasia.food);
		System.out.println("location1: "+malayasia.location1);
		System.out.println("location2: "+malayasia.location2);
		System.out.println("------------------------------------");

	}

}
