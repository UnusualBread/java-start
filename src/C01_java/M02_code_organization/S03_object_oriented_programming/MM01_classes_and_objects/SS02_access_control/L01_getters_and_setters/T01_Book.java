package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS02_access_control.L01_getters_and_setters;

/*
Here's a class named Book. It has three fields: a string field title,
an int field yearOfPublishing and an array of strings authors.
Write getters and setters for all fields. 
*/

class T01_Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getAuthors() {
        return authors;
    }
}
