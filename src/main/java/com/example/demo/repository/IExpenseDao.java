package com.example.demo.repository;

import com.example.demo.model.ModelExpense;
//import java.util.List;

public interface IExpenseDao {
    // ModelExpenseの情報を渡して登録
    int register(ModelExpense expense);

}