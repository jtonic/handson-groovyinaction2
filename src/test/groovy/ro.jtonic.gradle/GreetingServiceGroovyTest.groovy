package ro.jtonic.gradle

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by jtonic on 6/27/13.
 */
class GreetingServiceGroovyTest {

    GreetingService greetingService

    @Before void setUp() {
        greetingService = new GreetingServiceGroovyImpl()
    }

    @Test void testGreet() {
        def greet = greetingService.greet('jtonic')
        Assert.assertEquals('Hello jtonic. Greeting from Groovy!', greet)
    }

}
