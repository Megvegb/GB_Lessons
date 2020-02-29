package task_1.competitors;

public class Cat implements Participant {
    private String type = "Кот";
    private String name;
    private int maxRunDist;
    private int maxJumpHgt;
    private boolean onDistance;


    public Cat(String name, int maxRunDist, int maxJumpHgt) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHgt = maxJumpHgt;
        this.onDistance = true;
    }

    public Cat(String name) {
        this.name = name;
        this.maxRunDist = 500;
        this.maxJumpHgt = 5;
        this.onDistance = true;
    }

    public boolean isOnDistance() {
        return onDistance;
    }


    @Override
    public void run(int length) {
        String result;
        if (maxRunDist >= length)
            result = "пробежал";
        else if (maxRunDist < 0)
            result = "побежал в обратную сторону";
        else {
            result = "не пробежал";
            onDistance = false;
        }
        printInfo(result);
    }

    @Override
    public void jump(int height) {
        String result;
        if (maxJumpHgt >= height)
            result = "перепрыгнул";

        else if (maxJumpHgt < 0)
            result = "пролез под препятствием";
        else {
            result = "не допрыгнул";
            onDistance = false;
        }
        printInfo(result);
    }

    @Override
    public void printInfo(String result) {
        System.out.println(type + " " + name + " - " + result);
    }

    @Override
    public void info(){
        System.out.println(name + " " + onDistance);
    }

}

