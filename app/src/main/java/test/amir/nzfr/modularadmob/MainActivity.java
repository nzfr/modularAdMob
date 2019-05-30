package test.amir.nzfr.modularadmob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import test.amir.nzfr.modularadmob.AdTypes.BannerAds;
import test.amir.nzfr.modularadmob.AdTypes.IntersAds;
import test.amir.nzfr.modularadmob.AdTypes.RewardAds;

public class MainActivity extends AppCompatActivity  {
    private AdView mAdView;
    private BannerAds bannerAd;
    private RewardAds rewardAd;
    private IntersAds intersAd;
    private Button button;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        button = findViewById(R.id.btn);
        bannerAd = new BannerAds(mAdView);
        rewardAd = new RewardAds(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intersAd = new IntersAds(MainActivity.this);
                intersAd.showAdd();

            }
        });


    }


}
