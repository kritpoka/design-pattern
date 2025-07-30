package visitor;

public class Butterfly implements Creature {
    public void accept(CreatureVisitor action) {
        action.visitButterfly(this);
    }
}
