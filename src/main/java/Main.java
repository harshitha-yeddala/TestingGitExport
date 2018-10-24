
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println("Current date : " + (now.get(Calendar.DATE)) + "-"
                + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.YEAR));

        String[] strDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday"};
        // Day_OF_WEEK starts from 1 while array index starts from 0
        System.out.println(strDays[now.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
