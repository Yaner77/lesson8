package lesson8;

public class SwimmingPool implements Obstacle {

    private int distance;

    public SwimmingPool (int height) {
        this.distance = height;
    }

    @Override
    public boolean overcome(Participant participant) throws MyException {
        int swim = participant.getSwim();
        if (swim >= distance) {
            System.out.println(participant.getName() + " проплыл через бассейн длиной " + distance);
            return true;
        }
        System.out.println(participant.getName() + " не смог проплыть через бассейн длиной  " + distance);
        return false;
    }
}
