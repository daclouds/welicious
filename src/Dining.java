
public class Dining {

	public Dining(String time, String place, String menu) {
		this.time = time;
		this.place = place;
		this.menu = menu;
	}

	private String time;
	private String place;
	private String menu;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}

}
