class Person {
    private String name;

    public Person(String john) {
        name = john;
    }
    // returns the person's name
    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String passedName) {
        name = passedName;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + getName() + "!");
    }

//    public static void main(String[] args) {
//        Person john = new Person();
//        john.setName("John");
//        john.sayHello();
//    }
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}