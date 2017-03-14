package com.market.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by zhouxin on 17/3/9.
 */
public class JDBC {
    public static final String url = "jdbc:mysql://192.168.60.48:5201/lsh-atp1";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "root123";

    public Connection conn = null;
    public PreparedStatement pst = null;

    public JDBC(String sql) {
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

