package nomer5;

import java.util.Scanner;

public class Like2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] arr=line.split(", ");
        int i=1;
        if (i==arr.length){
            System.out.println(arr[0]+" лайкнул");
        }
        i=2;
        if (i==arr.length){
            System.out.println(arr[0]+", "+arr[1]+", "+"лайкнули");
        }
        if (i<arr.length){
            int b=arr.length-i;
            System.out.println(arr[0]+", "+arr[1]+" "+"и "+b+" остальных лайкнули");
        }
    }
}
