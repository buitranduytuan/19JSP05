package tuanbtd.com.model;

import java.util.Scanner;

public abstract class CanBo {
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo() {

	}

	public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public abstract void xuatThongTin();
}
