package tnsif.c2tc.batch09.entity;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	private long id;
	private String name;
	private String ordername;
	private long phone;
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", ordername=" + ordername + ", phone=" + phone + ", email="
				+ email + "]";
	}
	

}
