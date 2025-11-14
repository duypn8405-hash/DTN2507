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

public class Program {
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
		account2.department = department2;
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

		// 2. In các thông tin
		// 1 department
		System.out.println("thông tin của department1 ");
		System.out.println("id: " + department1.departmentId);
		System.out.println("name: " + department1.departmentName);
		System.out.println("================================");

		System.out.println("thông tin của department2 ");
		System.out.println("id: " + department2.departmentId);
		System.out.println("name: " + department2.departmentName);
		System.out.println("================================");

		// 2 position
		System.out.println("thông tin của position1 ");
		System.out.println("id: " + position1.positionId);
		System.out.println("name: " + position1.positionName);
		System.out.println("================================");

		System.out.println("thông tin của position2 ");
		System.out.println("id: " + position2.positionId);
		System.out.println("name: " + position2.positionName);
		System.out.println("================================");

		// 3 account
		System.out.println("thông tin của account1 ");
		System.out.println("id: " + account1.accountId);
		System.out.println("username: " + account1.username);
		System.out.println("fullName: " + account1.fullName);
		System.out.println("email: " + account1.email);
		System.out.println("departmentId: " + account1.department.departmentId);
		System.out.println("departmentName: " + account1.department.departmentId);
		System.out.println("================================");

		System.out.println("thông tin của account2 ");
		System.out.println("id: " + account2.accountId);
		System.out.println("username: " + account2.username);
		System.out.println("fullName: " + account2.fullName);
		System.out.println("email: " + account2.email);
		System.out.println("departmentId: " + account2.department.departmentId);
		System.out.println("departmentName: " + account2.department.departmentId);
		System.out.println("================================");

		// 4 group
		System.out.println("thông tin của group1 ");
		System.out.println("id: " + group1.groupId);
		System.out.println("name: " + group1.groupName);
		System.out.println("creator: " + group1.creator.fullName);
		System.out.println("================================");

		System.out.println("thông tin của group2 ");
		System.out.println("id: " + group2.groupId);
		System.out.println("name: " + group2.groupName);
		System.out.println("creator: " + group2.creator.fullName);
		System.out.println("================================");

		// 5 groupAccount
		System.out.println("thông tin của groupAccount1 ");
		System.out.println("GroupID: " + groupAccount1.account.fullName);
		System.out.println("AccountID: " + groupAccount1.group.groupName);
		System.out.println("================================");

		System.out.println("thông tin của groupAccount2 ");
		System.out.println("GroupID: " + groupAccount2.account.fullName);
		System.out.println("AccountID: " + groupAccount2.group.groupName);
		System.out.println("================================");

		// 6 typeQuestion
		System.out.println("thông tin của typeQuestion1 ");
		System.out.println("id: " + typeQuestion1.typeId);
		System.out.println("name: " + typeQuestion1.typeName);
		System.out.println("================================");

		System.out.println("thông tin của typeQuestion2 ");
		System.out.println("id: " + typeQuestion2.typeId);
		System.out.println("name: " + typeQuestion2.typeName);
		System.out.println("================================");

		// 7 CategoryQuestion
		System.out.println("thông tin của categoryQuestion1 ");
		System.out.println("id: " + categoryQuestion1.categoryId);
		System.out.println("name: " + categoryQuestion1.categoryName);
		System.out.println("================================");

		System.out.println("thông tin của categoryQuestion2 ");
		System.out.println("id: " + categoryQuestion2.categoryId);
		System.out.println("name: " + categoryQuestion2.categoryName);
		System.out.println("================================");

		// 8 Question
		System.out.println("thông tin của Question1 ");
		System.out.println("id: " + question1.questionId);
		System.out.println("name: " + question1.content);
		System.out.println("id: " + question1.category.categoryName);
		System.out.println("name: " + question1.type.typeName);
		System.out.println("id: " + question1.creator.fullName);
		System.out.println("================================");

		System.out.println("thông tin của Question2 ");
		System.out.println("id: " + question2.questionId);
		System.out.println("name: " + question2.content);
		System.out.println("id: " + question2.category.categoryName);
		System.out.println("name: " + question2.type.typeName);
		System.out.println("id: " + question2.creator.fullName);
		System.out.println("================================");

		// 9 Answer
		System.out.println("thông tin của Answer1 ");
		System.out.println("id: " + answer1.answerId);
		System.out.println("content: " + answer1.content);
		System.out.println("question: " + answer1.question.content);
		System.out.println("Correct: " + answer1.isCorrect);
		System.out.println("================================");

		System.out.println("thông tin của Answer2 ");
		System.out.println("id: " + answer2.answerId);
		System.out.println("content: " + answer2.content);
		System.out.println("question: " + answer2.question.content);
		System.out.println("Correct: " + answer2.isCorrect);
		System.out.println("================================");

		// 10 Exam
		System.out.println("thông tin của Exam 1 ");
		System.out.println("id: " + exam1.examId);
		System.out.println("code: " + exam1.code);
		System.out.println("title: " + exam1.title);
		System.out.println("Category: " + exam1.category.categoryName);
		System.out.println("Duration: " + exam1.duration);
		System.out.println("Creator: " + exam1.creator.fullName);
		System.out.println("================================");

		System.out.println("thông tin của Exam 2 ");
		System.out.println("id: " + exam2.examId);
		System.out.println("code: " + exam2.code);
		System.out.println("title: " + exam2.title);
		System.out.println("Category: " + exam2.category.categoryName);
		System.out.println("Duration: " + exam2.duration);
		System.out.println("Creator: " + exam2.creator.fullName);
		System.out.println("================================");

		// 11 ExamQuestion
		System.out.println("thông tin của ExamQuestion 1 ");
		System.out.println("Exam: " + examQuestion1.exam.title);
		System.out.println("Question: " + examQuestion1.question.content);

		System.out.println("thông tin của ExamQuestion 2 ");
		System.out.println("Exam: " + examQuestion2.exam.title);
		System.out.println("Question: " + examQuestion2.question.content);

		// 2. In các thông tin
		// 1 department
		System.out.println("thông tin của department1 ");
		System.out.println("id: " + department1.departmentId);
		System.out.println("name: " + department1.departmentName);
		System.out.println("================================");

		System.out.println("thông tin của department2 ");
		System.out.println("id: " + department2.departmentId);
		System.out.println("name: " + department2.departmentName);
		System.out.println("================================");

		// 2 position
		System.out.println("thông tin của position1 ");
		System.out.println("id: " + position1.positionId);
		System.out.println("name: " + position1.positionName);
		System.out.println("================================");

		System.out.println("thông tin của position2 ");
		System.out.println("id: " + position2.positionId);
		System.out.println("name: " + position2.positionName);
		System.out.println("================================");

		// 3 account
		System.out.println("thông tin của account1 ");
		System.out.println("id: " + account1.accountId);
		System.out.println("username: " + account1.username);
		System.out.println("fullName: " + account1.fullName);
		System.out.println("email: " + account1.email);
		System.out.println("departmentId: " + account1.department.departmentId);
		System.out.println("departmentName: " + account1.department.departmentId);
		System.out.println("================================");

		System.out.println("thông tin của account2 ");
		System.out.println("id: " + account2.accountId);
		System.out.println("username: " + account2.username);
		System.out.println("fullName: " + account2.fullName);
		System.out.println("email: " + account2.email);
		System.out.println("departmentId: " + account2.department.departmentId);
		System.out.println("departmentName: " + account2.department.departmentId);
		System.out.println("================================");

		// 4 group
		System.out.println("thông tin của group1 ");
		System.out.println("id: " + group1.groupId);
		System.out.println("name: " + group1.groupName);
		System.out.println("creator: " + group1.creator.fullName);
		System.out.println("================================");

		System.out.println("thông tin của group2 ");
		System.out.println("id: " + group2.groupId);
		System.out.println("name: " + group2.groupName);
		System.out.println("creator: " + group2.creator.fullName);
		System.out.println("================================");

		// 5 groupAccount
		System.out.println("thông tin của groupAccount1 ");
		System.out.println("GroupID: " + groupAccount1.account.fullName);
		System.out.println("AccountID: " + groupAccount1.group.groupName);
		System.out.println("================================");

		System.out.println("thông tin của groupAccount2 ");
		System.out.println("GroupID: " + groupAccount2.account.fullName);
		System.out.println("AccountID: " + groupAccount2.group.groupName);
		System.out.println("================================");

		// 6 typeQuestion
		System.out.println("thông tin của typeQuestion1 ");
		System.out.println("id: " + typeQuestion1.typeId);
		System.out.println("name: " + typeQuestion1.typeName);
		System.out.println("================================");

		System.out.println("thông tin của typeQuestion2 ");
		System.out.println("id: " + typeQuestion2.typeId);
		System.out.println("name: " + typeQuestion2.typeName);
		System.out.println("================================");

		// 7 CategoryQuestion
		System.out.println("thông tin của categoryQuestion1 ");
		System.out.println("id: " + categoryQuestion1.categoryId);
		System.out.println("name: " + categoryQuestion1.categoryName);
		System.out.println("================================");

		System.out.println("thông tin của categoryQuestion2 ");
		System.out.println("id: " + categoryQuestion2.categoryId);
		System.out.println("name: " + categoryQuestion2.categoryName);
		System.out.println("================================");

		// 8 Question
		System.out.println("thông tin của Question1 ");
		System.out.println("id: " + question1.questionId);
		System.out.println("name: " + question1.content);
		System.out.println("id: " + question1.category.categoryName);
		System.out.println("name: " + question1.type.typeName);
		System.out.println("id: " + question1.creator.fullName);
		System.out.println("================================");

		System.out.println("thông tin của Question2 ");
		System.out.println("id: " + question2.questionId);
		System.out.println("name: " + question2.content);
		System.out.println("id: " + question2.category.categoryName);
		System.out.println("name: " + question2.type.typeName);
		System.out.println("id: " + question2.creator.fullName);
		System.out.println("================================");

		// 9 Answer
		System.out.println("thông tin của Answer1 ");
		System.out.println("id: " + answer1.answerId);
		System.out.println("content: " + answer1.content);
		System.out.println("question: " + answer1.question.content);
		System.out.println("Correct: " + answer1.isCorrect);
		System.out.println("================================");

		System.out.println("thông tin của Answer2 ");
		System.out.println("id: " + answer2.answerId);
		System.out.println("content: " + answer2.content);
		System.out.println("question: " + answer2.question.content);
		System.out.println("Correct: " + answer2.isCorrect);
		System.out.println("================================");

		// 10 Exam
		System.out.println("thông tin của Exam 1 ");
		System.out.println("id: " + exam1.examId);
		System.out.println("code: " + exam1.code);
		System.out.println("title: " + exam1.title);
		System.out.println("Category: " + exam1.category.categoryName);
		System.out.println("Duration: " + exam1.duration);
		System.out.println("Creator: " + exam1.creator.fullName);
		System.out.println("================================");

		System.out.println("thông tin của Exam 2 ");
		System.out.println("id: " + exam2.examId);
		System.out.println("code: " + exam2.code);
		System.out.println("title: " + exam2.title);
		System.out.println("Category: " + exam2.category.categoryName);
		System.out.println("Duration: " + exam2.duration);
		System.out.println("Creator: " + exam2.creator.fullName);
		System.out.println("================================");

		// 11 ExamQuestion
		System.out.println("thông tin của ExamQuestion 1 ");
		System.out.println("Exam: " + examQuestion1.exam.title);
		System.out.println("Question: " + examQuestion1.question.content);

		System.out.println("thông tin của ExamQuestion 2 ");
		System.out.println("Exam: " + examQuestion2.exam.title);
		System.out.println("Question: " + examQuestion2.question.content);
	}
}
