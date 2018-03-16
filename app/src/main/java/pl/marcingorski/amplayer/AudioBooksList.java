package pl.marcingorski.amplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AudioBooksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        // Create a list of Tracks
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Dune", "Frank Herbert"));
        tracks.add(new Track("Ender's Game", "Orson Scott Card"));
        tracks.add(new Track("The Foundation Trilogy", "Isaac Asimov"));
        tracks.add(new Track("Hitch Hiker's Guide to the Galaxy", "Douglas Adams"));
        tracks.add(new Track("Stranger in a Strange Land", "Robert A Heinlein"));
        tracks.add(new Track("1984", "George Orwell"));
        tracks.add(new Track("Fahrenheit 451", "Ray Bradbury"));
        tracks.add(new Track("2001: A Space Odyssey", "Arthur C Clarke"));
        tracks.add(new Track("Do Androids Dream of Electric Sheep?", "Philip K Dick"));
        tracks.add(new Track("Neuromancer", "William Gibson"));
        tracks.add(new Track("I, Robot", "Isaac Asimov"));
        tracks.add(new Track("Starship Troopers", "Robert A Heinlein"));


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
