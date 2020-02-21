package card;

public class SkillCard extends Card {

    int bonus; // can be = 0, the benefit could be in the description.

    public SkillCard(String title,String description, int bonus) {
        super(title,description);
        this.bonus=bonus;
    }
}
