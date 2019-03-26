package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author 1", "title 1", 1999, "986-1-12-123456-0"));
        bookSet.add(new Book("author 2", "title 2", 2000, "456-1-12-123456-1"));
        bookSet.add(new Book("author 3", "title 3", 2001, "865-1-12-123456-2"));
        bookSet.add(new Book("author 4", "title 4", 2002, "246-1-12-123456-3"));
        bookSet.add(new Book("author 5", "title 5", 2003, "876-1-12-123456-4"));
        bookSet.add(new Book("author 6", "title 6", 2004, "924-1-12-123456-5"));
        //When
        int median = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2002, median);
    }
}
