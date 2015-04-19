package stepHelpers;

import parser.mdConfigParser;

/**
 * Created by maninderdhanju on 4/6/15.
 */
public class mdWait {

    public static void waitFor() {

        long end1 = System.currentTimeMillis() + mdConfigParser.getwaitTime() * 1000;
        while (System.currentTimeMillis() < end1) {
        }
    }
    public static void waitFor(int res) {
        long end1 = System.currentTimeMillis() + res * 1000;
        while (System.currentTimeMillis() < end1) {
        }
    }


}
