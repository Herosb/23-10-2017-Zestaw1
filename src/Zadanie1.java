import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float x = reader.nextFloat();
        float y = 1.8f * x + 32.0f;
        System.out.println(y);
	}

}
