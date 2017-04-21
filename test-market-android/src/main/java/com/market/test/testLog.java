package com.market.test;

/**
 * Created by zhouxin on 17/4/21.
 */
import org.apache.log4j.Logger;
public class testLog {
    private static Logger log = Logger.getLogger(testLog.class);

    public static void main(String[] args) {
            log.info("info level");            // <= (3)
        }
}
