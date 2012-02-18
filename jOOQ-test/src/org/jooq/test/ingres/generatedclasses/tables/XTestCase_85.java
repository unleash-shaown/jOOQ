/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 2052404164;

	/**
	 * The singleton instance of x_test_case_85
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.ingres.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> __RECORD_TYPE = org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.pk_x_test_case_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.ingres.generatedclasses.Keys.pk_x_test_case_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.ingres.generatedclasses.Keys.fk_x_test_case_85);
	}
}
