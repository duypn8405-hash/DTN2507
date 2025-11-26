package com.vti.entity;

import java.time.LocalDateTime;

public class Group {
	public int groupId;
	public String groupName;
	public Account creator;
	public LocalDateTime createDate;
	public Group[] groups;
}
