package DailyNote.dto;


import lombok.*;

import java.time.LocalDateTime;

//게시판 글 작성 DTO
@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모들 필드 매개변수 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    //조회수
    private int boardHits;
    private LocalDateTime boardCreateTime;
    private LocalDateTime boardUpdateTime;
}
