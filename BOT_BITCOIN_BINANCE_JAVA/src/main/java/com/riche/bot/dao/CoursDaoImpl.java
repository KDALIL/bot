package com.riche.bot.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import com.riche.bot.bean.Cours;

public class CoursDaoImpl extends AbstractDaoImpl {

	private static final String requeteInsert = "insert into cours(symbol,volume,prix,dateEnregistrement) values (?,?,?,?)";
	private static final String requeteUpdate = "update cours set symbol = ? ,volume = ? ,prix = ? ,dateEnregistrement = ? ) where id =?";


	public void insert(Cours cours) throws SQLException {
		if (cours != null) {
			Calendar calendar = Calendar.getInstance();
			java.sql.Date dateEnregistrement = new java.sql.Date(calendar.getTime().getTime());

			PreparedStatement preparedStmt = getConnection().prepareStatement(requeteInsert);
			preparedStmt.setString (1, cours.getSymbol());
			preparedStmt.setInt(2, cours.getVolume());
			preparedStmt.setDouble(3, cours.getPrix());
			preparedStmt.setDate(4, dateEnregistrement);
			preparedStmt.execute();
		}
	}


	public void update(Cours cours) throws SQLException {
		if (cours != null) {
			Calendar calendar = Calendar.getInstance();
			java.sql.Date dateEnregistrement = new java.sql.Date(calendar.getTime().getTime());

			PreparedStatement preparedStmt = getConnection().prepareStatement(requeteUpdate);
			preparedStmt.setString (1, cours.getSymbol());
			preparedStmt.setInt(2, cours.getVolume());
			preparedStmt.setDouble(3, cours.getPrix());
			preparedStmt.setDate(4, dateEnregistrement);
			preparedStmt.execute();
		}
	}


}


// create the mysql insert preparedstatement
