package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {
    private Button btn_back,btn_submit;
    private ViewPager viewPager;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        btn_back = findViewById(R.id.searchPageBtnBack);
        btn_submit = findViewById(R.id.searchPageBtnSubmit);
        viewPager = findViewById(R.id.viewPager);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((MainActivity)getActivity()).setViewPager(1);

//                viewPager.setCurrentItem(1,false); // 跳去 FindFragment

                intent = new Intent(SearchActivity.this,MainActivity.class);
                intent.putExtra("page",1);
                startActivity(intent);
            }
        });
    }
}
