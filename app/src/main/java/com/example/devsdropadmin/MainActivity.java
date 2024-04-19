package com.example.devsdropadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.devsdropadmin.activities.AllPostsActivity;
import com.example.devsdropadmin.activities.AllUsersActivity;

public class MainActivity extends AppCompatActivity {
    Button allUsers,allPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allPosts=findViewById(R.id.all_posts_btn);
        allUsers=findViewById(R.id.user_details_btn);

        allUsers.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, AllUsersActivity.class));
        });
        allPosts.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, AllPostsActivity.class));
        });
    }
}