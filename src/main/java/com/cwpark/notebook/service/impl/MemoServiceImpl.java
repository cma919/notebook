package com.cwpark.notebook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwpark.notebook.domain.Memo;
import com.cwpark.notebook.domain.repository.impl.MariaMemoRepository;
import com.cwpark.notebook.service.MemoService;

@Service
public class MemoServiceImpl implements MemoService {
	@Autowired
	MariaMemoRepository mariaMemoRepository;
	
	@Override
	public void addMemo(Memo memo) {
		mariaMemoRepository.addMemo(memo);
	}

	@Override
	public List<Memo> getMemoLines(int maxMemos) {
		return mariaMemoRepository.getMemoLines(maxMemos);
	}

	@Override
	public int deleteMemo(int seqNo) {
		return mariaMemoRepository.deleteMemo(seqNo);
	}
}
