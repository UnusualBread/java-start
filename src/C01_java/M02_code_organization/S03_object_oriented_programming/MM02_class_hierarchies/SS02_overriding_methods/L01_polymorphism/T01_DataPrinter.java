package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L01_polymorphism;

/*
You are given four classes — Publication, Newspaper, Article and Announcement.
You need to override the methods getType() and getDetails() in classes
inherited from the class Publication. getType() should show the kind of
publication, like a newspaper, and getDetails() should show the class
attribute, such as the source.

Then you need to implement getInfo() in the class Publication using getType()
and getDetails(). The method should return a String with a type of publication
in the first place, then details in round brackets and the title after a colon.
Examples are shown below.
*/

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return getType() + getDetails();
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return this.title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here
    @Override
    public String getType() {
        return "Newspaper ";
    }

    @Override
    public String getDetails() {
        return "(source - " + this.source + "): " + super.getDetails();
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getType() {
        return "Article ";
    }

    @Override
    public String getDetails() {
        return "(author - " + this.author + "): " + super.getDetails();
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getType() {
        return "Announcement ";
    }

    @Override
    public String getDetails() {
        return "(days to expire - " + this.daysToExpire + "): " + super.getDetails();
    }

}
