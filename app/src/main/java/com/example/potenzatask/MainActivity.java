package com.example.potenzatask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.potenzatask.offer.Example;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "test";

    EditText email, password;
    Button click;
    Login loginResponse = new Login();
    List<Data> dataList = new ArrayList<>();
    Data data = new Data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Login");

        click = findViewById(R.id.click);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        click.setOnClickListener(this);
    }

    private void LoginDemo() {

        final String str_email = email.getText().toString();
        final String str_password = password.getText().toString();

        if (str_email.isEmpty()) {
            email.setError("Please enter your email");
        } else if (str_password.isEmpty()) {
            password.setError("Please enter your password");
        } else if (str_email.isEmpty() && str_password.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter valid detail", Toast.LENGTH_SHORT).show();
        } else if (!(str_email.isEmpty() && str_password.isEmpty())) {
            String url = "http://test-bh.potenzaglobalsolutions.com/tasteelist/pgsapi/login";

            StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    Log.d(TAG, "onResponse: " + response);

                    try {
                        JSONObject jsonObject = new JSONObject(response);

                        loginResponse = new Gson().fromJson(jsonObject.toString(), Login.class);
                        data = loginResponse.getData();

                        if (loginResponse.getStatus().equals("success")) {
                            Intent intent = new Intent(MainActivity.this, OfferListActivity.class);
                            intent.putExtra("token", data.getAccToken());
                            intent.putExtra("client_id", data.getClientId());
                            startActivity(intent);

                            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                        }else {
                            Toast.makeText(MainActivity.this, "Login Not Successful", Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> map = new HashMap<>();
                    map.put("email", str_email);
                    map.put("password", str_password);
                    map.put("device_token", "APA91bE4M8X1I2SGCXzEiIF4NHoz8NZ9vVgaGpcDFogi2wgnHOUYvtYB3gd_UdYRjqFfe99lRnJ4lCKmlqYgd_iQ0irxfaI5DA8FIU2OI4zrWRbWZbd68Xm5kNiVkB62uzhAYZUavWQv");
                    map.put("device_type", "android");

                    return map;
                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.click:
                LoginDemo();
                break;
        }
    }
}
