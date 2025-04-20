import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {
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

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(4);
        nums.add(9);
        nums.add(5);
        nums.add(2);
        nums.add(1);

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.getClass());
        System.out.println(nums.isEmpty());
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(9));

        for( int data : nums){
            System.out.println(data+ "value");
            // System.out.println(data);
        }

    }
}
