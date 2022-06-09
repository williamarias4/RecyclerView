package com.abc.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numOfImages = 5;
        String img = "Image ";
        ArrayList<Source> imageList = new ArrayList<>();
        for(int i = 0; i < numOfImages; i++ ) {
            int id = getResources().getIdentifier("imagen"+(i+1), "drawable", getPackageName());
            imageList.add(new Source(img + (i+1), id));
        }

        RecyclerView container = findViewById(R.id.container);

        container.setItemViewCacheSize(20);
        container.setDrawingCacheEnabled(true);
        container.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        container.setAdapter(new Adapter(imageList));
        container.setLayoutManager(layout);
    }
}
