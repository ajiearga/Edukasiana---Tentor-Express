package id.tentorexpress.edukasiana.tentorexpress.base;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import id.tentorexpress.edukasiana.tentorexpress.R;

/**
 * Created by teddy on 12/18/15.
 */
public class BaseActivity extends AppCompatActivity {
    //Define Variable0
    protected Context mContext = this;
    protected Toolbar toolbar;
    protected AppCompatActivity mActivity = this;
    protected ImageView logo;
    protected TextView toolbar_title;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        initActivity();
    }

    protected void initActivity() {
        ButterKnife.bind(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar_title = (TextView) findViewById(R.id.toolbar_tittle);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
