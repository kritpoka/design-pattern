package visitor;

public class Snail implements Creature {
    public void accept(CreatureVisitor action) {
        action.visitSnail(this);
    }
}
