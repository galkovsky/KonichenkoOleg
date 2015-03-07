import java.io.IOException;
import java.io.Writer;
import java.util.*;


	
public class Calculyator {
    
        public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		double var1=4;
		double var2=5;
        System.out.println("Vvedite pervoe chislo\n");
		if (scan.hasNextDouble()) {
		var1=scan.nextDouble();}
		else {System.out.println("Nekorrektnue dannue\n");};
		System.out.println("Vvedite vtoroe chislo\n");
		if (scan.hasNextDouble()) {
		var2=scan.nextDouble();}
		else {System.out.println("Nekorektnue dannue\n");};
		System.out.println("Vvedite dejstvie:\n");
		System.out.println("+ - SYMMA\n");
		System.out.println("- - RAZNITSA\n");
		System.out.println("/ - DELENIE\n");
		System.out.println("* - UMNOZHENIE\n");
		String strok=scan.next();
		char[] stroka=strok.toCharArray();
		char dejstvie=stroka[0];
		double Resultat;
		switch (dejstvie) {
		case '+': Resultat=var1+var2;  System.out.println(Resultat); break;
		case '-': Resultat=var1-var2;   System.out.println(Resultat); break;
		case '/': Resultat=var1/var2;   System.out.println(Resultat); break;
		case '*': Resultat=var1*var2;   System.out.println(Resultat); break;
		default: System.out.println("DEJSTVIE VVEDENO NEVERNO!"); break;}
      
} }