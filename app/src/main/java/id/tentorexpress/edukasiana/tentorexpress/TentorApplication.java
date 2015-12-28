package id.tentorexpress.edukasiana.tentorexpress;

/**
 * Created by Irfan on 12/10/2015.
 */
import android.app.Application;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.MaterialModule;
import com.joanzapata.iconify.fonts.SimpleLineIconsModule;

/**
 * Created by Irfan on 12/3/2015.
 */
public class TentorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Iconify.with(new FontAwesomeModule());
        Iconify.with(new MaterialModule());
        Iconify.with(new SimpleLineIconsModule());
    }
}
