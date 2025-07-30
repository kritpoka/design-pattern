package visitor;

public interface Creature {
    void accept(CreatureVisitor visitor);
}
