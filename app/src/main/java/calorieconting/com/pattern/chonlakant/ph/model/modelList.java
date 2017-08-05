package calorieconting.com.pattern.chonlakant.ph.model;

import java.util.List;

/**
 * Created by chonlakantsattaboot on 4/26/2017 AD.
 */

public class modelList {

    
    private String test;
    private List<UserBean> user;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<UserBean> getUser() {
        return user;
    }

    public void setUser(List<UserBean> user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * code : ALL-0001
         * name : นมข้าวโพด
         * category : IPD-BEV-ALL
         */

        private String code;
        private String name;
        private String category;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}
