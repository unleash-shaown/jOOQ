/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Address extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> {

	private static final long serialVersionUID = 419946034;

	/**
	 * The singleton instance of Address
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Address ADDRESS = new org.jooq.examples.sqlserver.adventureworks.person.tables.Address();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.Integer> ADDRESSID = createField("AddressID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.String> ADDRESSLINE1 = createField("AddressLine1", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.String> ADDRESSLINE2 = createField("AddressLine2", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.String> CITY = createField("City", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_Address_StateProvince_StateProvinceID
	 * FOREIGN KEY (StateProvinceID)
	 * REFERENCES Person.StateProvince (StateProvinceID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.Integer> STATEPROVINCEID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.String> POSTALCODE = createField("PostalCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Address() {
		super("Address", org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON);
	}

	/**
	 * No further instances allowed
	 */
	private Address(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON, org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_Address;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.FK_Address_StateProvince_StateProvinceID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Address as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Address(alias);
	}
}
