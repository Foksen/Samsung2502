package com.example.fragments2502;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.fragments2502.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        binding.buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondFragment(makeColorBundle(FragmentColors.RED));
            }
        });

        binding.buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondFragment(makeColorBundle(FragmentColors.GREEN));
            }
        });

        binding.buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondFragment(makeColorBundle(FragmentColors.BLUE));
            }
        });


        // Сменить фрагмент, отправить на него данные
/*        binding = FragmentFirstBinding.inflate(inflater, container, false);     // inflate, container в контейнере объекта
        binding.firstFragmentContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Bundle нужны для передачи информации данных между фрагментами
                // Хранит данные в виде ключ-значение
                Bundle bundle = new Bundle();
                bundle.putString("key", "value");

                Navigation
                        .findNavController(binding.getRoot())
                        .navigate(R.id.action_firstFragment_to_secondFragment, bundle);
                // Указывается ID action, bundle не обязателен (может быть 1,, но в него можно засунуть всё что угодно)
            }
        });*/
        return binding.getRoot();
    }

    private Bundle makeColorBundle(FragmentColors color) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("color", color);       // Сериализация - перевод объекта из кодового состояния в строковую
        return bundle;
    }

    private void moveToSecondFragment(Bundle bundle) {
        Navigation
                .findNavController(binding.getRoot())
                .navigate(R.id.action_firstFragment_to_secondFragment, bundle);
    }
}

// CTRL+/ CTRL+SHIFT+/  - быстрый комментарий