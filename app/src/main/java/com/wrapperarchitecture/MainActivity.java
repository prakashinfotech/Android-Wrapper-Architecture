package com.wrapperarchitecture;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Requestclass.ProductRequest;
import com.Responseclass.ProductResponse;
import com.wapperclass.WrapperService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnGetProducts;
    private RecyclerView mRecyclerView;
    private List<ProductResponse.ProductList> mProductLists = new ArrayList<>();
    private AdapterForProduct mAdapter;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGetProducts = findViewById(R.id.btnGetProducts);
        mRecyclerView = findViewById(R.id.recycler_view);

        mAdapter = new AdapterForProduct(mProductLists);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        btnGetProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Request parameter

                final ProductRequest mProductRequest = new ProductRequest();
                if (BuildConfig.FLAVOR.equalsIgnoreCase("retailvista")) {
                    mProductRequest.storeId = 0;
                } else if (BuildConfig.FLAVOR.equalsIgnoreCase("snelstart")) {
                    mProductRequest.ApiKey = "Your Key";
                    mProductRequest.pageNumber = "1";
                }

                pd = new ProgressDialog(MainActivity.this);
                pd.setMessage("Please wait...");
                pd.show();
                //Wrapper Service Class
                WrapperService mWrapperService = new WrapperService();

                //GetProduct from any Backend
                mWrapperService.getProduct(mProductRequest, new com.callback.CallBackRequest() {
                    @Override
                    public void onSuccess(Object mObject) {
                        List<ProductResponse.ProductList> temp = (List<ProductResponse.ProductList>) mObject;
                        mProductLists.addAll(temp);
                        mAdapter.notifyDataSetChanged();
                        if (pd != null) {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onFailure(String msg) {
                        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                        if (pd != null) {
                            pd.dismiss();
                        }
                    }
                });

            }
        });

    }


}
