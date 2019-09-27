package communityuni.com.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuEmployee {
	static ArrayList< Employee>  listEmloyee = new ArrayList<Employee>();
	static boolean kt = true;

	public static void inPut() {
		Employee nv;
		System.out.println("Mời bạn nhập các thông tin của Nhân Viên");
		System.out.println("Mời nhập ID: ");
		int so = new Scanner(System.in).nextInt();
		System.out.println("Mời bạn nhập Tên: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Mời bạn nhập Lương: ");
		double luong = new Scanner(System.in).nextDouble();
		System.out.println("Mời bạn nhập Job Name: ");
		String jobname = new Scanner(System.in).nextLine();
		nv = new Employee(so, ten, luong, jobname);
		listEmloyee.add(nv);
		System.out.println("-------------------------------------------");
	}

	public static  void outPut() {
		System.out.println("Thông tin của tất cả các Nhân Viên: ");
		for(Employee i : listEmloyee) {
			i.print();
			System.out.println("*	*	*	*	*	*	*	*	*	*	*");
		}
		System.out.println("-------------------------------------------");
	}

	public static void meNu() {
		System.out.println("Menu Nhập - Xuất Nhân Viên");
		System.out.println("1. Nhập thông tin của Nhân Viên");
		System.out.println("2. Xuất tất cả các thông tin của Nhân Viên");
		System.out.println("3. Thoát chương trình");
		System.out.println("Mời bạn lựa chọn: ");
		int chon = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------------------");

		switch (chon) {
		case 1: 
			inPut();
			break;
		case 2: 
			outPut();
			break;
		case 3:
			System.out.println("Thoát chương trình!");
			kt = false;
			break;
		}
	}

	public static void main(String[] args) {
		while (kt) {
			meNu();
		}
	}
}
