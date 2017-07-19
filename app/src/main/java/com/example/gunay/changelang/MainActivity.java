package com.example.gunay.changelang;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button eng, azer;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = preferences.edit();
        eng = (Button)findViewById(R.id.eng);
        azer = (Button)findViewById(R.id.azer);

    }
    public void EngTranslate(View view){
        lang = "en";
        setLangRecreate(lang);

    }
    public void AzTranslate(View view){
        lang = "az";
        setLangRecreate(lang);

    }
    public void setLangRecreate(String langval) {
        editor.putString("Lang",langval);
        editor.apply();
        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
    }

}
