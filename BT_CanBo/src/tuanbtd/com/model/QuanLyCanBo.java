package tuanbtd.com.model;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	public static ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
	public static boolean kt = true;

	public static void menu() {
		System.out.println("=======CHƯƠNG TRÌNH NHẬP XUẤT THÔNG TIN CÁN BỘ CÔNG TY========");
		System.out.println("1. Nhập thông tin Cán Bộ");
		System.out.println("2. Xuất thông tin Cán Bộ");
		System.out.println("3. Tìm kiếm thông tin Cán Bộ");
		System.out.println("4. Thoát chương trình");
		System.out.println("Mời bạn lựa chọn: ");
		int chon = new Scanner(System.in).nextInt();
		System.out.println("----------------------------------------");

		if(chon==1)
			nhapThongTinCanBo();
		else if(chon==2)
			xuatThongTinCanBo();
		else if(chon==3)
			timKiemThongTinCanBo();
		else if(chon==4) {
			kt=false;
			System.out.println("Kết thúc chương trình");
		}
	}

	public static void nhapThongTinCanBo() {
		CanBo cb ;
		System.out.println("Bạn muốn nhập thông tin của Cán Bộ nào:");
		System.out.println("1. Nhân Viên");
		System.out.println("2. Công Nhân");
		System.out.println("3. Kỹ Sư");
		System.out.println("Mời bạn lựa chọn: ");
		int lchon = new Scanner(System.in).nextInt();
		System.out.println("----------------------------------------");

		if(lchon==1) {
			System.out.println("Mời bạn nhập các thông tin cho Nhân Viên");
			System.out.println("Mời bạn nhập Họ Tên: ");
			String ht = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập năm sinh: ");
			int ns = new Scanner(System.in).nextInt();
			System.out.println("Mời bạn nhập Giới Tính: ");
			String gt = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập Địa Chỉ: ");
			String dc = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập Công Việc: ");
			String cv = new Scanner(System.in).nextLine();
			cb = new NhanVien(ht, ns, gt, dc, cv);
			dsCanBo.add(cb);
			System.out.println("----------------------------------------");
		}
		if(lchon==2) {
			System.out.println("Mời bạn nhập các thông tin cho Công Nhân");
			System.out.println("Mời bạn nhập Họ Tên: ");
			String ht = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập năm sinh: ");
			int ns = new Scanner(System.in).nextInt();
			System.out.println("Mời bạn nhập Giới Tính: ");
			String gt = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập Địa Chỉ: ");
			String dc = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập Bậc Công Nhân: ");
			String bac = new Scanner(System.in).nextLine();
			cb = new CongNhan(ht, ns, gt, dc, bac);
			dsCanBo.add(cb);
			System.out.println("----------------------------------------");
		}
		if(lchon==3) {
			System.out.println("Mời bạn nhập các thông tin cho Nhân Viên");
			System.out.println("Mời bạn nhập Họ Tên: ");
			String ht = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập năm sinh: ");
			int ns = new Scanner(System.in).nextInt();
			System.out.println("Mời bạn nhập Giới Tính: ");
			String gt = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập Địa Chỉ: ");
			String dc = new Scanner(System.in).nextLine();
			System.out.println("Mời bạn nhập Ngành đào tạo: ");
			String ndt = new Scanner(System.in).nextLine();
			cb = new KySu(ht, ns, gt, dc, ndt);
			dsCanBo.add(cb);
			System.out.println("----------------------------------------");
		}
	}

	public static void xuatThongTinCanBo() {
		System.out.println("Xuất thông tin Cán Bộ của Công Ty");
		System.out.println("1. Thông tin tất cả Cán Bộ của Công Ty");
		System.out.println("2. Thông tin tất cả Cán Bộ là Nhân Viên");
		System.out.println("3. Thông tin tất cả Cán Bộ là Công Nhân");
		System.out.println("4. Thông tin tất cả Cán Bộ là Kỹ Sư ");
		System.out.println("Mời bạn lựa chọn");
		int lchon = new Scanner(System.in).nextInt();

		if(lchon==1) {
			for(CanBo cb: dsCanBo) {
				cb.xuatThongTin();
			}
		}

		if(lchon==2) {
			for(CanBo cb: dsCanBo) {
				if(cb instanceof NhanVien)
					cb.xuatThongTin();
			}
		}

		if(lchon==3) {
			for(CanBo cb: dsCanBo) {
				if(cb instanceof CongNhan)
					cb.xuatThongTin();
			}
		}

		if(lchon==4) {
			for(CanBo cb: dsCanBo) {
				if(cb instanceof KySu)
					cb.xuatThongTin();
			}
		}
	}

	public static void timKiemThongTinCanBo() {
		System.out.println("Mời bạn nhập tên Cán Bộ muốn tìm kiếm");
		String ht = new Scanner(System.in).nextLine();
		System.out.println("Thông Tin Cán Bộ bạn muốn tìm kiếm là: ");
		for(CanBo cb: dsCanBo) {
			if(ht.equalsIgnoreCase(cb.getHoTen()))
				cb.xuatThongTin();
		}
	}
}
