package com.example.macwojs.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Item> Items = new ArrayList<>();
        Items.add(new Item(getResources().getString(R.string.title31),
                getResources().getString(R.string.hour31),
                getResources().getString(R.string.dec31)));
        Items.add(new Item(getResources().getString(R.string.title32),
                getResources().getString(R.string.hour32),
                getResources().getString(R.string.dec32)));
        Items.add(new Item(getResources().getString(R.string.title33),
                getResources().getString(R.string.hour33),
                getResources().getString(R.string.dec33)));
        Items.add(new Item(getResources().getString(R.string.title34),
                getResources().getString(R.string.hour34),
                getResources().getString(R.string.dec34)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), Items);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Item_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
