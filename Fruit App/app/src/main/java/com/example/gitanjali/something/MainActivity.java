package com.example.gitanjali.something;

import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
    private RecyclerView.Adapter fruitAdapter;


    @BindView(R.id.rv_fruits_list_view)
    RecyclerView fruitRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fruitAdapter = new FruitAdapter(createFruits());
        fruitRecyclerView.setAdapter(fruitAdapter);

    }

    public ArrayList<Fruit> createFruits() {
        fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple",R.drawable.apple));
        fruitList.add(new Fruit("Banana",R.drawable.banana));
        fruitList.add(new Fruit("Blueberries",R.drawable.blueberries));
        fruitList.add(new Fruit("cherries",R.drawable.cherries));
        fruitList.add(new Fruit("Lemon", R.drawable.lemon));
        fruitList.add(new Fruit("Peach",R.drawable.peach));
        fruitList.add(new Fruit("Strawberry",R.drawable.strawberry));
        fruitList.add(new Fruit("Watermelon",R.drawable.watermelon));

        return fruitList;
    }


}
