package us.bojie.android_uts.persistence;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import us.bojie.android_uts.models.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "notes_db";

    public abstract NoteDao getNoteDao();
}
