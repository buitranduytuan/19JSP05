package communityuni.com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import communityuni.com.io.SerializeFileFactory;

public class ThuVien  {

	static ArrayList<DocGia> dsDocGia = new ArrayList<DocGia>();
	static DocGia x;
	static int t=1;

	public static int getT() {
		return t;
	}

	public static void setT(int t) {
		ThuVien.t = t;
	}

	public void chucNang() {
		System.out.println("Các chức năng của Phần Mềm Quản Lý Thư Viện");
		System.out.println("1. Thêm thông tin Độc Giả");
		System.out.println("2. Xuất thông tin Độc Giả");
		System.out.println("3. Sửa thông tin Độc Giả thông qua Mã số thẻ");
		System.out.println("4. Xóa thông tin Độc Giả thông qua Mã số thẻ");
		System.out.println("5. Kết thúc chương trình");
		System.out.println("Mời bạn lựa chọn chức năng");
	}

	public void inPut() {
		while(true) {
			System.out.println("1. Nhập thông tin Độc Giả Người Lớn");
			System.out.println("2. Nhập thông tin Độc Giả Trẻ Em");
			System.out.println("3. Kết thúc quá trình nhập thông tin Độc Giả");
			System.out.println("Mời lựa chọn chức năng");
			int chon = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------------------");
			if(chon==3)
				break;
			System.out.println("Nhập mã số thẻ: ");
			int ma = new Scanner(System.in).nextInt();

			if(kiemTraThuocArrayList(layDocGiaTuMaSo(ma))==true) {
				System.out.println("Mã số thẻ này đã cấp! Vui lòng nhập mã số thẻ khác");
				System.out.println("------------------------------------------------------------------");
			}
			else {
				System.out.println("Nhập Họ tên: ");
				String ht = new Scanner(System.in).nextLine();
				System.out.println("Nhập ngày lập thẻ: ");
				String ngay = new Scanner(System.in).nextLine();
				System.out.println("Nhập số tháng có hiệu lực: ");
				int sothang = new Scanner(System.in).nextInt();
				if(chon==1) {
					System.out.println("Nhập số CMND: ");
					String cmnd = new Scanner(System.in).nextLine();
					x = new DocGiaNguoiLon(ma, ht, ngay, sothang, cmnd);
					dsDocGia.add(x);
					System.out.println("------------------------------------------------------------------");

				}
				else if(chon==2){
					System.out.println("Nhập người đại diện: ");
					String ndd = new Scanner(System.in).nextLine();
					x = new DocGiaTreEm(ma, ht, ngay, sothang, ndd);
					dsDocGia.add(x);
					System.out.println("------------------------------------------------------------------");
				}
			}
		}
	}

	public void luuFileDocGia() {
		SerializeFileFactory.saveFile(dsDocGia, "D:/DuyTuanJava/DocGia/ThuvienDocGia.dat");
	}

	public void docfileDocGia() {
		Object data = SerializeFileFactory.readFile("D:/DuyTuanJava/DocGia/ThuvienDocGia.dat");
		dsDocGia = (ArrayList<DocGia>) data;
	}

	public void outPut() {
		while(true) {
			System.out.println("1. Xuất thông tin toàn bộ Độc Giả");
			System.out.println("2. Xuất thông tin Độc Giả Người Lớn");
			System.out.println("3. Xuất thông tin Độc Giả Trẻ Em");
			System.out.println("4. Xuất thông tin một Độc Giả theo mã số thẻ");
			System.out.println("5. Sắp xếp Độc Giả ");
			System.out.println("6. Kết thúc quá trình xuất thông tin Độc Giả");
			System.out.println("Mời lựa chọn chức năng");
			int chon = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------------------");

			if (chon==1) {
				for(DocGia i: dsDocGia) {
					i.xuatThongTin();
					System.out.println("..................................");
				}
				System.out.println("------------------------------------------------------------------");
			}
			else if(chon==2) {
				for (DocGia i: dsDocGia) {
					if(i instanceof DocGiaNguoiLon)
						i.xuatThongTin();
					System.out.println("..................................");
				}
				System.out.println("------------------------------------------------------------------");
			}
			else if(chon==3) {
				for (DocGia i: dsDocGia) {
					if(i instanceof DocGiaTreEm)
						i.xuatThongTin();
					System.out.println("..................................");
				}
				System.out.println("------------------------------------------------------------------");
			}
			else if(chon==4) {
				System.out.println("Bạn muốn xuất thông tin Độc Giả có mã số thẻ nào:  ");
				int ms = new Scanner(System.in).nextInt();
				if(layDocGiaTuMaSo(ms)==null) {
					System.out.println("Không tìm thấy Độc Giả có mã số thẻ là: "+ms);
				}
				else
					layDocGiaTuMaSo(ms).xuatThongTin();
				System.out.println("..................................");
			}
			else if(chon==5) {
				System.out.println("1. Sắp xếp độc giả theo mã số thẻ tăng dần");
				System.out.println("2. Sắp xếp Độc Giả theo số tháng hiệu lực tăng dần");
				System.out.println("3. Sắp xếp Độc Giả theo Họ Tên");
				System.out.println("Mời lựa chọn");
				int lc = new Scanner(System.in).nextInt();

				if(lc==1)
					this.t=1;
				if(lc==2)
					this.t=2;
				if(lc==3)
					this.t=3;

				Collections.sort(dsDocGia);
				for( DocGia i: dsDocGia) {
					i.xuatThongTin();
				}
				System.out.println("------------------------------------------------------------------");

				System.out.println("Có muốn lưu danh sách Độc Giả theo cách vừa sắp xếp");
				System.out.println("1. Có"+"\t\t\t"+"2.Không");
				System.out.println("Mời lựa chọn");
				int lc2 = new Scanner(System.in).nextInt();

				if(lc2==1) {
					this.luuFileDocGia();
					System.out.println("Đã lưu file danh sách thành công!");
					System.out.println("------------------------------------------------------------------");
				}
			}
			else break;
		}
	}

	public void suaThongTin() {
		System.out.println("Mời nhập Mã số thẻ của Độc Giả muốn sửa thông tin: ");
		int ms = new Scanner(System.in).nextInt();
		if (layDocGiaTuMaSo(ms)==null) {
			System.out.println("Không tìm thấy Độc Giả có mã số thẻ là: "+ms);
		}
		else {
			if(layDocGiaTuMaSo(ms) instanceof DocGiaNguoiLon) {
				System.out.println("Bạn muốn sửa thông tin gì: ");
				System.out.println("1. Họ Tên");
				System.out.println("2. Ngày lập thẻ");
				System.out.println("3. Số tháng có hiệu lực");
				System.out.println("4. Chứng minh nhân dân");
				System.out.println("Mời mục muốn sửa: ");
			}
			if(layDocGiaTuMaSo(ms) instanceof DocGiaTreEm) {
				System.out.println("Bạn muốn sửa thông tin gì: ");
				System.out.println("1. Họ Tên");
				System.out.println("2. Ngày lập thẻ");
				System.out.println("3. Số tháng có hiệu lực");
				System.out.println("4. Người đại diện");
				System.out.println("Mời mục muốn sửa: ");
			}
			int chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1: 
				System.out.println("Nhập Họ Tên mới: ");
				String newten = new Scanner(System.in).nextLine();
				layDocGiaTuMaSo(ms).setHoTen(newten);
				break;
			case 2: 
				System.out.println("Nhập ngày lập thẻ mới: ");
				String newdate = new Scanner(System.in).nextLine();
				layDocGiaTuMaSo(ms).setNgayLapThe(newdate);
				break;
			case 3: 
				System.out.println("Nhập số tháng hiệu lực mới: ");
				int newmonth = new Scanner(System.in).nextInt();
				layDocGiaTuMaSo(ms).setSoThangHieuLuc(newmonth);
				break;
			case 4:
				if(layDocGiaTuMaSo(ms) instanceof DocGiaNguoiLon) {
					System.out.println("Nhập số chứng minh nhân dân mới: ");
					String newcmnd = new Scanner(System.in).nextLine();
					((DocGiaNguoiLon) layDocGiaTuMaSo(ms)).setCmnd(newcmnd);
				}
				else {
					System.out.println("Nhập người đại diện mới: ");
					String newndd = new Scanner(System.in).nextLine();
					((DocGiaTreEm) layDocGiaTuMaSo(ms)).setNguoiDaiDien(newndd);
				}
				break;
			}
		}
	}

	public void xoaDocGia() {
		System.out.println("Nhập mã số thẻ của Độc Giả bạn muốn xóa: ");
		int ma = new Scanner(System.in).nextInt();
		if(layDocGiaTuMaSo(ma)==null)
			System.out.println("Không có Độc Giả có mã số thẻ "+ma+" trong danh sách Độc Giả");
		else {
			dsDocGia.remove(layDocGiaTuMaSo(ma));
			System.out.println("Đã xóa Độc Giả có mã số thẻ "+ma+" thành công!");
		}
	}

	public DocGia layDocGiaTuMaSo(int ma) {
		DocGia n = null;
		for(DocGia dg: dsDocGia) {
			if(dg.getMa()==ma) {
				n = dg;
			}
		}
		return n;
	}

	public boolean kiemTraThuocArrayList(DocGia dgkt) {
		int dem=0;
		for(DocGia dg: dsDocGia) {
			if (dgkt==dg) 
				dem=1;
		}
		if(dem!=0) 
			return true;
		else 
			return false;
	}
}
