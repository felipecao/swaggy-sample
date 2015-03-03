package swaggy.sample

class Person {

    String name
    String address

    static constraints = {
        name blank: false
        address maxSize: 20
    }
}
