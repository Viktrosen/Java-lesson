public class Human implements Participants{
    int jumpLimit;
    int runLimit;

    public Human(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public boolean run(int lim){
        if (lim<runLimit){
            System.out.println("Человек пробежал");
            return true;}
        else {
            System.out.println("Человек не сможет пробежать это расстояние");
            return false;
        }
    }

    public boolean jump(int lim){
        if(lim<jumpLimit){
            System.out.println("Человек прыгнул");
            return true;
        }
        else {
            System.out.println("Человек не сможет перепрынуть эту стену");
            return false;
        }
    }

}
