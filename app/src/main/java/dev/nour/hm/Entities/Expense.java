package dev.nour.hm.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "expenses")
public class Expense {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    public int id;

    public int reference;
    public String description;

    @NonNull
    public int expense;
    public Long date;

    @NonNull
    public Boolean is_deleted;

    @NonNull
    public Long created_at;
    public Long modified_at;

    public Expense(){
        this.is_deleted = false;
        this.created_at = new Date().getTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }

    public Long getModified_at() {
        return modified_at;
    }

    public void setModified_at(Long modified_at) {
        this.modified_at = modified_at;
    }
}
