package ro.jtonic.gradle

/**
 * Created by jtonic on 6/28/13.
 */
object GreetingServiceScalaImpl extends GreetingService {
  def greet(name: String): String = "Hello " + name + ". Greeting from Scala!"
}
