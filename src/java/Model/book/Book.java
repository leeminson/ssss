/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.book;

import Model.book.categorybook.CategoryBook;
import Model.book.feedback.FeedBack;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Book {
    private String ISBN,title;
    private Date publishDate;
    private int numberofpage;
    private String language;
    private Author author[];
    private Publisher publisher;
    private CategoryBook categoryBook[];
    private FeedBack feedback[];
    public FeedBack[] getFeedback() {
        return feedback;
    }

    public void setFeedback(FeedBack[] feedback) {
        this.feedback = feedback;
    }
    

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public CategoryBook[] getCategoryBook() {
        return categoryBook;
    }

    public void setCategoryBook(CategoryBook[] categoryBook) {
        this.categoryBook = categoryBook;
    }
    

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getNumberofpage() {
        return numberofpage;
    }

    public void setNumberofpage(int numberofpage) {
        this.numberofpage = numberofpage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
}
