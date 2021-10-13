package com.company;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//=======================================================1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
//======================================================2
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nWpisz 1 liczbe: ");
//        wynik = scan.nextInt();
//        for(int i =2;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik*=y;
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}
//============================================================3
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=abs(y);
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
//================================================================4
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        double y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = sqrt(abs(scan.nextInt()));
//            wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
//====================================================5
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nWpisz 1 liczbe: ");
//        wynik = abs(scan.nextInt());
//        for(int i =2;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik*=abs(y);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}
//=====================================================6
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=pow(y,2);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}
//====================================================7
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik1 = 0;
//        int wynik2 = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nWpisz 1 liczbe: ");
//        y = scan.nextInt();
//        wynik1+=y;
//        wynik2+=y;
//        for(int i =2;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik1+=y;
//            wynik2*=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik1+", a wynik mnożenia to: "+wynik2);
//    }
//}
//====================================================8
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==0)wynik-=y;
//            else wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
//=====================================================9
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        int silnia = 1;
//        for(int i =1;i <= x;i++){
//            silnia*=i;
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==0)wynik+=y/silnia;
//            else wynik-=y/silnia;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
//=====================================================10
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        int tab[] = new int[x];
//        for(int i =0;i < x;i++){
//            System.out.print("\nWpisz "+(i+1)+" liczbe: ");
//            y = scan.nextInt();
//            tab[i]=y;
//        }
//        for(int i = 1;i<x;i++){
//            System.out.print(tab[i]+"\n");
//        }
//        System.out.print(tab[0]);
//    }
//}
