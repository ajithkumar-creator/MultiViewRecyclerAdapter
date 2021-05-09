package com.example.multiview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting lists for recyclerview
        getProductList();
    }

    private void getProductList() {
        ArrayList<Model> list = new ArrayList<>();
        list.add(new Model(Model.TEXT_TYPE, R.string.item_chinese, R.drawable.chinese));
        list.add(new Model(Model.IMAGE_TYPE, R.string.item_american, R.drawable.american, R.string.item_american_price));
        list.add(new Model(Model.DESC_TYPE, R.string.item_malaysian, R.drawable.malaysian, R.string.item_malaysian_price, R.string.item_malaysian_desc));
        list.add(new Model(Model.TEXT_TYPE, R.string.item_american, R.drawable.american));
        list.add(new Model(Model.IMAGE_TYPE, R.string.item_chinese, R.drawable.chinese, R.string.item_chinese_price));
        list.add(new Model(Model.DESC_TYPE, R.string.item_american, R.drawable.malaysian, R.string.item_malaysian_price, R.string.item_chinese_desc));
        list.add(new Model(Model.TEXT_TYPE, R.string.item_chinese, R.drawable.chinese));
        list.add(new Model(Model.IMAGE_TYPE, R.string.item_american, R.drawable.american, R.string.item_american_price));
        list.add(new Model(Model.DESC_TYPE, R.string.item_malaysian, R.drawable.malaysian, R.string.item_malaysian_price, R.string.item_malaysian_desc));
        list.add(new Model(Model.TEXT_TYPE, R.string.item_american, R.drawable.american));
        list.add(new Model(Model.IMAGE_TYPE, R.string.item_chinese, R.drawable.chinese, R.string.item_chinese_price));
        list.add(new Model(Model.DESC_TYPE, R.string.item_american, R.drawable.malaysian, R.string.item_malaysian_price, R.string.item_chinese_desc));
        list.add(new Model(Model.TEXT_TYPE, R.string.item_chinese, R.drawable.chinese));
        list.add(new Model(Model.IMAGE_TYPE, R.string.item_american, R.drawable.american, R.string.item_american_price));
        list.add(new Model(Model.DESC_TYPE, R.string.item_malaysian, R.drawable.malaysian, R.string.item_malaysian_price, R.string.item_malaysian_desc));
        list.add(new Model(Model.TEXT_TYPE, R.string.item_american, R.drawable.american));
        list.add(new Model(Model.IMAGE_TYPE, R.string.item_chinese, R.drawable.chinese, R.string.item_chinese_price));
        list.add(new Model(Model.DESC_TYPE, R.string.item_american, R.drawable.malaysian, R.string.item_malaysian_price, R.string.item_chinese_desc));

        MultiViewTypeAdapter adapter = new MultiViewTypeAdapter(list, this);
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);

    }

}
