package com.cwpark.notebook.domain.repository;


import com.cwpark.notebook.domain.Memo;
public interface MemoRepository {
	void addMemo(Memo memo);
	int deleteMemo(int seqNo);
}