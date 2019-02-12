package com.example.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btnClick;
    EditText edtNumber1;
    EditText edtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HandlingNumber();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Chain1 = edtNumber1.getText().toString().trim();
                String Chain2 = edtNumber2.getText().toString().trim();

                if (Chain1.length() == 0 || Chain2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui Lòng Nhập Đủ Số", Toast.LENGTH_SHORT).show();
                } else {
                    int min = Integer.parseInt(Chain1);
                    int max = Integer.parseInt(Chain2);
                    Random random = new Random();
                    int number = random.nextInt(max - min + 1) + min;
                    txtNumber.setText(String.valueOf(number));
                }

            }
        });
    }

    private void HandlingNumber() {
        txtNumber = (TextView) findViewById(R.id.textView);
        btnClick = (Button) findViewById(R.id.btnClick);
        edtNumber1 = (EditText) findViewById(R.id.editText1);
        edtNumber2 = (EditText) findViewById(R.id.editText2);

    }
}
