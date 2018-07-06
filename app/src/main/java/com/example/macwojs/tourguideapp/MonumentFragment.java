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
public class MonumentFragment extends Fragment {

    public MonumentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Item> Items = new ArrayList<>();
        Items.add(new Item(getResources().getString(R.string.title21),
                getResources().getString(R.string.hour21),
                getResources().getString(R.string.cost21),
                getResources().getString(R.string.dec21)));
        Items.add(new Item(getResources().getString(R.string.title22),
                getResources().getString(R.string.hour22),
                getResources().getString(R.string.cost22),
                getResources().getString(R.string.dec22)));
        Items.add(new Item(getResources().getString(R.string.title23),
                getResources().getString(R.string.hour23),
                getResources().getString(R.string.cost23),
                getResources().getString(R.string.dec23)));
        Items.add(new Item(getResources().getString(R.string.title24),
                getResources().getString(R.string.hour24),
                getResources().getString(R.string.cost24),
                getResources().getString(R.string.dec24)));

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
