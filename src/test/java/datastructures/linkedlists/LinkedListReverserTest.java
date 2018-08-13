package datastructures.linkedlists;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LinkedListReverserTest {

  LinkedListReverser reverser;


  @Before
  public void setup(){

    List<Node> listToReverse = new ArrayList<>();

    reverser = new LinkedListReverser(listToReverse);
  }

  @Test
  public void thelistIsReversed() {

  }



}
