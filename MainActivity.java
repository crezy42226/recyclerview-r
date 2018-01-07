package com.alshahri.crezy.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter adapter;
    List<ListItemD> listItemDs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView) findViewById(R.id.id_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new  RecyclerAdapter(listItemDs);
        recyclerView.setAdapter(adapter);

        lists();
    }

    private void lists() {

        listItemDs.add(new ListItemD(R.drawable.a001,"Test1","Test"));
        listItemDs.add(new ListItemD(R.drawable.a002,"test2","Des"));

        listItemDs.add(new ListItemD(R.drawable.a003,"Test1","Test"));
        listItemDs.add(new ListItemD(R.drawable.a004,"test2","Des"));
        listItemDs.add(new ListItemD(R.drawable.a005,"Test1","Test"));
        listItemDs.add(new ListItemD(R.drawable.a006,"test2","Des"));
    }
}
