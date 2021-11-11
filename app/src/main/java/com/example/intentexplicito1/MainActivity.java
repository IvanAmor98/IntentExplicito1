package com.example.intentexplicito1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBuscador(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(((TextView) findViewById(R.id.input)).getText().toString()));
        startActivity(intent);
    }

    public void abrirMaps(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);

        String latitude = ((TextView) findViewById(R.id.inputLat)).getText().toString();
        String longitude = ((TextView) findViewById(R.id.inputLong)).getText().toString();

        intent.setData(Uri.parse("geo:" + latitude + "," + longitude));
        startActivity(intent);
    }
}