import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double x = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int dis;
        int d = (int) Math.pow(b, 2);
        double koren;

        double koreni;

        // System.out.println(d);
        dis =  d - 4*a*c;
        System.out.println( "dis" + " = " + d + " - " + 4*a*c);
        System.out.println("dis" + " = " + (d - 4*a*c));
        if (dis > 0){
            x = Math.sqrt(dis);
            System.out.println(x + " корень из дискременанта");
            double oneKoren = (int) (-b + x);
            double surok = 2 * a;
            koren = oneKoren/surok;

            double twoKoren = (int) (-b - x);

            koreni = twoKoren/surok;

            System.out.println(koren);
            System.out.println(koreni);
        }
        if (dis == 0){
            double oneKoren = (int) (-b + x);
            double surok = 2 * a;
            koren = oneKoren/surok;
            System.out.println(koren);

        }
        if (dis < 0){
            System.out.println(dis + " < " + "0");
            System.out.println(" нет корней");
        }







    }
}