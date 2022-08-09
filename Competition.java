package lesson8;

public class Competition {
    private Participant [] participants;
    private Obstacle [] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }
    public void start (){
    f: for (Participant participant : participants) {
        System.out.println("Участник " + participant.getName() + " готовится к препятствиям! ");
        for (Obstacle obstacle : obstacles) {
           try {
               boolean overcome = obstacle.overcome(participant);
            if(!overcome){

            }
                continue f;
            }
           catch (MyException e) {
               System.out.println("Произошел  инцидент с участником " + participant.getName() + ": " + e.getMessage());
               continue f;
           }
        }
        System.out.println("Участник " + participant.getName() + " преодолел все препятствия! ");
    }
}}
