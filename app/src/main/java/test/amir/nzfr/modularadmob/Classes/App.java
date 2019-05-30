package test.amir.nzfr.modularadmob.Classes;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, "ca-app-pub-5303705785416814~6180248126");

    }
}
