package us.bojie.android_uts;


import org.junit.After;
import org.junit.Before;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import us.bojie.android_uts.persistence.NoteDao;
import us.bojie.android_uts.persistence.NoteDatabase;

public abstract class NoteDatabaseTest {

    // system under test
    private NoteDatabase noteDatabase;


    public NoteDao getNoteDao() {
        return noteDatabase.getNoteDao();
    }

    @Before
    public void init() {
        noteDatabase = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                NoteDatabase.class
        ).build();
    }

    @After
    public void finish() {
        noteDatabase.close();
    }
}






