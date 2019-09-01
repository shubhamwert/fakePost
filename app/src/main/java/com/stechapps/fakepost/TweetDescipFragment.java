package com.stechapps.fakepost;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class TweetDescipFragment extends Fragment {
    private Context mcontext;
    private String TAG="ERROR AT TWEET DESCRIP FRAG";
    private OnTweetSubmittedListener mTweetSubmittedTweet;

    public void setmTweetSubmittedTweet(OnTweetSubmittedListener mTweetSubmittedTweet) {
        this.mTweetSubmittedTweet = mTweetSubmittedTweet;
    }

    public TweetDescipFragment() {
        // Required empty public constructor
    }
    public TweetDescipFragment(Context context){
        mcontext=context;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_tweet_descip, container, false);
        FloatingActionButton submitButton=root.findViewById(R.id.fab_submit_tweet);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1=root.findViewById(R.id.ed_ftd_user_name);
                String s1=e1.getText().toString().trim();
                EditText e2=root.findViewById(R.id.ed_ftd_user_id);
                String s2=e2.getText().toString().trim();
                EditText e3=root.findViewById(R.id.ed_ftd_descrip);
                String s3=e3.getText().toString().trim();

                    if(!(s1.isEmpty()&&s2.isEmpty()&&s3.isEmpty()&&mTweetSubmittedTweet==null)){
                        Log.d(TAG, "onClick: "+mTweetSubmittedTweet);
                        mTweetSubmittedTweet.onTweetSubmittedClicked(s1,s2,s3);

                    if(!(s1.isEmpty())){
                        Toast.makeText(mcontext, "s1 is empty", Toast.LENGTH_SHORT).show();
                    }
                    if(!(s2.isEmpty())){
                        Toast.makeText(mcontext, "s2 is empty", Toast.LENGTH_SHORT).show();
                    }
                    if(!(s3.isEmpty())){
                        Toast.makeText(mcontext, "s3 is empty", Toast.LENGTH_SHORT).show();
                    }

                }
           }
        });
        return root;
    }
    public interface OnTweetSubmittedListener{
        void onTweetSubmittedClicked(String s1,String s2,String s3);
    }

}
