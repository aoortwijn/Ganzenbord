import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {	
	public static void main(String[] args){		
		Scanner scanner = new Scanner(System.in);
		Bord ganzenbord = new Bord();
		
		ganzenbord.zetten(ganzenbord.ganzen);
		
	}


}


class Bord{
	Gans[] ganzen = new Gans[3];
	Dobbelsteen dobbelsteen1 = new Dobbelsteen();
	
	Bord() {
		ganzen[0] = new Gans("Rood");
		ganzen[1] = new Gans("Geel");
		ganzen[2] = new Gans("Blauw");
		
	}
	void zetten (Gans[] gans1) {
		Scanner scanner = new Scanner(System.in);
		for(int x = 0; x < 10 ; x++) {
			for(int y = 0 ; y < gans1.length ; y++) {
			dobbelsteen1.werpen();	
			gans1[y].lopen(dobbelsteen1);
			System.out.println("Nog een keer gooien toets G");
			System.out.println("Stop met gooien toets Q");
			String invoer = scanner.next();
			if (invoer.equals("Q")) {
				break;
			} else if(invoer.equals("G")) {
			}		
			}
		}
	}
}

class Dobbelsteen{
	int uitkomst;
	void werpen() {
		Random willekeur = new Random ();
		
		uitkomst = willekeur.nextInt(6) + 1;
		System.out.println("De dobbelsteen werpt: "+ uitkomst);
	}

}

class Gans{
	int positie;
	String kleur;
	Gans(String kleur){
		this.kleur = kleur;
	}
	void lopen(Dobbelsteen dobbelsteen) {
		positie = positie + dobbelsteen.uitkomst;
		System.out.println(kleur+": Je staat op vakje: " + positie);
		if(positie == 3) {
			System.out.println("Ga terug naar start");
			positie = 1;
		}else if (positie == 5) {
			int positie2 = positie + dobbelsteen.uitkomst;
			System.out.println("Bonusstapjes! Je staat op vakje: " + positie2); 
			positie = positie2;
			
		}
	}
}