package com.edu.ifsc.atividadecasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Converter(View view) {

    double valorCelsiu;
    double valorKelvin;
    double valorFari;

    EditText editText = (EditText) findViewById(R.id.editText);
    valorCelsiu =  Double.parseDouble(editText.getText().toString());

    RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
    RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
    Button button = (Button) findViewById(R.id.button);
    TextView text = (TextView) findViewById(R.id.text);

    if((radioButton.isChecked()) && (!radioButton2.isChecked())){

        valorKelvin = valorCelsiu + 273.15;
        text.setText(Double.toString(valorKelvin));
        radioButton.setChecked(false);
    }
    if((radioButton2.isChecked() && (!radioButton.isChecked()))){

        valorFari = (valorCelsiu * 1.8) + 32;
        text.setText(Double.toString(valorFari));
        radioButton2.setChecked(false);

    }



    }
}
