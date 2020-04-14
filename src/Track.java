public class Track implements Course {
    int length;
    @Override
    public boolean doIt(Participants participants){
       return participants.run(length);
    }

    public Track(int length) {
        this.length = length;
    }
}
