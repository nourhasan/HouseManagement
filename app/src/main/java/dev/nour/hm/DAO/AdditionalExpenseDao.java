package dev.nour.hm.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import dev.nour.hm.Entities.AdditionalExpense;

@Dao
public interface AdditionalExpenseDao {
    @Query("SELECT * FROM additional_expenses")
    List<AdditionalExpense> getAll();

    @Query("SELECT * FROM additional_expenses WHERE id IN (:ids)")
    List<AdditionalExpense> loadAllByIds(int[] ids);

    @Query("SELECT * FROM additional_expenses WHERE id = :id LIMIT 1")
    AdditionalExpense findById(int id);

    @Insert
    void insertAll(AdditionalExpense... expenses);

    @Delete
    void delete(AdditionalExpense expense);
}
