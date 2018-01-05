package com.example.nh.fragment;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
/*fragment life cycle:

- onAttach()       // attach the fragment on the activity
- onCreate()       // adds object in memory
- onCreateView()   // draw the design on the activity
- onActivtyCreated()//making sure that the activity is in the memory
- onStart()
- onresume()
- onPause()
- onStop()
- onDestroyView()//the fragment disappears
- onDestroy()
- onDettach()
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       android.app.FragmentManager manager =getFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.main,new FirstFragment());
        ft.commit();

    }
}














