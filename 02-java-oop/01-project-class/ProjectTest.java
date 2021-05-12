public class ProjectTest {
    public static void main(String[] args) {
        Project one = new Project();
        one.setName("Project1");
        one.setDescription("this is project one");
        System.out.println(one.elevatorPitch());

        Project two = new Project("Project2");
        two.setDescription("this is project two");
        System.out.println(two.elevatorPitch());

        Project three = new Project("Project3", "this is project three");
        System.out.println(three.elevatorPitch());

        System.out.println(two.getName());
        System.out.println(three.getDescription());

        one.setName("NewProjectOne");
        one.setDescription("I'm using setter for this");
        System.out.println(one.elevatorPitch());

    }

}
