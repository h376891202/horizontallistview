package org.androidconnect.listview.horizontal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.androidconnect.listview.horizontal.R;

import java.util.List;

/**
 * Created by PNB on 4/28/14.
 */
public class HorizontalListViewAdapter extends BaseAdapter {

        Context context;
        List<String> titles;
        public HorizontalListViewAdapter(Context context, List<String> titles){
            super();
            this.context = context;
            this.titles = titles;
        }

        public int getCount() {
            return titles.size();
        }

        public Object getItem(int position) {
            return titles.get(position);
        }

        public long getItemId(int position) {
            return position;
        }


        public View getView(final int position, View convertView, ViewGroup parent) {
            View retval = LayoutInflater.from(context).inflate(R.layout.viewitem, null, false);
            TextView title = (TextView) retval.findViewById(R.id.title);
            Button button = (Button) retval.findViewById(R.id.clickbutton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, titles.get(position), Toast.LENGTH_SHORT).show();
                }
            });
            title.setText(titles.get(position));

            return retval;
        }

}
