package tuanbtd.com.model;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public void xuatThongTin() {
		System.out.println("Thông Tin Kỹ Sư");
		System.out.print("Họ Tên: \t");
		System.out.println(this.getHoTen());
		System.out.print("Năm Sinh: \t");
		System.out.println(this.getNamSinh());
		System.out.print("Giới Tính: \t");
		System.out.println(this.getGioiTinh());
		System.out.print("Địa Chỉ: \t");
		System.out.println(this.getDiaChi());
		System.out.print("Ngành đào tạo: \t");
		System.out.println(this.getNganhDaoTao());
		System.out.println(".........................");
	}
}
