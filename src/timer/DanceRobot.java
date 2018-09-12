package timer;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

public class DanceRobot extends TimerTask {

    @Override
    public void run() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("schedule exec time:" + sdf.format(scheduledExecutionTime()));
        System.out.println("dancing happily");



    }
}
