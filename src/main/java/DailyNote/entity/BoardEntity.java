package DailyNote.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//Board DB TABLE
@Entity
@Getter
@Setter
@Table(name="board_table")
public class BoardEntity extends BaseEntity {

    //pk
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long id;


    @Column(length = 20, nullable = false)
    private String boardWriter;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;

}
