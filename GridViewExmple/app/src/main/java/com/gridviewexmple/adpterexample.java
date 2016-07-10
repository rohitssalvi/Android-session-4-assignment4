package com.gridviewexmple;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ROHIT on 6/1/2016.
 */
public class adpterexample extends BaseAdapter {

    Context c;
    int[] im;
    String [] name;
        LayoutInflater inflate;
    public adpterexample(MainActivity mainActivity, int[] images, String[] name) {

        c=mainActivity;
        im=images;
        this.name=name;
    }

    @Override
    public int getCount() {
        return im.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return im[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        viewHolder viewholder;
        if(convertView==null)
        {
            inflate=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflate.inflate(R.layout.custom_layout,parent,false);
            viewholder=new viewHolder();
            viewholder.image=(ImageView)convertView.findViewById(R.id.imge);
             viewholder.tvName=(TextView)convertView.findViewById(R.id.tvname);

           convertView.setTag(viewholder);

        }else {
            viewholder=(viewHolder)convertView.getTag();
        }


       viewholder.image.setImageResource(im[position]);

        viewholder.tvName.setText(name[position]);

        return convertView;
    }

class viewHolder{
    ImageView image;
    TextView tvName;
}
}
