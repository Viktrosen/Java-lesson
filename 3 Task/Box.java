import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> list;
    private float weight;

    public Box() {
        this.list = new ArrayList<>(10);
    }

    public void replaceTo(Box box){
        box.list.addAll(this.list);
        this.list.clear();
    }

    public void getWeight(int s, float w) {
        this.weight = s*w;
        System.out.println(this.weight);

    }

    public boolean compare(Box box){
        if (this.weight==box.weight){return true;}
        return false;
    }

    public void add(T obj){
        list.add(obj);
    }

}
