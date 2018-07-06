package com.example.macwojs.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemAdapter extends ArrayAdapter<Item>  {

    /*private int mColorResourceId;


    public ItemAdapter(Context context, ArrayList<Item> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }*/

    public ItemAdapter(Context context, ArrayList<Item> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.textview_title);
        titleTextView.setText(currentItem.getmTitle());

        TextView openTextView = (TextView) listItemView.findViewById(R.id.textview_open_hour);
        openTextView.setText(currentItem.getmOpenHour());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.textview_descripton);
        descTextView.setText(currentItem.getmDescription());

        TextView costTextView = (TextView) listItemView.findViewById(R.id.textview_cost);

        if (currentItem.hasCost()){
            costTextView.setText(currentItem.getmCost());
            costTextView.setVisibility(View.VISIBLE);
        } else {
            costTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageview_picture);
        // Check if an image is provided for this word or not
        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentItem.getmSrc());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        /*// Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_linear_layout);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);*/

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
