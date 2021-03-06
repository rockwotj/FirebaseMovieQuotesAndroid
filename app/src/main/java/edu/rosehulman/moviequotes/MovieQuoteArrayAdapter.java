package edu.rosehulman.moviequotes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;


public class MovieQuoteArrayAdapter extends BaseAdapter {


    private final LayoutInflater mInflater;
    private List<MovieQuote> mMovieQuotes;

    public MovieQuoteArrayAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        mMovieQuotes = new ArrayList<MovieQuote>();
    }

    @Override
    public int getCount() {
        return mMovieQuotes.size();
    }

    public void removeItem(MovieQuote movieQuote) {
        //TODO: Remove data from Firebase
    }

    public void addItem(MovieQuote movieQuote) {
        //TODO: Push new data to Firebase
    }

    public void updateItem(MovieQuote movieQuote, String newMovie, String newQuote) {
        //TODO: Push changes to Firebase
    }

    @Override
    public MovieQuote getItem(int position) {
        return mMovieQuotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = mInflater.inflate(android.R.layout.simple_expandable_list_item_2, parent, false);
        } else {
            view = convertView;
        }
        TextView titleTextView = (TextView) view.findViewById(android.R.id.text2);
        MovieQuote movieQuote = getItem(position);
        titleTextView.setText(movieQuote.getMovie());
        TextView quoteTextView = (TextView) view.findViewById(android.R.id.text1);
        quoteTextView.setText(movieQuote.getQuote());
        return view;
    }

}