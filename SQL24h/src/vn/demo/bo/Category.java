package vn.demo.bo;

public class Category {
	private int id;
	private String tenDanhMuc;

	public Category() {
	}

	public Category(int id, String tenDanhMuc) {
		this.id = id;
		this.tenDanhMuc = tenDanhMuc;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

}
