public class StackList {
  private Node head;

  public StackList() {
    this.head = null;
  }

  public void newUrl(String url) {
    Node newNode = new Node(url);
    newNode.setNext(head);

    head = newNode;
  }

  public void back() {
    if (head.getNext() == null) {
      System.out.println("No hay páginas para retroceder");
      return;
    }

    System.out.println("Retrocediendo a: " + head.getNext().getUrl());
    head = head.getNext();
  }

  public Node getHead() {
    return head;
  }
}