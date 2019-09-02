package com.stechapps.fakepost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_twitter_fake extends AppCompatActivity implements TweetDescipFragment.OnTweetSubmittedListener{
    private boolean b=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_fake);

        FrameLayout flm=findViewById(R.id.fl_frag_container);
        TweetDescipFragment tweetDescipFragment =new TweetDescipFragment(this);
        tweetDescipFragment.setmTweetSubmittedTweet(this);
        getSupportFragmentManager().beginTransaction().add(R.id.fl_frag_container, tweetDescipFragment).commit();
        flm.setVisibility(View.VISIBLE);


    }

    public void create_tweet(View view) {
       switchFrag();

    }

    @Override
    public void onTweetSubmittedClicked(String s1, String s2, String s3) {

        switchFrag(s1,s2,s3);
    }

    private void switchFrag() {
        if(b){

            TweetDescipFragment tweetDescipFragment =new TweetDescipFragment(this);
            tweetDescipFragment.setmTweetSubmittedTweet(this);

            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_left,R.anim.exit_right).replace(R.id.fl_frag_container, tweetDescipFragment).addToBackStack(null).commit();



        }
        else{

            twitterViewFragment twitterViewFragment =new twitterViewFragment(this);
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_left,R.anim.exit_right).replace(R.id.fl_frag_container, twitterViewFragment).addToBackStack(null).commit();


        }
        b=!b;
    }
    private void switchFrag(String s1,String s2,String s3) {

            Bundle args=new Bundle();
            twitterViewFragment twitterViewFragment =new twitterViewFragment(this);
            ArrayList<String> col=new ArrayList<>();
            col.add(s1);
            col.add(s2);
            col.add(s3);
            args.putStringArrayList("statements",col);
            twitterViewFragment.setArguments(args);
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_right,R.anim.exit_left).replace(R.id.fl_frag_container, twitterViewFragment).addToBackStack(null).commit();



        }

    }




