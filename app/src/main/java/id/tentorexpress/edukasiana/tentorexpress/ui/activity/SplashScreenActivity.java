package id.tentorexpress.edukasiana.tentorexpress.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import id.tentorexpress.edukasiana.tentorexpress.R;

/**
 * Created by Irfan on 12/28/2015.
 */
public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    int logoTimer = 0;
                    while (logoTimer < 3000) {
                        sleep(100);
                        logoTimer = logoTimer + 100;
                    }
                    ;
                    startActivity(new Intent("edu.tentor.CLEARSCREEN"));
                }

                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally {
                    finish();
                }
            }
        };

        logoTimer.start();
    }

}
