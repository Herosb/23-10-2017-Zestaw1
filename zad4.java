import java.util.Scanner;
public class zad4 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.println("Podaj dochod");
        double dochod = x.nextDouble();
        if (dochod < 85528) {
        	System.out.println("twój podatek:" + (dochod * 0.18 - 556.02));
        } else {
            System.out.println("Twoj podatek :" + (14839.02 + (dochod - 85528) * 0.32));
        }
	
	}

}
