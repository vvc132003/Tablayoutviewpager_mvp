package com.xuanthongn.ui.constract;

import com.xuanthongn.data.model.Category;
import com.xuanthongn.data.model.Product;
import com.xuanthongn.util.Constants;

import java.util.List;

public interface IHomeConstract {
    interface IView{
        void setHotProductsToUI(List<Product> productList);
        void setNewProductsToUI(List<Product> productList);
        void setCategoriesToUI(List<Category> categoryList);
    }
    interface IPresenter{
        void setView(IView view);
        void loadHotProducts();
        void loadNewProducts();
        void loadCategories();
    }
}
