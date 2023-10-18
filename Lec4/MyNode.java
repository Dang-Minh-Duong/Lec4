public class MyNode {
    private MyNode next;
    private String data;
    MyNode (String data, MyNode next) {
        this.data = data;
        this.next = next;
    }
    String getData() {
        return data;
    }
    void setData(String data) {
        this.data = data;
    }

    void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getNext() {
        return next;
    }
}

