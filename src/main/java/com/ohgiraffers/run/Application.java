package com.ohgiraffers.run;

import com.ohgiraffers.publisher.controller.AuthorControllerYI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AuthorControllerYI authorControllerYI = new AuthorControllerYI();
        do {

            System.out.println("==============작가 관리 프로그램==============" + '\n' +
                    /*"1. 전체 작가 목록 조회" + '\n' +
                    "2. 작가 코드로 작가 조회" + '\n' +*/
                    "1. 담당 직원과 함께 전체 작가 목록 조회" + '\n' +
                    "2. 담당 직원과 함께 작가 코드로 작가 조회" + '\n' +
                    "3. 새 작가 등록" + '\n' +
                    "4. 기존 작가 수정" + '\n' +
                    "5. 작가 삭제" + '\n' +
                    "0. 나가기");
            System.out.print("수행할 메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                /*case 1:
                    authorControllerYI.selectAllAuthor();
                    break;
                case 2:
                    authorControllerYI.selectAuthorByCode(inputAuthorCode());
                    break;*/
                case 1:
                    authorControllerYI.selectAllAuthorWithEmp();
                    break;
                case 2:
                    authorControllerYI.selectAuthorByCodeWithEmp(inputAuthorCode());
                    break;
                case 3:
                    authorControllerYI.insertAuthor(inputAuthorInfo());
                    break;
                case 4:
                    authorControllerYI.updateAuthor(inputAuthorToModify());
                    break;
                case 5:
                    authorControllerYI.deleteAuthor(inputAuthorCode());
                    break;
                case 0:
                    return;
            }
        } while (true);


    }

    private static Map<String, Integer> inputAuthorCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("작가 코드를 입력하세요 : ");
        int code = sc.nextInt();

        Map<String, Integer> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    private static Map<String, String> inputAuthorInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("작가의 이름을 입력하세요 : ");
        String authorName = sc.nextLine();
        System.out.print("작가의 수상 횟수를 입력하세요 : ");
        String awarded = sc.nextLine();
        System.out.print("담당 작가 코드를 입력하세요 ( 300 ~ 314 ) : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("authorName", authorName);
        parameter.put("awarded", awarded);
        parameter.put("empId", empId);

        return parameter;
    }

    private static Map<String, String> inputAuthorToModify() {
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 작가 코드를 입력하세요 : ");
        String authorId = sc.nextLine();
        System.out.print("작가의 수상 횟수를 입력하세요 : ");
        String awarded = sc.nextLine();
        System.out.print("담당 작가 코드를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("authorId", authorId);
        parameter.put("awarded", awarded);
        parameter.put("empId", empId);

        return parameter;
    }

}
