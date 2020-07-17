/*
package me.dhlee.studyspringboot1.exam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExController {
    String[] names = {"kim", "lee", "park", "choi", "jo"};
    String[] mails = {"kim@tuuyano.com", "lee@flower", "park@yamda", "choi@happy", "jo@baseball"};

    // @RestContoller의 개념 설명을 위한 코드
    @RequestMapping("/hello")
    public String index() {
        return "Hello Spring-Boot World!";
    }

    // @RestController에서 자동으로 JSON으로 변환시켜 줌
    @RequestMapping("/getInfo/{id}")
    public DataObject index(@PathVariable int id) {
        return new DataObject(id, names[id], mails[id]);
    }

    private class DataObject {
        private int id;
        private String name;
        private String value;

        public DataObject(int id, String name, String value) {
            this.id = id;
            this.name = name;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

    */
/*
    @PathVariable의 개념 설명을 위한 코드
    ? 책에서는 형변환이 가능하면 자동으로 형변환해서 처리한다는데 실제로는 그렇지 않았음 ( /12.345 => 1~12의 합 )

    @RequestMapping("/{num}")
    public String index(@PathVariable int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        return "total : " + res;
    }
    *//*

}
*/
