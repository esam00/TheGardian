package com.example.android.thegardian;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Essam on 03/03/2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *  @param context     The current context. Used to inflate the layout file.
     * @param news A List of AndroidFlavor objects to display in a list
     */
    public NewsAdapter(Activity context, List<News> news) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, news);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        //find the TextView of the section name  in the list_item with id : section
        TextView section = listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSection());

        //find the TextView of the date  in the list_item with id : date
        TextView date = listItemView.findViewById(R.id.date);
        date.setText(currentNews.getDate());

        //find the TextView of the section name  in the list_item with id : title
        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        //find the TextView of the trail text  in the list_item with id : trailText
        TextView trailText = listItemView.findViewById(R.id.trailText);
        trailText.setText(currentNews.getTrailText());

        //find the TextView of the author name in the list_item with id : author
        TextView author = listItemView.findViewById(R.id.author);
        author.setText(currentNews.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}

