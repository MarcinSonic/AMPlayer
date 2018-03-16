package pl.marcingorski.amplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        // Create a list of Tracks
        ArrayList<Track> tracks = new ArrayList<Track>();
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


        // Create an {@link WordAdapter}, whose data source is a list of {@link Track}s. The
        // adapter knows how to create list items for each item in the list.
        TrackAdapter adapter = new TrackAdapter(this, tracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // track_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TrackAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Track} in the list.
        listView.setAdapter(adapter);
    }
}
