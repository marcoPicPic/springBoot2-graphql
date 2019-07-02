package com.marco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ElasticConstant {

    // Paths
    public static final String PHONE_ACTIVITY_PATH = "phone_activities";
    public static final String REALTIME_COUNTER_PATH = "realtime_counters";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String INDEX_SEPARATOR = "_";

    public static String getElasticSearchPath(String path,
                                              String tenantUuid,
                                              int tenantId) {

        DateFormat dateFormat = new SimpleDateFormat(ElasticConstant.DATE_FORMAT);
        //TODO pr les tests dateFormat.format(new Date());
        String date = "2019-02-19";
        return path +
                INDEX_SEPARATOR + tenantUuid +
                INDEX_SEPARATOR + tenantId +
                INDEX_SEPARATOR + date;
    }

}
