package id.or.codelabs.materialtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import id.or.codelabs.materialtab.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup toolbar
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tab");

        //inisialisasi tab dan pager
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter ke dalam ViewPager
        viewPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));
        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(android.R.color.white));

        //set tab ke ViewPager
        tabs.setupWithViewPager(viewPager);

        //konfigurasi gravity fill untuk Tab berada di posisi yang proporsional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
