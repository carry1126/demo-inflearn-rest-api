package me.whiteship.demoinflearnrestapi.events;

import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    @NotNull
    private LocalDateTime beginEnrollmentDateTime;    //이벤트등록일시
    @NotNull
    private LocalDateTime closeEnrollmentDateTime;    //이벤트등록종료일시
    @NotNull
    private LocalDateTime beginEventDateTime;         //이벤트시작일시
    @NotNull
    private LocalDateTime endEventDateTime;           //이벤트종료일시
    private String location;                          // (optional) 이게 없으면 온라인 모임
    @Min(0)
    private int basePrice;                            // (optional)
    @Min(0)
    private int maxPrice;                             // (optional)
    @Min(0)
    private int limitOfEnrollment;

}
