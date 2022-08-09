package lesson8;

public class Cat implements Participant {
    private int run;
    private int jump;

    private String name;


    public Cat (String name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;

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
    public int getSwim() throws MyException {
        throw new MyException ("Коты не плавают! ");

    }

    @Override
    public String getName() {
        return name;
    }
}
