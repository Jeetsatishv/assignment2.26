package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    Button button;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        button = (Button)findViewById(R.id.button);
        results = (TextView) findViewById(R.id.results);
        button.setOnClickListener(view -> verifier(email));


    }


    private boolean verifier(EditText email) {
        String UserInput = email.getText().toString();

        if (UserInput.contains("@")) {
            results.setText("Valid");
            results.setBackgroundColor(-16711936);
            return true;
        }
        else {
            results.setText("Invalid");
            results.setBackgroundColor(-65536);
            return false;
        }
    }


}