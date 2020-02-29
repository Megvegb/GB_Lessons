package task_1.barriers;

import task_1.competitors.Participant;

public class Wall implements Barriers {
    private int weight;

    public Wall(int weight){
        this.weight = weight;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(weight);
    }
}
