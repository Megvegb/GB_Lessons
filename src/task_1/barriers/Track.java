package task_1.barriers;

import task_1.competitors.Participant;

public class Track implements Barriers {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}


