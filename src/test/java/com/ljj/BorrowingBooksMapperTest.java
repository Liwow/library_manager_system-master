package com.ljj;

import com.ljj.domain.BorrowingBooks;
import com.ljj.mapper.BorrowingBooksMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BorrowingBooksMapperTest {

    @Resource
    private BorrowingBooksMapper borrowingBooksMapper;


    @Test
    public void testSelectAllRecordCount(){
        int count=borrowingBooksMapper.selectAllRecordCount(1);
        System.out.println(count);
    }

    @Test
    public void testSelectAllByPageNum(){
        List<BorrowingBooks> list=borrowingBooksMapper.selectAllByPage(0,5);
        int count=borrowingBooksMapper.selectAll();
        System.out.println("count: "+count);
        if(null!=list){
            for(BorrowingBooks b:list){
                System.out.println(b.getId()+" "+b.getBookId());
            }
        }
    }
}
