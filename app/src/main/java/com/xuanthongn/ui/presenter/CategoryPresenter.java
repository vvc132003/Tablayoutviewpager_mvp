package com.xuanthongn.ui.presenter;

import android.content.Context;

import androidx.room.Room;

import com.xuanthongn.data.AppDatabase;
import com.xuanthongn.data.dao.ProductDao;
import com.xuanthongn.ui.constract.ICategoryConstract;
import com.xuanthongn.util.Constants;

public class CategoryPresenter implements ICategoryConstract.IPresenter {
    private ICategoryConstract.IView mView;

    private AppDatabase db;
    public CategoryPresenter(Context context){
        db = Room.databaseBuilder(context,
                AppDatabase.class, Constants.DB_NAME).build();
    }

    @Override
    public void setView(ICategoryConstract.IView view) {
        mView = view;
    }

    @Override
    public void loadProducts(int categoryId) {
        ProductDao productDao = db.productDao();
        mView.setProductsToUI(productDao.getProductsByCategory(categoryId));
    }
}
