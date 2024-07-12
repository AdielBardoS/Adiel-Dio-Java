
public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.ligarTv();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.mudarCanal(20);
		smartTv.diminuirCanal();
		smartTv.diminuirCanal();
		smartTv.diminuirCanal();
		smartTv.diminuirCanal();
		smartTv.diminuirCanal();
		
		
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);

	}

}
