import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final int NUM_CHAR_PADD_LEFT = -70;
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
		
		String text; 
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT +"s","Tên-phim:").replace(' ','.').replace('-',' ');
		System.out.println(text + tenPhim);
		
		text =String.format("%1$" + NUM_CHAR_PADD_LEFT +"s", "Số-vé-đã-bán:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + (soVeLon + soVeNho));
		
		text =String.format("%1$" + NUM_CHAR_PADD_LEFT +"s", "Doanh-thu:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tongThu);
		
		text =String.format("%1$" + NUM_CHAR_PADD_LEFT +"s", "Trích-phần-trăm-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + phanTramTuThien + "%");
		
		text =String.format("%1$" + NUM_CHAR_PADD_LEFT +"s", "Tổng-tiền-trích-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tuThien);
		
		text =String.format("%1$" + NUM_CHAR_PADD_LEFT +"s", "Tổng-tiền-sau-khi-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + conLai);
		
		//Example data 3d,2d - 2,2 - tien:10d,10%,1d,9d
	}
}
