package com.cloud.dto;

import com.cloud.model.Note;
import com.cloud.model.NoteDetail;

import java.util.List;

public class NoteDTO extends Note {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9137450109616800726L;

	private String categrayName;
	
	private List<NoteDetail> details;
	

	public String getCategrayName() {
		return categrayName;
	}

	public void setCategrayName(String categrayName) {
		this.categrayName = categrayName;
	}

	public List<NoteDetail> getDetails() {
		return details;
	}

	public void setDetails(List<NoteDetail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "NoteDTO [categrayName=" + categrayName + ", details=" + details + "]";
	}
	
}
