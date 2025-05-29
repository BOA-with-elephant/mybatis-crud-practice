package com.ohgiraffers.run;

import com.ohgiraffers.publisher.controller.AuthorControllerYR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AuthorControllerYR authorControllerYR = new AuthorControllerYR();

        do{
            System.out.println("======= 작가 관리 =======");
            System.out.println("1. 작가 전체 조회");
            System.out.println("2. 작가 코드로 작가 조회");
            System.out.println("3. 신규 작가 추가(create)");
            System.out.println("4. 작가 담당 직원 수정(update)");
            System.out.println("5. 작가 삭제(delete)");
            System.out.print("작가 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: authorControllerYR.selectAllAuthor(); break;
                case 2: authorControllerYR.selectAuthorByCode(inputAuthorCode()); break;
                case 3: authorControllerYR.registAuthor(inputAuthor()); break;
                case 4: authorControllerYR.modifyAuthorEmp(inputAuthorEmp()); break;
                case 5: authorControllerYR.deleteAuthor(inputDeleteAuthor()); break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다!!");
            }

        }while (true);
    }

    static public int inputAuthorCode(){
        Scanner sc= new Scanner(System.in);
        System.out.print("작가 코드를 입력하세요.");
        return Integer.parseInt(sc.nextLine());
    }

    static public Map<String,String> inputAuthor(){
        Scanner sc = new Scanner(System.in);
        Map<String, String>  parameter = new HashMap<>();

        System.out.print("작가 이름을 입력하세요.");
        parameter.put("name", sc.nextLine());

        System.out.print("작가 수상 여부를 입력하세요.(1 = true, 0 = false)");
        parameter.put("awarded", sc.nextLine());

        System.out.println("담당 직원 코드를 입력하세요.");
        parameter.put("id", sc.nextLine());

        return parameter;
    }

    static public Map<String,String> inputAuthorEmp(){
        Scanner sc = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();

        System.out.println("수정할 작가 코드를 입력해주세요. : ");
        parameter.put("id", sc.nextLine());

        System.out.println("담당할 직원 코드를 입력해주세요. : ");
        parameter.put("empId", sc.nextLine());


        return parameter;
    }

    static public int inputDeleteAuthor(){
        Scanner sc= new Scanner(System.in);
        System.out.print("삭제할 작가 코드를 입력하세요.");
        return Integer.parseInt(sc.nextLine());
    }

}
