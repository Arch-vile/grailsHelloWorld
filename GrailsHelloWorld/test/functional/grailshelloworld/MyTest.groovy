package grailshelloworld;

import geb.junit4.GebTest
import org.junit.Test
import geb.*

class MyTest extends GebTest {
    void testIndexSearch() {
        go('/GrailsHelloWorld/helloworld')
        assert $("h1").text() == "Hello World!"
    }
}