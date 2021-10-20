import java.util.Scanner;
import java.util.Random;
//=======================================================1.a
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int parz = 0;
//        int nie = 0;
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//        System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        int tab[] = new int[x];
//        for(int i = 0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(tab[i] % 2 == 0)parz++;
//            if(tab[i] % 2 == 1)nie++;
//        }
//        System.out.print("parzyste: "+parz+"\nnieparzyste: "+nie);
//    }
//}
//=======================================================1.b
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int dodatnie = 0;
//        int ujemne = 0;
//        int zero = 0;
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//            System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        int tab[] = new int[x];
//        for(int i = 0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(tab[i] > 0)dodatnie++;
//            if(tab[i] < 0)ujemne++;
//            if(tab[i]==0) zero++;
//        }
//        System.out.print("dodatnie: "+dodatnie+"\nujemne: "+ujemne+"\nzera: "+zero);
//    }
//}
//=======================================================1.c
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//            System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        int najw = r.nextInt(-999,999);
//        int tab[] = new int[x];
//        int wys = 1;
//        for(int i =0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(tab[i] == najw)wys++;
//            if(tab[i] > najw){
//                najw=tab[i];
//                wys=1;
//            }
//        }
//        System.out.print("największa: "+najw+"\nilość wystąpień: "+wys);
//    }
//}
//=======================================================1.d
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//            System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        int sumad = 0;
//        int sumau = 0;
//        int tab[] = new int[x];
//        for(int i =0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(tab[i] >= 0) sumad += tab[i];
//            if(tab[i] < 0)sumau += tab[i];
//        }
//        System.out.print("suma dodatnich elementów: "+sumad+"\nsuma ujemnych elementów: "+sumau);
//    }
//}
//=======================================================1.e
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//            System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        int tab[] = new int[x];
//        int seria = 0;
//        int seriam = 0;
//        for(int i =0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(tab[i]>=0)seria++;
//            else seria = 0;
//            if(seria>seriam)seriam=seria;
//            System.out.print(tab[i]+"\n");
//        }
//        System.out.print("najdłuższy dodatni fragment tablicy: "+seriam);
//    }
//}
//=======================================================1.f
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//            System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        int tab[] = new int[x];
//        for(int i =0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(tab[i] >= 0) tab[i] = 1;
//            if(tab[i] < 0) tab[i] = -1;
//            System.out.print(tab[i]+", ");
//        }
//    }
//}
//=======================================================1.d
//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int x = 0;
//        int z = 0;
//        while(z!=1){
//            System.out.print("Wpisz n z przedziału od 1 do 100: ");
//            x = scan.nextInt();
//            if(x > 0 && x < 101)z = 1;
//        }
//        System.out.print("lewy: ");
//        int lewy = scan.nextInt() - 1;
//        System.out.print("prawy: ");
//        int prawy = scan.nextInt() - 1;
//        int dlu = prawy - lewy + 1;
//        int tab[] = new int[x];
//        int tab2[] = new int[dlu];
//        for(int i =0;i < x;i++){
//            tab[i] = r.nextInt(-999,999);
//            if(i>=lewy && i<=prawy)tab2[i-lewy] = tab[i];
//            System.out.print(tab[i]+"\n");
//        }
//        System.out.print("===============\n");
//        for(int i = 0;i<dlu;i++){
//            tab[lewy+i] = tab2[dlu - i - 1];
//        }
//        for(int i = 0;i<x;i++){
//            System.out.print(tab[i]+"\n");
//        }
//    }
//}
