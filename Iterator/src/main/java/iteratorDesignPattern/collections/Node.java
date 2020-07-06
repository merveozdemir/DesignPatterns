package iteratorDesignPattern.collections;

/**
 * Node
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class Node {

    private Object data;
    private Node nextNode;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
