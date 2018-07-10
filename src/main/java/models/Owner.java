package models;

import javax.persistence.*;
import java.util.List;

    @Entity
    @Table(name = "owners")
    public class Owner {


        private int id;
        private String name;
        private String userName;

        public Owner() {
        }


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        @Column(name = "name")
        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
        @Column(name = "userName")
        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }



