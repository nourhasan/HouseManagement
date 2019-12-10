package dev.nour.hm.Repos;

import android.content.Context;
import android.os.AsyncTask;

import dev.nour.hm.DAO.ExpenseDao;
import dev.nour.hm.DAO.MyRoomDatabase;
import dev.nour.hm.Entities.Expense;

public class ExpenseRepo {
    private MyRoomDatabase roomDb;
    private ExpenseDao expenseDao;

    public ExpenseRepo(Context context){
        this.roomDb = MyRoomDatabase.getDatabase(context);
        this.expenseDao = roomDb.expenseDao();
    }

    public void insert(Expense expense){
        new Insert(expenseDao).execute(expense);
    }

    public void insertAll(Expense... expenses){
        new Insert(expenseDao).execute(expenses);
    }
}

class Insert extends AsyncTask<Expense, Void, Void>{
    ExpenseDao expenseDao;

    public Insert(ExpenseDao expenseDao){
        this.expenseDao = expenseDao;
    }

    @Override
    protected Void doInBackground(Expense... expenses) {
        expenseDao.insert(expenses[0]);
        return null;
    }
}

class InsertAll extends AsyncTask<Expense, Void, Void>{
    ExpenseDao expenseDao;

    public InsertAll(ExpenseDao expenseDao){
        this.expenseDao = expenseDao;
    }

    @Override
    protected Void doInBackground(Expense... expenses) {
        expenseDao.insertAll(expenses);
        return null;
    }
}
