package rao1122.com.example.my_uni;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static Cursor c;
    static int nameIndex;
    static int addressIndex;
    static int sectorIndex;
    static int emailIndex;
    static int disciplineIndex;
    static int rectorIndex;
    static int cityIndex;
    static int establishedIndex;
    static int provinceIndex;
    static int contactNoIndex;
    static int rankingIndex;
    static int chancellorIndex;
    static int campusIndex;
    static int websiteIndex;

    static SQLiteDatabase sqLiteDatabase;
    public void all(View view){
        Button button=findViewById(R.id.button1);
        Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("tag", (String) button.getTag());
        startActivity(intent);
    }

    public void med(View view){
        Button button=findViewById(R.id.button2);
        Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("tag", (String) button.getTag());
        startActivity(intent);
    }

    public void eng(View view){
        Button button=findViewById(R.id.button3);
        Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("tag", (String) button.getTag());
        startActivity(intent);
    }

    public void pub(View view){
        Button button=findViewById(R.id.button4);
        Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("tag", (String) button.getTag());
        startActivity(intent);
    }

    public void pri(View view){
        Button button=findViewById(R.id.button5);
        Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("tag", (String) button.getTag());
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            sqLiteDatabase = this.openOrCreateDatabase("Pakistan", MODE_PRIVATE, null);
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS myTable(name VARCHAR,sector VARCHAR,chancellor VARCHAR,discipline VARCHAR,province VARCHAR,city VARCHAR,ranking INTEGER,website VARCHAR,address VARCHAR,contactNo VARCHAR,email VARCHAR,campus VARCHAR,rector VARCHAR,established VARCHAR)");

           sqLiteDatabase.execSQL("INSERT INTO myTable(name,sector,chancellor,discipline,province,city," +
                    "ranking,website,address,contactNo,email,campus,rector,established) VALUES " +
                    "('King Edward Medical University','Public/Govt'," +
                    "'Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal Prof. Khalid Masood Gondal','Medical','Punjab','Lahore',6,'https://kemu.edu.pk/'," +
                    "'King Edward Medical University,\n" +
                    " Nelagumbad, Anarkali,\n" +
                    " Lahore, Pakistan. 54000.','+92 (42) 99211145-54'," +
                    "'info@kemu.edu.pk'," +
                    "'Multiple campuses','Prof Mahmood Ali Malik','1860')");
            c=sqLiteDatabase.rawQuery("SELECT * FROM myTable",null);
            nameIndex = c.getColumnIndex("name");
            sectorIndex = c.getColumnIndex("sector");
            chancellorIndex = c.getColumnIndex("chancellor");
            disciplineIndex = c.getColumnIndex("discipline");
            provinceIndex = c.getColumnIndex("province");
            cityIndex = c.getColumnIndex("city");
            rankingIndex = c.getColumnIndex("ranking");
            websiteIndex = c.getColumnIndex("website");
            addressIndex = c.getColumnIndex("address");
            contactNoIndex = c.getColumnIndex("contactNo");
            emailIndex = c.getColumnIndex("email");
            campusIndex = c.getColumnIndex("campus");
            rectorIndex = c.getColumnIndex("rector");
            establishedIndex = c.getColumnIndex("established");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



