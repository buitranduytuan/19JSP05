package communityuni.com.model;


import java.io.Serializable;
import java.util.Scanner;

public class DocGiaNguoiLon extends DocGia  implements Serializable{

	private String cmnd;
	
	
	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public DocGiaNguoiLon() {
		super();
	}

	public DocGiaNguoiLon(int ma, String hoTen, String ngayLapThe, int soThangHieuLuc, String cmnd) {
		super(ma, hoTen, ngayLapThe, soThangHieuLuc);
		this.cmnd = cmnd;
	}

	@Override
	public int tinhTienLamThe() {
		return getSoThangHieuLuc()*10000;
	}
	
	@Override
	public void xuatThongTin() {
		System.out.println("Thông tin Độc Giả Người Lớn:");
		System.out.println("Mã số thẻ: "+this.getMa());
		System.out.println("Họ Tên: "+this.getHoTen());
		System.out.println("Ngày lập thẻ: "+this.getNgayLapThe());
		System.out.println("Số tháng hiệu lực của thẻ: "+this.getSoThangHieuLuc());
		System.out.println("Số CMND: "+this.cmnd);
		System.out.println("Số tiền làm thẻ: "+this.getSoThangHieuLuc()*10000);
	}

}
