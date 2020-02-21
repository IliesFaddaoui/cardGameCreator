package card;

public class SoftwareCard extends Card{

    int bonus;
    int sizeTaken;
    int ramUsed;

    public SoftwareCard(String title,String description, int bonus, int sizeTaken, int ramUsed) {
        super(title,description);
        this.bonus=bonus;
        this.sizeTaken=sizeTaken;
        this.ramUsed=ramUsed;
    }

}
