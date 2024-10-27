package Object_Oriented_Programming.Encapsulation.Getters_and_Setters;

class Agent {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class sample {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setName("Vinod");
        System.out.println("The name of the agent is "+agent.getName());
    }
}
