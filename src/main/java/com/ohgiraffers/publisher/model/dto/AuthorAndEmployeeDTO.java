package com.ohgiraffers.publisher.model.dto;

public class AuthorAndEmployeeDTO {

    private int authorId;
    private String authorName;
    private Boolean awarded;
    private int empId;
    private String empName;

    public AuthorAndEmployeeDTO() {
    }

    public AuthorAndEmployeeDTO(int authorId, String authorName, int empId, Boolean awarded, String empName) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.awarded = awarded;
        this.empName = empName;
        this.empId = empId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getAwarded() {
        return awarded;
    }

    public void setAwarded(Boolean awarded) {
        this.awarded = awarded;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "작가 코드 : " + authorId +
                " 작가 이름 : '" + authorName + '\'' +
                " 수상 여부 : " + awarded +
                " 담당 직원 코드 : " + empId +
                " 담당 직원 이름 : '" + empName;
    }
}
