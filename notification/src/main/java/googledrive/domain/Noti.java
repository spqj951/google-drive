package googledrive.domain;

import googledrive.NotificationApplication;
import googledrive.domain.Notificated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Noti_table")
@Data
//<<< DDD / Aggregate Root
public class Noti {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Notificated notificated = new Notificated(this);
        notificated.publishAfterCommit();
    }

    public static NotiRepository repository() {
        NotiRepository notiRepository = NotificationApplication.applicationContext.getBean(
            NotiRepository.class
        );
        return notiRepository;
    }

    //<<< Clean Arch / Port Method
    public static void videoStreamUrl(Videostreamed videostreamed) {
        //implement business logic here:

        /** Example 1:  new item 
        Noti noti = new Noti();
        repository().save(noti);

        */

        /** Example 2:  finding and process
        
        repository().findById(videostreamed.get???()).ifPresent(noti->{
            
            noti // do something
            repository().save(noti);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void indexNoti(Indexed indexed) {
        //implement business logic here:

        /** Example 1:  new item 
        Noti noti = new Noti();
        repository().save(noti);

        */

        /** Example 2:  finding and process
        
        repository().findById(indexed.get???()).ifPresent(noti->{
            
            noti // do something
            repository().save(noti);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
