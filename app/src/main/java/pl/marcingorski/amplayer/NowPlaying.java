package pl.marcingorski.amplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView titleNowPlaying = findViewById(R.id.title_now_playing);
        TextView authorNowPlaying = findViewById(R.id.author_now_playing);
        TextView stopButton = findViewById(R.id.stop_button);

        String authorString;
        String titleString;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            titleString = bundle.getString("title");
            titleNowPlaying.setText(titleString);
            authorString = bundle.getString("author");
            authorNowPlaying.setText(authorString);

        }

    }

}

