package visitor;

public class Main {
    public static void main(String[] args) {
        Creature[] creatures = {
                new Snail(),
                new Frog(),
                new Butterfly()
        };

        CreatureVisitor moveVisitor = new MoveVisitor();

        for(Creature creature : creatures) {
            creature.accept(moveVisitor);
        }
    }
}
