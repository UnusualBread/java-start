package theory.M03_working_with_data.S01_file_processing.L01_file_class;

/*
Implement the method areSibling that checks if the files have the same parent.
*/

import java.io.File;

public class T01_SameParentDirChecker {
    public static boolean areSiblings(File f1, File f2) {
        return f1.getParent().equals(f2.getParent());
    }
}
