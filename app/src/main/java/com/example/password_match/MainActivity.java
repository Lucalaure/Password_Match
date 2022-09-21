package com.example.password_match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private EditText edtPsswrd1;
    private EditText edtPsswrd2;
    private Button btnChecker;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (TextView) findViewById(R.id.answer);
        edtPsswrd1 = (EditText) findViewById(R.id.edtPsswrd1);
        edtPsswrd2 = (EditText) findViewById(R.id.edtPsswrd2);
        btnChecker = (Button) findViewById(R.id.btnChecker);

        btnChecker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass1 = edtPsswrd1.getText().toString();
                String pass2 = edtPsswrd2.getText().toString();

                if (pass1.length() > 0 && pass2.length() > 0) {
                    if (pass1.equals(pass2)) {
                        answer.setBackgroundColor(Color.parseColor("#90EE90"));
                        answer.setText("THANK YOU");
                    } else {
                        answer.setBackgroundColor(Color.parseColor("#FF0000"));
                        answer.setText("PASSWORDS MUST MATCH");
                    }
                } else {
                    answer.setBackgroundColor(Color.parseColor("#FF0000"));
                    answer.setText("PLEASE FILL ALL FIELDS");
                }
            }
        } );
    }
}