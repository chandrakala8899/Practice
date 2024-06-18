package Project.Model;



import java.util.List;

public class Node {
    public String key;
    public String label;

    public List<Node> children;


    @Override
    public String toString() {
        return "Node{\n" +
                " key='" + key + '\'' +",\n"+
                " label='" + label + '\'' +",\n"+
                " children=" + children +"\n"+
                '}';
    }
}