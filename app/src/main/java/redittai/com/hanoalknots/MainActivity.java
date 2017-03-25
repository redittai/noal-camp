package redittai.com.hanoalknots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Serializable{
    TextView txt;
    ImageView headimg;
    LinearLayout lin1;
    Button bt1,bt2,bt3;
    ListView lis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lin1 = (LinearLayout)findViewById(R.id.lin1);
        txt = (TextView)findViewById(R.id.headertxt);
        lis = (ListView) findViewById(R.id.lis1);

        txt.setText("רשימת קשרים");
//        bt1 = (Button)findViewById(R.id.bt1);
//        bt2 = (Button)findViewById(R.id.bt2);
//        bt3 = (Button)findViewById(R.id.bt3);
//        bt1.setText(R.string.Knot);
//        bt2.setText(R.string.Restraint);
//        bt3.setText(R.string.macrame);


        listAdapter shad = new listAdapter(getApplicationContext(),splash.myList);
        lis.setAdapter(shad);


        lis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //  Toast.makeText(getApplicationContext(), splash.myList.get(position).toString(),Toast.LENGTH_SHORT).show();

//          passing knots object to youtube activity
                Intent in1 = new Intent(getApplicationContext(),youtubePlayer.class);
                       in1 .putExtra("url", splash.myList.get(position).getUrl());
                in1.putExtra("description",splash.myList.get(position).getDescription());
                in1.putExtra("name",splash.myList.get(position).getName());
                startActivity(in1);

            }

        });
    }

    }


