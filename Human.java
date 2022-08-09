package lesson8;

public class Human implements Participant {
    private int run;
    private int jump;

    private int swim;
    private String name;


    public Human (String name, int run, int jump,int swim){
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;

    }
    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getSwim() {
        return swim;
    }

    @Override
    public String getName() {
        return name;
    }
}
