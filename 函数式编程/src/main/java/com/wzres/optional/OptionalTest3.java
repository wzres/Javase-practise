package com.wzres.optional;

import com.wzres.stream_optional.Author;
import com.wzres.stream_optional.Book;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName：OptionalTest3
 * @description：
 * @date：2023-05-13 10:33
 */
public class OptionalTest3 {
    public static void main(String[] args) {
        test8();
        //test7();
        //test6();
        //test5();
        //test4();
        //test3();
        //test2();
        //test1();

    }

    private static void test8() {
        List<Author> authors = getAuthors();
        Optional<Integer> max = authors.stream()
                .map(author -> author.getAge())
                .reduce((result, element) -> result < element ? element : result);
        max.ifPresent(age -> System.out.println(age));

    }

    private static void test7() {
        List<Author> authors = getAuthors();
        Optional<Integer> first = authors.stream()
                .map(author -> author.getAge())
                .sorted((o1, o2) -> o2 - o1)
                .findFirst();

        //.filter(author -> author.getAge() > 16)
                //.findAny();
        //.anyMatch(author -> author.getAge()>16);
                //.allMatch(author -> author.getAge()>12);
                //.noneMatch(author -> author.getAge() > 100);


        //any.ifPresent(author -> System.out.println(author.getName()));
        first.ifPresent(age -> System.out.println(age));

    }

    private static void test6() {
        List<Author> authors = getAuthors();
        Map<String, List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));

        System.out.println(map);
    }

    private static void test5() {
        List<Author> authors = getAuthors();
        Set<Integer> set = authors.stream()
                .map(author -> author.getAge())
                .collect(Collectors.toSet());

        for (Integer element : set) {
            System.out.println(element);
        }
    }

    private static void test4() {
        List<Author> authors = getAuthors();
        List<String> list = authors.stream()
                .map(author -> author.getName())
                .collect(Collectors.toList());

        for (String element : list) {
            System.out.println(element);
        }

    }

    private static void test3() {
        List<Author> authors = getAuthors();
        Optional<Integer> max = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .map(book -> book.getScore())
                .min((o1, o2) -> o1 - o2);
        max.ifPresent(num -> System.out.println(num));
    }

    private static void test2() {
        List<Author> authors = getAuthors();
        long count = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .map(book -> book.getName())
                .distinct()
                .count();

        System.out.println(count);
    }

    private static void test1() {
        List<Author> authors = getAuthors();
        boolean b = authors.stream()
                .anyMatch(author -> author.getAge() < 7);
                //.allMatch(author -> author.getAge() < 18);
                //.noneMatch(author -> author.getAge() < 8);
        System.out.println(b);

        List<Author> authors2 = getAuthors();
        Optional<Author> any = authors2.stream()
                .filter(author -> author.getAge() > 7)
                .findAny();
        any.ifPresent(author -> System.out.println(author.getName()));

        List<Author> authors3 = getAuthors();
        Optional<Author> first = authors3.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .findFirst();

        first.ifPresent(author -> System.out.println(author.getName()));

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
