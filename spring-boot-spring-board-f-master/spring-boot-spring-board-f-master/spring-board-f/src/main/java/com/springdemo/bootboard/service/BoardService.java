package com.springdemo.bootboard.service;

import java.util.List;

import com.springdemo.bootboard.entity.BoardEntity;
import com.springdemo.bootboard.entity.BoardFileEntity;
import com.springdemo.bootboard.vo.Board;
import com.springdemo.bootboard.vo.BoardFile;

public interface BoardService {
	
	void writeBoard(BoardEntity board);

	List<BoardEntity> findBoardList();

	BoardEntity findBoardByBoardIdx(int boardIdx);

	void updateBoard(BoardEntity board);

	void deleteBoard(BoardEntity board);

	BoardFileEntity findBoardFileByIdx(int idx);

}
