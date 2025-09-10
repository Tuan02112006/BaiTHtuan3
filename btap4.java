import java.util.Scanner;

public class btaptuan3 {
    public static float tienlai(int tiengoc, int thang, float lai){
        return tiengoc * ((lai/12) * thang);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiengoc, thang;
        float lai, tienlainhanduoc;

        System.out.print("Nhập số tiền gửi vào ngân hàng (VND): ");
        tiengoc = sc.nextInt();

        System.out.print("Nhập số tháng cần gửi: ");
        thang = sc.nextInt();

        System.out.print("Nhập lãi suất 1 năm của ngân hàng (%): ");
        lai = sc.nextFloat();

        tienlainhanduoc = tienlai(tiengoc, thang, lai / 100);

        System.out.println("\n===== KẾT QUẢ =====");
        System.out.printf("Tiền lãi trong vòng %d tháng: %, .2f VND\n", thang, tienlainhanduoc);
        System.out.printf("Tổng tiền gốc + lãi: %, .2f VND\n", tiengoc + tienlainhanduoc);
    }
}
