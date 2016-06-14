package experiments;

public class CD implements Comparable<CD >{

	private String artist;
	private String title;
	private int price;
		
	public boolean equals(Object o){
		if((o instanceof CD) && (((CD)o).getTitle() == this.title)){
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(CD disc){
		return this.title.compareTo(disc.getTitle());
	}
	public int hashcode(){
		return title.length();
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
