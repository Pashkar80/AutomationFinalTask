package by.htp.finalprojectlibrary.bean;

import java.io.Serializable;
import java.sql.Date;

public class ExtraditionBean implements Serializable   {
	private int id;
	private int id_reader;
	private int id_book;
	private Date dateExtradion;
	private int count;

	public ExtraditionBean() {

	}

	public ExtraditionBean(int id, int id_reader, int id_book,
			Date dateExtradion, int count) {
		super();
		this.id = id;
		this.id_reader = id_reader;
		this.id_book = id_book;
		this.dateExtradion = dateExtradion;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_reader() {
		return id_reader;
	}

	public void setId_reader(int id_reader) {
		this.id_reader = id_reader;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public Date getDateExtradion() {
		return dateExtradion;
	}

	public void setDateExtradion(Date dateExtradion) {
		this.dateExtradion = dateExtradion;
	}

	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result
				+ ((dateExtradion == null) ? 0 : dateExtradion.hashCode());
		result = prime * result + id;
		result = prime * result + id_book;
		result = prime * result + id_reader;
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
		ExtraditionBean other = (ExtraditionBean) obj;
		if (count != other.count)
			return false;
		if (dateExtradion == null) {
			if (other.dateExtradion != null)
				return false;
		} else if (!dateExtradion.equals(other.dateExtradion))
			return false;
		if (id != other.id)
			return false;
		if (id_book != other.id_book)
			return false;
		if (id_reader != other.id_reader)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExtraditionBean [id=" + id + ", id_reader=" + id_reader
				+ ", id_book=" + id_book + ", dateExtradion=" + dateExtradion
				+ ", count=" + count + "]";
	}

}
