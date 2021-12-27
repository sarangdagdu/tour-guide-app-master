package com.example.android.tourguide;

/**
 * {@link Place} represents info about attraction place.
 * It contains name of place and its photo.
 */
public class Place {

    // Name of an attraction place
    private final String mPlaceName;
    // Photo of an attraction place
    private final int mImageResourceID;


    /**
     * Create a new {@link Place} object.
     *
     * @param placeName       is the name of an attraction place.
     * @param imageResourceID is the photo of an attraction place.
     */
    public Place(String placeName, int imageResourceID) {
        mPlaceName = placeName;
        mImageResourceID = imageResourceID;
    }


    // Get the name of an attraction place
    public String getPlaceName() {
        return mPlaceName;
    }

    // Get the photo's ID of an attraction place
    public int getImageResourceID() {
        return mImageResourceID;
    }
}
