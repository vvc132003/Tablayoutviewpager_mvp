package com.xuanthongn.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xuanthongn.DetailActivity;
import com.xuanthongn.MainActivity;
import com.xuanthongn.R;
import com.xuanthongn.data.model.Product;
import com.xuanthongn.util.Constants;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{
    private Context mContext;
    private List<Product> mProductList;
    public ProductAdapter(Context mContext, List<Product> productList) {
        this.mContext = mContext;
        this.mProductList = productList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View heroView = inflater.inflate(R.layout.item_product, parent, false);
        ViewHolder viewHolder = new ViewHolder(heroView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = mProductList.get(position);
//        Glide.with(mContext)
//                .load(hero.getImage())
//                .into(holder.mImageHero);
        holder.mTextName.setText(product.name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //KHoi dong Activty DetailActivity
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra(Constants.PRODUCT_ID, product.id);

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;
        private TextView mTextName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.iv_image);
            mTextName = itemView.findViewById(R.id.tv_name);
        }
    }
}
