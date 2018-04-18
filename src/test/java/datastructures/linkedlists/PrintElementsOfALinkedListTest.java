package datastructures.linkedlists;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrintElementsOfALinkedListTest {

  PrintElementsOfLinkedList linkedListPrinter = new PrintElementsOfLinkedList();

  @Test
  public void givenANullListShouldPrintNothing() {
    assertEquals("", linkedListPrinter.print(null));
  }

  @Test
  public void shouldPrintAllTheElementsOfTheList() {
    LinkedList<Node> list = getNonEmptyLinkedList();

    assertEquals("3\n2\n1\n", linkedListPrinter.print(list.getFirst()));
  }

  private LinkedList<Node> getNonEmptyLinkedList() {
    LinkedList<Node> list = new LinkedList<>();
    Node tail = new Node(3, null);
    Node middle = new Node(2, tail);
    Node head = new Node(1, middle);
    list.addFirst(head);
    list.add(middle);
    list.add(tail);
    return list;
  }
}
