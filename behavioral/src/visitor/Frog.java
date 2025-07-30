package visitor;

public class Frog implements Creature{
    public void accept(CreatureVisitor action){
        action.visitFrog(this);
    }
}
