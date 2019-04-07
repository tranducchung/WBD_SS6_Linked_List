public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList.printList();
        for(int i=1;i<=10;i++){
            myLinkedList.addLast(i);
        }
        myLinkedList1.printList();

    }
}
