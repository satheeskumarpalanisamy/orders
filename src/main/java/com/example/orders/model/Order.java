package com.example.orders.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order1")
public class Order {

    public Order() {

    }

    @Id
    private int orderId;
    private Long userId;
    private String type;
    private String status;
    private float subTotal;
    private float tax;
    private float shipping;
    private float total;
    private String promo;
    private float discount;
    private float grandTotal;
    private Date createdAt;
    private Date updatedAt;
    private String content;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String line1;
    private String line2;
    private String city;
    private String province;
    private String country;
    private int itemId;
    private int productId;
    private String sku;
    private float price;

    private int item1itemId;
    private int item1productId;
    private String item1quantity;
    private float item1price;
    private float item1discount;

    private int item2itemId;
    private int item2productId;
    private String item2quantity;
    private float item2price;
    private float item2discount;

    public Order(int orderId, Long userId, String type, String status, float subTotal, float tax, float shipping, float total, String promo, float discount, float grandTotal, Date createdAt, Date updatedAt, String content, String firstName, String middleName, String lastName, String mobile, String email, String line1, String line2, String city, String province, String country, int itemId, int productId, String sku, float price, int item1itemId, int item1productId, String item1quantity, float item1price, float item1discount, int item2itemId, int item2productId, String item2quantity, float item2price, float item2discount) {
        this.orderId = orderId;
        this.userId = userId;
        this.type = type;
        this.status = status;
        this.subTotal = subTotal;
        this.tax = tax;
        this.shipping = shipping;
        this.total = total;
        this.promo = promo;
        this.discount = discount;
        this.grandTotal = grandTotal;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.province = province;
        this.country = country;
        this.itemId = itemId;
        this.productId = productId;
        this.sku = sku;
        this.price = price;
        this.item1itemId = item1itemId;
        this.item1productId = item1productId;
        this.item1quantity = item1quantity;
        this.item1price = item1price;
        this.item1discount = item1discount;
        this.item2itemId = item2itemId;
        this.item2productId = item2productId;
        this.item2quantity = item2quantity;
        this.item2price = item2price;
        this.item2discount = item2discount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getShipping() {
        return shipping;
    }

    public void setShipping(float shipping) {
        this.shipping = shipping;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getItem1itemId() {
        return item1itemId;
    }

    public void setItem1itemId(int item1itemId) {
        this.item1itemId = item1itemId;
    }

    public int getItem1productId() {
        return item1productId;
    }

    public void setItem1productId(int item1productId) {
        this.item1productId = item1productId;
    }

    public String getItem1quantity() {
        return item1quantity;
    }

    public void setItem1quantity(String item1quantity) {
        this.item1quantity = item1quantity;
    }

    public float getItem1price() {
        return item1price;
    }

    public void setItem1price(float item1price) {
        this.item1price = item1price;
    }

    public float getItem1discount() {
        return item1discount;
    }

    public void setItem1discount(float item1discount) {
        this.item1discount = item1discount;
    }

    public int getItem2itemId() {
        return item2itemId;
    }

    public void setItem2itemId(int item2itemId) {
        this.item2itemId = item2itemId;
    }

    public int getItem2productId() {
        return item2productId;
    }

    public void setItem2productId(int item2productId) {
        this.item2productId = item2productId;
    }

    public String getItem2quantity() {
        return item2quantity;
    }

    public void setItem2quantity(String item2quantity) {
        this.item2quantity = item2quantity;
    }

    public float getItem2price() {
        return item2price;
    }

    public void setItem2price(float item2price) {
        this.item2price = item2price;
    }

    public float getItem2discount() {
        return item2discount;
    }

    public void setItem2discount(float item2discount) {
        this.item2discount = item2discount;
    }
}
