package com.xuanthongn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.xuanthongn.base.BaseActivity;
import com.xuanthongn.data.model.Product;
import com.xuanthongn.ui.constract.IMainConstract;
import com.xuanthongn.ui.fragment.FavouriteFrament;
import com.xuanthongn.ui.fragment.HomeFrament;
import com.xuanthongn.ui.fragment.SettingFrament;
import com.xuanthongn.ui.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends BaseActivity implements NavigationBarView
                   .OnItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Fragment homeFrament = new HomeFrament();
    Fragment favouriteFrament = new FavouriteFrament();
    Fragment settingFrament = new SettingFrament();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();
    }

    private void initGUI() {
        bottomNavigationView  = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.home){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, homeFrament)
                    .commit();
        }

        if(item.getItemId() == R.id.favourite){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, favouriteFrament)
                    .commit();
        }

        if(item.getItemId() == R.id.setting){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, settingFrament)
                    .commit();
        }

        return true;
    }
}