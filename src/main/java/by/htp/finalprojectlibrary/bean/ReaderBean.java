package by.htp.finalprojectlibrary.bean;

import java.io.Serializable;

public class ReaderBean implements Serializable {
	private int id;// it is nuber his reader bilet
	private String password;
	private String name;
	private String surname;
	private int countbooks;// добавить поле и все что  сним связано
	

	public ReaderBean() {

	}

	public ReaderBean(int id, String password, String name, String surname, int countbooks) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.countbooks = countbooks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getCountbooks() {
		return countbooks;
	}

	public void setCountbooks(int countbooks) {
		this.countbooks = countbooks;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countbooks;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReaderBean other = (ReaderBean) obj;
		if (countbooks != other.countbooks)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "ReaderBean [id=" + id + ", password=" + password + ", name="
				+ name + ", surname=" + surname + ", countbooks=" + countbooks
				+ "]";
	}

	
}
