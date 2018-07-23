package com.example.pc.ss;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login1 extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button _btnreg;
    EditText _txtfname, _txtlname, _txtpass, _txtemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        _btnreg =(Button)findViewById(R.id.btnreg);
        _txtfname=(EditText)findViewById(R.id.txtfname);
        _txtlname=(EditText)findViewById(R.id.txtlname);
        _txtpass=(EditText)findViewById(R.id.txtpass);
        _txtemail=(EditText)findViewById(R.id.txtemail);
    }
}
