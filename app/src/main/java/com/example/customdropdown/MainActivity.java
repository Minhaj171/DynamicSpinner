package com.example.customdropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] countryNames1={"India","China","Australia","Portugle","America","New Zealand"};
    String[] countryNames2={"Bangladesh","Pakistan","Nepal","Bhutan","Panama","Thailand"};
    String[] countryNames3={"Denmark","Finland","Malaysia","Saudi Arabia","Qatar","Nigeria"};
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);


        customAdapter = new CustomAdapter(getApplicationContext(),countryNames3);
        spin.setAdapter(customAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(), countryNames3[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}