package com.example.fragments2502;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragments2502.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        // Для приёма текста
/*        String str = getArguments().getString("key");    // возвращает bundle, getString достаёт из него строку по ключу
        Toast.makeText(this.getContext(), str, Toast.LENGTH_SHORT).show();*/

        String colorCode = null;

        FragmentColors color = (FragmentColors)getArguments().get("color");
        switch (color) {
            case RED:
                colorCode = "#FF0000";
                break;
            case GREEN:
                colorCode = "#00FF00";
                break;
            case BLUE:
                colorCode = "#0000FF";
                break;
        }

        binding.secondFragmentContainer.setBackgroundColor(Color.parseColor(colorCode));
        return binding.getRoot();
    }
}