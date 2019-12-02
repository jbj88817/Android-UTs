package us.bojie.android_uts.di;

import android.app.Application;

import javax.inject.Singleton;

import androidx.room.Room;
import dagger.Module;
import dagger.Provides;
import us.bojie.android_uts.persistence.NoteDao;
import us.bojie.android_uts.persistence.NoteDatabase;

import static us.bojie.android_uts.persistence.NoteDatabase.DATABASE_NAME;

@Module
class AppModule {

    @Singleton
    @Provides
    static NoteDatabase provideNoteDatabase(Application application) {
        return Room.databaseBuilder(
                application,
                NoteDatabase.class,
                DATABASE_NAME
        ).build();
    }

    @Singleton
    @Provides
    static NoteDao provideNoteDao(NoteDatabase noteDatabase) {
        return noteDatabase.getNoteDao();
    }


//    @Singleton
//    @Provides
//    static NoteRepository provideNoteRepository(NoteDao noteDao) {
//        return new NoteRepository(noteDao);
//    }
}















