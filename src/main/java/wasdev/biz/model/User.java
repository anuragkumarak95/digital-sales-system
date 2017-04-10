package wasdev.biz.model;

public class User extends CloudantEntity{


  //User states.
  private String userId;
  private String userPass;
  private String email;
  private boolean isAdmin;
  private String fName;
  private String lName;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String postalCode;
  private String province;
  private String country;
  private String phone;
  private String lang;
  private String favCategory;
  private boolean showPetTips;

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
public String getUserPass() {
	return userPass;
}
public void setUserPass(String userPass) {
	this.userPass = userPass;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isAdmin() {
	return isAdmin;
}
public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
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
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
public String getFavCategory() {
	return favCategory;
}
public void setFavCategory(String favCategory) {
	this.favCategory = favCategory;
}
public boolean isShowPetTips() {
	return showPetTips;
}
public void setShowPetTips(boolean showPetTips) {
	this.showPetTips = showPetTips;
}

@Override
public void copy(CloudantEntity obj){
  this.userId = ((User)obj).getUserId();
  this.userPass = ((User)obj).getUserPass();
  this.email = ((User)obj).getEmail();
  this.isAdmin = ((User)obj).isAdmin();
  this.fName = ((User)obj).getfName();
  this.lName = ((User)obj).getlName();
  this.address1 = ((User)obj).getAddress1();
  this.address2 = ((User)obj).getAddress2();
  this.city = ((User)obj).getCity();
  this.state = ((User)obj).getState();
  this.postalCode = ((User)obj).getPostalCode();
  this.province = ((User)obj).getProvince();
  this.country = ((User)obj).getCountry();
  this.phone = ((User)obj).getPhone();
  this.lang = ((User)obj).getLang();
  this.favCategory = ((User)obj).getFavCategory();
  this.showPetTips = ((User)obj).isShowPetTips();
}




}
