package com.example.pcarphin.loginpageandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {

    /*
     * This function prints the username and password to the console when the button is clicked
     */
    public void loginClicked(View view){

        EditText usernameTextView = findViewById(R.id.loginName);
        EditText passwordTextView = findViewById(R.id.loginPassword);

        CharSequence username = usernameTextView.getText();
        CharSequence password = passwordTextView.getText();

        Log.i("Info", "Login was click: credentials : username=" + username + " , password=" + password);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
