package dev.nour.hm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;
import java.util.List;

import dev.nour.hm.DAO.ExpenseDao;
import dev.nour.hm.DAO.MyRoomDatabase;
import dev.nour.hm.Entities.Expense;
import dev.nour.hm.Repos.ExpenseRepo;

public class CreateHmActivity extends BaseActivity implements View.OnClickListener {
    private Button clickMe;
    private ExpenseRepo expenseRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_hm);

        expenseRepo = new ExpenseRepo(this);

        clickMe = findViewById(R.id.clickMe);
        clickMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.clickMe){
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();

            Expense expense = new Expense();
            expense.expense = 100;
            expense.date = new Date().getTime();
            expense.description = "dfyhgfh";

            expenseRepo.insert(expense);
            //List<Expense> expenses = expenseDao.getAll();
        }
    }
}
