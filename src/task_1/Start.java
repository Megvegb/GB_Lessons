/**
 * @Autor Medvedev Vladimir
 * @Group GU_Android_394
 */

package task_1;

import task_1.barriers.Barriers;
import task_1.barriers.Track;
import task_1.barriers.Wall;
import task_1.competitors.*;

import java.util.Scanner;

public class Start {
    private static final int COUNT = 3;


    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Иван"),
                new Sportsman("Макс", 3000, 4),
                new Cat("Барсик"),
                new Bot("Нано")
        };

        Barriers[] barriers = {
                new Track(1000),
                new Wall(1),
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                barriers[j].doIt(participants[i]);
                if (!participants[i].isOnDistance()) {
                    break;
                }
            }
        }

        for (Participant prtc : participants)
            prtc.info();
    }
}

