package pojoclasses;

public class Ad {
	
	
	private String company;
	private String url;
	private String text;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
		
//whenever we are trying to print any object reference, internally toString() method will be called. 
// System.out.println(adObject), it will internally call toString() method	

	@Override
	public String toString() {
		return "Ad [company=" + company + ", url=" + url + ", text=" + text + "]";
	}
}
