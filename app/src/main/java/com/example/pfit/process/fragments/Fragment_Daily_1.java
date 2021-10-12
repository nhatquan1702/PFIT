package com.example.pfit.process.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pfit.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Daily_1 extends Fragment{
    public Fragment_Daily_1() {
        // Required empty public constructor
    }

    public static Fragment_Daily_1 newInstance(String param1, String param2) {
        Fragment_Daily_1 fragment = new Fragment_Daily_1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__daily_1, container, false);
        return view;
    }
}