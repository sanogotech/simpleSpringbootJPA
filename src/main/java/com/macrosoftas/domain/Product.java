package com.macrosoftas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prodId;
	private String name;
	private String brand;
	private String madein;
	private float price;
	

	 
	
	private Boolean available;

	
	@ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory productCategory;
	/*
	 * @JoinColumn indicates the entity is the owner of the relationship: 
	 * the corresponding table has a column with a foreign key to the referenced table.
	 */
	
	@OneToMany
	private List<OrderLineItem>  orderLineItemList;
	
	@ManyToOne
	private Supplier supplier;

	public Product() {
	}


	public Product(String name, ProductCategory category) {
		this.name = name;
        this.productCategory = category;
	}

	

	public Long getProdId() {
		return prodId;
	}


	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	

	public List<OrderLineItem> getOrderLineItemList() {
		return orderLineItemList;
	}


	public void setOrderLineItemList(List<OrderLineItem> orderLineItemList) {
		this.orderLineItemList = orderLineItemList;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	

	
	  public Supplier getSupplier() {
		return supplier;
	}


	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	public Boolean getAvailable() { return available; }
	  
	  
	  public void setAvailable(Boolean available) { this.available = available; }


	


	
	

	  

}
