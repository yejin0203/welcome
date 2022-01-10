package com.spring.boot.mapper;


import com.spring.boot.dto.ThorClientDTO;

public interface ThorService {
	
	public int maxNum() throws Exception;
	
	public void insertData(ThorClientDTO dto) throws Exception;
	
	public ThorClientDTO getReadData(String id) throws Exception;
	
	

}