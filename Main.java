package lesson8;

public class Main {
    public static void main(String[] args) {
        Participant [] participants  = new Participant[]{
                new Human("Игорь", 15, 10, 20),
                new Human("Безымянный человек", 20, 20, 8),
                new Robot("AZT32"),
                new Cat("Мурзик", 10, 25),
                new Robot("ICR45")
        };
        Obstacle[] obstacles = new Obstacle[]{
                new Wall(10),
                new SwimmingPool(5),
                new Wall(8),
                new Treadmill(17),


        };
        Competition competition = new Competition(participants, obstacles);
        competition.start();
    }

    }
   

