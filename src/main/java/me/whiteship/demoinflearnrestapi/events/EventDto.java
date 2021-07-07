package me.whiteship.demoinflearnrestapi.events;

import lombok.*;

import java.time.LocalDateTime;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

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

}
