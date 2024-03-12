package com.xuanthongn.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "orders")
public class Order {
    @PrimaryKey
    @ColumnInfo(name = "Id")
    public int id;

    @ColumnInfo(name = "code")
    public String code;
    @ColumnInfo(name = "status")
    public String status;
}

