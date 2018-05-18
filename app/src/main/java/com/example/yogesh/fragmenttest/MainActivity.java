package com.example.yogesh.fragmenttest;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.yogesh.fragmenttest.Discussion.ItemTwoFragment;
import com.example.yogesh.fragmenttest.HomeAdapter.ItemOneFragment;
import com.example.yogesh.fragmenttest.Notification.ItemThreeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                selectedFragment = ItemOneFragment.newInstance();
                                break;
                            case R.id.navigation_dashboard:
                                selectedFragment = ItemTwoFragment.newInstance();
                                break;
                            case R.id.navigation_notifications:
                                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.yogesh.notification");
                                if (launchIntent != null) {
                                   startActivity(launchIntent);//null pointer check in case package name was not found
                        }

                               // selectedFragment = ItemThreeFragment.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.content, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.content, ItemTwoFragment.newInstance());
        transaction.commit();

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }
}