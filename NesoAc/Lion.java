import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        //String roar1 = "roar";
        //StringBuilder roar2 = new StringBuilder("roar");
        //new Lion().roar(roar1, roar2);
        //System.out.println(roar1 + " " + roar2);

        // String letters = "abcdef";
        // System.out.println(letters.length());
        // System.out.println(letters.charAt(3));
        // System.out.println(letters.charAt(6));

        // String numbers = "012345678";
        // System.out.println(numbers.substring(1, 3));
        // System.out.println(numbers.substring(7, 7));
        // System.out.println(numbers.substring(7));

        // String s = "purr";
        // s.toUpperCase();
        // s.trim();
        // s.substring(1, 3);
        // s += " two";
        // System.out.println(s.length());

        // String a = "";
        // a += 2;
        // a += 'c';
        // a += false; 
        // System.out.println( a == "2cfalse");
        //if ( a.equals("2cfalse")) System.out.println("equals");

        // String a = "Salif";
        // String b = "Salif";
        // System.out.println("Salif"==b);

        // int total = 0;
        // StringBuilder letters = new StringBuilder("abcdefg");
        // total += letters.substring(1, 2).length();
        // total += letters.substring(6, 6).length();
        //total += letters.substring(6, 5).length();
        //System.out.println(total);

        // StringBuilder numbers = new StringBuilder("0123456789");
        // numbers.delete(2, 8);
        // numbers.append("-").insert(2, "+");
        // System.out.println(numbers);

        //StringBuilder b = new StringBuilder("Java");
        //b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        //System.out.println(b.append("vaJ$").delete(0, 3).deleteCharAt(b.length() - 1));

        // char[] c = new char[2];
        // int length = c.length;
        // System.out.println(length);

        // ArrayList l = new ArrayList();
        // l.add("Salif");
        // int length = l.size();
        // System.out.println(length);
        // System.out.println(l.remove(0));
        // System.out.println(l.remove(0));

        // List<String> list = new ArrayList<String>();
        // list.add("one");
        // list.add("two");
        // list.add("7");
        // for(String s : list) System.out.print(s);


        // int arr1[] = { 1, 2 };
        // int arr2[] = arr1;
        // System.out.println(arr1.equals(arr2));

        // ArrayList<Integer> values = new ArrayList<>();
        // values.add(4);
        // values.add(5);
        // values.set(1, 6);
        // values.remove(0);
        // for (Integer v : values) System.out.print(v);

        // int[] random = { 6, -4, 12, 0, -10 };
        // int x = 12;
        // int y = Arrays.binarySearch(random, x);
        // System.out.println(y);

        // List<Integer> list = Arrays.asList(10, 4, -1, 5);
        // Collections.sort(list);
        // Integer array[] = list.toArray(new Integer[4]);
        // System.out.println(array[0]);

        // String [] names = {"Tom", "Dick", "Harry"};
        // List<String> list = names.asList();
        // list.set(0, "Sue");
        // System.out.println(names[0]);

        // List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        // Collections.sort(hex);
        // int x = Collections.binarySearch(hex, "8");
        // int y = Collections.binarySearch(hex, "3A");
        // int z = Collections.binarySearch(hex, "4F");
        // System.out.println(x + " " + y + " " + z);

        // List<Integer> ages = new ArrayList<>();
        // ages.add(Integer.parseInt("5"));
        // ages.add(Integer.valueOf("6"));
        // ages.add(7);
        // ages.add(null);
        // for (int age : ages) System.out.print(age);

        // List<String> one = new ArrayList<String>();
        // one.add("abc");
        // List<String> two = new ArrayList<>();
        // two.add("abc");
        // if (one == two) 
        // System.out.println("A");
        // else if (one.equals(two))
        // System.out.println("B");
        // else 
        // System.out.println("C");

        // LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        // date.plusDays(2);
        // date.plusHours(3);
        // System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
        
        // LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        // System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());

        // LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        // date.plusDays(2);
        // date.plusYears(3);
        // System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());

        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.of(1, 2, 3);
        // d = d.minus(p);
        // DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        // System.out.println(d.format(f));

        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.ofDays(1).ofYears(2);
        // d = d.minus(p);
        // DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // System.out.println(f.format(d));

        
        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}