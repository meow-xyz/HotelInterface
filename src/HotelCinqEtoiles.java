
public class HotelCinqEtoiles implements HotelLuxe {
	
	String piscine5;
	String taxi5;
	
	public String descriptionPiscineLuxe() {
		return piscine5;
	}
	
	public String reserverTaxiLuxe() {
		return taxi5;
	}

	
	
	public String getPiscine5() {
		return piscine5;
	}

	public void setPiscine5(String piscine5) {
		this.piscine5 = piscine5;
	}

	public String getTaxi5() {
		return taxi5;
	}

	public void setTaxi5(String taxi5) {
		this.taxi5 = taxi5;
	}

}
