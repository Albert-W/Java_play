import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Orange");
        String[] array = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}