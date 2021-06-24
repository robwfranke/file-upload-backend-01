package nl.lotrac.bv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;




@Getter
@Setter
@EqualsAndHashCode
@ToString


    @Entity
    @Table(name = "files")
    public class FileDB {
        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        private String id;

        private String name;

        private String type;

        @Lob
        private byte[] data;

        public FileDB() {
        }

        public FileDB(String name, String type, byte[] data) {
            this.name = name;
            this.type = type;
            this.data = data;
        }



}
