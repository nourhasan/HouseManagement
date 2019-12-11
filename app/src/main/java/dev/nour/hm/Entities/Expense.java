package dev.nour.hm.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "expenses")
public class Expense {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private String description;

    @NonNull
    private int expense;

    @NonNull
    private long date;

    @NonNull @ColumnInfo(name = "is_additional")
    private boolean isAdditional;

    @NonNull @ColumnInfo(name = "user_id")
    private int userId;

    @NonNull @ColumnInfo(name = "is_deleted")
    private boolean isDeleted;

    @NonNull @ColumnInfo(name = "created_at")
    private long createdAt;

    @ColumnInfo(name = "modified_at")
    private long modifiedAt;

    /*----------------------------------------------------------------*/

    public Expense(){
        this.isAdditional = false;
        this.isDeleted = false;
        this.createdAt = new Date().getTime();
    }

    @Ignore
    public Expense(int userId){
        this.isAdditional = false;
        this.isDeleted = false;
        this.createdAt = new Date().getTime();

        this.userId = userId;
    }

    @Ignore
    public Expense(boolean isAdditional){
        this.isAdditional = isAdditional;
        this.isDeleted = false;
        this.createdAt = new Date().getTime();
    }

    @Ignore
    public Expense(int userId, boolean isAdditional){
        this.isDeleted = false;
        this.createdAt = new Date().getTime();

        this.userId = userId;
        this.isAdditional = isAdditional;
    }

    @Ignore
    public Expense(String description, int expense, long date){
        this.isAdditional = false;
        this.isDeleted = false;
        this.createdAt = new Date().getTime();

        this.description = description;
        this.expense = expense;
        this.date = date;
    }

    @Ignore
    public Expense(int userId, String description, int expense, long date){
        this.isAdditional = false;
        this.isDeleted = false;
        this.createdAt = new Date().getTime();

        this.userId = userId;
        this.description = description;
        this.expense = expense;
        this.date = date;
    }

    @Ignore
    public Expense(int userId, String description, int expense, long date, boolean isAdditional){
        this.isDeleted = false;
        this.createdAt = new Date().getTime();

        this.userId = userId;
        this.description = description;
        this.expense = expense;
        this.date = date;
        this.isAdditional = false;
    }

    /*----------------------------------------------------------------*/

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    @NonNull
    public String getDescription() { return description; }

    public void setDescription(@NonNull String description) { this.description = description; }

    public int getExpense() { return expense; }

    public void setExpense(int expense) { this.expense = expense; }

    public long getDate() { return date; }

    public void setDate(long date) { this.date = date; }

    public boolean getIsAdditional() { return isAdditional; }

    public void setIsAdditional(boolean isAdditional) { this.isAdditional = isAdditional; }

    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public boolean getIsDeleted() { return isDeleted; }

    public void setDeleted(boolean isDeleted) { this.isDeleted = isDeleted; }

    public long getCreatedAt() { return createdAt; }

    public void setCreatedAt(long createdAt) { this.createdAt = createdAt; }

    public long getModifiedAt() { return modifiedAt; }

    public void setModifiedAt(long modifiedAt) { this.modifiedAt = modifiedAt; }
}
