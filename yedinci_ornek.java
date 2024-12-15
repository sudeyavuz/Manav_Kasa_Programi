package JAVA101;
import java.util.Scanner;
public class yedinci_ornek {
    public static void main(String[] args) {
        int a , e ,d ,m ,p ;
        double af = 2.14 , ef = 3.67, df = 1.11 , mf = 0.95 , pf = 5.00 ;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("kaç kilo armut? ");
        a = input.nextInt();
        af*=a;
        System.out.println("kaç kilo elma? ");
        e = input.nextInt();
        ef*=e;
        System.out.println("kaç kilo domates? ");
        d = input.nextInt();
        df*=d;
        System.out.println("kaç kilo muz? ");
        m = input.nextInt();
        mf*=m;
        System.out.println("kaç kilo patlıcan? ");
        p = input.nextInt();
        pf*=p;
        tutar = af+ef+df+mf+pf;
        System.out.println("toplam tutar: "+tutar);


    }
}
