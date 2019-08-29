package com.stechapps.fakepost;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class twitterViewFragment extends Fragment {

    private Context mContext;

    public twitterViewFragment() {
        // Required empty public constructor
    }

  public twitterViewFragment(Context context){
        mContext=context;
  }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_twitter_view, container, false);
        ArrayList<String> arrayList=getArguments().getStringArrayList("statements");
        if (!arrayList.isEmpty()){
            TextView tv=root.findViewById(R.id.tv_twiter_user_id);
            tv.setText(arrayList.get(0));
            tv=root.findViewById(R.id.tv_twiter_user_name);
            tv.setText(arrayList.get(1));
            tv=root.findViewById(R.id.tv_twiter_description);
            tv.setText(arrayList.get(2));        }
        return root;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }
}
