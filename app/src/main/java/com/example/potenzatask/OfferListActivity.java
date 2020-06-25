package com.example.potenzatask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.potenzatask.offer.Example;
import com.example.potenzatask.offer.Item;
import com.example.potenzatask.offer.OfferData;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferListActivity extends AppCompatActivity {

    private static final String TAG = "test";

    OfferData offerData = new OfferData();
    List<Item> items = new ArrayList<>();
    Example example = new Example();

    RecyclerView offerRecyclerView;
    OfferAdapter adapter;
    String token, clientId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_list);

        setTitle("Offer List");

        if (getIntent().getExtras() != null) {
            token = getIntent().getExtras().getString("token");
            clientId = getIntent().getExtras().getString("client_id");
        } else {
            Toast.makeText(this, "Intent Not Getting ", Toast.LENGTH_SHORT).show();
        }



        offerRecyclerView = findViewById(R.id.offerRecyclerView);


        OfferList();

    }

    public void OfferList() {

        String url = "http://test-bh.potenzaglobalsolutions.com/tasteelist/pgsapi/restaurants";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d(TAG, "onResponse: " + response);

                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            example = new Gson().fromJson(jsonObject.toString(), Example.class);
                            items = example.getData().getItems();

                            adapter = new OfferAdapter(OfferListActivity.this, items);
                            offerRecyclerView.setLayoutManager(new LinearLayoutManager(OfferListActivity.this, RecyclerView.VERTICAL, false));
                            offerRecyclerView.setItemAnimator(new DefaultItemAnimator());
                            offerRecyclerView.setAdapter(adapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e(TAG, "error: " + error.toString());
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> map = new HashMap<String, String>();
                map.put("lat", "21.2051027");
                map.put("lng", "72.7734034");
                map.put("device_token", "f2t3N0Nijy8:APA91bE4M8X1I2SGCXzEiIF4NHoz8NZ9vVgaGpcDFogi2wgnHOUYvtYB3gd_UdYRjqFfe99lRnJ4lCKmlqYgd_iQ0irxfaI5DA8FIU2OI4zrWRbWZbd68Xm5kNiVkB62uzhAYZUavWQv");
                map.put("client_id", clientId);
                return map;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("acc-token", token);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }


}


    /*@Override
    public Map getHeaders() throws AuthFailureError {
        HashMap headers = new HashMap();
        headers.put("Content-Type", "application/json");
        headers.put("apiKey", "xxxxxxxxxxxxxxx");
        return headers;
    }*/