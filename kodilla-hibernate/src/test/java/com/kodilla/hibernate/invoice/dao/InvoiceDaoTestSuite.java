package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(120), 12,new BigDecimal(32));
        Item item2 = new Item(new BigDecimal(333), 99,new BigDecimal(77));

        Product product1 = new Product("bred");
        Product product2 = new Product("butter");
        Product product3 = new Product("milk");
        product1.getItems().addAll(Arrays.asList(item1, item2));
        product2.getItems().addAll(Arrays.asList(item1));
        product3.getItems().addAll(Arrays.asList(item2));

        Invoice invoice = new Invoice("F/2019/01/13/N/001");
        invoice.getItems().addAll(Arrays.asList(item1, item2));

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Clean
        invoiceDao.delete(id);
    }
}
