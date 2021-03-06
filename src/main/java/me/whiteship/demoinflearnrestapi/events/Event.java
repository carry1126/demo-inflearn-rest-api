package me.whiteship.demoinflearnrestapi.events;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
@Entity
public class Event {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;    //이벤트등록일시
    private LocalDateTime closeEnrollmentDateTime;    //이벤트등록종료일시
    private LocalDateTime beginEventDateTime;         //이벤트시작일시
    private LocalDateTime endEventDateTime;           //이벤트종료일시
    private String location;                          // (optional) 이게 없으면 온라인 모임
    private int basePrice;                            // (optional)
    private int maxPrice;                             // (optional)
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;
    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus = EventStatus.DRAFT;

}
