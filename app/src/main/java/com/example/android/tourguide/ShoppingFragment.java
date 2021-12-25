package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of shopping places.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.phoenix_mall), R.drawable.oz_mall));
        places.add(new Place(getString(R.string.sgs_megamall), R.drawable.sbs_megamall));
        places.add(new Place(getString(R.string.seasons_banquet), R.drawable.gallery_krasnodar));
        places.add(new Place(getString(R.string.tarachand_mall), R.drawable.krasnaya_ploshchad));
        places.add(new Place(getString(R.string.elpro_square), R.drawable.mega));
        places.add(new Place(getString(R.string.fatimanagar_square), R.drawable.galaktika));
        places.add(new Place(getString(R.string.pimpri_central), R.drawable.karnaval));
        places.add(new Place(getString(R.string.westend_mall), R.drawable.crystal));
        places.add(new Place(getString(R.string.shoppers_stop), R.drawable.city_center));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}
