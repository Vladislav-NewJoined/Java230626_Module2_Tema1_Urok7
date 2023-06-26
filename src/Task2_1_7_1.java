import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2_1_7_1 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
                "\nодну при помощи метода collect()\n\nРешение (показано решение 2-мя способами): ");

        String str1 = "I";
        String str2 = "LOVE";
        String str3 = "JAVA";

        // НОВОЕ
        // Уменьшаем поток до списка
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
//        Конец Примера _ КККККККККККККККК








//    //        Пример 5 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
//                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
//                "\nодну при помощи метода collect()\n\nРешение: ");
//
////        String str1 = "I";
////        String str2 = "LOVE";
////        String str3 = "JAVA";
//
//        // Creating the List with string values using Arrays.asList() method
//        List<String> stringsList = Arrays.asList("1", "2", "3", "4", "5");
//
//        // java 8 join stream of strings or stream to string
//
//        // Example - 1: with default delimiter
//        String joinWithDefaultDelimiter = stringsList.stream().collect(Collectors.joining());
//
//        // Example - 2: with delimiter
//        String joinWithDelimiter = stringsList.stream().collect(Collectors.joining(":"));
//
//        // Example - 3: with given delimiter, suffix and prefix
//        String joinWithDelimiterSuffixPrefix = stringsList.stream().collect(Collectors.joining("|", "[", "]"));
//
//        // printing the values
//        System.out.println("Input List of strings : " + stringsList);
//        System.out.println("joining() string : " + joinWithDefaultDelimiter);
//        System.out.println("joining(delimiter) string : " + joinWithDelimiter);
//        System.out.println("joining(delimiter, suffix, prefix) string : " + joinWithDelimiterSuffixPrefix);
//
//    }
//}
////        Конец Примера 5 КККККККККККККККК








//    //        Пример 4 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
//                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
//                "\nодну при помощи метода collect()\n\nРешение: ");
//
//        String str1 = "I";
//        String str2 = "LOVE";
//        String str3 = "JAVA";
//
//
//        // входная коллекция
//        List<String> collection = Arrays.asList(str1, str2, str3);
//
//        // создаем последовательный поток из коллекции
//        Stream<String> stream = collection.stream();
//        System.out.println(Arrays.toString(stream.toArray(String[]::new)));
//
//    }
//}
////        Конец Примера 4 КККККККККККККККК








//    //        Пример 3 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
//                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
//                "\nодну при помощи метода collect()\n\nРешение: ");
//
////        String str1 = "I";
////        String str2 = "LOVE";
////        String str3 = "JAVA";
//
//
//        // входная коллекция
//        List<String> collection = Arrays.asList("I", "LOVE", "JAVA");
//
//        // создаем последовательный поток из коллекции
//        Stream<String> stream = collection.stream();
//        System.out.println(Arrays.toString(stream.toArray(String[]::new)));
//
//        // создаем параллельный поток из коллекции
//        Stream<String> parallel_stream = collection.parallelStream();
//        System.out.println(Arrays.toString(parallel_stream.toArray()));
//    }
//}
////        Конец Примера 3 КККККККККККККККК








//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
//                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
//                "\nодну при помощи метода collect()\n\nРешение: ");
//
//        List<String> items = new ArrayList<String>();
//
//        items.add("one");
//        items.add("two");
//        items.add("three");
//
//        Stream<String> stream = items.stream();
//        System.out.println(stream);
//
//
//
//
//    }
//}
//    //        Конец Примера 2 КККККККККККККККК


//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tИспользуя Stream вам необходимо объединить данные три строки " +
//                "\n“I”, “LOVE”,“JAVA” вы создаете новый поток из простых строк, а затем собираете их в " +
//                "\nодну при помощи метода collect()\n\nРешение: ");
//
//        String str1 = "I";
//        String str2 = "LOVE";
//        String str3 = "JAVA";
//
//
//    }
//}
//    //        Конец Примера 1 КККККККККККККККК
