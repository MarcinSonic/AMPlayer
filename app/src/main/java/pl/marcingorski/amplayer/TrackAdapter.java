package pl.marcingorski.amplayer;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gorsk on 15.03.2018.
 * * {@link TrackAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Track} objects.
 */

public class TrackAdapter extends ArrayAdapter<Track> {

    private static final String LOG_TAG = TrackAdapter.class.getSimpleName();

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param track   A List of AndroidFlavor objects to display in a list
     */
    public TrackAdapter(Activity context, ArrayList<Track> track) {
        super(context, 0, track);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
// Get the {@link AndroidFlavor} object located at this position in the list
        Track currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = listItemView.findViewById(R.id.title_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        authorTextView.setText(currentAndroidFlavor.getAuthor());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
