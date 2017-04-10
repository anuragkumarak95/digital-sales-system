package wasdev.biz.model;

//weak entity. belongs to Product entity.
public class Supplier{
  private String name;
  private String supplierStatus;
  private String address1;
  private String address2;
  private String city;
  private String postalCode;
  private String province;
  private String country;
  private String phone;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSupplierStatus() {
	return supplierStatus;
}
public void setSupplierStatus(String supplierStatus) {
	this.supplierStatus = supplierStatus;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
  
  
}
