package us.bojie.android_uts;


import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import us.bojie.android_uts.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
