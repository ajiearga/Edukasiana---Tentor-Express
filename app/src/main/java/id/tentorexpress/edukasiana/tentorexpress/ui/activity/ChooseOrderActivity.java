package id.tentorexpress.edukasiana.tentorexpress.ui.activity;

import android.os.Bundle;
import android.view.View;

import id.tentorexpress.edukasiana.tentorexpress.R;
import id.tentorexpress.edukasiana.tentorexpress.base.BaseActivity;

/**
 * Created by Irfan on 1/3/2016.
 */
public class ChooseOrderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_order);
        toolbar_title.setText("Pemesanan");
    }

    public void onClickOrder(View view) {
        ChooseTentorActivity.startThisActivity(this);
    }
}