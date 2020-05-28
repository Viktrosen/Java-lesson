public class Stats<T> {
    private T[] obj;

    public Stats(T...obj) {
        this.obj = obj;
    }

    public void display(){
        for (int i = 0; i < obj.length; i++) {
            System.out.print(this.obj[i]+" ");
        }
        System.out.println();
    }

    public void replace(int first, int second){
        T temp = this.obj[first];
        this.obj[first] = this.obj[second];
        this.obj[second] = temp;
    }
}
