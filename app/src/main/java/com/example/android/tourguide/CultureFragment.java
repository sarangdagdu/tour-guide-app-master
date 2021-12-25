package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass that displays a list of cultural places.
 */
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.vasant_theater), R.drawable.musical_theater));
        places.add(new Place(getString(R.string.darshan_hall), R.drawable.organ_hall));
        places.add(new Place(getString(R.string.ram_krishna_more_hall), R.drawable.philharmonic_hall));
        places.add(new Place(getString(R.string.bal_gandharva_hall), R.drawable.central_concert_hall));
        places.add(new Place(getString(R.string.pune_puppet_theater), R.drawable.puppet_theater));
        places.add(new Place(getString(R.string.kirkee_exhibition_hall), R.drawable.central_exhibition_hall));
        places.add(new Place(getString(R.string.senapati_art_museum), R.drawable.regional_art_museum));
        places.add(new Place(getString(R.string.mah_historical_and_archaeological_museum_reserve),
                             R.drawable.state_historical_and_archaeological_museum_reserve));
        places.add(new Place(getString(R.string.pune_regional_universal_scientific_library),
                              R.drawable.pushkin_regional_universal_scientific_library));

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
