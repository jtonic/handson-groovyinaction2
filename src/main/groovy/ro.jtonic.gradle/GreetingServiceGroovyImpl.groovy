package ro.jtonic.gradle

/**
 * Created by jtonic on 6/27/13.
 */
class GreetingServiceGroovyImpl implements GreetingService {
    @Override
    String greet(String name) {
        "Hello ${name ?: 'stranger'}. Greeting from Groovy!"
    }
}
