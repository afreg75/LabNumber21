package co.grandcircus.coffeeshop;

public class User {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private Integer age;
	private String password;
	private boolean mail;
	private String favCoffee;
	
	
	public User() {
		
	}


	public User(Long id, String firstname, String lastname, String email, String phonenumber, Integer age,
			String password, boolean mail, String favCoffee) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.age = age;
		this.password = password;
		this.mail = mail;
		this.favCoffee = favCoffee;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isMail() {
		return mail;
	}


	public void setMail(boolean mail) {
		this.mail = mail;
	}


	public String getFavCoffee() {
		return favCoffee;
	}


	public void setFavCoffee(String favCoffee) {
		this.favCoffee = favCoffee;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", age=" + age + ", password=" + password + ", mail=" + mail
				+ ", favCoffee=" + favCoffee + "]";
	}
	
	

}