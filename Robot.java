package lesson8;

public class Robot implements Participant {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRun() {
        return 0;
    }

    @Override
    public int getJump() {
        return 0;
    }

    @Override
    public int getSwim() {
        return 0;
    }
}
