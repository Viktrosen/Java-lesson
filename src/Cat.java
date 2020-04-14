public class Cat implements Participants {
    int jumpLimit;
    int runLimit;

    public Cat(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public boolean run(int lim){
        if (lim<runLimit){
            System.out.println("Кот пробежал");
            return true;}
        else {
            System.out.println("Кот не сможет пробежать это расстояние");
            return false;
        }
    }

    public boolean jump(int lim){
        if(lim<jumpLimit){
            System.out.println("Кот прыгнул");
            return true;
        }
        else {
            System.out.println("Кот не сможет перепрынуть эту стену");
            return false;
        }
    }
}
