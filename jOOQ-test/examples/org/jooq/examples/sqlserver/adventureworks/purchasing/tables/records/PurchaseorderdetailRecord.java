/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PurchaseOrderDetail", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"PurchaseOrderID", "PurchaseOrderDetailID"})
})
public class PurchaseorderdetailRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord> {

	private static final long serialVersionUID = 725401697;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_PurchaseOrderHeader_PurchaseOrderID
	 * FOREIGN KEY (PurchaseOrderID)
	 * REFERENCES Purchasing.PurchaseOrderHeader (PurchaseOrderID)
	 * </pre></code>
	 */
	public void setPurchaseorderid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PURCHASEORDERID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_PurchaseOrderHeader_PurchaseOrderID
	 * FOREIGN KEY (PurchaseOrderID)
	 * REFERENCES Purchasing.PurchaseOrderHeader (PurchaseOrderID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "PurchaseOrderID")
	public java.lang.Integer getPurchaseorderid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PURCHASEORDERID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setPurchaseorderdetailid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PURCHASEORDERDETAILID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "PurchaseOrderDetailID")
	public java.lang.Integer getPurchaseorderdetailid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PURCHASEORDERDETAILID);
	}

	/**
	 * An uncommented item
	 */
	public void setDuedate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.DUEDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DueDate")
	public java.sql.Timestamp getDuedate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.DUEDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setOrderqty(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.ORDERQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "OrderQty")
	public java.lang.Short getOrderqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.ORDERQTY);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PRODUCTID);
	}

	/**
	 * An uncommented item
	 */
	public void setUnitprice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.UNITPRICE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "UnitPrice")
	public java.math.BigDecimal getUnitprice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.UNITPRICE);
	}

	/**
	 * An uncommented item
	 */
	public void setLinetotal(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.LINETOTAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LineTotal")
	public java.math.BigDecimal getLinetotal() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.LINETOTAL);
	}

	/**
	 * An uncommented item
	 */
	public void setReceivedqty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.RECEIVEDQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReceivedQty")
	public java.math.BigDecimal getReceivedqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.RECEIVEDQTY);
	}

	/**
	 * An uncommented item
	 */
	public void setRejectedqty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.REJECTEDQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "RejectedQty")
	public java.math.BigDecimal getRejectedqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.REJECTEDQTY);
	}

	/**
	 * An uncommented item
	 */
	public void setStockedqty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.STOCKEDQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StockedQty")
	public java.math.BigDecimal getStockedqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.STOCKEDQTY);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.MODIFIEDDATE);
	}

	/**
	 * Create a detached PurchaseorderdetailRecord
	 */
	public PurchaseorderdetailRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL);
	}
}
