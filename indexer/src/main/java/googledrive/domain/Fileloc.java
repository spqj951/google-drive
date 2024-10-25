package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.Indexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Fileloc_table")
@Data
//<<< DDD / Aggregate Root
public class Fileloc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();
    }

    public static FilelocRepository repository() {
        FilelocRepository filelocRepository = IndexerApplication.applicationContext.getBean(
            FilelocRepository.class
        );
        return filelocRepository;
    }

    //<<< Clean Arch / Port Method
    public static void indexing(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Fileloc fileloc = new Fileloc();
        repository().save(fileloc);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(fileloc->{
            
            fileloc // do something
            repository().save(fileloc);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
