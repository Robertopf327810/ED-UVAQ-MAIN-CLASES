public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedList myList = new LinkedList();

        myList.addToBeginning(1);
        myList.addToBeginning(2);
        myList.addToBeginning(3);

        myList.addToEnd(5);

        myList.showValues();
        myList.searchValue(7);
    }
}
