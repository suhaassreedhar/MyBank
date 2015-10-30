package com.example.suhaas.mybank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= "MainActivity";
    EditText mAmountInput;
    Button mWithdrawButton;
    Button mDepositButton;
    TextView mAmountDisplay;
    BankAccount mCurrentAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCurrentAccount = new SavingsAccount();

        mAmountDisplay = (TextView) findViewById(R.id.balance_display);
        mWithdrawButton = (Button) findViewById(R.id.withdraw_button);
        mDepositButton = (Button) findViewById(R.id.deposit_button);
        mAmountInput = (EditText) findViewById(R.id.amount_input);

        mWithdrawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = mAmountInput.getText().toString();
                mCurrentAccount.withdraw(Double.parseDouble(amount));
                mAmountDisplay.setText("Balance is: " + mCurrentAccount.getBalance());
            }
        });

        mDepositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = mAmountInput.getText().toString();
                mCurrentAccount.deposit(Double.parseDouble(amount));
                mAmountDisplay.setText("Balance is :" + mCurrentAccount.getBalance());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
}
