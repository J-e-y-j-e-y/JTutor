package homework.oop.abstract_homework.task_2;

public class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");
    private String bodyPart;

    private BodyPart(String bodyPart)
    {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString()
    {
        return this.bodyPart;
    }
}
