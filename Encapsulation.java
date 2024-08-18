/*
 * this keyword: used for instance variables
 * Method overloading
 */

class Human {
    private int age;
    private String name;

    public Human(){ // default constructor

    }

    public Human(String name, int age) { // parameterized constructor
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Encapsulation {
    public static void main(String args[]) {
        Human h = new Human(); 
        //here a constructor is called which is created automatically, if not defined explicitly
        h.setName("Karn");
        h.setAge(22);
        // above implementation is without constructor

        Human h1 = new Human("Ashish", 22);

        System.out.println(h.getName() + " : " + h.getAge());
        System.out.println(h1.getName() + " : " + h1.getAge());
    }

}
