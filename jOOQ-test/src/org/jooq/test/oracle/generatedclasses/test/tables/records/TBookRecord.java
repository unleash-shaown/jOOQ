/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> {

	private static final long serialVersionUID = -296790288;

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.oracle.generatedclasses.test.enums.TLanguage value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK);
	}
}
