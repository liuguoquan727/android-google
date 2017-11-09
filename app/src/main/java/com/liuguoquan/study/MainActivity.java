package com.liuguoquan.study;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.liuguoquan.study.room.AppDatabase;
import com.liuguoquan.study.room.entity.Address;
import com.liuguoquan.study.room.entity.User;

public class MainActivity extends AppCompatActivity {

  private AppDatabase mDatabase;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mDatabase = Room.databaseBuilder(this, AppDatabase.class, AppDatabase.DB_NAME).build();
    User user = new User();
    user.userId = "223";
    user.name = "liuguoquan";
    user.age = 23;
    Address address = new Address();
    address.city = "shenzhen";
    user.address = address;
    mDatabase.userDao().insertUser(user);
  }
}
