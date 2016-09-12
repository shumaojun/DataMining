package com.its.funny.datamining.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Test {

	  public static void main(String args[]) {
	    Connection con = null;
	    Statement st = null;
	    ResultSet rs = null;
	    try {
	      // 获得MySQL驱动的实例
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      // 获得连接对象(提供：地址，用户名，密码)
	      con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/datamining","root", "123");
	     
	      if (!con.isClosed())
	        System.out.println("Successfully connected ");
	      else
	        System.out.println("failed connected");
	      
	      //建立一个Statement，数据库对象
	      st = con.createStatement();
	      
	      for(int i=0; i<10; i++) {
	    	  String sql = "insert into datamining.user(username,password,register_time)values("+"'小李',"+"'123456','2016-09-10'"+")";
	    	   st.execute(sql);
	    	   System.out.println("SUccess");
	       }
	      // 运行SQL查询语句
	      rs = st.executeQuery("select * from datamining.user;");
	      // 读取结果集
	      while (rs.next()) {
	        System.out.println("column1:"+rs.getInt(1));
	        System.out.println("column2:"+rs.getString(2));
	        System.out.println("column3:"+rs.getString(3));
	        System.out.println("column4:"+rs.getString(4));
	      }
	      // 关闭链接
	      con.close();
	    } catch(Exception e) {
	      System.err.println("Exception: " + e.getMessage());
	    }
	  }
	}
