package card;

public class HardwareCard extends Card {
	
	int bonus;  // peut être rajouter un attribut typeBonus (mais pr l'instant en hardware on a seulement des barrettes
                // de RAM et des DD donc en Go pour les deux.


    public HardwareCard(String title,String textDescription, int bonus) {
		super(title,textDescription);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}
	
}
