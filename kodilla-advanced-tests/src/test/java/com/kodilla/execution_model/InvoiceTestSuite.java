package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item dress = new Item("Dress", 206.50);
    Item shoes = new Item("Shoes", 184.60);
    Item jeans = new Item("Jeans", 69.90);
    Item shirt = new Item("Shirt", 83.20);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(dress);
        invoice.addItem(shoes);
        invoice.addItem(jeans);
        invoice.addItem(shirt);
    }

    @Test
    public void shouldAddItemToTheInvoice() {
        //when
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(4, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //when
        Item result = invoice.getItem(1);
        //then
        assertEquals("Shoes", result.getName());
        assertEquals(184.60, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenIndexIsNegative() {
        //when
        Item result = invoice.getItem(-5);
        //then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenIndexIsOutOfRange() {
        //when
        Item result = invoice.getItem(12);
        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //given
        int invoiceSizeBeforeClear = invoice.getSize();
        //when
        invoice.clear();
        //then
        assertEquals(4, invoiceSizeBeforeClear);
        assertEquals(0, invoice.getSize());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}