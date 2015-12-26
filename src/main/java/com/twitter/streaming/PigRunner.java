package com.twitter.streaming;

import com.twitter.streaming.pig.PigETL;
import org.apache.pig.ExecType;

/**
 * Created by vaibhavguptabits on 12.09.15.
 */
public class PigRunner {


    private static final boolean  isLocal = true;

    public static void main(String[] args) {


       PigETL pigETL = null;

        try {
            pigETL = new PigETL(isLocal, ExecType.LOCAL);

           pigETL.loadData();

              // pigETL.transformData();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
