package com.ljj.service;

import com.ljj.domain.BookCategory;
import com.ljj.utils.page.Page;

import java.util.List;

public interface IBookCategoryService {

    //图书类别分页查询
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum);

    int deleteBookCategoryById(int bookCategoryId);

    List<BookCategory> selectAllBookCategories();
}
