package com.xuanthongn.ui.constract;

import com.xuanthongn.data.model.Product;

import java.util.List;

public interface ICategoryConstract {
    interface IView{
        void setProductsToUI(List<Product> productList);
    }
    interface IPresenter{
        void setView(IView view);
        void loadProducts(int categoryId);
    }
}
