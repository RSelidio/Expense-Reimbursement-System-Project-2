package com.revture.project2.reimbursement.pojo;


import javax.validation.constraints.NotNull;
import com.revture.project2.reimbursement.service.UsersTypes;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Use Lombok
@Data // or we can use QGetter and @Setter
@NoArgsConstructor
@ToString 

public class UsersPojo {
	
	private  int id; 
	@NotNull
	private  String name; 
	@NotNull
	private  String password; 
	@NotNull
	private String email;
	private  UsersTypes usertypeId; 
	@NotNull
	private String addres; 
	@NotNull
	private String contact;
	
	
	public UsersPojo(int id, String name, String password, String email, UsersTypes usertypeId, String addres,
			String contact) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.usertypeId = usertypeId;
		this.addres = addres;
		this.contact = contact;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public UsersTypes getUsertypeId() {
		return usertypeId;
	}


	public void setUsertypeId(UsersTypes usertypeId) {
		this.usertypeId = usertypeId;
	}


	public String getAddres() {
		return addres;
	}


	public void setAddres(String addres) {
		this.addres = addres;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}



