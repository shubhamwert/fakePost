package com.stechapps.fakepost;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TweetDescip extends Fragment {
    Context mcontext;
    public TweetDescip() {
        // Required empty public constructor
    }
    public TweetDescip(Context context){
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
        View root = inflater.inflate(R.layout.fragment_tweet_descip, container, false);

        return root;
    }

}
