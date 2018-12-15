package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testToString() {
        //given
        //creating the library and assigning books
        Library library = new Library("1st Library");
        for (int i = 0; i < 10; i++) {
            library.getBooks().add(new Book("book " + i, "author " + i, LocalDate.now().minusYears(i)));
        }
        Book bookToRemove = new Book("ABC", "DEF", LocalDate.now());
        library.getBooks().add(bookToRemove);
        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("2nd Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("3rd Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(bookToRemove);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
        Assert.assertEquals(11, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}