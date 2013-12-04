package com.example.samplefont;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager assetManager = this.getAssets();
        Typeface droidSansFallbackFull = Typeface.createFromAsset(assetManager,
                "DroidSansFallbackFull.ttf");
        Typeface droidSansJapanese = Typeface
                .createFromAsset(assetManager, "DroidSansJapanese.ttf");
        Typeface robotoRegular = Typeface.createFromAsset(assetManager, "Roboto-Regular.ttf");

        ((TextView) this.findViewById(R.id.droid_sans_fallback_full_text_view))
                .setTypeface(droidSansFallbackFull);
        ((TextView) this.findViewById(R.id.droid_sans_japanese_text_view))
                .setTypeface(droidSansJapanese);
        ((TextView) this.findViewById(R.id.roboto_regular_text_view)).setTypeface(robotoRegular);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
