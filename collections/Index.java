import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;

// public class Index {
//     public static void main(String[] args) {
        // String nums[] = {"nepal", "ocean"};
        // int types[] = new int[5];
        // System.out.println(types.length);

        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(4);
        // nums.add(9);

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(4);
        // nums.add(9);
        // nums.add(1); //supports duplicate value

        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(1);
        // nums.add(4);
        // nums.add(9);
        // nums.add(5);
        // nums.add(2);
        // nums.add(1);

        // System.out.println(nums);
        // System.out.println(nums.size());
        // System.out.println(nums.getClass());
        // System.out.println(nums.isEmpty());

        // for( int data : nums){
        //     System.out.println(data+ "value");
        //     // System.out.println(data);
        // }

        
        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(1);
        // nums.add(6);
        // nums.add(3);
        // nums.add(9);
        // nums.add(4);

        // System.out.println(nums + "value");

        // Map students = new HashMap();
        // students.put("math", 20);
        // students.put("english", 50);
        // students.put("nepali", 70);
        // students.put("social", 80);
        // students.put("social", 90);

        // System.out.println(students + "students");
        // System.out.println(students.get("social"))

//     }
// }

//Comparator
// public class Index {
//     public static void main(String[] args) {
//         Comparator<Integer> com = new Comparator<Integer>() {
//             public int compare(Integer i , Integer j){
//                 if(i%10 > j%10){
//                     return 1;
//                 }
//                 return -1;
//             }
//         };
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(4);
//        nums.add(3);
//        nums.add(2);
//        nums.add(9);
//        System.out.println(nums + "before");

//        Collections.sort(nums, com);

//        System.out.println(nums);
//     }
// }



// public class Index {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1,2,5,7);
//         System.out.println(nums);

//         int sum = 0;
//         for(int n : nums){
//             if(n%2 == 0){
//                 n = n*2;
//                 sum += n;
//             }
//         }
//         System.out.println(sum);

//         nums.forEach(items -> System.out.println(items));
//     }
// }


class Emp{
    private String name;
    private int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{name=" + name + ", salary=" + salary + "}";
    }

    
}


// Interview Question
public class Index {
    public static void main(String[] args) {
    //    ArrayList<Integer> marks = new ArrayList<>();
    //    marks.add(10);
    //    marks.add(40);
    //    marks.add(30);
    //    System.out.println(marks);
    //    System.out.println(marks.getClass() + "class");
    //    Collections.sort(marks);
    //    System.out.println(marks + "sorted array");

    ArrayList<Emp> emps = new ArrayList<>();
    emps.add(new Emp( "Raj", 1000));
    emps.add(new Emp("Shyam",50));
    System.out.println(emps);
    Collections.sort(emps);
       
    }
}