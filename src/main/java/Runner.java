import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder = new Folder("Pictures");
        DBHelper.save(folder);

        File file1 = new File("Holiday", "jpg", 10);
        DBHelper.save(file1);

        File file2 = new File("Java project", "java", 120);
        DBHelper.save(file2);

        File file3 = new File("Movies", "mpg4", 1500);
        DBHelper.save(file3);


        List<File> files = DBFile.getAll();

    }
}
