import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("HH:mm:ss");  
        LocalTime alarmTime = null ;
        String filePath = "Alarm_Tune.wav";

       while (alarmTime == null) {
        try{
            System.out.print("Enter an alarm time (HH:MM:SS) : ");
            String inputTime = scanner.nextLine();
            
    
            alarmTime = LocalTime.parse(inputTime,formatter);
    
            System.out.println("Alarm set for : "+alarmTime);
           }catch(DateTimeException e){
            System.out.println("Invalid format, Please use (HH:MM:SS)");
           }
       }

       AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,scanner);
       Thread alarmThread = new Thread(alarmClock);
       alarmThread.start();

    }
}