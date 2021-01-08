package com.example.choice.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.choice.MainActivity;
import com.example.choice.R;
import com.example.choice.randname;
import com.example.choice.result;
import com.example.choice.result2;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Activity activity;
    public String settingc;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);






        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button re = (Button) view.findViewById(R.id.generate);
        Spinner setting = (Spinner) view.findViewById(R.id.spinner1);
        Switch singlen = (Switch) view.findViewById(R.id.singlename);
        Switch doublen = (Switch) view.findViewById(R.id.doublename);
        Switch settingplus = (Switch) view.findViewById(R.id.settingplus);


            re.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    boolean checks = settingplus.isChecked();
                    if(checks == false) {
                        Intent nexta = new Intent(getActivity(), result.class);
                        settingc = setting.getSelectedItem().toString();
                        boolean singlename = singlen.isChecked();
                        boolean doublename = doublen.isChecked();
                        nexta.putExtra("key", settingc);
                        nexta.putExtra("sin", singlename);
                        nexta.putExtra("dou", doublename);
                        startActivity(nexta);
                    }else{
                        Intent nexta = new Intent(getActivity(), result2.class);
                        settingc = setting.getSelectedItem().toString();
                        boolean singlename = singlen.isChecked();
                        boolean doublename = doublen.isChecked();
                        nexta.putExtra("key", settingc);
                        nexta.putExtra("sin", singlename);
                        nexta.putExtra("dou", doublename);
                        startActivity(nexta);


                    }


                }
            });


    }

}