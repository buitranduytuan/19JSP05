package communityuni.com.model;

import java.io.Serializable;

public abstract class DocGia implements Comparable<DocGia>, Serializable{
	private int ma;
	private String HoTen;
	private String NgayLapThe;
	private int SoThangHieuLuc;


	public DocGia() {
		super();
	}

	public DocGia(int ma, String hoTen, String ngayLapThe, int soThangHieuLuc) {
		super();
		this.ma = ma;
		HoTen = hoTen;
		NgayLapThe = ngayLapThe;
		SoThangHieuLuc = soThangHieuLuc;
	}
	
	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getHoTen() {
		return this.HoTen;
	}

	public void setHoTen(String hoTen) {
		this.HoTen = hoTen;
	}

	public String getNgayLapThe() {
		return this.NgayLapThe;
	}

	public void setNgayLapThe(String ngayLapThe) {
		this.NgayLapThe = ngayLapThe;
	}

	public int getSoThangHieuLuc() {
		return this.SoThangHieuLuc;
	}

	public void setSoThangHieuLuc(int soThangHieuLuc) {
		this.SoThangHieuLuc = soThangHieuLuc;
	}

	public abstract int tinhTienLamThe();
	public abstract void xuatThongTin();
	public int compareTo(DocGia o) {
		if(ThuVien.getT()==1) {
		if(this.ma>o.ma)
			return 1;
		else if(this.ma<o.ma)
			return -1;
		else
			return 0;
		}
		if(ThuVien.getT()==2) {
			if(this.SoThangHieuLuc>o.SoThangHieuLuc)
				return 1;
			else if(this.SoThangHieuLuc<o.SoThangHieuLuc)
				return -1;
			else
				return 0;
			}
		if(ThuVien.getT()==3) {
			return this.HoTen.compareTo(o.HoTen);
			}
		return 0;
	}
}
