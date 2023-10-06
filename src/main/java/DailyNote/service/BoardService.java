package DailyNote.service;

import DailyNote.dto.BoardDTO;
import DailyNote.entity.BoardEntity;
import DailyNote.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//DTO - Entity(db, service) (Entity Class)
//Entity -> DTO(view) (DTO Class)

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO){
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
