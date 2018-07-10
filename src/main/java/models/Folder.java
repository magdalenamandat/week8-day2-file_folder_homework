package models;


@Entity
@Table(name = "folders")
public class Folder {


        private int id;
        private String title;

        public Folder() {
        }


        public Folder(String title) {
            this.title = title;
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

        @Column(name = "title")
        public String getName() {
            return title;
        }

        public void setName(String title) {
            this.title = title;
        }

    }
}
