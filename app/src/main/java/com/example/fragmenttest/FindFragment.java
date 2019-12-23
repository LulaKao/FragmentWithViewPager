package com.example.fragmenttest;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FindFragment extends Fragment {
    private TextView tv;
    private Button btn_search;
    private Intent intent;

    public static FindFragment newInstance(String name) {

        Bundle args = new Bundle();
        args.putString("name", name);
        FindFragment fragment = new FindFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_find_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv = view.findViewById(R.id.fragment_test_tv2);
        btn_search = view.findViewById(R.id.findPageBtnSearch);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.get("name").toString();
            tv.setText(name);
        }

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
                //((Activity) v.getContext()).finish(); // 強制轉型
            }
        });

    }
}
