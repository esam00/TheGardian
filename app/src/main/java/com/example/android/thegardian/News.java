package com.example.android.thegardian;

/**
 * Created by Essam on 03/03/2018.
 */

public class News {

    /** the name of the section*/
    private String mSection;

    /** Date */
    private String mDate;

    /** The Title of the news */
    private String mTitle ;

    /** Website URL of the news */
    private String mUrl;

    /** short trail text */
    private String mTrailText;

    /** author name */
    private String mAuthor;

    /**
     * Constructs a new {@link News} object.
     * @param mSection is the name of the section which the news belongs to
     * @param mDate is the date in which the news been published
     * @param mTitle is the title of the news
     * @param mUrl is the website URL to find more details about the news
     * @param mTrailText is a short text relevant to the the news
     * @param mAuthor is the name of the author
     */
    public News(String mSection,String mDate, String mTitle, String mUrl, String mTrailText, String mAuthor) {
        this.mSection = mSection;
        this.mDate = mDate;
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mTrailText = mTrailText;
        this.mAuthor = mAuthor;
    }

    /** Getter methods  */
    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getTrailText() { return mTrailText; }

    public String getAuthor() {
        return mAuthor;
    }


}
