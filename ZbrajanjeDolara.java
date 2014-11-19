//Zbir sitnisa za dolar

import java.util.Scanner;

public class ZbrajanjeDolara {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesi broj penny-a");
		int brPenny=unos.nextInt();
		int izPenny=brPenny;															//001
		System.out.println("Unesi broj Nickel-a");
		int brNickel=unos.nextInt();
		int izNickel=brNickel*5;														//005
		System.out.println("Unesi broj Dime-a");
		int brDime=unos.nextInt();
		int izDime=brDime*10;															//010
		System.out.println("Unesi broj Quarter-a");
		int brQuarter=unos.nextInt();
		int izQuarter=brQuarter*25;													//025
		double dolar=((izPenny+izNickel+izDime+izQuarter)*0.01);		//zbir * 0.01
		int zbir=izPenny+izNickel+izDime+izQuarter;
		System.out.println("Iznos u dolarima je "+dolar);
		System.out.println (zbir);
	}

}
//nadodaje mali iznos cudno