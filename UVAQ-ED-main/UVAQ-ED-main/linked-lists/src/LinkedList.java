public class LinkedList {

  Node head;

  public LinkedList() {
    this.head = null;
  }

  public void addToBeginning(int value) {
    
    Node node = new Node(value);
    node.setNext(head);
    head = node;

  }

  public void addToEnd(int value) {

    Node node = new Node(value);
    Node tmp = head;

    while (tmp.getNext() != null) {
      tmp = tmp.getNext();
    }
    tmp.setNext(node);

  }

  public void searchValue(int value) {

    int cont = 0;
    Node tmp = head;

    while (tmp != null) {
      if (tmp.getValue() == value) {
        System.out.println("Found on position: " + cont);
        return;
      }

      tmp = tmp.getNext();
      cont++;
    }

    System.out.println("Value not found");
  }

  public void showValues() {

    Node tmp = head;
    
    while (tmp != null) {
      System.out.println("Value: " + tmp.getValue());

      tmp = tmp.getNext();
    }

  }
}
