public class Node {
  private String url;
  private Node next;

  public Node(String url) {
    this.url = url;
    this.next = null;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
