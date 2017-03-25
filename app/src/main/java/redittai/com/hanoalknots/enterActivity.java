package redittai.com.hanoalknots;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class enterActivity extends AppCompatActivity {
Button list,mehandel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        mehandel = (Button)findViewById(R.id.mehandelBtn);
        list = (Button)findViewById(R.id.knotBtn);

    }
    boolean flag =false;
   public void click(View v){

       CheckList ch = new CheckList();
       android.app.FragmentManager fm1 = getFragmentManager();
       android.app.FragmentTransaction tr1= fm1.beginTransaction();
       switch (v.getId()){

           case R.id.knotBtn:
             Intent  in1 =  new Intent(getApplicationContext(),MainActivity.class);
               startActivity(in1);
               break;
           case R.id.mehandelBtn:

               break;
           case R.id.checkListBtn:
               if (flag == false){

                   flag = true;
                   Toast.makeText(getApplicationContext(),flag+"",Toast.LENGTH_SHORT).show();
               tr1.replace(R.id.checkLayout,ch);
               tr1.commit();

               }
               else {
                   flag=false;
                   tr1.remove(ch);
                   Toast.makeText(getApplicationContext(),flag+"",Toast.LENGTH_SHORT).show();

               }

               break;
       }

   }
}
