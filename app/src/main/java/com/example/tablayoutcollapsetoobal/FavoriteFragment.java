package com.example.tablayoutcollapsetoobal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment {

    private RecyclerView rcvmovie;
    private View mView;

    public FavoriteFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_favorite, container, false);

        rcvmovie = mView.findViewById(R.id.rcv_movie);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rcvmovie.setLayoutManager(linearLayoutManager);

        MovieAdapter movieAdapter = new MovieAdapter();
        movieAdapter.setData(getListMovie());
        rcvmovie.setAdapter(movieAdapter);


        return mView;
    }

    private List<Movie> getListMovie() {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie(R.drawable.anh2, "Pokemon", "200.000"));
        list.add(new Movie(R.drawable.anh3,"Marvel", "400.000"));
        list.add(new Movie(R.drawable.hoathoa, "Ca Map", "100.000"));

        list.add(new Movie(R.drawable.anh2, "Pokemon", "200.000"));
        list.add(new Movie(R.drawable.anh3,"Marvel", "400.000"));
        list.add(new Movie(R.drawable.hoathoa, "Ca Map", "100.000"));

        list.add(new Movie(R.drawable.anh2, "Pokemon", "200.000"));
        list.add(new Movie(R.drawable.anh3,"Marvel", "400.000"));
        list.add(new Movie(R.drawable.hoathoa, "Ca Map", "100.000"));

        list.add(new Movie(R.drawable.anh2, "Pokemon", "200.000"));
        list.add(new Movie(R.drawable.anh3,"Marvel", "400.000"));
        list.add(new Movie(R.drawable.hoathoa, "Ca Map", "100.000"));

        return list;
    }
}