package com.icia.mjcinema.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Movie {

	private String mcode;
	private String mtitle;
	private String mdirector;
	private String mdate;
	private String mgenre;
	private String mgrade;
	private String mvfilename;
	private String fee;
	
	private MultipartFile mvfile;

}
