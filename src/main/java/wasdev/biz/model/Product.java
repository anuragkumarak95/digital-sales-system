package wasdev.biz.model;

public class Product extends CloudantEntity{


  //Product states.
  private String name;
  private String productId;
  private String description;
  private Category category;
  private String[] searchKey;
  private String imgUrl;
  private int unitCost;
  private int quantity;
  private boolean availablity;
  private int reorderQuantity;
  private Supplier supplier;

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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String[] getSearchKey() {
	return searchKey;
}
public void setSearchKey(String[] searchKey) {
	this.searchKey = searchKey;
}
public String getImgUrl() {
	return imgUrl;
}
public void setImgUrl(String imgUrl) {
	this.imgUrl = imgUrl;
}
public int getUnitCost() {
	return unitCost;
}
public void setUnitCost(int unitCost) {
	this.unitCost = unitCost;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public boolean isAvailablity() {
	return availablity;
}
public void setAvailablity(boolean availablity) {
	this.availablity = availablity;
}
public int getReorderQuantity() {
	return reorderQuantity;
}
public void setReorderQuantity(int reorderQuantity) {
	this.reorderQuantity = reorderQuantity;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

public Category getCategory(){
  return category;
}

public void setCategory(Category category){
  this.category = category;
}


@Override
public void copy(CloudantEntity obj){
  this.name = ((Product)obj).getName();
  this.productId = ((Product)obj).getProductId();
  this.description = ((Product)obj).getDescription();
  this.category = ((Product)obj).getCategory();
  this.searchKey = ((Product)obj).getSearchKey();
  this.imgUrl = ((Product)obj).getImgUrl();
  this.unitCost = ((Product)obj).getUnitCost();
  this.quantity = ((Product)obj).getQuantity();
  this.availablity = ((Product)obj).isAvailablity();
  this.reorderQuantity = ((Product)obj).getReorderQuantity();
  this.supplier = ((Product)obj).getSupplier();
}




}
