package com.wrapperarchitecture;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.Responseclass.ProductResponse;

import java.util.List;

/**
 * Created by haresh
 * on 18-03-2019.
 */
public class AdapterForProduct  extends RecyclerView.Adapter<AdapterForProduct.MyViewHolder> {

    private List<ProductResponse.ProductList> productLists;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView productName,productBarcode;

        public MyViewHolder(View view) {
            super(view);
            productName = (TextView) view.findViewById(R.id.productName);
            productBarcode = (TextView) view.findViewById(R.id.productBarcode);
        }
    }


    public AdapterForProduct(List<ProductResponse.ProductList> productLists) {
        this.productLists = productLists;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_row_product, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       holder.productName.setText(productLists.get(position).productName);
        holder.productBarcode.setText(""+productLists.get(position).productBarcode);
    }

    @Override
    public int getItemCount() {
        return productLists.size();
    }
}