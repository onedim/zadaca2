import java.util.Scanner;


public class Jaja_podjela_na_tuce {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesi broj jaja");
		int brJaja=unos.nextInt();
		int korpaJaja=brJaja/144;
		int tuceJaja=(brJaja%144)/12;
		int ostatJaja=(brJaja%144)%12;
		System.out.println(korpaJaja);
		System.out.println(tuceJaja);
		System.out.println(ostatJaja);
	}

}
