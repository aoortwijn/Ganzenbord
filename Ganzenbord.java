import java.util.Random;

public class Ganzenbord {
	public static void main(String[] args){
		
		
		Dobbelsteen dobbelsteen1 = new Dobbelsteen();
		dobbelsteen1.werpen();
		
		Gans gans1 = new Gans();
		gans1.positie(dobbelsteen1);
		
	}
}

class Dobbelsteen{
	int uitkomst;
	void werpen() {
		Random willekeur = new Random ();
		int uitkomst = willekeur.nextInt(6);
		System.out.println(uitkomst + 1);
	}
}


class Gans{
	int positie;
	void positie(Dobbelsteen dobbelsteen) {
		int positie = 1;
		System.out.println("Je staat op vakje " + positie);
	}
}


