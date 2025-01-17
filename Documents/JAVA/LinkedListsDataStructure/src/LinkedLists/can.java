package LinkedLists;

public class can {
	// These are data fields
	private String company;
	private String content;
	private double Size;
	private double price;

	/**
	 * This is default constructor
	 * 
	 */
	public can() {

	}

	/**
	 * This is data constructor where we can call this constructor by creating
	 * an object of this instance
	 * 
	 * @param company
	 * @param content
	 * @param size
	 * @param price
	 */
	public can(String company, String content, double size, double price) {
		this.company = company;
		this.content = content;
		Size = size;
		this.price = price;
	}

	/**
	 * Two data fields constructor required by object
	 * 
	 * @param company
	 * @param content
	 */
	public can(String company, String content) {
		this.company = company;
		this.content = content;
	}

	/**
	 * @param size
	 * @param price
	 */
	public can(double size, double price) {
		Size = size;
		this.price = price;
	}

	/**
	 * Get method is used to print the set value
	 * 
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * To set the input to its data field
	 * 
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * Get method is used to print the set value
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * To set the input to its data field
	 * 
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Get method is used to print the set value
	 * 
	 * @return the size
	 */
	public double getSize() {
		return Size;
	}

	/**
	 * To set the input to its data field
	 * 
	 * @param size
	 *            the size to set
	 */
	public void setSize(double size) {
		Size = size;
	}

	/**
	 * Get method is used to print the set value
	 * 
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * To set the input to its data field
	 * 
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc) Format output
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "can [company=" + company + ", content=" + content + ", Size="
				+ Size + ", price=" + price + "]";
	}
}
