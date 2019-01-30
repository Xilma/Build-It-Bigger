package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.example.com.javajokelibrary.MyJokes;
import android.example.com.jokelibrary.DisplayJokeActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivityFragment extends Fragment implements EndpointsAsyncTask.mCallback{

    MyJokes myJoker = new MyJokes();

    private ProgressBar mProgressBar;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        mProgressBar = root.findViewById(R.id.spinner);
        Button jokeButton = root.findViewById(R.id.joke_button);
        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start AsyncTask to get the Joke
                mProgressBar.setVisibility(View.VISIBLE);
                getJokeFromTask();
            }
        });

        return root;
    }

    public void getJokeFromTask() {
        Context context = getActivity();
        new EndpointsAsyncTask(this).execute(context);

    }

    public void passJoke() {
        Intent intent = new Intent(getContext(), DisplayJokeActivity.class);
        String result = myJoker.getJoke();
        intent.putExtra("jokes", result);
        startActivity(intent);
    }

    public void onCallbackResult(String result) {
        Intent sendIntent = new Intent(getActivity(), DisplayJokeActivity.class);
        sendIntent.putExtra("jokes", result);
        mProgressBar.setVisibility(View.GONE);
        startActivity(sendIntent);
    }
}
