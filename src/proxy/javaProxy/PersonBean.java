package proxy.javaProxy;

/**
 * Created by xu on 01/08/2017.
 */
public interface PersonBean {// 设置或取得一个人的信息

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}
