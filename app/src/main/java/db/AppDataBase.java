package db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.akhandanyan.todoapp.model.TodoItem;


@Database(entities = {TodoItem.class}, version=1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract TodoDao mTodoDao();
}
