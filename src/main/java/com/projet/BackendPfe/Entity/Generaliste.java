package com.projet.BackendPfe.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@DiscriminatorValue(value="generaliste")
public class Generaliste extends User {

	private String gender ;
	private long telephone;
	@OneToMany(mappedBy = "generaliste"/* , cascade = CascadeType.ALL*/)
	@JsonProperty(access =Access.WRITE_ONLY)
	private List<Patient>liste_patients=new ArrayList<Patient>();
	  
	 public Generaliste(String username, String email, String password, String gender, long telephone , byte[] image , LocalDate date_inscription  , String role  ) {
			super(username,email,password,image , date_inscription , role );
			this.gender=gender;
			this.telephone=telephone;
		
		} 
	 public Generaliste(byte[]image) {
			this.image=image ;
		}
	 public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setImage(){
		 super.setImage(super.getImage());
	}
	public byte[] getImage(){
		return super.getImage();
	}
	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getUsername(){
		return super.getUsername();
	}
	

	public void setUsername(){
		 super.setUsername(super.getUsername());
		 
	}
	public String getEmail(){
		return super.getEmail();
	}
	

	public void setEmail(){
		 super.setEmail(super.getEmail());
	}
	
	
	public String getPassword(){
		return super.getPassword();
	}
	

	public void setPassword(){
		 super.setPassword(super.getPassword());
	}
	public LocalDate getDate_inscription() {
		return date_inscription;
	}

public Generaliste() {
	super();
}

@Override
public String toString() {
	return "Generaliste [gender=" + gender + ", telephone=" + telephone + ", id=" + id + ", username=" + username
			+ ", email=" + email + ", password=" + password + ", image=" + image + "]";
}
public List<Patient> getListe_patients() {
	return liste_patients;
}
public void setListe_patients(List<Patient> liste_patients) {
	this.liste_patients = liste_patients;
}

}
