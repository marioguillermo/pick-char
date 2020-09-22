package com.example.primerparcial.ui;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primerparcial.R;
import com.example.primerparcial.data.CharactersProvider;
import com.example.primerparcial.domain.FairytaleChar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<FairytaleChar> items = CharactersProvider.provideCharacters();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        CharacterAdapter adapter = new CharacterAdapter(this, items);
        listView.setAdapter(adapter);
    }
}