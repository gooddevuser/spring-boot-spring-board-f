package com.springdemo.bootboard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_file")
@Data
public class BoardFileEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idx;
	@Column(nullable = false)
	private String userFileName;
	@Column(nullable = false)
	private String savedFileName;
	@Column(nullable = false)
	private long fileSize;
	@Column(nullable = false)
	private String creatorId;
	@Column(nullable = false)
	private Date createdDatetime = new Date();
}








