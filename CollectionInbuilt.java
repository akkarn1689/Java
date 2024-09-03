/*
 * Iterables -> Collection -> [List(ArrayList, LinkedList), Queue(Queue, Dequeue), Set(HashSet, LinkedHashSet)]
 * 
 */

/*
 * Collection API
 * Collection
 * Collections
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    // implements Comparable<Student>: it is to make our class able to use default
    // sort function of collections when compareTo() is called function is declared
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // function to implement default sort function of Collections on class Student
    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }
}

class CollectionInbuilt {
    public static void main(String args[]) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(9);
        nums.add(75);
        nums.add(3);
        nums.add(5);

        for (int n : nums) {
            System.out.print(n + " ");
        }

        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(5);
        nums1.add(9);
        nums1.add(75);
        nums1.add(3);
        nums1.add(5);
        System.out.println("");

        for (int i = 0; i < nums1.size(); i++) {
            System.out.print(nums1.get(i) + " ");
        }

        Set<Integer> nums2 = new HashSet<Integer>(); // it doesn't store values in sorted order
        nums2.add(56);
        nums2.add(95);
        nums2.add(75);
        nums2.add(37);
        nums2.add(56);
        nums2.add(135);
        System.out.println("");

        for (int n : nums2) {
            System.out.print(n + " ");
        }

        Set<Integer> nums3 = new TreeSet<Integer>(); // it doesn't store values in sorted order
        nums3.add(56);
        nums3.add(95);
        nums3.add(75);
        nums3.add(37);
        nums3.add(56);
        nums3.add(135);
        System.out.println("");

        for (int n : nums3) {
            System.out.print(n + " ");
        }

        System.out.println("");

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.print(values.next() + " ");
        }

        System.out.println("");

        Collections.sort(nums1); // works on List
        System.out.print("Sorted nums1 ");
        for (int n : nums1) {
            System.out.print(n + " ");
        }

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Ashish", 47);
        students.put("Prakhar", 90);
        students.put("Pratham", 31);

        System.out.println("");
        System.out.println(students);
        System.out.println(students.get("Ashish"));

        for (String name : students.keySet()) {
            System.out.println(name + " " + students.get(name));
        }

        Map<String, Integer> students1 = new Hashtable<String, Integer>();
        // this is synchronised, can be used in a
        // scenario where multiple threads are
        // operating

        students1.put("Ashish", 47);
        students1.put("Prakhar", 90);
        students1.put("Pratham", 31);

        System.out.println("");
        System.out.println(students1);
        System.out.println(students.get("Ashish"));

        for (String name : students1.keySet()) {
            System.out.println(name + " " + students1.get(name));
        }

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(65);
        arr.add(26);
        arr.add(67);
        arr.add(36);
        arr.add(97);
        arr.add(158);

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a < b ? 1 : -1;
                // return 1 to swap, -1 to keep the same
                // i.e. return 1 when the order is not correct, -1 when the order is correct
            }
        };

        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("");

        Collections.sort(arr, comp);

        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println("");

        // sort string based on length of string: Ascending order
        List<String> arrStr = new ArrayList<>();
        arrStr.add("Ashish");
        arrStr.add("Kumar");
        arrStr.add("Karn");

        Comparator<String> compStr = new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() > b.length() ? 1 : -1;
                // return 1 to swap, -1 to keep the same
                // i.e. return 1 when the order is not correct, -1 when the order is correct
            }
        };

        for (String s : arrStr) {
            System.out.print(s + " ");
        }
        System.out.println("");

        Collections.sort(arrStr, compStr);

        for (String s : arrStr) {
            System.out.print(s + " ");
        }

        System.out.println("");

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(22, "Ashish"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(21, "Prakhar"));

        for (Student s : studs) {
            System.out.println(s);
        }
        System.out.println("Sorted students");
        Collections.sort(studs);
        for (Student s : studs) {
            System.out.println(s);
        }

        Comparator<Student> compStu = new Comparator<Student>(){
            public int compare(Student a, Student b) {
                return a.age < b.age ? 1 : -1;
            }
        };
        System.out.println("");

        Comparator<Student> compStuds = (a, b) -> a.age < b.age ? 1 : -1;

        Collections.sort(studs, compStu);
        for (Student s : studs) {
            System.out.println(s);
        }
        System.out.println("");
        Collections.sort(studs);
        for (Student s : studs) {
            System.out.println(s);
        }
        System.out.println("");
        Collections.sort(studs, compStuds);
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
