package hello;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionException;
/**
 * @author long
 *
 */
public class MyJob {
    public void method1()
            throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(new Date()));        
    }

}