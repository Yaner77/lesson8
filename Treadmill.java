package lesson8;

public class Treadmill implements Obstacle {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }
    public boolean overcome(Participant participant) throws MyException {
        int run = participant.getRun();
        if (run >= distance) {
            System.out.println(participant.getName() + " пробежал расстояние длиной  " + distance);
            return true;
        }
        System.out.println(participant.getName() + " не смог пробежать расстояние длиной " + distance);
        return false;
    }
}
