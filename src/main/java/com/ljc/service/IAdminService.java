package com.ljc.service;

import com.ljc.model.Admin;
import com.ljc.model.Book;
import com.ljc.model.BookCategory;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IAdminService {

    //验证用户是否存在
    boolean adminIsExist(String name);

    //管理员登陆
    Admin adminLogin(String name, String password);

    //&emsp;&emsp;录入新书
    boolean addBook(Book book);

    //获取所有图书类别
    List<BookCategory> getBookCategories();

    //增加图书类别
    boolean addBookCategory(BookCategory bookCategory);

    // 更新管理员信息
    boolean updateAdmin(Admin admin, HttpServletRequest request);
}
