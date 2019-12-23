package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DataFragment extends Fragment {

    private TextView tv;

    public static DataFragment newInstance(String name) {

        Bundle args = new Bundle();
        args.putString("name", name);
        DataFragment fragment = new DataFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_data_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv = view.findViewById(R.id.fragment_test_tv3);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.get("name").toString();
            tv.setText(name);
        }

    }
}
