import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2_1_7_1 {

    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
                "\nодну при помощи метода collect()\n\nРешение (показано решение 2-мя способами): ");

        String str1 = "I";
        String str2 = "LOVE";
        String str3 = "JAVA";

        Stream<String> stream = Stream.of(str1, str2, str3);
        Stream<String> stream2 = Stream.of(str1, str2, str3);
        List <String> list = stream.collect (ArrayList :: new, ArrayList :: add, ArrayList :: addAll); // Способ 1
        List <String> list2 = stream2.collect (Collectors.toList ()); // Способ 2
        //  System.out.println(list);
        //  System.out.println(list2);

        String delim = " ";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;
        while (i < list.size() - 1)
        {
            sb.append(list.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(list.get(i));

        int n = 0;
        while (n < list2.size() - 1)
        {
            sb2.append(list2.get(n));
            sb2.append(delim);
            n++;
        }
        sb2.append(list2.get(i));

        String res = sb.toString();
        String res2 = sb2.toString();
        System.out.println(res);
        System.out.println(res2);

    }
}