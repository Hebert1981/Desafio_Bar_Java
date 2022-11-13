package entities;

public class Bill { // MEMBROS
	
	// CONSTANTES ESTATICAS
	
	public static int COVER = 4;
	public static int PRECOBEER = 5;
	public static int PRECOBARBECUE = 7;
	public static int PRECOSOFTDRINK = 3;
	public static int INGRESSOHOMEN = 10;
	public static int INGRESSOMULHER = 8;
	
	
	
	// ATRIBUTOS
	
	public char gender;
	public int beer;
	public int barbecue ;
	public int softDrink ;
	
	
	// METODOS
	
	public double feeding() {
		return (beer*PRECOBEER) + (barbecue*PRECOBARBECUE) + (softDrink*PRECOSOFTDRINK); 
		
	}
	
	
	
	public double cover() {
		return COVER;
		
	}
	
	
	public double ticket() {
		if (this.gender == 'M' ) {
			return INGRESSOHOMEN;
		}
		else if(this.gender == 'm'){
			return INGRESSOHOMEN;
		}else if(this.gender == 'F') {
			return INGRESSOMULHER;
		}
		else {
			return INGRESSOMULHER;
		}
	}
	
	
	
	
	
	public double total() {
		if(feeding() > 30) {
			return feeding()+ ticket();	
		}
		return feeding()+ ticket()+cover();	
		
	}
		
		
	public String gender() {
		// TODO Auto-generated method stub
		return null;
	}
}

