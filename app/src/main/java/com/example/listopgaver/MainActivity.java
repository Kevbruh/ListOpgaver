package com.example.listopgaver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listTest);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        List<Substances> substances = new ArrayList<>();

        substances.add(new Substances("Trenbolone Acetate"));
        substances.add(new Substances("Trenbolone Acetate"));
        substances.add(new Substances("Trenbolone Acetate"));
        substances.add(new Substances("Trenbolone Acetate"));
        substances.add(new Substances("Trenbolone Acetate"));


        PostAdapter postAdapter = new PostAdapter(substances);
        recyclerView.setAdapter(postAdapter);
    }
}