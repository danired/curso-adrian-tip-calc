package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by Dani on 04/06/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/adriancatalan";

    public String getAboutUrl() {
        return ABOUT_URL;
    }

}
