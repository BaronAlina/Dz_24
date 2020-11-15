package nomer3;

import java.util.Scanner;

public class Country {
    final static String russian = "Привет";
    final static String english = "Hello";
    final static String french = "Bonjour";
    final static String spanish = "Hola";
    final static String arab = "مرحبا";
    final static String chinese = "你好";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String language= sc.nextLine();
        switch (language){
            case "russian":
                System.out.println(russian);
                break;
            case "english":
                System.out.println(english);
                break;
            case "french":
                System.out.println(french);
                break;
            case "spanish":
                System.out.println(spanish);
                break;
            case "arab":
                System.out.println(arab);
                break;
            case "chinese":
                System.out.println(chinese);
                break;
        }
    }
}
