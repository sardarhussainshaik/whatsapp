package whatsapp.entity;

public class WhatsAppUser {
	private String name;
	private String password;
	private String mail;
	private String address;
	public int setName(String name) {
		this.name = name;
		return 0;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	public String getMail() {
		return mail;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	

}
