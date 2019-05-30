package test.amir.nzfr.modularadmob.AdTypes;

import android.app.Activity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BannerAds extends Activity {

    private AdView mAdView;


    public BannerAds(AdView adView) {
        this.mAdView = adView;
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


}
