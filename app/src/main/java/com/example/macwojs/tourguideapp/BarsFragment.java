package com.example.macwojs.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary Items.
 */
public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Item> Items = new ArrayList<>();
        Items.add(new Item(getResources().getString(R.string.title11),
                getResources().getString(R.string.hour11),
                getResources().getString(R.string.cost11),
                getResources().getString(R.string.dec11)));
        Items.add(new Item(getResources().getString(R.string.title12),
                getResources().getString(R.string.hour12),
                getResources().getString(R.string.cost12),
                getResources().getString(R.string.dec12)));
        Items.add(new Item(getResources().getString(R.string.title13),
                getResources().getString(R.string.hour13),
                getResources().getString(R.string.cost13),
                getResources().getString(R.string.dec13)));
        Items.add(new Item(getResources().getString(R.string.title14),
                getResources().getString(R.string.hour14),
                getResources().getString(R.string.cost14),
                getResources().getString(R.string.dec14)));

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
