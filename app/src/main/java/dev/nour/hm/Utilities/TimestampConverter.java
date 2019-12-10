package dev.nour.hm.Utilities;

import androidx.room.TypeConverter;

import java.util.Date;

public class TimestampConverter {
    @TypeConverter
    public static Date date(Long value) {
        return value == null ? null : new Date(value);
    }
}
