package com.example.connor.ccc_wumap;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                //changing to Map
                /*
                TODO
                String: title_map
                ID: navigation_map (Done)
                Change Icon (done)
                 */
                case R.id.navigation_map:
                    mTextMessage.setText(R.string.title_map);
                    return true;
                //changing to Buildings
                /*
                TODO
                String: title_buildings
                ID: navigation_buildings
                Change Icon
                 */
                case R.id.navigation_buildings:
                    mTextMessage.setText(R.string.title_buildings);
                    return true;
                //changing to Departments
                /*
                TODO
                String: title_departments
                ID: navigation_departments
                Change Icon
                 */
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
