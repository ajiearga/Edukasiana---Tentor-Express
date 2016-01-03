package id.tentorexpress.edukasiana.tentorexpress.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.tentorexpress.edukasiana.tentorexpress.R;
import id.tentorexpress.edukasiana.tentorexpress.base.BaseActivity;

/**
 * Created by Irfan on 1/1/2016.
 */
public class SignUpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        toolbar_title.setText("Pendaftaran");
    }

    public static void startThisActivity(Context context) {
        context.startActivity(new Intent(context, SignUpActivity.class));
    }

    public void onCLickLogIn(View view) {
        AuthActivity.startThisActivity(this);
    }

    public void onClickSignIn(View view) {
        HomeSideBarActivity.startThisActivity(this);
    }
}
