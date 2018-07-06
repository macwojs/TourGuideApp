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
public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Item> Items = new ArrayList<>();
        Items.add(new Item(getResources().getString(R.string.title41),
                getResources().getString(R.string.hour41),
                getResources().getString(R.string.cost41),
                getResources().getString(R.string.dec41),R.drawable.img41));
        Items.add(new Item(getResources().getString(R.string.title42),
                getResources().getString(R.string.hour42),
                getResources().getString(R.string.cost42),
                getResources().getString(R.string.dec42),R.drawable.img42));
        Items.add(new Item(getResources().getString(R.string.title43),
                getResources().getString(R.string.hour43),
                getResources().getString(R.string.cost43),
                getResources().getString(R.string.dec43),R.drawable.img43));
        Items.add(new Item(getResources().getString(R.string.title44),
                getResources().getString(R.string.hour44),
                getResources().getString(R.string.cost44),
                getResources().getString(R.string.dec44),R.drawable.img44));

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
