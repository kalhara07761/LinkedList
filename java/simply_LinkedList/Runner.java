

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // list : 10 -> 65 -> 89 -> 78

        list.insert(10);
        list.insert(65);
        list.insert(89);
        list.insert(78);

        //list.insertAtStart(99);

        //list.insterAt(60, 3);
        //list.insterAt(23, 0);
        list.delete(2);
        list.print();
    }
    
}
