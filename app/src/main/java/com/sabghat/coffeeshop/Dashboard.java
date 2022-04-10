package com.sabghat.coffeeshop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

    // Variables
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<ItemModelClass> itemModelClassList;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initData();
        initRecyclerView();
    }

    private void initData() {
        itemModelClassList = new ArrayList<>();
        itemModelClassList.add(new ItemModelClass(R.drawable.image1,"Coffee","Tea is Fantastic"));
    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerview_card);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        itemAdapter = new ItemAdapter(itemModelClassList);
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.notifyDataSetChanged();
    }

}