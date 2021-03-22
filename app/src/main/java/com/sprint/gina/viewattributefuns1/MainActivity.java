package com.sprint.gina.viewattributefuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Add an event handler to your button so whenever the user clicks,
        the button’s text switches to “On” if it was “Off” and “Off” if it was “On”.
        */
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onText = getString(R.string.on);
                String offText = getString(R.string.off);
                if (button.getText().toString().compareTo(onText) == 0) {
                    button.setText(offText);
                }
                else {
                    button.setText(onText);
                }
            }
        });
    }
}