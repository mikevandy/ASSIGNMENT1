//Removed Producer and Consumer Class and created separate files

import java.util.*;
import java.util.concurrent.*;


public class SynQApp
{
    public static void main(String[] args)
    {
        BlockingQueue<String> drop = new SynchronousQueue<String>();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
