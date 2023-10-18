import java.util.Scanner;

public class MergeTwoSortedLinkedListsHR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyList list1 = new MyList();
        int length1, length2;
        MyList list2 = new MyList();
        MyList mergeList = new MyList();
        int k = sc.nextInt();
        for (int i = 0;i<k;i++) {
            length1 = sc.nextInt();
            for (int j = 0;j<length1;j++) {
                list1.append(sc.nextInt());
            }
            length2 = sc.nextInt();
            for (int j = 0;j<length2;j++) {
                list2.append(sc.nextInt());
            }
        }
        while (list1.getHead() != null||list2.getHead()!=null) {
            if (list1.getHead() != null && list2.getHead() != null) {
                if (list1.getHead().getValue() >= list2.getHead().getValue()) {
                    mergeList.append(list2.getHead().getValue());
                    list2.setHead(list2.getHead().getNext());
                }
                else {
                    mergeList.append(list1.getHead().getValue());
                    list1.setHead(list1.getHead().getNext());
                }
            }
            else if (list1.getHead() != null) {
                mergeList.append(list1.getHead().getValue());
                list1.setHead(list1.getHead().getNext());
            }
            else {
                mergeList.append(list2.getHead().getValue());
                list2.setHead(list2.getHead().getNext());
            }
        }
        System.out.println(mergeList);
    }


}
class MyNode {
    private int value;
    private MyNode next;
    MyNode (int value, MyNode next) {
        this.value = value;
        this.next = next;
    }
    int getValue() {
        return value;
    }
    MyNode getNext() {
        return next;
    }
    void setValue(int value) {
        this.value = value;
    }
    void setNext(MyNode next) {
        this.next = next;
    }
}
class MyList {
    private MyNode head = null;
    MyNode append(int value, MyNode node) {
        if (node == null) return new MyNode(value, null);
        node.setNext(append(value, node.getNext()));
        return node;
    }
    void append(int value) {
        head = append(value, head);
    }
    int removeHeadValue() {
        if (head == null) return -1;
        int headValue = head.getValue();
        head = head.getNext();
        return headValue;
    }
    public String toString() {
        return toString(head);
    }
    private String toString(MyNode node) {
        if (node==null) return "";
        return node.getValue() + " " + toString(node.getNext());
    }
    MyNode getHead() {
        return head;
    }
    void setHead(MyNode head) {
        this.head = head;
    }
}

