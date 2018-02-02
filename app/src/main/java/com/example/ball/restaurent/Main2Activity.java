package com.example.ball.restaurent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText nameEditText,surnameEditText,usernameEditText,passwordEditText,phoneEditText, emailEditText;
    private String nameString,surnameString,userString,passwordString,phoneString, emailString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bindWindget();

    }//Main Class

    public void clickSingup(View view) {
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = usernameEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();

        if (chekSpace()) {
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกข้อมูลให้ครบทุกช่อง");
        } else {

        }

    }

    private boolean chekSpace() {

        return nameString.equals("")||
                surnameString.equals("")||
                userString.equals("") ||
                passwordString.equals("")||
                phoneString.equals("")||
                emailString.equals("");


    }

    private void bindWindget() {
        nameEditText = findViewById(R.id.editText7);
        surnameEditText = findViewById(R.id.editText3);
        usernameEditText = findViewById(R.id.editText4);
        passwordEditText = findViewById(R.id.editText8);
        phoneEditText = findViewById(R.id.editText9);
        emailEditText = findViewById(R.id.editText10);


    }
}
