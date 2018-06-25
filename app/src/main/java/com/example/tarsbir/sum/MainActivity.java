package com.example.tarsbir.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText1;
EditText editText2;
    EditText editText3;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.f);
        editText2=findViewById(R.id.f2);
        editText3=findViewById(R.id.result);
        btn=findViewById(R.id.addButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=editText1.getText().toString();
                String n2=editText2.getText().toString();
                int n_1= Integer.parseInt(n1);
                int n_2=Integer.parseInt(n2);
                editText3.setText(String.valueOf(n_1+n_2));

            }
        });
    }
}
