package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach
  void init() {
    s = new ArrayStack<Integer>();
  }

  @Test
  void testPushPop() {
    assertEquals(s.isEmpty(), true);
    assertTrue(s.isEmpty());
    s.push(4);
    assertEquals(s.isEmpty(), false);
    s.push(12);
    s.push(7);
    assertEquals(s.peek(), 7);
    assertEquals(s.pop(), 7);
    assertEquals(s.pop(), 12);
    assertEquals(s.pop(), 4);
    assertEquals(s.isEmpty(), true);
    //s.pop();
  }

}
