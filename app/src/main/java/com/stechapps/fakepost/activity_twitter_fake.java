package com.stechapps.fakepost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class activity_twitter_fake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_fake);




    }

    public void create_tweet(View view) {
        FrameLayout flm=findViewById(R.id.fl_frag_container);
        TweetDescip tweetDescip=new TweetDescip(this);
        getSupportFragmentManager().beginTransaction().add(R.id.fl_frag_container,tweetDescip).commit();
        flm.setVisibility(View.VISIBLE);
        findViewById(R.id.bt_create_twitter).setVisibility(View.GONE);
    }
}
