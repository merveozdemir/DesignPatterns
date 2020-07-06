package iteratorDesignPattern.collections;

/**
 * LinkedList
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class LinkedList {

    private Node head;

    void addFirst(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    public void addFirst(Object newData) {
        addFirst(new Node(newData));
    }

    public void addLast(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }

            temp.setNextNode(newNode);
        }
    }

    public void addLast(Object newData) {
        addLast(new Node(newData));
    }


    public Node remove(Object data) {
        Node removedNode = null;

        if (isEmpty()) {
            System.out.println("Empty list !");
        } else {

            if (head.getData().equals(data)) {
                removedNode = head;
                head = head.getNextNode();
            } else {
                Node temp = head;

                while (temp.getNextNode() != null && !temp.getNextNode().getData().equals(data)) {
                    temp = temp.getNextNode();
                }

                if (temp.getNextNode() != null) {
                    removedNode = temp.getNextNode();
                    temp.setNextNode(temp.getNextNode().getNextNode());
                }
            }
        }

        return removedNode;
    }

    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNextNode();
        }

        System.out.println("null");
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.getNextNode();
        }

        return count;
    }

    public Node getHead() {
        return head;
    }
}
