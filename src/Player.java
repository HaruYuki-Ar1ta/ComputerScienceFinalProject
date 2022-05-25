public class Player {
    private Space space;
    private int order;
    public Player(Space space, int order){
        this.space = space;
        this.order = order;
    }

    public Space getSpace() {
        return this.space;
    }
}
