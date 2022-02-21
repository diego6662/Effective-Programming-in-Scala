import org.junit.Test
import org.junit.Assert.*

class Test1:
  @Test def t1(): Unit = 
    assertEquals("I was compiled by Scala 3. :)", msg)

  @Test def t2(): Unit =
    assertEquals(2,r2.area)
