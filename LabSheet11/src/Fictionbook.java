import java.time.*;
public class Fictionbook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public Fictionbook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
		this.author_name = "";
		this.email = "";
	}
	public void setAuthorName(String name) {
		author_name = name; 
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		return this.author_name.indexOf(" ") > 0;
	}
	public String toString() {
		return this.title+" write by"+getLastname().substring(0,1)+"."+getfirstname()+"("+this.email+")\n"
				+ "published for "+totalPublicyear()+"years";
	}

	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int totalPublicyear() {
		return Year.now().getValue()-this.publicYear;
	}
	@Override
	public String getLastname() {
		return this.author_name.substring(this.author_name.indexOf(" ")).trim().toUpperCase();
	}
	@Override
	public String getfirstname() {
		return this.author_name.substring(0,this.author_name.indexOf(" ")).trim().toUpperCase();
	}
	@Override
	public boolean checkemail() {
		return this.email.startsWith(" ")||this.email.startsWith("@")||(this.email.endsWith("@hotmail.com")||this.email.endsWith("@windowslive.com"));
	}
}
