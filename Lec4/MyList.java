import edu.princeton.cs.algs4.StdOut;

public class MyList {
    static MyNode head = null;
    void printDataNote(MyNode head) {
        MyNode tmp = head;
        while (tmp != null) {
            StdOut.print(tmp.getData());
            tmp = tmp.getNext();
            if (tmp != null) StdOut.print("->");
            else StdOut.println();
        }

    }
    /*MyNode addFirst(MyNode head, String data) {
        MyNode newNode = new MyNode(data);
        if (head != null) newNode.setNext(head);
        return newNode;
    }*/
    private MyNode append(MyNode node, String data) {
        if (node == null) return new MyNode(data, null);
        node.setNext(append(node.getNext(), data));
        return node;
    }
    void append(String data) {
        head = append(head, data);
    }
    /*void removeFirst(String data) {
        if (head == null) return;
        if (head.getData().equals(data)) {
            head = head.getNext();
            return;
        }
        MyNode node = head;
        while (node.getNext()!=null&&!node.getNext().getData().equals(data)) {
            node = node.getNext();
        }
        if (node.getNext() != null) {
            node.setNext(node.getNext().getNext());
        }
    }*/
    void removeFirst(String data) {
        head = removeFirst(head, data);
    }
    private MyNode removeFirst(MyNode node, String data) {
        if (node == null) return null;
        if (node.getData().equals(data)) return node.getNext();
        node.setNext(removeFirst(node.getNext(), data));
        return node;
    }
    void removeAll(String data) {
        //if (head == null) return;
        MyNode node = head;
        while(node!=null && node.getData().equals(data)) {
            node
        }
    }

    public String toString() {
        return "[" + toString(head) + "]";
    }
    private String toString(MyNode node) {
        if (node==null) return "";
        return node.getData() + " " + toString(node.getNext());
    }
    public static void main(String[] args) {
        MyList list = new MyList();
        list.append("zero");
        list.append("one");
        list.append("two");
        list.append("three");
        list.append("zero");
        StdOut.print(list);
        list.removeFirst("two");
        StdOut.print(list);

    }
}
