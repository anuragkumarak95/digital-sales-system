package wasdev.biz.model;

public class Category{
  //cloudant reference variables
  private String _id;
  private String _rev;

  //Category states
  private String categoryId;
  private String name;
  private String description;
  private String imgUrl;
  private String bannerUrl;
public String get_id() {
	return _id;
}
public void set_id(String _id) {
	this._id = _id;
}
public String get_rev() {
	return _rev;
}
public void set_rev(String _rev) {
	this._rev = _rev;
}
public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImgUrl() {
	return imgUrl;
}
public void setImgUrl(String imgUrl) {
	this.imgUrl = imgUrl;
}
public String getBannerUrl() {
	return bannerUrl;
}
public void setBannerUrl(String bannerUrl) {
	this.bannerUrl = bannerUrl;
}
  
  
}
