package com.example.fragments2502;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.example.fragments2502.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}

// Обратить внимание на dependencies в buildGradle
// Чтобы создать nav_graph: ПКМ по res -> new -> Android Resource File -> FileName: "nav_graph.xml" , ResourceType: Navigation

// Фрагменты в NavGraph добавляются через прямоугольник с зелёным плюсом (сверху справа, где отображаются фрагменты)

// Для "нормального" расположения элементов в ConstraintLayout используй chain (привязка каждой к каждой.
// привязывай низ верхней к нижней, а верх нижней к верхней, зазубренная линия становится плавнее)
// Затем ПКМ по одному из элементов в цепи -> chain -> packed

// CTRL+ALT+L - настроить табуляцию