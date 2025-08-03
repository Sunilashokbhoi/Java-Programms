package com.interface_Demo.Record.Interface;

import java.util.Objects;

public class ProductClass {
	/**
	 * @param productId
	 * @param productName
	 */
	protected ProductClass(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	private Integer productId;
	private String productName;
	@Override
	public String toString() {
		return "ProductClass [productId=" + productId + ", productName=" + productName + "]";
	}
	protected Integer getProductId() {
		return productId;
	}
	protected void setProductId(Integer productId) {
		this.productId = productId;
	}
	protected String getProductName() {
		return productName;
	}
	protected void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductClass other = (ProductClass) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName);
	}
	
	
}
