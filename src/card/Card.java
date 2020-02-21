package card;

public abstract class Card {
	
	protected String textDescription;
	protected String title;

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public Card(String title,String textDescription) {

	    this.textDescription = textDescription;
	    this.title=title;
	}
	
	public static void main(String[] args) {
		System.out.println("Yo" +
                "Je comptais faire un objet \"board\" ou je sais pas comment on pourrait" +
                "l'appeler, qui contiendrait 8 ou 10 cartes et dans chaque board on ajoute 10 cartes" +
                "que l'on aura construit au préalable. L'objet board contient une méthode qui génère " +
                "un pdf contenant les 8/10 cartes, faudra faire pas mal de test avec les positions " +
                "absolues et/ou relative");
	}
	
}
