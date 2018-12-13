/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklib.api;

import java.util.List;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.sfedu.booklib.model.Book;

/**
 *
 * @author Sergey
 */
public class PgsqlDatabaseApiTest extends PgsqlDatabaseApi{
    
    private static final Logger log = Logger.getLogger(PgsqlDatabaseApiTest.class);
    
    
    public PgsqlDatabaseApiTest() {
    }
    
     @BeforeClass
    public static void setUpClass() {
    log.debug("------------------------Postgres SQL Database API TEST LOG-------------------------");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    


    /**
     * Test of connectToDatabase method, of class PgsqlDatabaseApi.
     */
    @Before
    public void testConnectToDatabase() throws Exception {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testConnectToDatabase\" =>");
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        boolean expResult = true;
        boolean result = instance.connectToDatabase();
        assertEquals(expResult, result);
    }
    
    @After
    public void testCloseConnection() {
    log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testCloseConnection\" =>");
    PgsqlDatabaseApi.closeConnection();
    log.debug("----------------------------------------------------------------");
    }

    /**
     * Test of addBook method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testAddBook() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testAddbook\" =>");
        Book bookObject = new Book(47,"The Witr","Test", "Fantasy", "1985","Poland","304");
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        boolean expResult = instance.addBook(bookObject);
        boolean result = true;
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getBookList method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testGetBookList() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testGetBookList\" =>");
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        List<Book> expResult = instance.getBookList();
        List<Book> result = expResult;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBookById method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testGetBookById() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testGetBookById\" =>");
        int bookID = 7;
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        Book expResult =  instance.getBookById(bookID);
        Book result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of printBookList method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testPrintBookList() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testPrintBookList\" =>");
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        boolean expResult = true;
        boolean result = instance.printBookList();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testUpdate() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testUpdate\" =>");
        Book bookObject = new Book(12,"update test 5","Test", "TTTTEEEST", "1985","Poland","304");
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        boolean expResult = true;
        boolean result = instance.update(bookObject);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testDelete() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testDelete\" =>");
        int bookID = 47;
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        boolean expResult = false;
        boolean result = instance.delete(bookID);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of printBook method, of class PgsqlDatabaseApi.
     */
    @Test
    public void testPrintBook() {
        log.debug("\t @TEST@ \t \"PgsqlDatabaseApiTest\" => \"testPrintBook\" =>");
        Book bookObject = new Book(47,"TESTPRINT","Test", "Fantasy", "1488","Poland","304");
        PgsqlDatabaseApi instance = new PgsqlDatabaseApi();
        boolean expResult = true;
        boolean result = instance.printBook(bookObject);
        assertEquals(expResult, result);
    }
    
}
