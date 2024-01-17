package Advanced.Ch_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter/* It formatts date and
         time by given type */
                dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate = dt.format(dtf);
        System.out.println(myDate);
    }
}
