public class Robot implements Participants {
    int jumpLimit;
    int runLimit;

    public Robot(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public boolean run(int lim){
        if (lim<runLimit){
            System.out.println("Робот пробежал");
            return true;}
        else {
            System.out.println("Робот не сможет пробежать это расстояние");
            return false;
        }
    }

    public boolean jump(int lim){
        if(lim<jumpLimit){
            System.out.println("Робот прыгнул");
            return true;
        }
        else {
            System.out.println("Робот не сможет перепрынуть эту стену");
            return false;
        }
    }
}
