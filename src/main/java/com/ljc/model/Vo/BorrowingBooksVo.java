package com.ljc.model.Vo;

import com.ljc.model.Book;
import com.ljc.model.User;
import lombok.Data;

/**
 * @author zbw
 * 添加视图层对象
 * 新增属性 user
 */
@Data
public class BorrowingBooksVo {
    private User user;
    private Book book;  //借阅书籍
    private String dateOfBorrowing;  //借书日期
    private String dateOfReturn;    //还书日期
}
