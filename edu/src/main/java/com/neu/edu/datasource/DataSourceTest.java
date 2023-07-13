package com.neu.edu.datasource;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceTest {

    //代码
    //创建连接池
       //基本属性
       //优化属性
    //获取连接对象


    public static void main(String[] args) throws SQLException {

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("sdcx123456,");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/examination");

        //优化
        druidDataSource.setMaxActive(10);
        druidDataSource.setInitialSize(2);
        druidDataSource.setMaxWait(2000);
        druidDataSource.setMinIdle(2);

        for(int i=0;i<11;i++){
            Connection conn = druidDataSource.getConnection();

            if(i==9){
                conn.close();
            }
            System.out.println(conn);
        }






    }
}
