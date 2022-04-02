package com.example.abc.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abc.R;
import com.example.abc.RecyclerContactAdapter;
import com.example.abc.databinding.FragmentHomeBinding;
import com.example.abc.eps;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    Activity table;
    ArrayList<eps> arraycontact = new ArrayList<>();
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;


    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        table= getActivity();

    }

    @Override
    public void onStart() {
        super.onStart();
        RecyclerView k = (RecyclerView)table.findViewById(R.id.recycle);
        k.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        arraycontact.add(new eps("03 Apr 2022", "1st Ramadan", "SUHOOR", "04:30 AM", "IFTAR", "6:34 PM"));
        arraycontact.add(new eps("04 Apr 2022", "2nd Ramadan", "SUHOOR", "04:29 AM", "IFTAR", "6:35 PM"));
        arraycontact.add(new eps("05 Apr 2022", "3rd Ramadan", "SUHOOR", "04:27 AM", "IFTAR", "6:35 PM"));
        arraycontact.add(new eps("06 Apr 2022", "4rth Ramadan", "SUHOOR", "04:26 AM", "IFTAR", "6:36 PM"));
        arraycontact.add(new eps("07 Apr 2022", "5th Ramadan", "SUHOOR", "04:24 AM", "IFTAR", "6:37 PM"));
        arraycontact.add(new eps("08 Apr 2022", "6th Ramadan", "SUHOOR", "04:23 AM", "IFTAR", "6:38 PM"));
        arraycontact.add(new eps("09 Apr 2022", "7th Ramadan", "SUHOOR", "04:21 AM", "IFTAR", "6:39 PM"));
        arraycontact.add(new eps("10 Apr 2022", "8th Ramadan", "SUHOOR", "04:20 AM", "IFTAR", "6:39 PM"));
        arraycontact.add(new eps("11 Apr 2022", "9th Ramadan", "SUHOOR", "04:18 AM", "IFTAR", "6:40 PM"));
        arraycontact.add(new eps("12 Apr 2022", "10th Ramadan", "SUHOOR", "04:17 AM", "IFTAR", "6:41 PM"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(getActivity().getApplicationContext(), arraycontact);
        k.setAdapter(adapter);

    };


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}