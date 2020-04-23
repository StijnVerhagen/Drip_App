package com.example.drip_application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class DashboardFragment extends Fragment implements View.OnClickListener {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View dashboardView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final Button subscribeButton = (Button)dashboardView.findViewById(R.id.butSubcribe);
        Log.i("DASHBOARDFRAG", "Yayyyy");
        subscribeButton.setOnClickListener(this);
        return dashboardView;


    }

    @Override
    public void onClick(View v) {

        Log.i("DASHBOARDFRAG", "Jeuj");
        Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_LONG).show();
    }
}







