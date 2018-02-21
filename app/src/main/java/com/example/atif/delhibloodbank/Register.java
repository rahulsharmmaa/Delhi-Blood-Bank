package com.example.atif.delhibloodbank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {


    private FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    private DatabaseReference mRootReference =firebaseDatabase.getReference("member");

    EditText name;
    EditText email;
    EditText password;
    EditText c;
    EditText d;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name=(EditText)findViewById(R.id.editText1);
        email=(EditText)findViewById(R.id.editText2);
        password=(EditText)findViewById(R.id.editText3);


        b=(Button)findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memnew();
               // Toast.makeText(this,"Details Submitted Successfully!",Toast.LENGTH_SHORT).show();
               // Intent i=new Intent(addmem.this,Questionare.class);
               // startActivity(i);
            }
        });


    }


    private void memnew()
    {
        String na=name.getText().toString().trim();
        String e=email.getText().toString().trim();
        String p=password.getText().toString().trim();
        String type="acceptor";
        //String col=c.getText().toString().trim();
        //String date=d.getText().toString().trim();
        if(!TextUtils.isEmpty(na))
        {
            String id=mRootReference.push().getKey();

            Artist artist=new Artist(id,na,e,p,type);
            mRootReference.child(id).setValue(artist);

        }else
        {
            Toast.makeText(this,"You should enter name",Toast.LENGTH_SHORT).show();
        }
    }
}



