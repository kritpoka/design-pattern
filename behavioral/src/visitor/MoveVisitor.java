package visitor;

public class MoveVisitor extends CreatureVisitor {
    @Override
    public void visitSnail(Snail snail){
        System.out.println("snail crawl");
    }

    @Override
    public void visitFrog(Frog frog){
        System.out.println("frog jump");
    }

    public void visitButterfly(Butterfly butterfly){
        System.out.println("butterfly fly");
    }
}
