package grailshelloworld



import grails.test.mixin.*
import org.junit.*
import org.springframework.stereotype.Controller;

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloworldController)
class HelloworldControllerTests {

    void testSomething() {
       controller.index()
	   assert response.text == 'Hello World! fail'
    }
}
