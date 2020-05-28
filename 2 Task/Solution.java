import java.util.ArrayList;
import java.util.List;

public class Solution<T> {
    private T[]obj;
    List<T> arr;

    public Solution(T...obj) {
        this.obj = obj;
    }

    public void arrToList(){
        arr = new ArrayList<>();
        for (int i = 0; i < obj.length; i++) {
            arr.add(obj[i]);
        }
    }

    public void displayArr(){
        for (int i = 0; i < obj.length; i++) {
             System.out.print(obj[i]+" ");
        }
        System.out.println();
    }

    public void displayList(){
        System.out.println(arr);
    }
}
