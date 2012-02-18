/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book", schema = "public")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 142823206;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "author_id")
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "co_author_id")
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "details_id")
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "title")
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "published_in")
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES public.t_language (id)
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.postgres.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES public.t_language (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "language_id")
	public org.jooq.test.postgres.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "content_text")
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "content_pdf")
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * An uncommented item
	 */
	public void setStatus(org.jooq.test.postgres.generatedclasses.enums.UBookStatus value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.STATUS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "status")
	public org.jooq.test.postgres.generatedclasses.enums.UBookStatus getStatus() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.STATUS);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK);
	}
}
