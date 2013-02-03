package grailshelloworld

class HelloworldController {

    def index() { 
		render "<h1>Hello World!</h1>"
	}
	
	
	
	def testme() {
		render "test string"
	}
}
