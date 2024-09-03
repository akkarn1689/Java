/*
 * 
 * all the variables in the record classes are "private" and "final"
 * record class cannot extend any other class
 * record class can implement interface
 * record class can have different methods
 * 
 */


// class Person{
//     private final int age;
//     private final String name;

//     public Person(int age, String name){
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public String toString() {
//         return "Person [age=" + age + ", name=" + name + "]";
//     }

    
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Person other = (Person) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }    
// }


// record Person(int age, String name){};

//
// record Person(int age, String name){
//     public Person(int age, String name){
//         if(age == 0){
//             throw new IllegalArgumentException("Age cannot be 0");
//         }
//         this.age = age;
//         this.name = name;
//     }
// };

//
record Person(int age, String name){
    public Person{
        if(age == 0){
            throw new IllegalArgumentException("Age cannot be 0");
        }
        
    }
};


class RecordClass {
    public static void main(String[] args){
        Person a = new Person(22, "Ashish");
        Person b = new Person(22, "Ashish");
        // Person c = new Person(0, "A"); // it will give error

        System.out.println(a);
        System.out.println(a.equals(b));

    }
}
