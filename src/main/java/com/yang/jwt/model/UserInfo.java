package com.yang.jwt.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;

}
