package com.example.francisco.practicawifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnEn;
    Button btnDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEn = (Button)findViewById(R.id.buttonEna);
        btnDis = (Button)findViewById(R.id.buttonDis);

        btnEn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "WiFi Activado",
                        Toast.LENGTH_LONG).show();
            }
        });
        btnDis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(), "WiFi Desactivado",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
