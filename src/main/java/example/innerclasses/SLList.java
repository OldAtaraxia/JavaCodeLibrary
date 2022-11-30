package example.innerclasses;

public class SLList {
    /**
     * inner node class
     */
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    // 返回指向内部类的引用
    public IntNode getFirstIntNode() {
        return first;
    }

    /**
     * hide the naked recursive data structure
     */
    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        SLList.IntNode firstIntNode = L.getFirstIntNode();
    }

}

