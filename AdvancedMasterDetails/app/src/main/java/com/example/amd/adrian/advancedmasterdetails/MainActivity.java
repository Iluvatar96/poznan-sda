package com.example.amd.adrian.advancedmasterdetails;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Podmiana fragmentów
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragmentFrame, new CurrencyCalculatorFragment());
        transaction.commit();
    }

    public void showCurrencyCalculator() {
    }

    public void showInvestmentButton() {
    }
}
