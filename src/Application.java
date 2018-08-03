
public class Application {

	public static void main(String[] args) {
		// ici je initialise une instance de HotelCinqEtoiles avec le nom inter
		HotelCinqEtoiles inter = new HotelCinqEtoiles();
		
		//ici je initialise une valeur de variable piscine5 via Setter
		inter.setPiscine5("une piscine sur le toit.");
		System.out.println("Hotel cinq etoiles a " + inter.descriptionPiscineLuxe());
		//ici je initialise une valeur de variable taxi5 via Setter
		inter.setTaxi5(" taxi Mersedes class A ");
		System.out.println("Il y a" + inter.reserverTaxiLuxe() + "a votre disposition.");
		System.out.println();
		
		//ici je initialise une instance de HotelSeptEtoiles avec le nom inter1
		HotelSeptEtoiles inter1 = new HotelSeptEtoiles();
		//ici je initialise une valeur de variable piscine7 via Setter
		inter1.setPiscine7("une piscine sur le toit avec la vue sur toute la ville et ");
		System.out.println("Hotel sept etoiles a " + inter1.descriptionPiscineLuxe());
		// ici je initialise une valeur de variable taxi7 via Setter
		inter1.setTaxi7(" taxi de luxe Bugatti et Bentley ");
		System.out.println("Il y a" + inter1.reserverTaxiLuxe() + "a votre disposition.");

	}

}
