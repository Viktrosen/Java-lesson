public class Main {
    public static void main(String[] args) {
        Stats<Integer> stats = new Stats<>(1, 2, 4, 5, 6, 8);
        stats.display();
        stats.replace(2,4);
        stats.display();
    }
}
