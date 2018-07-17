package db;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateTypeConverter
{
    @TypeConverter
    public static Date toDate(Long value) {
        return value == null ? new Date(0) : new Date(value);
    }

    @TypeConverter
    public static Long toLong(Date value) {
        return value == null ? value.getTime() : value.getTime();
    }
}


