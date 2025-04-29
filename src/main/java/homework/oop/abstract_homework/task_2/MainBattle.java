package homework.oop.abstract_homework.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MainBattle {
    static int greenScore = 0;
    static int redScore = 0;

    public static void main(String[] args) {
        Random random = new Random();

        List<AbstractRobot> greenTeam = new ArrayList<>();
        String greenTeamFlag = "GREEN";
        AbstractRobot blitz = new RobotAttacker("Blitz", greenTeamFlag);
        AbstractRobot galaxy = new RobotDefender("Galaxy", greenTeamFlag);
        greenTeam.add(blitz);
        greenTeam.add(galaxy);

        List<AbstractRobot> redTeam = new ArrayList<>();
        String redTeamFlag = "RED";
        AbstractRobot wortex = new RobotDefender("Wortex", redTeamFlag);
        AbstractRobot mehano = new RobotAttacker("Mehano", redTeamFlag);
        redTeam.add(wortex);
        redTeam.add(mehano);

        for(int i = 0; i < Math.min(greenTeam.size(), redTeam.size()); i++) {
            AbstractRobot greenRobot = greenTeam.get(i);
            AbstractRobot redRobot = redTeam.get(i);

            boolean whoIsFirst = random.nextBoolean();
            if (whoIsFirst) {
                duel(greenRobot, redRobot);
                duel(redRobot,greenRobot);
            }else {
                duel(redRobot,greenRobot);
                duel(greenRobot, redRobot);
            }
        }

        System.out.println("Результат битвы роботов: GREEN = " + greenScore + " RED = " + redScore);
        if(greenScore > redScore) {
            System.out.println("GREEN team выиграли");
        } else if (redScore > greenScore) {
            System.out.println("RED team выиграли");
        } else System.out.println("Победила дружба :)");
    }

    public static void duel(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        if (Objects.isNull(attacked)) {
            System.out.println(robotFirst + " не атакующий робот");
        } else {
            BodyPart defenced = robotFirst.defense();
            if (Objects.isNull(defenced)) {
                if ("GREEN".equals(robotFirst.getTeam())) {
                    greenScore++;
                } else {
                    redScore++;
                }
                System.out.println(String.format("%s атаковал робота %s, атакована %s",
                        robotFirst, robotSecond, attacked));
                return;
            }
            System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
            robotFirst, robotSecond, attacked, defenced));
            if (attacked != defenced) {
                if ("GREEN".equals(robotFirst.getTeam())) {
                    greenScore++;
                } else {
                    redScore++;
                }
            }
        }
    }
}
