import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollections {


    public static void main(String[] args) {
        int[] ar = {1, 3, 43, 2, 5, 222, 112, 23132};
        List<Integer> intlist;
        //remove all uneven numbers
        intlist = Arrays.stream(ar).boxed().filter(y -> (y%2 == 0)).collect(Collectors.toList());
//        intlist.removeIf(x -> x%2 != 0);
        System.out.println(intlist);

    }
}
