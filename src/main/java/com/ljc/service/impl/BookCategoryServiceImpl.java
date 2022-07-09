package com.ljc.service.impl;

import com.ljc.mapper.BookCategoryMapper;
import com.ljc.model.BookCategory;
import com.ljc.service.IBookCategoryService;
import com.ljc.utils.page.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookCategoryServiceImpl implements IBookCategoryService {

    @Resource
    private BookCategoryMapper bookCategoryMapper;

    @Override
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum) {
        Page<BookCategory> page = new Page<>();
        List<BookCategory> list = bookCategoryMapper.selectByPageNum((pageNum - 1) * 10, 10);
        page.setPageSize(10);
        page.setPageNum(pageNum);
        page.setList(list);
        int recordCount = bookCategoryMapper.selectAllCount();
        int pageCount = recordCount / 10;
        if (recordCount % 10 != 0) {
            pageCount++;
        }
        page.setPageCount(pageCount);
        return page;
    }

    @Override
    public int deleteBookCategoryById(int bookCategoryId) {
        return bookCategoryMapper.deleteByPrimaryKey(bookCategoryId);
    }

    @Override
    public List<BookCategory> selectAllBookCategories() {
        return bookCategoryMapper.selectAllBookCategories();
    }

    @Override
    public void addBookCategory(String bookCategoryName) {
        BookCategory bookCategory = new BookCategory();
        bookCategory.setCategoryName(bookCategoryName);
        bookCategoryMapper.insert(bookCategory);
    }
}
