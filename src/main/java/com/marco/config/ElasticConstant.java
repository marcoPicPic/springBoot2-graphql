package com.marco.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ElasticConstant {

    // Paths
    public static final String PHONE_ACTIVITY_PATH = "phone_activities";
    public static final String REALTIME_COUNTER_PATH = "realtime_counters";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String INDEX_SEPARATOR = "_";

    //TODO pr le test
    public static final String TENANT_UUID = "f0e59e00-ed4c-4068-bf7c-f99e69ab4fc1";
    public static final int TENANT_ID = 3;
    public static final String DATE_STAT = "date_stat";


    public static DateFormat dateFormat = new SimpleDateFormat(ElasticConstant.DATE_FORMAT);

    public static String getElasticSearchPath(String path,
                                              String tenantUuid,
                                              int tenantId) {


        return path +
                INDEX_SEPARATOR + tenantUuid +
                INDEX_SEPARATOR + tenantId +
                INDEX_SEPARATOR + dateFormat.format(new Date());
    }

    public static String getElasticSearchPathExampleForTheTest(String path) {

        return path +
                INDEX_SEPARATOR +  TENANT_UUID +
                INDEX_SEPARATOR + TENANT_ID +
                INDEX_SEPARATOR + dateFormat.format(new Date());
    }

}
