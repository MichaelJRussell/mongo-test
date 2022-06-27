package mongo.test

class FooController {
    def index() {
        respond Foo.getAll()
    }

    def save(Foo foo) {
        foo.save()

        println("${foo.dump()}")

        respond foo
    }
}
