package com.wzres.stream_optional;

import java.util.*;

/**
 * @ClassName：StreamTest2
 * @description：中间操作
 * @date：2023-05-05 09:21
 */
public class StreamTest1 {
    public static void main(String[] args) {
        //test6(); //flaMap
        //test5(); //flaMap
        //test4(); //limit
        //test3(); //sorted
        //test2(); //map
        //test1(); //filter
    }

    private static void test6() {
        List<Author> authors = getAuthors();
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()
                .forEach(name-> System.out.println(name));
    }

    private static void test5() {
        List<Author> authors = getAuthors();
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .forEach(books-> System.out.println(books.getName()));
    }

    private static void test4() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct() //去重
                .sorted((o1, o2) -> o2.getAge()- o1.getAge()) //按照年龄升序，传入一个比较器
                .limit(2) //读取前2个元素，多出的元素截掉
                //.skip(2) //跳过前2个元素，保留剩下的元素
                .forEach(author -> System.out.println(author.getName()));
    }

    private static void test3() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge()) )
                .forEach(author -> System.out.println(author.getAge()));
    }

    private static void test2() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .map(author -> author.getName())
                .forEach(name -> System.out.println(name));
    }

    private static void test1() {
        List<Author> authors = getAuthors();
        authors.stream() //将集合转换成流
                .distinct() //去重，需要重写equals
                .filter(name -> name.getName().length()>1) //筛选返回值为true的元素
                .forEach(author -> {System.out.println(author.getName());}); //流的终结操作，必须写
    }

    private static List<Author> getAuthors() {
        //数据初始化
        Author author = new Author(1L,"蒙多",33,"一个从菜刀中明悟哲理的祖安人",null);
        Author author2 = new Author(2L,"亚拉索",15,"狂风也追逐不上他的思考速度",null);
        Author author3 = new Author(3L,"易",14,"是这个世界在限制他的思维",null);
        Author author4 = new Author(3L,"易",14,"是这个世界在限制他的思维",null);

        //书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L,"刀的两侧是光明与黑暗","哲学,爱情",88,"用一把刀划分了爱恨"));
        books1.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",99,"讲述如何从失败中明悟真理"));

        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(4L,"吹或不吹","爱情,个人传记",56,"一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L,"你的剑就是我的剑","爱情",56,"无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        List<Author> authorList = new ArrayList<>(Arrays.asList(author,author2,author3,author4));
        return authorList;
    }
}
