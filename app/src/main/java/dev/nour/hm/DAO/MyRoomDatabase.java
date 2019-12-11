package dev.nour.hm.DAO;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import dev.nour.hm.Entities.Expense;

@androidx.room.Database(entities = {Expense.class}, version = 1, exportSchema = false)
public abstract class MyRoomDatabase extends RoomDatabase {
    public abstract ExpenseDao expenseDao();

    public static volatile MyRoomDatabase myRoomDatabase;

    public static MyRoomDatabase getDatabase(final Context context){
        if(myRoomDatabase == null){
            synchronized (MyRoomDatabase.class){
                if(myRoomDatabase == null){
                    myRoomDatabase = Room.databaseBuilder(context.getApplicationContext(),
                            MyRoomDatabase.class, "hm_database.db").build();
                }
            }
        }
        return myRoomDatabase;
    }
}
