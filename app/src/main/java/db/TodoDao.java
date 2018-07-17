package db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.akhandanyan.todoapp.model.TodoItem;

import java.util.List;

@Dao

public interface TodoDao {
    @Query("SELECT * FROM todoitem")
    List<TodoItem> getAll();

    @Query("SELECT * FROM todoitem WHERE mId = :id")
    TodoItem getById(long id);

    @Insert
    void insert(TodoItem item);

    @Update
    void update(TodoItem item);

    @Delete
    void delete(TodoItem item);

}



