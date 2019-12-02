package us.bojie.android_uts.di;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import us.bojie.android_uts.ui.NotesListActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract NotesListActivity contributeNotesListActivity();

}
