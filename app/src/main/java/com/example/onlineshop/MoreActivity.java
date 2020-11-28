package com.example.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.paperdb.Paper;

public class MoreActivity extends AppCompatActivity
{
    private Button CartButton,ContactButton,SearchButton,LogoutButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        CartButton = (Button) findViewById(R.id.cart_btn);
        ContactButton = (Button) findViewById(R.id.contact_us_btn);
        SearchButton = (Button) findViewById(R.id.search_btn);
        LogoutButton = (Button) findViewById(R.id.logout_btn);

       

        CartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MoreActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        ContactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MoreActivity.this, ContactUsActivity.class);
                startActivity(intent);
            }
        });

        SearchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MoreActivity.this, SearchProductsActivity.class);
                startActivity(intent);
            }
        });

        LogoutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        });
    }
}