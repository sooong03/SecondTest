package kr.anima.xd.s.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import kr.anima.xd.s.test.interf.IOnFocusListenable;

public class MainActivity extends AppCompatActivity {

    private DashCalendarFragment fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_cloud:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new CloudFragment(MainActivity.this)).commit();

                    return true;
                case R.id.navigation_dashboard:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new DashboardFragment(MainActivity.this)).commit();

                    return true;
                case R.id.navigation_inventory:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new SettingFragment(MainActivity.this)).commit();

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_dashboard);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(fragment instanceof IOnFocusListenable){
            fragment.onWindowFocusChanged(hasFocus);
        }
    }
}
