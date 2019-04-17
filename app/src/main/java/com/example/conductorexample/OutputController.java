package com.example.conductorexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;

public class OutputController extends Controller {

    public OutputController(int sum, int product, int quotient, int difference) {

        // Prepare bundle to pass parameters
        getArgs().putInt("sum", sum);
        getArgs().putInt("product", product);
        getArgs().putInt("quotient", quotient);
        getArgs().putInt("difference", difference);
    }

    public OutputController(){

    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_outputs, container, false);

        // Views
        TextView tvSum = view.findViewById(R.id.sum);
        TextView tvDifference = view.findViewById(R.id.diff);
        TextView tvProduct = view.findViewById(R.id.product);
        TextView tvQuotient = view.findViewById(R.id.quotient);

        // Retrieve parameters from passed bundle
        Bundle bundle = getArgs();
        Toast.makeText(getActivity(), getArgs().getInt("sum")+"", Toast.LENGTH_SHORT).show();

        // Populate views
        tvSum.setText(String.valueOf(bundle.getInt("sum")));
        tvProduct.setText(String.valueOf(bundle.getInt("product")));
        tvQuotient.setText(String.valueOf(bundle.getInt("quotient")));
        tvDifference.setText(String.valueOf(bundle.getInt("difference")));

        return view;
    }

}
