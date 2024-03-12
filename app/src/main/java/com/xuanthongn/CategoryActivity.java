package com.xuanthongn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.xuanthongn.base.BaseActivity;
import com.xuanthongn.data.model.Product;
import com.xuanthongn.ui.adapter.ProductAdapter;
import com.xuanthongn.ui.constract.ICategoryConstract;
import com.xuanthongn.ui.presenter.CategoryPresenter;
import com.xuanthongn.util.Constants;

import java.util.List;

public class CategoryActivity extends BaseActivity implements ICategoryConstract.IView {
    private ICategoryConstract.IPresenter mPresenter;
    private RecyclerView rvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        initGUI();
        initData();
    }

    private void initGUI() {
        rvProduct = findViewById(R.id.rv_products);
        rvProduct.setLayoutManager(new LinearLayoutManager(this));
    }
    private void initData() {
        mPresenter = new CategoryPresenter(this);
        mPresenter.setView(this);

        Intent intent = getIntent();
        int categoryId = intent.getIntExtra(Constants.CATEGORY_ID, 1);
        mPresenter.loadProducts(categoryId);
    }

    @Override
    public void setProductsToUI(List<Product> productList) {
        ProductAdapter adapter = new ProductAdapter(this, productList);
        rvProduct.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}