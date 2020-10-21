package com.example.worldskillsleague1498;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
//    Button btnPlus, btnMinus, btnMult, btnDiv;
    TextView tvOut;

    // метод, автоматически срабатывающий на этапе создания приложения(до появления на экране телефона)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.et_number1);
        etNum2 = findViewById(R.id.et_number2);
        tvOut = findViewById(R.id.tv_out);

        Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_SHORT).show();
    }

    public void multClick(View view) {

    }

    public void divClick(View view) {

    }

    public void minusClick(View view) {

    }

    public void plusClick(View view) {
        // Вытащить данные с форм ввода(EditText'ы)

            if(!etNum1.getText().toString().isEmpty() && !etNum2.getText().toString().isEmpty()) {
                Integer num1 = Integer.parseInt(etNum1.getText().toString());
                Integer num2 = Integer.parseInt( etNum2.getText().toString() );
                Integer sum = num1 + num2;
                tvOut.setText(sum.toString());
            }
            else{
                Toast.makeText(this, "Введите оба числа!", Toast.LENGTH_SHORT).show();
            }

    }
}
