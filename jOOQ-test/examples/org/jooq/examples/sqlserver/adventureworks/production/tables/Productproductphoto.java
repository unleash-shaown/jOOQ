/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productproductphoto extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord> {

	private static final long serialVersionUID = -829336424;

	/**
	 * The singleton instance of ProductProductPhoto
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto PRODUCTPRODUCTPHOTO = new org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductProductPhoto_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductProductPhoto_ProductPhoto_ProductPhotoID
	 * FOREIGN KEY (ProductPhotoID)
	 * REFERENCES Production.ProductPhoto (ProductPhotoID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, java.lang.Integer> PRODUCTPHOTOID = createField("ProductPhotoID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, java.lang.Boolean> PRIMARY = createField("Primary", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productproductphoto() {
		super("ProductProductPhoto", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Productproductphoto(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductProductPhoto_ProductID_ProductPhotoID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductProductPhoto_ProductID_ProductPhotoID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductProductPhoto_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductProductPhoto_ProductPhoto_ProductPhotoID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto(alias);
	}
}
