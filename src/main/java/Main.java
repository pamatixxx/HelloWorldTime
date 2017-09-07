import com.sun.javafx.util.Logging;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;


public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws Exception {

    ;

        Date currentTime = new Date();//получаем текущую дату
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");//форматируем дату в нужную нам (час, минуты , секунды)
        System.out.println(dateFormat.format(currentTime));//выводим текущую дату
        int hours = currentTime.getHours(); //получаем текущий час времени
        int mins = currentTime.getMinutes();// получаем текущие минуты времени
        int secs = currentTime.getSeconds(); // получаем текущее секундывремени

        Locale currentLocale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle("GreetingsBundle", currentLocale);


        String ms1 = null;
        if (hours < 9 && hours >= 6) {  //проверяем утро ?
            ms1 = messages.getString("morning");
            log.info("Print morning message");
        } else if (hours >= 9 && hours < 19) {//проверяем день?
            ms1 = messages.getString("day");
            log.info("Print day message");
        } else if (hours >= 19 && hours < 23) {//проверяем, вечер?
            ms1 = messages.getString("evening");
            log.info("Print evening message");
        } else {
            ms1 = messages.getString("night");
            log.info("Print night message");//проверяем, ночь?
        }
        System.out.println(ms1);
    }
}
