package timer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class WaterRobot extends TimerTask {

    private Integer buckerCapacity = 0;

    private Timer timer;
    public WaterRobot(Timer inputTimer){
        timer = inputTimer;
    }

    @Override
    public void run() {
        if (buckerCapacity < 5){
            System.out.println("add one water into the bucket");
            buckerCapacity++;
        }else {
            cancel();
            System.out.println("water robot has been aborted");
            System.out.println("number of cancel task in timer is :" + timer.purge());
            System.out.println("current water is:" + buckerCapacity);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            timer.cancel();
        }

    }
}
