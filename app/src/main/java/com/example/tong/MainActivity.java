package com.example.tong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edta, edtb;
    TextView txtht;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
    }

    private void addControls() {
        edta = (EditText) findViewById(R.id.edta);
        edtb = (EditText) findViewById(R.id.edtb);
        txtht = (TextView) findViewById(R.id.txtht);
    }
    public void xulibtn(View view){
        int a = Integer.parseInt(edta.getText().toString());
        int b = Integer.parseInt(edtb.getText().toString());
        int sum = a + b;
        txtht.setText(String.valueOf(sum));
    }
}
