package com.example.vezdekod10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddPodcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_podcast);

        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        List<Map<String, String>> items = new ArrayList<Map<String, String>>();

        Map<String, String> item0 = new HashMap<String, String>(2);
        item0.put("text", "Кому доступен данный подкаст");
        item0.put("subText", "Всем пользователям");
        items.add(item0);

        Map<String, String> item1 = new HashMap<String, String>(2);
        item1.put("text", "Кому доступен данный подкаст");
        item1.put("subText", "Только друзьям");
        items.add(item1);

        Map<String, String> item2 = new HashMap<String, String>(2);
        item2.put("text", "Кому доступен данный подкаст");
        item2.put("subText", "Друзьям и друзьям друзей");
        items.add(item2);

        SimpleAdapter adapter = new SimpleAdapter(this, items,
                android.R.layout.simple_spinner_item, // This is the layout that will be used for the standard/static part of the spinner. (You can use android.R.layout.simple_list_item_2 if you want the subText to also be shown here.)
                new String[] {"subText"},
                new int[] {android.R.id.text1}
        );

// This sets the layout that will be used when the dropdown views are shown. I'm using android.R.layout.simple_list_item_2 so the subtext will also be shown.
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);

    }

    public void onAddPodcastClick(View view) {
        Intent unfinished = new Intent(this, Unfinished.class);
        startActivity(unfinished);
    }
}