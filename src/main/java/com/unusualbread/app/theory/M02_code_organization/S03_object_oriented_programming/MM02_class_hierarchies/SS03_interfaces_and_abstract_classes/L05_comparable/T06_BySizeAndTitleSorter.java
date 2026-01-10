package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L05_comparable;

/*
You should implement comparing articles by their size, and if their sizes are
equal, compare them by title (according to the lexicographical order).
*/

class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        int result = Integer.compare(size, otherArticle.size);
        if (result == 0) {
            result = title.compareTo(otherArticle.title);
        }
        return result;
    }
}
