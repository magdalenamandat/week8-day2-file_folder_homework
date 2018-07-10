package models;

import javax.persistence.*;

@Entity
@Table(name = "Files")
public class File {

        private int id;
        private String name;
        private String extention;
        private double size;
        private Folder folder;

        public File() {
        }

        public File(String name, String extention, double size) {
            this.name = name;
            this.extention = extention;
            this.size = size;
            this.folder = folder;
        }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "size")
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "extention")
    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
