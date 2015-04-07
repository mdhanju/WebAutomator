package stepHelpers;

/**
 * Created by maninderdhanju on 4/6/15.
 */
public class mdWait {

    public static void waitFor(int res) {
        long end1 = System.currentTimeMillis() + res * 1000;
        while (System.currentTimeMillis() < end1) {
        }
    }

}
