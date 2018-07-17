package db;

import android.app.Application;
import android.arch.persistence.room.Room;

public class App extends Application {

    public static App mInstance;

    public static App getInstance() {
        if(mInstance==null){
            mInstance=new App();
        }
        return mInstance;
    }


    public AppDataBase mDataBase;


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        mDataBase= Room.databaseBuilder(this,
                AppDataBase.class,"database").build();
    }


    public AppDataBase getDataBase() {
        return mDataBase;
    }
}
