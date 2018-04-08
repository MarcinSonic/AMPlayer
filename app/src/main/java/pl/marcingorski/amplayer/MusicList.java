package pl.marcingorski.amplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        // Making button for returnig to previus activity
        TextView back = findViewById(R.id.back_button);
        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(MusicList.this, MainActivity.class);
                // Start the new activity
                startActivity(mainIntent);
            }

        });
        // Create a list of Tracks
        final ArrayList<Track> tracks = new ArrayList <>();
        tracks.add(new Track("God's Plan", "Drake"));
        tracks.add(new Track("Perfect", "Ed Sheeran"));
        tracks.add(new Track("Finesse", "Bruno Mars & Cardi B"));
        tracks.add(new Track("Psycho", "Post Malone"));
        tracks.add(new Track("Meant To Be", "Bebe Rexha & Florida Georgia Line"));
        tracks.add(new Track("Havana", "Camila Cabello Ft. Young Thug"));
        tracks.add(new Track("Look Alive", "BlocBoy JB Featuring Drake"));
        tracks.add(new Track("The Middle", "Zedd, Maren Morris & Grey"));
        tracks.add(new Track("Pray For Me", "The Weeknd & Kendrick Lamar"));
        tracks.add(new Track("Stir Fry", "Migos"));
        tracks.add(new Track("All The Stars", "Kendrick Lamar & SZA"));
        tracks.add(new Track("Let You Down", "NF"));

        // Create an {@link TrackAdapter}, whose data source is a list of {@link Track}s. The
        // adapter knows how to create list items for each item in the list.
        TrackAdapter adapter = new TrackAdapter(this, tracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // track_list.xml file.
        final ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TrackAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Track} in the list.
        listView.setAdapter(adapter);

        // setting listener on each list item
        listView.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowPlayingIntent = new Intent(MusicList.this, NowPlaying.class);

                       String title = tracks.get(position).getTitle();
                       String author = tracks.get(position).getAuthor();
                        nowPlayingIntent.putExtra("title", title);
                        nowPlayingIntent.putExtra("author", author);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }

    private class OnItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        }
    }
}