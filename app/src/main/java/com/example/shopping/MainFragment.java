package com.example.shopping;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainFragment  extends Fragment {
    private BottomNavigationView bottomNavigationView;
    private RecyclerView newItemRecView, popularitemRecView, suggestedItemRecView;
    private GroceryItemAdapter newItemAdapter, popularItemAdapter, suggestedItemAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        initViews(view);
        homeSelect();
        initRecViews();
        return view;
    }
    private void initRecViews(){
        newItemAdapter = new GroceryItemAdapter(getActivity());
        newItemRecView.setAdapter(newItemAdapter);
        newItemRecView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));

        suggestedItemAdapter = new GroceryItemAdapter(getActivity());
        suggestedItemRecView.setAdapter(suggestedItemAdapter);
        suggestedItemRecView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));


        popularItemAdapter = new GroceryItemAdapter(getActivity());
        popularitemRecView.setAdapter(popularItemAdapter);
        popularitemRecView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
    }
    private void homeSelect(){
        bottomNavigationView.setSelectedItemId(R.id.ic_home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        // TODO: 14/12/2022 Finish these case conditions 
                        break;
                    case R.id.ic_cart:
                        break;
                    case R.id.ic_search:
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
    private void initViews(View view){
        bottomNavigationView = view.findViewById(R.id.bottomNavView);
        newItemRecView = view.findViewById(R.id.newItemRecView);
        suggestedItemRecView = view.findViewById(R.id.suggestedRecView);
        popularitemRecView = view.findViewById(R.id.popularRec);

    }
}
