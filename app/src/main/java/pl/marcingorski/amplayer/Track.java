package pl.marcingorski.amplayer;

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
