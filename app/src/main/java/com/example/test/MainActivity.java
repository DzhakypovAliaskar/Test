package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math = new Math();
        setUpListener();
    }

    private void setUpListener() {
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvResult.setVisibility(View.VISIBLE);
                String num1 = binding.etNum1.getText().toString();
                String num2 = binding.etNum2.getText().toString();
                binding.tvResult.setText(math.add(num1,num2));
            }
        });
    }
}