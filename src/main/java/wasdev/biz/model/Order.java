package wasdev.biz.model;

import java.util.Date;

public class Order extends CloudantEntity{


  //Order states. cc** Credit Card
  private String userId;
  private Date orderDate;
  private String orderStatus;

  private String ccType;
  private String ccNumber;
  private String ccExpiryMonth;
  private String ccExpiryYear;

  private String billFName;
  private String billLName;
  private String billAddress1;
  private String billAddress2;
  private String billCity;
  private String billState;
  private String billProvince;
  private String billPostalCode;
  private String billCountry;
  private boolean shipToBillingAddress;

  private String shipFName;
  private String shipLName;
  private String shipAddress1;
  private String shipAddress2;
  private String shipCity;
  private String shipState;
  private String shipProvince;
  private String shipPostalCode;
  private String shipCountry;

  private float subTotal;
  //private ShipMethod shipMethod;
  private float shipCost;
  private float total;

  private Item[] items;

@Override
public String get_id() {
	return _id;
}
@Override
public void set_id(String _id) {
	this._id = _id;
}
@Override
public String get_rev() {
	return _rev;
}
@Override
public void set_rev(String _rev) {
	this._rev = _rev;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}

public String getCcType() {
	return ccType;
}

public void setCcType(String ccType) {
	this.ccType = ccType;
}

public String getCcNumber() {
	return ccNumber;
}

public void setCcNumber(String ccNumber) {
	this.ccNumber = ccNumber;
}

public String getCcExpiryMonth() {
	return ccExpiryMonth;
}

public void setCcExpiryMonth(String ccExpiryMonth) {
	this.ccExpiryMonth = ccExpiryMonth;
}

public String getCcExpiryYear() {
	return ccExpiryYear;
}

public void setCcExpiryYear(String ccExpiryYear) {
	this.ccExpiryYear = ccExpiryYear;
}

public String getBillFName() {
	return billFName;
}

public void setBillFName(String billFName) {
	this.billFName = billFName;
}

public String getBillLName() {
	return billLName;
}

public void setBillLName(String billLName) {
	this.billLName = billLName;
}

public String getBillCity() {
	return billCity;
}

public void setBillCity(String billCity) {
	this.billCity = billCity;
}

public String getBillState() {
	return billState;
}

public void setBillState(String billState) {
	this.billState = billState;
}

public String getBillProvince() {
	return billProvince;
}

public void setBillProvince(String billProvince) {
	this.billProvince = billProvince;
}

public String getBillPostalCode() {
	return billPostalCode;
}

public void setBillPostalCode(String billPostalCode) {
	this.billPostalCode = billPostalCode;
}

public String getBillCountry() {
	return billCountry;
}

public void setBillCountry(String billCountry) {
	this.billCountry = billCountry;
}

public boolean isShipToBillingAddress() {
	return shipToBillingAddress;
}

public void setShipToBillingAddress(boolean shipToBillingAddress) {
	this.shipToBillingAddress = shipToBillingAddress;
}

public String getShipFName() {
	return shipFName;
}

public void setShipFName(String shipFName) {
	this.shipFName = shipFName;
}

public String getShipLName() {
	return shipLName;
}

public void setShipLName(String shipLName) {
	this.shipLName = shipLName;
}

public String getShipCity() {
	return shipCity;
}

public void setShipCity(String shipCity) {
	this.shipCity = shipCity;
}

public String getShipState() {
	return shipState;
}

public void setShipState(String shipState) {
	this.shipState = shipState;
}

public String getShipProvince() {
	return shipProvince;
}

public void setShipProvince(String shipProvince) {
	this.shipProvince = shipProvince;
}

public String getShipPostalCode() {
	return shipPostalCode;
}

public void setShipPostalCode(String shipPostalCode) {
	this.shipPostalCode = shipPostalCode;
}

public String getShipCountry() {
	return shipCountry;
}

public void setShipCountry(String shipCountry) {
	this.shipCountry = shipCountry;
}

public float getSubTotal() {
	return subTotal;
}

public void setSubTotal(float subTotal) {
	this.subTotal = subTotal;
}

public float getShipCost() {
	return shipCost;
}

public void setShipCost(float shipCost) {
	this.shipCost = shipCost;
}

public float getTotal() {
	return total;
}

public void setTotal(float total) {
	this.total = total;
}

public Item[] getItems() {
	return items;
}

public void setItems(Item[] items) {
	this.items = items;
}

public String getBillAddress1(){
  return billAddress1;
}

public void setBillAddress1(String billAddress1){
  this.billAddress1 = billAddress1;
}

public String getBillAddress2(){
  return billAddress2;
}

public void setBillAddress2(String billAddress2){
  this.billAddress1 = billAddress2;
}

public String getShipAddress1(){
  return shipAddress1;
}

public void setShipAddress1(String shipAddress1){
  this.shipAddress1 = shipAddress1;
}

public String getShipAddress2(){
  return shipAddress2;
}

public void setShipAddress2(String shipAddress2){
  this.shipAddress1 = shipAddress2;
}

@Override
public void copy(CloudantEntity obj){
  this.userId = ((Order)obj).getUserId();
  this.orderDate = ((Order)obj).getOrderDate();
  this.orderStatus = ((Order)obj).getOrderStatus();

  this.ccType = ((Order)obj).getCcType();
  this.ccNumber = ((Order)obj).getCcNumber();
  this.ccExpiryMonth = ((Order)obj).getCcExpiryMonth();
  this.ccExpiryYear = ((Order)obj).getCcExpiryYear();

  this.billFName = ((Order)obj).getBillFName();
  this.billLName = ((Order)obj).getBillLName();
  this.billAddress1 = ((Order)obj).getBillAddress1();
  this.billAddress2 = ((Order)obj).getBillAddress2();
  this.billCity = ((Order)obj).getBillCity();
  this.billState = ((Order)obj).getBillState();
  this.billProvince = ((Order)obj).getBillProvince();
  this.billPostalCode = ((Order)obj).getBillPostalCode();
  this.billCountry = ((Order)obj).getBillCountry();
  this.shipToBillingAddress = ((Order)obj).isShipToBillingAddress();

  this.shipFName = ((Order)obj).getShipFName();
  this.shipLName = ((Order)obj).getShipLName();
  this.shipAddress1 = ((Order)obj).getShipAddress1();
  this.shipAddress2 = ((Order)obj).getShipAddress2();
  this.shipCity = ((Order)obj).getShipCity();
  this.shipState = ((Order)obj).getShipState();
  this.shipProvince = ((Order)obj).getShipProvince();
  this.shipPostalCode = ((Order)obj).getShipPostalCode();
  this.shipCountry = ((Order)obj).getShipCountry();

  this.subTotal = ((Order)obj).getSubTotal();
  //this.shipMethod = ((Order)obj).getShipMethod();
  this.shipCost = ((Order)obj).getShipCost();
  this.total = ((Order)obj).getTotal();

  this.items = ((Order)obj).getItems();
}

}
