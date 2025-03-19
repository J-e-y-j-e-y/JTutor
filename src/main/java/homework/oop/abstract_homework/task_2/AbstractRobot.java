package homework.oop.abstract_homework.task_2;

import java.util.Random;

public class AbstractRobot {
    long seed = System.nanoTime();
    Random random = new Random(seed);
    private static int hitCount;
    private String name;
    private String team;

    public AbstractRobot(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public BodyPart attack() {
        if (!(this instanceof Attackable)) {
            return null;
        }

        BodyPart attackedBodyPart = null;
        hitCount = random.nextInt(4) + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        if (!(this instanceof Defensable)) {
            return null;
        }

        BodyPart defencedBodyPart = null;
        hitCount = random.nextInt(4) + 1;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defencedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }

    public Object getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
