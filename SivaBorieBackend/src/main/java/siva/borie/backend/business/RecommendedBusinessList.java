package siva.borie.backend.business;

import org.json.JSONArray;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import siva.borie.backend.database.DatabaseConnection;

/**
 * Created by Eungjun on 2015-03-09.
 */
public class RecommendedBusinessList extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        JSONArray bizArray = readDB();
        
    }

    private JSONArray readDB()
    {
        JSONArray bizArray = new JSONArray();
        Connection conn = DatabaseConnection.getConnection();

        try
        {
            Statement stmt = conn.createStatement();
            String query = "select * from ";

        } catch (SQLException e)
        {
            e.printStackTrace();
        }


        return bizArray;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    }
}
