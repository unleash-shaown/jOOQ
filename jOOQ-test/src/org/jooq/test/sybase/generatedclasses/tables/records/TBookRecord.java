/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -496099882;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES dba.t_author (ID)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES dba.t_author (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES dba.t_author (ID)
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES dba.t_author (ID)
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES dba.t_author (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES dba.t_author (ID)
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES dba.t_language (id)
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.sybase.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES dba.t_language (id)
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK);
	}
}
