package pl.marcingorski.amplayer;

/**
 * Created by gorsk on 15.03.2018.
 */

public class Track {
    private String mTitle;
    private String mAuthor;

    public Track(String Title, String Author) {
        mTitle=Title;
        mAuthor=Author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }
}
