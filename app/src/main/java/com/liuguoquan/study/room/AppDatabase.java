package com.liuguoquan.study.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import com.liuguoquan.study.room.dao.UserDao;
import com.liuguoquan.study.room.entity.User;

/**
 * Description:
 *
 * Created by liuguoquan on 2017/11/9 11:57.
 */

@Database(entities = { User.class }, version = 1) public abstract class AppDatabase
    extends RoomDatabase {

  public static final String DB_NAME = "user";

  public abstract UserDao userDao();
}
