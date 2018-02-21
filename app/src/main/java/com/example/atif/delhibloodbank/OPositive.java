package com.example.atif.delhibloodbank;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public class OPositive extends AppCompatActivity {

    private FirebaseRemoteConfig mFirebaseRemoteConfig;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,
            t25,t26,t27,t28,t29,t30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opositive);


        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        t6=(TextView) findViewById(R.id.t6);
        t7=(TextView) findViewById(R.id.t7);
        t8=(TextView) findViewById(R.id.t8);
        t9=(TextView) findViewById(R.id.t9);
        t10=(TextView) findViewById(R.id.t10);
        t11=(TextView) findViewById(R.id.t11);
        t12=(TextView) findViewById(R.id.t12);
        t13=(TextView) findViewById(R.id.t13);
        t14=(TextView) findViewById(R.id.t14);
        t15=(TextView) findViewById(R.id.t15);
        t16=(TextView) findViewById(R.id.t16);
        t17=(TextView) findViewById(R.id.t17);
        t18=(TextView) findViewById(R.id.t18);
        t19=(TextView) findViewById(R.id.t19);
        t20=(TextView) findViewById(R.id.t20);
        t21=(TextView) findViewById(R.id.t21);
        t22=(TextView) findViewById(R.id.t22);
        t23=(TextView) findViewById(R.id.t23);
        t24=(TextView) findViewById(R.id.t24);
        t25=(TextView) findViewById(R.id.t25);
        t26=(TextView) findViewById(R.id.t26);
        t27=(TextView) findViewById(R.id.t27);
        t28=(TextView) findViewById(R.id.t28);
        t29=(TextView) findViewById(R.id.t29);
        t30=(TextView) findViewById(R.id.t30);




        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();


        long cacheExpiration=0;
        mFirebaseRemoteConfig.fetch(cacheExpiration)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            // Toast.makeText(BloodBank.this,"Fetch successful",Toast.LENGTH_SHORT).show();
                            // Once the config is successfully fetched it must be activated before newly fetched
                            // values are returned.
                            mFirebaseRemoteConfig.activateFetched();
                        } else {
                            //Toast.makeText(BloodBank.this,"Fetch unsuccessful",Toast.LENGTH_SHORT).show();
                        }
                        displayPrice();
                    }
                });
    }

    private void displayPrice() {
        t1.setText(mFirebaseRemoteConfig.getString("opd1name"));
        t2.setText(mFirebaseRemoteConfig.getString("opd1phone"));
        t3.setText(mFirebaseRemoteConfig.getString("opd1address"));

        t4.setText(mFirebaseRemoteConfig.getString("opd2name"));
        t5.setText(mFirebaseRemoteConfig.getString("opd2phone"));
        t6.setText(mFirebaseRemoteConfig.getString("opd2address"));

        t7.setText(mFirebaseRemoteConfig.getString("opd3name"));
        t8.setText(mFirebaseRemoteConfig.getString("opd3phone"));
        t9.setText(mFirebaseRemoteConfig.getString("opd3address"));

        t10.setText(mFirebaseRemoteConfig.getString("opd4name"));
        t11.setText(mFirebaseRemoteConfig.getString("opd4phone"));
        t12.setText(mFirebaseRemoteConfig.getString("opd4address"));

        t13.setText(mFirebaseRemoteConfig.getString("opd5name"));
        t14.setText(mFirebaseRemoteConfig.getString("opd5phone"));
        t15.setText(mFirebaseRemoteConfig.getString("opd5address"));

        t16.setText(mFirebaseRemoteConfig.getString("opd6name"));
        t17.setText(mFirebaseRemoteConfig.getString("opd6phone"));
        t18.setText(mFirebaseRemoteConfig.getString("opd6address"));

        t19.setText(mFirebaseRemoteConfig.getString("opd7name"));
        t20.setText(mFirebaseRemoteConfig.getString("opd7phone"));
        t21.setText(mFirebaseRemoteConfig.getString("opd7address"));

        t22.setText(mFirebaseRemoteConfig.getString("opd8name"));
        t23.setText(mFirebaseRemoteConfig.getString("opd8phone"));
        t24.setText(mFirebaseRemoteConfig.getString("opd8address"));

        t25.setText(mFirebaseRemoteConfig.getString("opd9name"));
        t26.setText(mFirebaseRemoteConfig.getString("opd9phone"));
        t27.setText(mFirebaseRemoteConfig.getString("opd9address"));

        t28.setText(mFirebaseRemoteConfig.getString("opd10name"));
        t29.setText(mFirebaseRemoteConfig.getString("opd10phone"));
        t30.setText(mFirebaseRemoteConfig.getString("opd10address"));

    }
}


