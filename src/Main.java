import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


        var custom = new Random()
                .ints(1000, 10, 10000)
                .filter(x -> x != 1)
                .map(x -> x+1)
                .limit(20);
        var array = custom.toArray();




        var custom2 = new Random()
                .ints(1000, 10, 10000)
                .filter(x -> x != 1)
                .map(x -> x+1)
                .limit(20);
        var count = custom2.count();



        var custom3 = new Random()
                .ints(1000, 10, 10000)
                .filter(x -> x != 1)
                .map(x -> x+1)
                .limit(20);
        var reduce = custom3.reduce(0, (acc,x) -> acc+x);



        var custom4 = new Random()
                .ints(1000, 10, 10000)
                .filter(x -> x != 1)
                .map(x -> x+1).mapToLong(x -> x);
        System.out.println(custom4);

        var custom5 = new Random()
                .ints(1000, 10, 10000)
                .filter(x -> x != 1)
                .map(x -> x+1)
                .distinct()
                .boxed();

        var map = custom5.collect(Collectors.toMap(
                x->x, y -> y*y
        ));

        Stream.of(1,3,4543,5,6,7,8, 7457,32,6547,435, 6546543)
                .filter(x-> x>10)
                .map(x->x*x)
                .sorted()
                .limit( 5)
                .forEach(x-> System.out.println(x));

    }
}