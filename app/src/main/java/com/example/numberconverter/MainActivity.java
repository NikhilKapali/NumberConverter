package com.example.numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.numberconverter.R.id.btn_convert;

public class MainActivity extends AppCompatActivity {

    Button btn_1;
    EditText ed_number;
    TextView txt_result;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_number = findViewById(R.id.edit_number);
        txt_result = findViewById(R.id.txt_convert);
        
        btn_1 = findViewById(btn_convert);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_convert:
                        number = ed_number.getText().toString();
                        String result = EnglishNumberToWords.convert(Integer.parseInt(number));
                        txt_result.setText(result);
                }
            }
        });

    }
}
