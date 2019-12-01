package us.bojie.android_uts.di;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import us.bojie.android_uts.viewmodel.ViewModelProviderFactory;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}







