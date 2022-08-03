package com.org.nyp;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int islem;
        int a;
        int b;
        System.out.println("İşlem yapılacak sayıları giriniz.");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapılacak işlemi seçiniz. ");
        islem = scanner.nextInt();
        if(islem==1){
            System.out.println("Sonuç : "+ (a+b));
        }else if(islem==2){
            System.out.println("Sonuç : "+ (a-b));
        }else if (islem==3){
            System.out.println("Sonuç : "+ (a*b));
        }else if(islem==4){
            System.out.println("Sonuç : "+ (a/b));
        }


    }
}
