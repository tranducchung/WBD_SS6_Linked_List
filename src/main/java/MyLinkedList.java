public class MyLinkedList {
    private int size = 0;
    private Node head = null;
    private Node tail = null;
    private Node headc = null;
    private Node tailc = null;

    MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    MyLinkedList() {
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(Object data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Object data) {
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else if (index > 0 && index < size) {
            Node newNode = new Node(data);
            Node temp = head;
            Node current;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            current = temp.next;
            temp.next = newNode;
            newNode.next = current;
            size++;
        }
        if (index < 0 || index > size) {
            System.out.println("Index = " + index + " Size = " + getSize());
        }
    }

    public int remove1(int index) {
        if (index == 0) {
            head = head.next;
            size--;
        } else if (head == null) {
            System.out.println("List Empty");
            return -1;
        } else if (index > 0 && index < size) {
            Node temp = head;
            Node current;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            current = temp.next.next;
            temp.next = current;
            size--;
        } else if (index < 0 || index >= size) {
            System.out.println("Index = " + index + " Size = " + getSize());
            return -1;
        }
        return 1;
    }

    public int remove2(Object data) {
        Node temp = head;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (temp.getData() == data) {
                index = i;
                break;
            } else {
                index = -1;
            }
            temp = temp.next;
        }
        return remove1(index);
    }

    public String Contains(Object data) {
        Node temp = head;
        String result = "";
        for (int i = 0; i < size; i++) {
            if (temp.getData() == data) {
                result = "Element = " + temp.getData() + " have in List";
                break;
            }
            temp = temp.next;
        }
        return result;
    }

    public String indexOf(Object data) {
        Node temp = head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (temp.getData() == data) {
                index = i;
                break;
            }
            temp = temp.next;
        }
        if (index == -1) {
            return "Element " + data + " is not in List";
        } else {
            return "Element " + data + " have a index = " + index;
        }
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + i + " = " + temp.getData());
            temp = temp.next;
        }
    }


    public Object Data(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public int getSize() {
        return this.size;
    }


}
