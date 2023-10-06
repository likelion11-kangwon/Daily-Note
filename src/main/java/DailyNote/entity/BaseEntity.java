package DailyNote.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

//Time
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp //생성시간
    @Column(updatable = false) //수정시반영 X
    private LocalDateTime createTime;

    @UpdateTimestamp
    @Column(insertable = false) //입력시반영 X
    private LocalDateTime updateTime;
}
