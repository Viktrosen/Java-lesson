public class Main3 {

    public static void main(String[] args) {
        Box<Orange> box1 = new Box();
        Box<Apple> box2 = new Box();

        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());

        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());


        System.out.println(box1.list.size());
        System.out.println(box2.list.size());


        box1.getWeight(box1.list.size(),box1.list.get(0).weight);
        box2.getWeight(box2.list.size(),box2.list.get(0).weight);

        System.out.println(box1.compare(box2));

        box1.replaceTo(box2);

        System.out.println(box1.list.size());
        System.out.println(box2.list.size());
    }
}
