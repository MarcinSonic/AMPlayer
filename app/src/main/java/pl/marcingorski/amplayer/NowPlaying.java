package pl.marcingorski.amplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView titleNowPlaying = findViewById(R.id.title_now_playing);
        TextView authorNowPlaying = findViewById(R.id.author_now_playing);

        String authorString;
        String titleString;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            titleString = bundle.getString("title");
            titleNowPlaying.setText(titleString);
            authorString = bundle.getString("author");
            authorNowPlaying.setText(authorString);

        }

        // Find the View that shows the music category
        TextView music = findViewById(R.id.music);
        // Set a click listener on that View
        music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicListActivity}
                Intent musicIntent = new Intent(NowPlaying.this, MusicList.class);
                // Start the new activity
                startActivity(musicIntent);
            }

        });

        // Find the View that shows the audiobooks category
        TextView audiobooks = findViewById(R.id.audiobooks);
        // Set a click listener on that View
        audiobooks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the audiobooks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AudiobooksListActivity}
                Intent audiobooksIntent = new Intent(NowPlaying.this, AudioBooksList.class);
                // Start the new activity
                startActivity(audiobooksIntent);
            }

        });


    }

}

