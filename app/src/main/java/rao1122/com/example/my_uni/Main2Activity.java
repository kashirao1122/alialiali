package rao1122.com.example.my_uni;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String tag=intent.getStringExtra("tag");
        Log.i("tag",tag);
        android.widget.ListView listView=findViewById(R.id.myListView);
        final ArrayList<String> uni=new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,uni);
        try {
            switch (tag){

                case "1":
                    Log.i("tag",tag);
                    MainActivity.c = MainActivity.sqLiteDatabase.rawQuery("SELECT * FROM myTable", null);
                    MainActivity.c.moveToFirst();
                    while (MainActivity.c != null) {
                        uni.add(MainActivity.c.getString(MainActivity.nameIndex));
                        MainActivity.c.moveToNext();
                    }
                case "2":   Log.i("tag",tag);

                    MainActivity.c = MainActivity.sqLiteDatabase.rawQuery("SELECT * FROM myTable WHERE discipline='Medical'", null);
                    MainActivity.c.moveToFirst();
                    while (MainActivity.c != null) {
                        uni.add(MainActivity.c.getString(MainActivity.nameIndex));
                        MainActivity.c.moveToNext();
                    }
                case "3":
                    Log.i("tag",tag);
                    MainActivity.c = MainActivity.sqLiteDatabase.rawQuery("SELECT * FROM myTable where discipline='Engineering'", null);
                    MainActivity.c.moveToFirst();
                    while (MainActivity.c != null) {
                        uni.add(MainActivity.c.getString(MainActivity.nameIndex));
                        MainActivity.c.moveToNext();
                    }
                case "4":
                    Log.i("tag",tag);
                    MainActivity.c = MainActivity.sqLiteDatabase.rawQuery("SELECT * FROM myTable where sector ='Public'", null);
                    MainActivity.c.moveToFirst();
                    while (MainActivity.c != null) {
                        uni.add(MainActivity.c.getString(MainActivity.nameIndex));
                        MainActivity.c.moveToNext();
                    }
                case "5":
                    Log.i("tag",tag);
                    MainActivity.c = MainActivity.sqLiteDatabase.rawQuery("SELECT * FROM myTable where sector='Private'", null);
                    MainActivity.c.moveToFirst();
                    while (MainActivity.c != null) {
                        uni.add(MainActivity.c.getString(MainActivity.nameIndex));
                        MainActivity.c.moveToNext();
                    }
            }

        }catch (Exception e){
            e.printStackTrace();

        }
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try{
                    String namee=uni.get(position);
                    MainActivity.c = MainActivity.sqLiteDatabase.rawQuery("SELECT * FROM myTable WHERE name="+"'"+namee+"'",null);
                    MainActivity.c.moveToFirst();
                    Intent intent=new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(intent);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}


