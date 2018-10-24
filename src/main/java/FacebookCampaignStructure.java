
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author harshitha
 */

public class FacebookCampaignStructure {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Harshitha", "Harshini", "Raji", "Bhavs", "Monica", "Teja", "Ashitha");
        Stream<String> allNames = names.stream();
        Stream<String> longNames = allNames.filter(str -> str.length() >= 6);
        System.out.println("The Stream Example");
        longNames.forEach(str -> System.out.println(str + " "));

        List<String> names1 = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

        List<String> longnames = names1.stream() // converting the list to stream
                .filter(str -> str.length() > 5) // filter the stream to create a new stream
                .collect(Collectors.toList());  // collect the final stream and convert it to a List
        System.out.println("The Stream with collect function");
        longnames.forEach(System.out::println);
        float finalTotalIsR;
        BigDecimal amount = new BigDecimal("1.8");
        finalTotalIsR = amount.divide(amount, MathContext.DECIMAL32).multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.CEILING).floatValue();
        System.out.println("The finalTotalIsR..." + finalTotalIsR);

        BigDecimal payment = new BigDecimal("5766.37");
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        double doublePayment = payment.doubleValue();
        String s = n.format(doublePayment);
        System.out.println(s);

        StringJoiner mystring = new StringJoiner(",");

        mystring.add("Negan");
        mystring.add("Rick");
        mystring.add("Maggie");
        mystring.add("Daryl");

        System.out.println("First String: " + mystring);
        StringJoiner myanotherstring = new StringJoiner("-", ")", "(");

        myanotherstring.add("Sansa");
        myanotherstring.add("Imp");
        myanotherstring.add("Jon");
        myanotherstring.add("Ned");

        System.out.println("Second String: " + myanotherstring);
        StringJoiner mergedString = mystring.merge(myanotherstring);
        System.out.println(mergedString);

        int numbers[] = {22, 89, 1, 32, 19, 5};
        Arrays.parallelSort(numbers);
        Arrays.stream(numbers).forEach(n1 -> System.out.print(n1 + " "));

        float number = 4.0f;
        float epsilon = 0.004f; // 4 tenths of a cent
        if (Math.abs(Math.round(number) - number) < epsilon) {
            String.format("%10.0f", number); // sdb
        } else {
            String.format("%10.2f", number); // dj_segfault

        }
        DecimalFormat df = new DecimalFormat("$###,###.##");
        df.format(40449.78);
        System.out.println(df.format(40449.78));
        System.out.println(df.format(3784.02));

        String text = "h a r s h i t h a";
        String temp = text.replaceAll("\\s+", "").toLowerCase();
        boolean java = IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
        System.out.println(java);

        List<String> example = Arrays.asList("Harshitha", "Harshini", "Harika", "Haritha", "Harshith", "Harish");
        List<String> example1 = example.stream().filter(str -> str.length() > 6).collect(Collectors.toList());
        System.out.println(example1);
        example1.forEach(str -> System.out.print(str + " - "));
    }
}
