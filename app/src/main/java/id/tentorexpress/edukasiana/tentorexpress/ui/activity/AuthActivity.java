package id.tentorexpress.edukasiana.tentorexpress.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.tentorexpress.edukasiana.tentorexpress.R;
import id.tentorexpress.edukasiana.tentorexpress.base.BaseActivity;

/**
 * Created by Irfan on 12/28/2015.
 */
public class AuthActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }

    public static void startThisActivity(Context context) {
        context.startActivity(new Intent(context, AuthActivity.class));
    }

    public void onClickSignUp(View view)
    {
        SignUpActivity.startThisActivity(this);
    }
    public void onClickLogIn(View view)
    {
        HomeSideBarActivity.startThisActivity(this);
    }

}

