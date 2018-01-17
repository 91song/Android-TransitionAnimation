package me.victor.transitionanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        ActivityCompat.startActivity(this, new Intent(this, SubActivity.class),
                ActivityOptionsCompat.makeSceneTransitionAnimation(this, v,
                        getString(R.string.share_image)).toBundle());
    }
}
