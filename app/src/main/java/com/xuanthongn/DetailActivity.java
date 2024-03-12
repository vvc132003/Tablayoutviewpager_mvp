package com.xuanthongn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xuanthongn.base.BaseActivity;
import com.xuanthongn.data.model.Product;
import com.xuanthongn.ui.constract.IDetailConstract;
import com.xuanthongn.ui.presenter.DetailPresenter;
import com.xuanthongn.util.Constants;

public class DetailActivity extends BaseActivity implements IDetailConstract.IView {
    private IDetailConstract.IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initGUI();
        initData();
    }

    private void initGUI() {
    }
    private void initData() {
        mPresenter = new DetailPresenter(this);
        mPresenter.setView(this);

        int productId = getIntent().getIntExtra(Constants.PRODUCT_ID, 1);
        mPresenter.loadProduct(productId);
    }

    @Override
    public void setProductToUI(Product product) {
        //Dung Glide de load anh
    }

    @Override
    public void showMessage(Constants.CART_EVENT event, String message) {

    }
}