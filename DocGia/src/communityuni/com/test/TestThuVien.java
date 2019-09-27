package communityuni.com.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import communityuni.com.model.DocGia;
import communityuni.com.model.ThuVien;

public class TestThuVien {

	public static void main(String[] args) {
		ThuVien x = new ThuVien();
		x.docfileDocGia();
		while(true) {
			x.chucNang();
			int chon = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------------------");
			if(chon==1) {
				x.inPut();
				x.luuFileDocGia();
			}
			else if(chon==2) {
				x.outPut();
			}
			else if(chon==3) {
				x.suaThongTin();
				x.luuFileDocGia();
			}
			else if(chon==4) {
				x.xoaDocGia();
				x.luuFileDocGia();
			}
			else {
				System.err.println("Kết thúc chương trình!!!");
				break;
			}
		}
	}
}
