package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;

//=====================================================================1.a
//public class Main {
//    public static int countChar(String str,char c){
//        int wynik = 0;
//        for(int i = 0; i < str.length() - 1;i++){
//            if(str.charAt(i) == c) wynik++;
//        }
//        return wynik;
//    }
//    public static void main(String[] args){
//        String str = "aabbccdd";
//        char a = 'a';
//        System.out.print("Ilość wystąpień litery a: "+countChar(str,a));
//    }
//}
//=====================================================================1.b
//public class Main {
//    public static int countSubStr(String str, String subStr){
//        int ciag = 0;
//        int wynik = 0;
//        int x = 0;
//        for(int i = 0; i < str.length();i++){
//            if(str.charAt(i) == subStr.charAt(x)){
//                ciag++;
//                x++;
//            }
//            else{
//                ciag = 0;
//                x = 0;
//            }
//            if(ciag==subStr.length()){
//                wynik++;
//                x = 0;
//                ciag=0;
//            }
//        }
//        return wynik;
//    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String str;
//        String subStr;
//        str = scan.next();
//        subStr = scan.next();
//        System.out.print("Ilość wystąpień ciągu znaków aa: "+countSubStr(str,subStr));
//    }
//}
//=====================================================================1.c
//public class Main {
//    public static String Stringmiddle(String str){
//        String wynik = "";
//        if(str.length()%2==0){
//            wynik += str.charAt(str.length()/2 - 1);
//            wynik += str.charAt(str.length()/2);
//        }
//        else wynik+= str.charAt(str.length()/2);
//        return wynik;
//    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String str;
//        str = scan.next();
//        System.out.print("Srodkowe litery/a: "+Stringmiddle(str));
//    }
//}
//=====================================================================1.d
//public class Main {
//    public static String repeat(String str, int n){
//        String wynik = "";
//        for(int i = 0;i < n;i++){
//            wynik+=str;
//        }
//        return wynik;
//    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String str;
//        int n;
//        str = scan.next();
//        n = scan.nextInt();
//        System.out.print("Wynik fukncji: "+repeat(str,n));
//    }
//}
//=====================================================================1.e
//public class Main {
//    public static int[] where(String str, String subStr){
//        int tab[] = new int[str.length()];
//        int ciag = 0;
//        int x = 0;
//        for(int i = 0; i < str.length();i++){
//            if(str.charAt(i) == subStr.charAt(x)){
//                ciag++;
//                tab[i] = 0;
//            }
//            else{
//                tab[i] = 0;
//            }
//            if(ciag==subStr.length()){
//                x = 0;
//                ciag=0;
//                for(int z = 0 ; z > subStr.length() * -1;z--){
//                    tab[i+z] = 1;
//                }
//            }
//        }
//        return tab;
//    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String str;
//        String subStr;
//        str = scan.next();
//        subStr = scan.next();
//        int tab[] = new int[str.length()];
//        tab = where(str,subStr);
//        for(int i = 0;i<str.length();i++){
//            System.out.print(tab[i]+" ");
//        }
//    }
//}
//=====================================================================1.f
public class Main {
    public static String change(String str){
        StringBuffer sb = new StringBuffer();
        String wynik = "";
        for(int i = 0;i < n;i++){
            wynik += str;
        }
        return wynik;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.next();
        System.out.print("Wynik fukncji: "+change(str));
    }
}
