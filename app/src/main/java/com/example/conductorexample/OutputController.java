package com.example.conductorexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;

public class OutputController extends Controller {

    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_inputs, container, false);

        // Views
        TextView tvSum = view.findViewById(R.id.sum);
        TextView tvDifference = view.findViewById(R.id.diff);
        TextView tvProduct = view.findViewById(R.id.product);
        TextView tvQuotient = view.findViewById(R.id.quotient);

        return view;
    }

}
