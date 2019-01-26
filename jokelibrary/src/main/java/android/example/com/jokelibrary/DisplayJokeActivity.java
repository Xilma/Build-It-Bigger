package android.example.com.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    private TextView jokesText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        jokesText = findViewById(R.id.jokes);

        Intent joke = getIntent();
        String jokes = joke.getStringExtra("jokes");

        jokesText.setText(jokes);
    }
}
