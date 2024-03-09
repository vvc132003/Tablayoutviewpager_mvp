package com.xuanthongn.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xuanthongn.R;
import com.xuanthongn.base.BaseFragment;
import com.xuanthongn.data.model.Category;
import com.xuanthongn.data.model.Product;
import com.xuanthongn.ui.adapter.ProductAdapter;
import com.xuanthongn.ui.constract.IHomeConstract;
import com.xuanthongn.ui.presenter.HomePresenter;

import java.util.List;

public class HomeFrament extends BaseFragment implements IHomeConstract.IView {
    private IHomeConstract.IPresenter mPresenter;
    private RecyclerView rvHotProducts;
    private RecyclerView rvNewProducts;
    private RecyclerView rvCategories;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_fragment, container, false);
        initGUI(root);
        initData();
        
        return root;
    }
    private void initGUI(View root) {
        rvHotProducts = root.findViewById(R.id.rv_hot_products);
        rvHotProducts.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void initData() {

        mPresenter = new HomePresenter(getContext());
        mPresenter.setView(this);

        mPresenter.loadCategories();
        mPresenter.loadHotProducts();
        mPresenter.loadNewProducts();
    }


    @Override
    public void setHotProductsToUI(List<Product> productList) {
        ProductAdapter adapter = new ProductAdapter(getContext(), productList);
        rvHotProducts.setAdapter(adapter);
    }

    @Override
    public void setNewProductsToUI(List<Product> productList) {

    }

    @Override
    public void setCategoriesToUI(List<Category> categoryList) {

    }
}
