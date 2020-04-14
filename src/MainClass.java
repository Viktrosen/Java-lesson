public class MainClass {
    public static void main(String[] args) {
        Participants[] part1 = new Participants[3];//Создание массивов участников команд
        Participants[] part2 = new Participants[3];

        part1[0] = new Human(2,1000);//Заполняем массивы членами команд + задаём физические ограничения через конструктор
        part1[1] = new Cat(3, 300);
        part1[2] = new Robot(5, 200);

        part2[0] = new Human(4,400);
        part2[1] = new Cat(5, 300);
        part2[2] = new Robot(10, 2000);

        Wall wall = new Wall(4);//Создаём объекты препятствий + задаём их характеристики
        Track track = new Track(500);

        for (int i = 0; i < part1.length; i++) {//С помощью цикла проходим полосу препятствий
            if (wall.doIt(part1[i])) {
                track.doIt(part1[i]);
            }
        }

        for (int i = 0; i < part2.length; i++) {
            if (wall.doIt(part2[i])){
                track.doIt(part2[i]);
            }
        }
    }
}
