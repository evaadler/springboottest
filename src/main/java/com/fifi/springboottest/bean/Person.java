package com.fifi.springboottest.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Alicia
 * @description
 * @date 2019/9/20
 */

//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix ="person")
public class Person {


    /**
     * 字面量${key}从环境变量，配置文件获取值，#{SpEL}Spring表达式
     */


    private int age;
    private boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;


    private Dog dog;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +

                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
