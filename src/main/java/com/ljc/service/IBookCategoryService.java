package com.ljc.service;

import com.ljc.model.BookCategory;
import com.ljc.utils.page.Page;

import java.util.List;

public interface IBookCategoryService {

    //图书类别分页查询
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum);

    int deleteBookCategoryById(int bookCategoryId);

    List<BookCategory> selectAllBookCategories();
}
