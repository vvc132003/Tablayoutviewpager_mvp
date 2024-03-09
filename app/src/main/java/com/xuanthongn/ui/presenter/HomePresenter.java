package com.xuanthongn.ui.presenter;

import android.content.Context;

import androidx.room.Room;

import com.xuanthongn.data.AppDatabase;
import com.xuanthongn.data.dao.CategoryDao;
import com.xuanthongn.data.dao.ProductDao;
import com.xuanthongn.ui.constract.IHomeConstract;
import com.xuanthongn.util.Constants;

public class HomePresenter implements IHomeConstract.IPresenter {
    private IHomeConstract.IView mView;

    private AppDatabase db;
    public HomePresenter(Context context){
        db = Room.databaseBuilder(context,
                AppDatabase.class, Constants.DB_NAME).build();
    }

    @Override
    public void setView(IHomeConstract.IView view) {
        mView = view;
    }

    @Override
    public void loadHotProducts() {
        ProductDao productDao = db.productDao();
        mView.setHotProductsToUI(productDao.getHotProducts());
    }

    @Override
    public void loadNewProducts() {
        ProductDao productDao = db.productDao();
        mView.setNewProductsToUI(productDao.getNewProducts());
    }

    @Override
    public void loadCategories() {
        CategoryDao categoryDao = db.categoryDao();
        mView.setCategoriesToUI(categoryDao.getAll());
    }
}
