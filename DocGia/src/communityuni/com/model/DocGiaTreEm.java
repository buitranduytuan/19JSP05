package communityuni.com.model;

import java.io.Serializable;
import java.util.Scanner;

public class DocGiaTreEm extends DocGia implements Serializable {
	private String NguoiDaiDien;
	
	
	public String getNguoiDaiDien() {
		return NguoiDaiDien;
	}

	public void setNguoiDaiDien(String nguoiDaiDien) {
		NguoiDaiDien = nguoiDaiDien;
	}

	public DocGiaTreEm() {
		super();
	}

	public DocGiaTreEm(int ma, String hoTen, String ngayLapThe, int soThangHieuLuc, String nguoiDaiDien) {
		super(ma, hoTen, ngayLapThe, soThangHieuLuc);
		NguoiDaiDien = nguoiDaiDien;
	}

	@Override
	public int tinhTienLamThe() {
		return getSoThangHieuLuc()*5000;
	}

	@Override
	public void xuatThongTin() {
		System.out.println("Thông tin Độc Giả Trẻ Em:");
		System.out.println("Mã số thẻ: "+this.getMa());
		System.out.println("Họ Tên: "+this.getHoTen());
		System.out.println("Ngày lập thẻ: "+this.getNgayLapThe());
		System.out.println("Số tháng hiệu lực của thẻ: "+this.getSoThangHieuLuc());
		System.out.println("Người Đại Diện: "+this.NguoiDaiDien);
		System.out.println("Số tiền làm thẻ: "+this.getSoThangHieuLuc()*5000);
	}
}
