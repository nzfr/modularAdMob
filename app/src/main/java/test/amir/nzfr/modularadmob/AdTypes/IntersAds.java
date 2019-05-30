package test.amir.nzfr.modularadmob.AdTypes;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import test.amir.nzfr.modularadmob.R;

public class IntersAds extends Activity {
    private InterstitialAd mInterstitialAd;
    private Context context;
    public IntersAds(Context context) {
        this.context = context;
        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId(context.getResources().getString(R.string.inters_ad_unit_id));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
        });

    }

    public void showAdd()
    {
        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        Log.d("TAG", "The interstitial wasn't loaded yet.");
    }
    }




}
