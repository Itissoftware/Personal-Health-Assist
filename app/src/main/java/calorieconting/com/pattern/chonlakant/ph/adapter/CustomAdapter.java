package calorieconting.com.pattern.chonlakant.ph.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import calorieconting.com.pattern.chonlakant.ph.R;

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    String[] strName; 

       
    public CustomAdapter(Context context, String[] strName) {
        this.mContext= context;
        this.strName = strName;

    }

    public int getCount() {
        return strName.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = 
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
     
        if(view == null) 
            view = mInflater.inflate(R.layout.list_menu, parent, false);

        TextView textView = (TextView)view.findViewById(R.id.txt_list);
        textView.setText(strName[position]);



        return view;
    }
}