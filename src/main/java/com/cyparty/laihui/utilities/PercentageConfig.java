package com.cyparty.laihui.utilities;

/**
 * Created by zhu on 2017/1/3.
 */
public class PercentageConfig {
    private final static double campaign_percentage=0.03;
    private final static double pc_percentage=0.9;
    private final static double single_person=120f;

    public static double getSingle_person() {
        return single_person;
    }

    public static double getCampaign_percentage() {
        return campaign_percentage;
    }

    public static double getPc_percentage() {
        return pc_percentage;
    }
}
