/**
 * 
 */
package com.com.springmvc.model;

/**
 * @author Vamsi
 *
 */

public class User {
 
  
	private long id;
	private String email;
	private String username;
	private String lastname;
	

	private String phone;
    private String address;
    
    public User(long id, String email, String username, String lastname, String phone, String address) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
	}
   
    
   
     
    /**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	
     
    public User(){
        id=0;
    }
     
   
 
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof User))
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", address=" + address + ", lastName=" + lastname + ", username=" + username
				+ ", phone=" + phone + ", email=" + email + "]";
	}

	
 
    
 
     
}