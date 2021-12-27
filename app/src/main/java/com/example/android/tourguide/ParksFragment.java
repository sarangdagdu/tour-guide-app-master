package com.example.android.tourguide;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of parks.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.saras_baug), R.drawable.gorky_park));
        places.add(new Place(getString(R.string.p_l_deshpande_garden), R.drawable.chistiakovskaya_grove));
        places.add(new Place(getString(R.string.okoyama_fuji_garden), R.drawable.catherine_square));
        places.add(new Place(getString(R.string.appu_ghar),
                R.drawable.square_of_friendship_of_peoples));
        places.add(new Place(getString(R.string.katraj_garden), R.drawable.sunny_island));
        places.add(new Place(getString(R.string.sambhaji_udyaan), R.drawable.park_krasnodar));
        places.add(new Place(getString(R.string.nowrojee_udyaan), R.drawable.botanical_garden));
        places.add(new Place(getString(R.string.strawberry_garden), R.drawable.seafront));

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
