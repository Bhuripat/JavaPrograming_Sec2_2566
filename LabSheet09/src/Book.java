import java.time.Year;
public class Book {
	private String title;
	private float price;
	private int publishyear;

	public void setTitle(String title) {
		this.title = title;
   }
	public String getTitle() {
		return title;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setPulishyear(int year) {
		this.publishyear =year;
	}
	public int getPublishyear() {
		return publishyear;
	}
	public int getTotalyear() {
		return Year.now().getValue()-getPublishyear();
	}
	public String toString() {
		return "Title:["+title+"] published for ["+getTotalyear()+"] year ( "+price+ "baht).";
	}
}
