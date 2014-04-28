package org.androidconnect.listview.horizontal;

import org.androidconnect.listview.horizontal.adapter.HorizontalListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.androidconnect.listview.horizontal.adapter.HorizontalListViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class HorizontalListViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.listviewdemo);
		
		HorizontalListView listview = (HorizontalListView) findViewById(R.id.listview);

        List<String> titles = new ArrayList<String>();
        titles.add("Title 1");
        titles.add("Title 2");
        titles.add("Title 3");
        titles.add("Title 4");
        titles.add("Title 5");

        HorizontalListViewAdapter adapter = new HorizontalListViewAdapter(this, titles);
		listview.setAdapter(adapter);
		
	}

}