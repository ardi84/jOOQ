/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookToBookStore implements java.io.Serializable {

	private static final long serialVersionUID = -1603361738;

	private final java.lang.String  bookStoreName;
	private final java.lang.Integer bookId;
	private final java.lang.Integer stock;

	public TBookToBookStore(
		java.lang.String  bookStoreName,
		java.lang.Integer bookId,
		java.lang.Integer stock
	) {
		this.bookStoreName = bookStoreName;
		this.bookId = bookId;
		this.stock = stock;
	}

	public java.lang.String getBookStoreName() {
		return this.bookStoreName;
	}

	public java.lang.Integer getBookId() {
		return this.bookId;
	}

	public java.lang.Integer getStock() {
		return this.stock;
	}
}
