import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập số thứ nhất: ");
            double a = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Nhập số thứ hai: ");
            double b = Double.parseDouble(sc.nextLine().trim());

            double sum = a + b;
            double diff = a - b;
            double prod = a * b;

            System.out.println();
            System.out.printf("Tổng: %.6f%n", sum);
            System.out.printf("Hiệu (a - b): %.6f%n", diff);
            System.out.printf("Tích: %.6f%n", prod);

            if (b == 0.0) {
                System.out.println("Thương: Không xác định (chia cho 0)");
            } else {
                double quot = a / b;
                System.out.printf("Thương (a / b): %.6f%n", quot);
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
        } finally {
            sc.close();
        }
    }
}
