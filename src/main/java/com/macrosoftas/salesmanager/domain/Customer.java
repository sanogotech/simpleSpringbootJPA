package com.macrosoftas.salesmanager.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  custId;

	@Column(columnDefinition = "varchar(255) default 'John Snow'")
	String  fisrstname;
	
	String  surname;
	
	@Column(unique=true)
	String email;
	
	String phone;
	
	//mappedBy and how to use them in a one-to-many bidirectional relationship.
	//mappedBy is the name of the association-mapping attribute on the owning side. 
	@OneToMany(mappedBy = "customer")
	private List<PurchaseOrder>  purchaseOrderList;
	
	@OneToOne
	private ShippingInfo shippingInfo;
	
	@OneToOne
	private BillingInfo billingInfo;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getFisrstname() {
		return fisrstname;
	}

	public void setFisrstname(String fisrstname) {
		this.fisrstname = fisrstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public List<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderList;
	}

	public void setPurchaseOrderList(List<PurchaseOrder> purchaseOrderList) {
		this.purchaseOrderList = purchaseOrderList;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}
	
	
	
	
}
