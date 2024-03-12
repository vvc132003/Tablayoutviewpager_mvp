package com.xuanthongn.ui.constract;

import com.xuanthongn.data.model.OrderItem;
import com.xuanthongn.data.model.Product;

import java.util.List;

public interface ICartConstract {
    interface IView{
        void setOrderToUI(List<OrderItem> productList);
        void updateTotal(double total);
        void goToCheckout();
    }
    interface IPresenter{
        void setView(IView view);
        void loadOrder();
        void updateCart(int productId, int quantity);
        void removeFromCart(int productId);
    }
}
