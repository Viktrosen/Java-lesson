public class Wall implements Course{
    int height;
    @Override
    public boolean doIt(Participants participants){
        return participants.jump(height);
    }

    public Wall(int height) {
        this.height = height;
    }
}
