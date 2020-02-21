package card;

public class OSCard extends Card {

    String advantages;
    String drawbacks;

    public OSCard(String title,String description, String advantages, String drawbacks) {
        super(title,description);
        this.advantages=advantages;
        this.drawbacks=drawbacks;
    }
}
