package baitap2;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao canh a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap vao canh b: ");
        double b = sc.nextDouble();

        double chuVi = (a + b) * 2;
        double dienTich = a * b;

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
        
        sc.close();
    }
}