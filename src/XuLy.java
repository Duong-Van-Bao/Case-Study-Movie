import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Bước 1: Khai báo biến nameMovie, priceTicketsAdults, priceTickersChild, numberAdultsSlot, numberChildSlot and ratioPercentSum, sumTurnover, sumTicker, percent,  
		  Bước 2: In ra thông báo nhập thông tin của các biến ở trên
		  Bước 3: Cho người dùng nhập vào thông tin của các biến ở trên
		  Bước 5: Tính tổng số Doanh thu:
		             tổng giá vé: sumTurnover =  numberChildSlot + numberAdultsSlot;
		  Bước 6: Tính tổng số vé:
		             tổng số vé: sumTicker = priceTicketsAdults + priceTickerChild;
		  Bước 7: Phần trăm của từ thiện:
		             percent: người dùng nhập vào   
		  Bước 8: Tính tổng số tiền trích ra từ thiện:
		             ratioPercen: (sumTicker * 100%) - (percent-100%)
		  Bước 9: Tổng thu được sau khi trừ: 
		             Sum: ((sumTicker * 100%) - percent)/100%
		 * */

		String tenPhim;
		int giaVeLon;
		int giaVeEm;
		int soVeLon;
		int soVeNho;
		int phanTramTuThien;
		float tongThu;
		float tuThien;
		float conLai;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập tên phim: ");
		tenPhim = scan.nextLine();
		System.out.println("Vui lòng nhập vào giá vé người lớn: ");
		giaVeLon = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào giá vé trẻ em: ");
		giaVeEm = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào số vé người lớn đã bán: ");
		soVeLon = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào số vé người trẻ em đã bán: ");
		soVeNho = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào phần trăm từ thiện: ");
		phanTramTuThien = Integer.parseInt(scan.nextLine());
	     	
		tongThu = giaVeLon*soVeLon + giaVeEm*soVeNho;
		tuThien = ((1.0f)*phanTramTuThien)/100 * tongThu;
		conLai = tongThu - tuThien;
		
		System.out.print("Tên phim: " + "\t" + tenPhim);
		System.out.print("Số vé đã bán : " + "\t" + (soVeLon + soVeNho));
		System.out.print("Doanh Thu: " + "\t" + tongThu);
		System.out.print("Trích phần trăm từ thiện: " + "\t" + phanTramTuThien + "%");
		System.out.print("Tổng tiền trích từ thiện: " + "\t" + tuThien);
		System.out.print("Tổng tiền sau khi từ thiện: " + "\t" + conLai);
		
		//Example data 3d,2d - 2,2 - tien:10d,10%,1d,9d
		
	}
}
