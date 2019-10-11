package tuanbtd.com.model;

public class CongNhan extends CanBo {
	private String bacCongNhan;

	public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, String bacCongNhan) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.bacCongNhan = bacCongNhan;
	}

	public String getBacCongNhan() {
		return bacCongNhan;
	}

	public void setBacCongNhan(String bacCongNhan) {
		this.bacCongNhan = bacCongNhan;
	}
	
	public void xuatThongTin() {
		System.out.println("Thông Tin Công Nhân");
		System.out.print("Họ Tên: \t");
		System.out.println(this.getHoTen());
		System.out.print("Năm Sinh: \t");
		System.out.println(this.getNamSinh());
		System.out.print("Giới Tính: \t");
		System.out.println(this.getGioiTinh());
		System.out.print("Địa Chỉ: \t");
		System.out.println(this.getDiaChi());
		System.out.print("Bậc Công Nhân: \t");
		System.out.println(this.getBacCongNhan());
		System.out.println(".........................");
	}
}
