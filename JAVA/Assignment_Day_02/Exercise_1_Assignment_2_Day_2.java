package com.vti.frontend;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.ExamQuestion;
import com.vti.entity.Group;
import com.vti.entity.GroupAccount;
import com.vti.entity.Position;
import com.vti.entity.PositionName;
import com.vti.entity.Question;
import com.vti.entity.TypeQuestion;

public class Exercise_1_Assignment_2_Day_2 {
	public static void main(String[] args) {
		// 1. Khởi tạo các đối tượng
		// khởi tạo 3 đối tượng từ class Department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "IT";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Security";

		// khởi tạo 3 đối tượng từ class Position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.Dev;

		Position position2 = new Position();
		position2.positionId = 1;
		position2.positionName = PositionName.Test;

		Position position3 = new Position();
		position3.positionId = 1;
		position3.positionName = PositionName.Scrum_master;

		// khởi tạo 3 đối tượng từ class Account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.username = "nguyenvana";
		account1.fullName = "Nguyen Van A";
		account1.email = "nguyenvana@gmail.com";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.accountId = 2;
		account2.username = "nguyenvanb";
		account2.fullName = "Nguyen Van B";
		account2.email = "nguyenvanb@gmail.com";
		account2.department = department1;
		account2.position = position2;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.accountId = 3;
		account3.username = "nguyenvanc";
		account3.fullName = "Nguyen Van C";
		account3.email = "nguyenvanc@gmail.com";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.now();

		// khởi tạo 3 đối tượng từ class Group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Java";
		group1.creator = account1;
		group1.createDate = LocalDateTime.now();

		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "SQL ";
		group2.creator = account2;
		group2.createDate = LocalDateTime.now();

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "Python";
		group3.creator = account3;
		group3.createDate = LocalDateTime.now();

		// khởi tạo 3 đối tượng từ class GroupAccount
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.group = group1;
		groupAccount1.account = account1;
		groupAccount1.joinDate = LocalDateTime.now();

		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.group = group2;
		groupAccount2.account = account2;
		groupAccount2.joinDate = LocalDateTime.now();

		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.group = group2;
		groupAccount3.account = account3;
		groupAccount3.joinDate = LocalDateTime.now();

		GroupAccount groupAccount4 = new GroupAccount();
		groupAccount4.group = group3;
		groupAccount4.account = account3;
		groupAccount4.joinDate = LocalDateTime.now();

		// khởi tạo 3 đối tượng từ class TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = "ESSAY";

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = "MULTIPLE_CHOICE";

		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeId = 3;
		typeQuestion3.typeName = "TRUE_FALSE";

		// khởi tạo 3 đối tượng từ class CategoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "Python";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "SQL";

		// khởi tạo 3 đối tượng từ class Question
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "What is 1?";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator = account1;
		question1.createDate = LocalDateTime.now();

		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "What is 2?";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.creator = account2;
		question2.createDate = LocalDateTime.now();

		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "What is 3?";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion3;
		question3.creator = account3;
		question3.createDate = LocalDateTime.now();

		// khởi tạo 3 đối tượng từ class Answer
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "Java Virtual Machine";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "INNER JOIN";
		answer2.question = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.answerId = 3;
		answer3.content = ".NET Framework";
		answer3.question = question3;
		answer3.isCorrect = false;

		// khởi tạo 3 đối tượng từ class Exam
		Exam exam1 = new Exam();
		exam1.examId = 101;
		exam1.code = "D1";
		exam1.title = "Java Basic";
		exam1.category = categoryQuestion1;
		exam1.duration = 60; // phút
		exam1.creator = account1;
		exam1.createDate = LocalDateTime.now();

		Exam exam2 = new Exam();
		exam2.examId = 202;
		exam2.code = "D2";
		exam2.title = "SQL Pro";
		exam2.category = categoryQuestion2;
		exam2.duration = 45;
		exam2.creator = account1;
		exam2.createDate = LocalDateTime.now();

		Exam exam3 = new Exam();
		exam3.examId = 303;
		exam3.code = "D3";
		exam3.title = "NET Dev";
		exam3.category = categoryQuestion3;
		exam3.duration = 50;
		exam3.creator = account1;
		exam3.createDate = LocalDateTime.now();

		// khởi tạo 3 đối tượng từ class Exam
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;

		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = question2;

		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question3;

//		Exercise 1: Flow Control - Tiếp tục bài tập Day 01

//		IF
//		Question 1:
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.departmentName);
		}

//		Question 2:
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
		int dem = 0;
		if (groupAccount1.account.accountId == account2.accountId) {
			dem += 1;
		} else if (groupAccount2.account.accountId == account2.accountId) {
			dem += 1;
		} else if (groupAccount3.account.accountId == account2.accountId) {
			dem += 1;
		} else if (groupAccount4.account.accountId == account2.accountId) {
			dem += 1;
		}
		if (dem == 0) {
			System.out.println("Nhân viên này chưa có group");
		} else if (dem == 1 || dem == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (dem == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (dem >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + account2.department.departmentName);

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"

// Bắt buộc 2 vế phải cùng kiểu, nếu positionName không phải kiểu String, ép nó thành String nên dùng toString()
		System.out.println(account1.position.positionName.toString() == "Dev" ? "Đây là Developer"
				: "Người này không phải là Developer");
//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"

//			Question 6:
//			Sử dụng switch case để làm lại Question 2

//			Question 7:
//			Sử dụng switch case để làm lại Question 4

	}
}
