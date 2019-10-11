package tuanbtd.com.model;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public void xuatThongTin() {
		System.out.println("Thông Tin Nhân Viên");
		System.out.print("Họ Tên: \t");
		System.out.println(this.getHoTen());
		System.out.print("Năm Sinh: \t");
		System.out.println(this.getNamSinh());
		System.out.print("Giới Tính: \t");
		System.out.println(this.getGioiTinh());
		System.out.print("Địa Chỉ: \t");
		System.out.println(this.getDiaChi());
		System.out.print("Công Việc: \t");
		System.out.println(this.getCongViec());
		System.out.println(".........................");
	}
}
