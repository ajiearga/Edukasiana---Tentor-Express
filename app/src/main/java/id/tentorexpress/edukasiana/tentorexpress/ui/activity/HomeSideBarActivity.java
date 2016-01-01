package id.tentorexpress.edukasiana.tentorexpress.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.MaterialIcons;

import id.tentorexpress.edukasiana.tentorexpress.R;
import id.tentorexpress.edukasiana.tentorexpress.base.BaseActivity;
import id.tentorexpress.edukasiana.tentorexpress.ui.fragment.HomeFragment;

/**
 * Created by Irfan on 1/1/2016.
 */
public class HomeSideBarActivity extends BaseActivity {
    DrawerLayout mDrawer;
    NavigationView nvDrawer;

    Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sidebar_home);
        toolbar_title.setText("Tentor Express");
        getSupportActionBar().setHomeAsUpIndicator(new IconDrawable(this, MaterialIcons.md_menu)
                .colorRes(R.color.white)
                .actionBarSize());
        mDrawer = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        nvDrawer = (NavigationView) findViewById(R.id.navigation_view);

        fragment = HomeFragment.newInstance();
        mDrawer.closeDrawer(GravityCompat.START);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
    }

    public void onClickExit(View view) {
        this.finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        // Set an icon in the ActionBar
        menu.findItem(R.id.menu_action).setIcon(
                new IconDrawable(this, MaterialIcons.md_receipt)
                        .colorRes(R.color.white)
                        .actionBarSize());
        return super.onCreateOptionsMenu(menu);
    }

    public static void startThisActivity(Context ctx) {
        Intent intent = new Intent(ctx, HomeSideBarActivity.class);
        ctx.startActivity(intent);
    }
}