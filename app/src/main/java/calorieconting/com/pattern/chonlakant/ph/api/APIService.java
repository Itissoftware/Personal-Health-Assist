package calorieconting.com.pattern.chonlakant.ph.api;


import calorieconting.com.pattern.chonlakant.ph.model.modelList;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface APIService {



    @FormUrlEncoded
    @POST("/app_cal/menu_list.php")
    Call<modelList> getOrder(@Field("category") String category);





}
