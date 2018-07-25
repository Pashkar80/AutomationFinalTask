package by.htp.finalprojectlibrary.ntety;

import java.io.Serializable;


public class Book implements Serializable {
	private int id;
	private String title;
	private int id_author;
	private int count;

	public Book() {
	}

	public Book(int id, String title, int id_author, int count) {
		super();
		this.id = id;
		this.title = title;
		this.id_author = id_author;
		this.count = count;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public int getId_author() {
		return id_author;
	}

	public void setId_author(int id_author) {
		this.id_author = id_author;
	}

	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + id;
		result = prime * result + id_author;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (count != other.count)
			return false;
		if (id != other.id)
			return false;
		if (id_author != other.id_author)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookBean [id=" + id + ", title=" + title + ", id_author="
				+ id_author + ", count=" + count + "]";
	}


	
	
	

}
	


