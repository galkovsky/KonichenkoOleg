import java.util.Scanner;

/**
 * Created by Дмитрий on 20.02.2015.
 */
public class Index {
    public static void main (String[]args){
        System.out.println(" Type you index: ");
        int [] arr = {121,348,357,87,43,7,634,6,87,63,413,67,36,41,687,321,654,687,654687,35,8,34,87,364,87,364,867,634,687,63,4,687,65,46,87,65,46,87,36,4};
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if(index>arr.length-1||index<0){
            System.out.println(" Index doesn't exist ");

        }else{
            System.out.println(" You number is " + arr[index]);

        }

    }

}
