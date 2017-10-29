import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		float a = reader.nextFloat();
		float b = reader.nextFloat();
		float c = reader.nextFloat();
			if (a>b && a>c && b<c)
			{
			System.out.println("Najwieksza liczba to " +a +" a najmniejsza " +b);
			
			}
			else if (a>b && a>c && c<b)
			{
			System.out.println("Najwieksza liczba to " +a +" a najmniejsza " +c);

			}
			else if (b>a && b>c && a<c)
			{
			System.out.println("Najwieksza liczba to " +b +" a najmniejsza " +a);

			}
			else if (b>a && b>c && c<a)
			{
			System.out.println("Najwieksza liczba to " +b +" a najmniejsza " +c);
			
			}
			else if (c>a && c>b && a<b)
			{
			System.out.println("Najwieksza liczba to " +c +" a najmniejsza " +a);
			
			}
			else if (c>a && c>b && b<a)
			{
			System.out.println("Najwieksza liczba to " +c +" a najmniejsza " +b);
			}
	
	}	
}	


