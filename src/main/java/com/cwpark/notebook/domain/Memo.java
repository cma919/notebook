package com.cwpark.notebook.domain;

import java.io.Serializable;

public class Memo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6930809665230402371L;
	private int seqNo;
	private String content;
	
	public Memo() {
		super();
	}

	public Memo(int seqNo, String content) {
		this.seqNo = seqNo;
		this.content = content;
	}
	
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}