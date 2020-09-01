package rao1122.com.example.my_uni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    TextView data;



    String s;

    public void BROWS(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(MainActivity.c.getString(MainActivity.websiteIndex)));
        startActivity(intent);
    }



    public void calll(View v){
        s="tel:"+s;

        Intent intent=new Intent(Intent.ACTION_CALL,Uri.parse(MainActivity.c.getString(MainActivity.contactNoIndex)));
        //intent.setData(Uri.parse(s));
        startActivity(intent);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent=getIntent();

        data=findViewById(R.id.textView2);
        data.setText(MainActivity.c.getString(MainActivity.nameIndex));
        data=findViewById(R.id.textView5);
        data.setText(MainActivity.c.getString(MainActivity.sectorIndex));

       data=findViewById(R.id.textView15);
        data.setText(MainActivity.c.getString(MainActivity.chancellorIndex));



        data=findViewById(R.id.textView17);
        data.setText(MainActivity.c.getString(MainActivity.disciplineIndex));


        data=findViewById(R.id.textView18);
        data.setText(MainActivity.c.getString(MainActivity.provinceIndex));


        data=findViewById(R.id.textView21);
        data.setText(MainActivity.c.getString(MainActivity.cityIndex));



        data=findViewById(R.id.textView23);
        data.setText(MainActivity.c.getString(MainActivity.rankingIndex));


        data=findViewById(R.id.textView25);
        data.setText(MainActivity.c.getString(MainActivity.websiteIndex));


        data=findViewById(R.id.textView27);
        data.setText(MainActivity.c.getString(MainActivity.addressIndex));


        data=findViewById(R.id.textView29);
        data.setText(MainActivity.c.getString(MainActivity.contactNoIndex));

        s=MainActivity.c.getString(MainActivity.contactNoIndex);

        data=findViewById(R.id.textView31);
        data.setText(MainActivity.c.getString(MainActivity.emailIndex));


        data=findViewById(R.id.textView33);
        data.setText(MainActivity.c.getString(MainActivity.campusIndex));


        data=findViewById(R.id.textView35);
        data.setText(MainActivity.c.getString(MainActivity.rectorIndex));


        data=findViewById(R.id.textView37);
        data.setText(MainActivity.c.getString(MainActivity.establishedIndex));




        Log.i("address:",MainActivity.c.getString(MainActivity.nameIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.addressIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.rankingIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.emailIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.rectorIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.chancellorIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.websiteIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.campusIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.establishedIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.sectorIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.contactNoIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.disciplineIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.disciplineIndex));
        Log.i("address:",MainActivity.c.getString(MainActivity.cityIndex));
    }
}



