import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;
// To Compile in MacOS/Replit use:  javac -cp sqlite-jdbc-3.23.1.jar: Main.java
// To compile in Windows use:       javac -cp sqlite-jdbc-3.23.1.jar
// To execute(run) in Windows use:  java -cp sqlite-jdbc-3.23.1.jar: Main

/*
To communicate with DB server: In browser, append route name to the Port forwarded address
(ctrl + click link in Codespace Port tab)
OR 
In the browser address bar, type in http:// followed by your IP address, then a colon and the port #, followed by the route name
For e.g., http://192.168.0.100:8500/route_name
*/
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{   

    // Create a port - this is your Gateway
    int port = 8500;

    // Create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // Create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    
    // Default route
    // Problem 1
    server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect....") );

    /* GOAL: To create a webpage that will display a card for each track(song) in the 'tracks' table from the Chinook database. (See picture "chinookDBdiagram.JPG").

    PART 1: Build a database server with the route you will need to serve the required information from the DB. Test your route to make sure that it is working correctly.

    For Part 2, see "Activity50-Website".
    */

    // Add your code here.....see Problem.txt file for tasks
    // Problem 2
    String sql = "";
    sql = "SELECT * FROM customers;";
    server.createContext("/customers", new RouteHandler(db, sql));

    // Problem 3
    sql = "SELECT * FROM employees;";
    server.createContext("/employees", new RouteHandler(db, sql));

    // Problem 4
    sql = "SELECT tracks.name, tracks.composer, albums.title FROM tracks INNER JOIN albums ON tracks.albumid = albums.albumid LIMIT 100;";
    server.createContext("/albumsinfo", new RouteHandler(db, sql));

    // Problem 5
    sql = "SELECT customers.firstname, customers.lastname, tracks.name, invoices.invoicedate FROM tracks, invoice_items, invoices, customers WHERE customers.customerid=invoices.customerid AND invoices.invoiceid=invoice_items.invoiceid AND tracks.trackid=invoice_items.trackid;";
    server.createContext("/songs", new RouteHandler(db, sql));
  
    // Start the server      
    server.start();
    System.out.println("Server is listening on port " + port);       
      
  }    
}
