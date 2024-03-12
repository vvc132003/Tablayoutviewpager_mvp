package com.xuanthongn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.xuanthongn.base.BaseActivity;
import com.xuanthongn.data.model.OrderItem;
import com.xuanthongn.ui.constract.ICartConstract;

import java.util.List;

public class CartActivity extends BaseActivity implements ICartConstract.IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    @Override
    public void setOrderToUI(List<OrderItem> productList) {

    }

    @Override
    public void updateTotal(double total) {

    }

    @Override
    public void goToCheckout() {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }
}