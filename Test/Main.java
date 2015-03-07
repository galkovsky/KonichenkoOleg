import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some value as y"+'\n');
        int y = scan.nextInt();
        System.out.println("Enter some value as x"+ '\n');
        int x = scan.nextInt();
        int sum=x+y;
        int dif = x-y;
        int mult = x*y;
        double div = (double)x/y; //\\ Молодец, правильно сделала
        double rootx; //\\ ты можешь объявлять переменную на той строке, где будешь записывать в нее данные. Это чуть красивее )
        double rooty;
        rootx=Math.sqrt( (double)x);
        rooty=Math.sqrt( (double)y);
        double exp1 = Math.pow((double)x, (double)y);
        double lg = Math.log((double)sum);

        System.out.println("This is sum of x and y  "+ sum);
        System.out.println("This is difference between x and y  "+dif);
        System.out.println("This is multiplication of x and y  "+mult);
        System.out.println("This is division from x and y  "+div);
        System.out.println("This is a root from x  "+ rootx);
        System.out.println("This is a root from y  "+ rooty);
        System.out.println("This is a exponent x and y  "+ exp1);
        System.out.println("This is a logarithm of sum  "+ lg);
    }
}
