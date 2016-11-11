import com.MyLinkedList.LinkedList;

public class run {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        int myElementOne = 56;

        myList.add(myElementOne);
        myList.add(78);

        System.out.println(myList.get(1));

    }


}
