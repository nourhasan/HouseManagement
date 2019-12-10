package dev.nour.hm.DAO;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import dev.nour.hm.Entities.AdditionalExpense;
import dev.nour.hm.Entities.Expense;

@androidx.room.Database(entities = {Expense.class, AdditionalExpense.class}, version = 1, exportSchema = false)
public abstract class MyRoomDatabase extends RoomDatabase {
    public abstract ExpenseDao expenseDao();
    public abstract AdditionalExpenseDao additionalExpenseDao();

    public static volatile MyRoomDatabase myRoomDatabase;

    public static MyRoomDatabase getDatabase(final Context context){
        if(myRoomDatabase == null){
            synchronized (MyRoomDatabase.class){
                if(myRoomDatabase == null){
                    myRoomDatabase = Room.databaseBuilder(context.getApplicationContext(),
                            MyRoomDatabase.class, "hm_database").build();
                }
            }
        }
        return myRoomDatabase;
    }
}
