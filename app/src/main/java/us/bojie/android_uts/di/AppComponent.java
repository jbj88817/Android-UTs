package us.bojie.android_uts.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import us.bojie.android_uts.BaseApplication;

@Component(
        modules = {
                AndroidInjectionModule.class,
                AppModule.class,
                ActivityBuildersModule.class,
                ViewModelFactoryModule.class
        }
)

public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
