package cn.spring.debugger;

import org.springframework.stereotype.Component;

/**
 * @desc：
 * @author：xiaojingyu
 * @ClassName：RefectTest
 * @ProjectName：springSource
 * @date：Created in 2021/5/20 16:27
 * @Copyright(c)：tellyes tech. inc. co.,ltd
 */
@Component
public class RefectTest {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "RefectTest{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public RefectTest(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void test(){
        System.out.println("this is debugger");
    }

}
