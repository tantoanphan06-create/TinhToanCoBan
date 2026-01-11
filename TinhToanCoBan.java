package tinhtoancoban;

import java.util.Scanner;

public class TinhToanCoBan {

    public static void main(String[] a4545rgs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();

        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;

        System.out.println("Tong = " + tong);
        System.out.println("Hieu = " + hieu);
        System.out.println("Tich = " + tich);

        if (b != 0) {
            double thuong = a / b;
            System.out.println("Thuong = " + thuong);
        } else {
            System.out.println("Khong the chia cho 0");
        }
    }
}

