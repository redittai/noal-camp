package redittai.com.hanoalknots;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 03/01/2017.
 */

public class listAdapter extends ArrayAdapter<knots> {
    public listAdapter(Context context, List<knots> resource) {
        super(context, 0,resource);
    }
TextView shortdesc, name;
    ImageView img;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       final knots k1 =  getItem(position);
        if (convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.adapter,parent,false);
        }

        shortdesc = (TextView)convertView.findViewById(R.id.adapterdesc);
        name = (TextView)convertView.findViewById(R.id.adapterName);
        img= (ImageView)convertView.findViewById(R.id.img1);
        img.setImageDrawable(k1.getImg());
        shortdesc.setText(k1.getShortDescription());
        name.setText(k1.getName());
        return convertView;
    }
}
