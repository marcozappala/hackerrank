package datastructures.linkedlists;


public class Node {
  int data;
  Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
