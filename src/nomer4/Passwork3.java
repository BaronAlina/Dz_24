package nomer4;

import nomer4.Passwork2;

import java.util.Scanner;

public class Passwork3 {
    public static void main(String[] args) {
        Passwork2 arr=new Passwork2();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        arr.prov1(s);
        char[] ar=s.toCharArray();
        arr.prov2(ar, s);
        System.out.println(arr.prov3(ar, s));
    }
}
