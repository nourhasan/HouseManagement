package dev.nour.hm.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import dev.nour.hm.Entities.Expense;

@Dao
public interface ExpenseDao {
    @Query("SELECT * FROM expenses")
    List<Expense> getAll();

    @Query("SELECT * FROM expenses WHERE id IN (:ids)")
    List<Expense> loadAllByIds(int[] ids);

    @Query("SELECT * FROM expenses WHERE id = :id LIMIT 1")
    Expense findById(int id);

    @Insert
    void insertAll(Expense... expenses);

    @Insert
    void insert(Expense expense);

    @Delete
    void delete(Expense expense);
}
