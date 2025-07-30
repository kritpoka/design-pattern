package visitor;

public abstract class CreatureVisitor {
    abstract public void visitSnail(Snail snail);
    abstract public void visitFrog(Frog frog);
    abstract public void visitButterfly(Butterfly butterfly);
}
