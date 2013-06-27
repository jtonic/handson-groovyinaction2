package ro.jtonic.gradle

import org.junit.{Before, Assert, Test}

/**
 * Created by jtonic on 6/28/13.
 */
class GreetingServiceScalaTest {

  @Before def setUp() {
    println("Before")
  }

  @Test
  def testSimple() {
    val greet: String = GreetingServiceScalaImpl.greet("jtonic")
    println (greet)
    Assert.assertEquals("Hello jtonic. Greeting from Scala!", greet)
  }

}
