package datastructures.linkedlists;

import java.util.List;

public class PrintElementsOfLinkedList {
  public String print(Node head) {
    if (head == null) {
      return "";
    }
    return printUntilTale(head);
  }

  private String printUntilTale(Node node) {
    String output= "";
    printOuput(String.valueOf(node.data));
    if (node.next != null) {
      output += printUntilTale(node.next);
    }
    output += node.data + "\n";
    return output;

  }


  private void printOuput(String output) {
    if (output != null && output != "") {
      System.out.println(output);
    }
  }

}
