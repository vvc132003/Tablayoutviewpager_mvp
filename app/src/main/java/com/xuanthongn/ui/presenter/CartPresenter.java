package com.xuanthongn.ui.presenter;

import android.content.Context;

import androidx.room.Room;

import com.xuanthongn.data.AppDatabase;
import com.xuanthongn.ui.constract.ICartConstract;
import com.xuanthongn.util.Constants;

public class CartPresenter implements ICartConstract.IPresenter {
    private ICartConstract.IView mView;
    private AppDatabase db;
    public CartPresenter(Context context){
        db = Room.databaseBuilder(context,
                AppDatabase.class, Constants.DB_NAME).build();
    }

    @Override
    public void setView(ICartConstract.IView view) {
        mView = view;
    }

    @Override
    public void loadOrder() {

    }

    @Override
    public void updateCart(int productId, int quantity) {

    }

    @Override
    public void removeFromCart(int productId) {

    }
}
