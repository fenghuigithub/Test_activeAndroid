package com.example.test_activeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Table(name="Category")
    public class Category extends Model{
        @Column(name="Name")
        public String name;
    }
    @Table(name="Items")
    public class Items extends Model{
        @Column(name="Name")
        public String name;
        @Column(name="Category")
        public Category category;
    }
}
