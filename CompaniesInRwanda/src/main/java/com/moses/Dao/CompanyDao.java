package com.moses.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moses.controller.DbConnection;
import com.moses.model.Company;



public class CompanyDao {

public static void saveCompany(int registartionNo, String companyName,String category , String owner, LocalDate startingDate, LocalDate registrationDate, Double capital) {
		
		try (Connection con=DbConnection.getConnected()){
			String sql_save_book="INSERT INTO companies ( registartionNo,  companyName,  category,  owner,  startingDate,registrationDate,  capital) values (?,?,?,?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(sql_save_book);
			statement.setInt(1, registartionNo);
			statement.setString(2, companyName);
			statement.setString(3, category);
			statement.setString(4, owner);
			statement.setDate(5, Date.valueOf(startingDate));
			statement.setDate(6, Date.valueOf(registrationDate));
			statement.setDouble(7, capital);
			
			statement.execute();
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
public static List<Company> getAllCompany(){
	List<Company> companyList=new ArrayList<>();
	try (Connection con=DbConnection.getConnected()){
		String sql_get_all_company="SELECT * FROM companies";
		
		PreparedStatement statement=con.prepareStatement(sql_get_all_company);
		
		ResultSet rs= statement.executeQuery();
		while(rs.next()) {
			 int registartionNo=rs.getInt(1);
			 String companyName=rs.getString(2);
			 String category=rs.getString(3);
			 String owner=rs.getString(4);
			 LocalDate startingDate=rs.getDate(5).toLocalDate();
			 LocalDate registrationDate=rs.getDate(6).toLocalDate();
			 Double capital=rs.getDouble(7);
			Company company=new Company(registartionNo,  companyName,  category,  owner,  startingDate,registrationDate,  capital);
			companyList.add(company);
		
			
		}
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
return companyList;
	

}

	
}
