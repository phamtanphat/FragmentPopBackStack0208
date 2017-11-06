package com.ptp.phamtanphat.fragmentpopbackstack0208;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
    }
    public void AddA(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_A fragment_a = new Fragment_A();
        fragmentTransaction.add(R.id.framelayout,fragment_a,"fragmenta");
        fragmentTransaction.addToBackStack("fragment_A");
        fragmentTransaction.commit();
    }
    public void AddB(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_B fragment_b = new Fragment_B();
        fragmentTransaction.add(R.id.framelayout,fragment_b,"fragmentb");
        fragmentTransaction.addToBackStack("fragment_B");
        fragmentTransaction.commit();
    }
    public void AddC(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_C fragment_c = new Fragment_C();
        fragmentTransaction.add(R.id.framelayout,fragment_c,"fragmentc");
        fragmentTransaction.addToBackStack("fragment_C");
        fragmentTransaction.commit();
    }
    public void RemoveA(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_A fragment_a = (Fragment_A) getFragmentManager().findFragmentByTag("fragmenta");

        if (fragment_a != null){
            fragmentTransaction.remove(fragment_a);
            fragmentTransaction.commit();
        }else {
            Toast.makeText(this, "Fragment A không còn tồn tại", Toast.LENGTH_SHORT).show();
        }
    }
    public void RemoveB(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_B fragment_b = (Fragment_B) getFragmentManager().findFragmentByTag("fragmentb");

        if (fragment_b != null){
            fragmentTransaction.remove(fragment_b);
            fragmentTransaction.commit();
        }else {
            Toast.makeText(this, "Fragment B không còn tồn tại", Toast.LENGTH_SHORT).show();
        }
    }
    public void RemoveC(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_C fragment_c = (Fragment_C) getFragmentManager().findFragmentByTag("fragmentc");

        if (fragment_c != null){
            fragmentTransaction.remove(fragment_c);
            fragmentTransaction.commit();
        }else {
            Toast.makeText(this, "Fragment C không còn tồn tại", Toast.LENGTH_SHORT).show();
        }
    }
    public void Back(View view){
        fragmentManager.popBackStack();
    }
    public void AttachA(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_A fragment_a = (Fragment_A) getFragmentManager().findFragmentByTag("fragmenta");

        if (fragment_a != null){
            fragmentTransaction.attach(fragment_a);
            fragmentTransaction.commit();
            Toast.makeText(this, "Co fragmentA", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Fragment A không có nằm trong stack", Toast.LENGTH_SHORT).show();
        }
    }
    public void DetachA(View view){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_A fragment_a = (Fragment_A) getFragmentManager().findFragmentByTag("fragmenta");

        if (fragment_a != null){
            fragmentTransaction.detach(fragment_a);
            fragmentTransaction.commit();
            Toast.makeText(this, "Co fragmentA", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Fragment A không có nằm trong stack", Toast.LENGTH_SHORT).show();
        }
    }
}

