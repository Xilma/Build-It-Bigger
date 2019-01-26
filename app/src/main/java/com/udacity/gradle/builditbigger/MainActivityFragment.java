package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.example.com.javajokelibrary.MyJokes;
import android.example.com.jokelibrary.DisplayJokeActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    MyJokes myJoker = new MyJokes();

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        AdView mAdView = root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        Button jokeButton = root.findViewById(R.id.tellJoke);
        jokeButton.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tellJoke:
                //Toast.makeText(getContext(), myJoker.getJoke(), Toast.LENGTH_LONG).show();
                passJoke();
        }
    }

    public void passJoke() {
        Intent intent = new Intent(getContext(), DisplayJokeActivity.class);
        String result = myJoker.getJoke();
        intent.putExtra("jokes", result);
        startActivity(intent);
    }
}
