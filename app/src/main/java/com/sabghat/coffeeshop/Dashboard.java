package com.sabghat.coffeeshop;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Dashboard extends AppCompatActivity {

    // Variables
    RecyclerView itemRecyclerView;
    String[] itemName, itemDescription;
    int[] imageResource = {R.drawable.image1,R.drawable.coffee_mug,R.drawable.coffee_mug};

    // Objects
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        itemRecyclerView = findViewById(R.id.recyclerview_card);
        itemName = getResources().getStringArray(R.array.item_name_array);
        itemDescription = getResources().getStringArray(R.array.item_description_array);

        itemAdapter = new ItemAdapter(itemName,itemDescription,imageResource,this);

        itemRecyclerView.setAdapter(itemAdapter);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Log.d("Dashboard","Dashboard finished");
    }

}